package com.newsun.web.domain;

import com.newsun.web.entity.UsersEntity;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * Description: com.newsun.web.domain
 * User: diyaguang
 * Date: 2017-09-07 5:51 PM
 */
@Repository("userDao")
public class UserDaoImpl extends BaseRepositoryImpl<UsersEntity,String> implements UserDao{
}
