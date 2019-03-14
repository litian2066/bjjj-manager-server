package net.greatsoft.bjjj.service.system;

import net.greatsoft.bjjj.entity.system.PermissionResource;
import net.greatsoft.bjjj.entity.system.UserSystem;
import net.greatsoft.bjjj.mapper.ResourceMapper;
import net.greatsoft.bjjj.repository.system.UserSystemRepository;
import net.greatsoft.bjjj.util.constants.SystemConstants;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

@Service
public class UserSystemService {

    @Resource
    private UserSystemRepository userSystemRepository;

    @Resource
    private ResourceMapper resourceMapper;

    /**
     * 登录方法 通过用户名和密码查找用户信息
     * @param username
     * @param password
     * @return
     */
    public UserSystem findUserByNameAndPassword(String username, String password) {
       return  this.userSystemRepository.findUserByDisplayNameAndPassword(username, password);
    }

    public PermissionResource findLoginInfo(UserSystem userSystem) {
        Map<String,Object> params = new HashMap<>();
        params.put("userId", userSystem.getId());
        // 查询用户的所有资源角色
        List<PermissionResource> list = resourceMapper
                .findResourcesByUsersId(params);
        if (list == null || list.isEmpty()) {
            return null;
        }
        // 查询顶级资源
        PermissionResource topMenu = resourceMapper
                .findByResourcesId(SystemConstants.RESOURCE_TOP_ID);
        List<PermissionResource> treeList = new ArrayList<>();
        for (PermissionResource resources : list) {
            if (SystemConstants.RESOURCE_TOP_ID.equals(resources.getParentId())
                    && !treeList.contains(resources)) {
                treeList.add(resources);
            }
            for (PermissionResource r : list) {
                if (resources.getId().equals(r.getParentId())) {
                    if (resources.getChildren() == null) {
                        List<PermissionResource> resourcesList = new ArrayList<>();
                        resourcesList.add(r);
                        resources.setChildren(resourcesList);
                    } else {
                        if (resources.getChildren().contains(r)) {
                            continue;
                        } else {
                            resources.getChildren().add(r);
                        }
                    }
                }
            }
        }
        topMenu.setChildren(treeList);
        // 一级目录排序
        Collections.sort(topMenu.getChildren());
        // 二级目录排序
        for (PermissionResource resource : topMenu.getChildren()) {
            Collections.sort(resource.getChildren());
            // 三级目录排序
            for (PermissionResource r : resource.getChildren()) {
                Collections.sort(r.getChildren());
            }
        }
        return topMenu;
    }


    public static void main(String[] args) {
        Set<String> list = new HashSet<String>();
        while (list.size() <= 1000) {
            String str = "";
            for (int i = 0; i < 6; i++) {
                if (i == 0) {
                    str = str + (char)(Math.random()*26 + 'A');
                } else {
                    str = str + (char)(Math.random()*26 + 'a');
                }
            }
            if (str.charAt(0) == 'A') {
                list.add(str);
            }
        }
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
    }

}
