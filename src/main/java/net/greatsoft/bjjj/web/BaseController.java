package net.greatsoft.bjjj.web;

import net.greatsoft.bjjj.dto.UserDto;
import net.greatsoft.bjjj.entity.system.UserSystem;
import net.greatsoft.bjjj.service.redis.CacheUsersService;
import net.greatsoft.bjjj.util.ParamUtil;
import org.apache.catalina.User;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

public class BaseController {

    @Resource
    private CacheUsersService cacheUsersService;
    /**
     * 登录成功后缓存用户信息
     * @param userSystem
     * @return
     */
    public UserSystem setCacheUsers(UserSystem userSystem) {
        UserSystem users = new UserSystem();
        ParamUtil.copy(users, userSystem);
        // 生成token
        String token = UUID.randomUUID().toString();
        users.setToken(token);
        userSystem.setToken(token);
        UserDto userDto = new UserDto();
        ParamUtil.copy(userDto, users);
        // 将token缓存到redise中,token-cacheUsersDto存储
        cacheUsersService.addOrUpdate(users.getToken(), userDto);
        return users;
    }

    /**
     * 清除用户token
     */
    public void delCacheUsersDto(HttpServletRequest request) {
        String token = request.getHeader("token");
        cacheUsersService.delByToken(token);
    }

}
