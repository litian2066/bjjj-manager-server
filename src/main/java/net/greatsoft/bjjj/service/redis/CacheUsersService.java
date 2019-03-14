package net.greatsoft.bjjj.service.redis;

import net.greatsoft.bjjj.dto.UserDto;
import net.greatsoft.bjjj.entity.system.UserSystem;
import net.greatsoft.bjjj.repository.redis.CacheRedisDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@Service
public class CacheUsersService {

    @Resource
    private CacheRedisDao cacheRedisDao;

    @Value("${spring.redis.expireTime}")
    private Long expireTime;

    /**
     * 缓存用户信息
     * @param users
     */
    public void addOrUpdate(UserSystem users) {
        cacheRedisDao.set(users.getToken(), users);
    }

    /**
     * 缓存信息(定时删除数据)
     */
    public void addOrUpdate(String token,  Object object) {
        cacheRedisDao.set(token, object, expireTime, TimeUnit.HOURS);
    }

    /*public void addOrUpdate(String token, Object object){
        cacheRedisDao.set(token, object);
    }*/

    /**
     * 通过token 从redis中取出用户数据
     * @param token
     * @return
     */
    public UserDto findByToken(String token) {
        return (UserDto) cacheRedisDao.get(token);
    }

    /**
     * 通过token从redis中移除数据
     * @param token
     */
    public void delByToken(String token) {
        cacheRedisDao.remove(token);
    }

    /**
     * 通过token从reids中拿出数据
     * @param token
     * @return
     */
    public Object getByToken(String token){
        Object object = cacheRedisDao.get(token);
        return object;
    }
}
