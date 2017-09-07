package com.newsun.web.service;

import com.newsun.web.entity.UsersEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description: com.newsun.web.service
 * User: diyaguang
 * Date: 2017-09-07 5:55 PM
 */
@Service("userService")
public interface UserService {
    public List<UsersEntity> getAllUser();
    public void saveUser(UsersEntity user);
    public int login(UsersEntity user);
    public UsersEntity getUser(String userId);
}
