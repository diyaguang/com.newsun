package com.newsun.web.service;

import com.newsun.web.domain.UserDao;
import com.newsun.web.entity.UsersEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description: com.newsun.web.service
 * User: diyaguang
 * Date: 2017-09-07 5:56 PM
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public List<UsersEntity> getAllUser()
    {
        return userDao.getAll();
    }
    public void saveUser(UsersEntity user){
        userDao.save(user);
    }
    public int login(UsersEntity user){
        //这里对传进来的用户与数据库中查询到的用户的数据进行比对，判断是否可以登录
        return 0;
    }
    public UsersEntity getUser(String userId){
        UsersEntity user = userDao.get(userId);
        return user;
    }
}
