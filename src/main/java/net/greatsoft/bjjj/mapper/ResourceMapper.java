package net.greatsoft.bjjj.mapper;

import net.greatsoft.bjjj.entity.system.PermissionResource;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ResourceMapper {

    /**
     * 根据权限资源的id查询该条信息
     */
    PermissionResource findByResourcesId(String resourcesId);

    /**
     * 根据用户的id查询权限资源
     */
    List<PermissionResource> findResourcesByUsersId(Map<String,Object> map);
}
