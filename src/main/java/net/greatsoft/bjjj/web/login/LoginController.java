package net.greatsoft.bjjj.web.login;

import net.greatsoft.bjjj.entity.system.Org;
import net.greatsoft.bjjj.entity.system.PermissionResource;
import net.greatsoft.bjjj.entity.system.UserSystem;
import net.greatsoft.bjjj.service.system.OrgService;
import net.greatsoft.bjjj.service.system.UserSystemService;
import net.greatsoft.bjjj.util.ResultSingleton;
import net.greatsoft.bjjj.util.constants.SystemConstants;
import net.greatsoft.bjjj.web.BaseController;
import net.greatsoft.bjjj.web.dto.ResultDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/login")
public class LoginController extends BaseController {

    @Autowired
    private UserSystemService userSystemService;

    @Autowired
    private OrgService orgService;

    @PostMapping(value = "/login")
    public ResultSingleton login(@RequestBody UserSystem userSystem, HttpServletRequest request) {
        Map<String, Object> map = new HashMap<String, Object>();
        ResultSingleton resultSingleton = null;
        UserSystem user = this.userSystemService.findUserByNameAndPassword(userSystem.getDisplayName(), userSystem.getPassword());
        Org org = null;
        if (user != null) {
            // 获取权限
            PermissionResource menus = this.userSystemService.findLoginInfo(user);
            UserSystem users = setCacheUsers(user);
            if (menus == null) {
                resultSingleton = ResultSingleton.getInstance(ResultSingleton.CODE_FAIL, "该用户没有权限", null);
            }
            // 获取用户所属机构信息
            if (users.getOrgId() == null || (org = orgService.findOrgById(Long.valueOf(users.getOrgId()))) == null) {
                resultSingleton = ResultSingleton.getInstance(ResultSingleton.CODE_FAIL, "该用户没有所属机构信息", null);
            }
            Map<String, Object> result = new HashMap<String, Object>();
            result.put("users", users);
            result.put("menus", menus);
            result.put("org", org);
            HttpSession session = request.getSession();
            session.setAttribute(SystemConstants.SESSION_USER, user);
            resultSingleton = ResultSingleton.getInstance(ResultSingleton.CODE_SUCCESS, "登录成功", result);
        } else {
            resultSingleton = ResultSingleton.getInstance(ResultSingleton.CODE_FAIL, "该用户不存在", null);
        }
        return resultSingleton;
    }


    /**
     * 退出
     * @param request
     * @return
     */
    @GetMapping(value = "/loginOut")
    public ResultSingleton loginOut(HttpServletRequest request) {
        delCacheUsersDto(request);
        ResultSingleton resultSingleton = ResultSingleton.getInstance(ResultSingleton.CODE_SUCCESS, "退出成功", null);
        return resultSingleton;
    }
}
