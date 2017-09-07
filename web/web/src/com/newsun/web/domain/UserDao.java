package com.newsun.web.domain;

import com.newsun.web.entity.UsersEntity;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * Description: com.newsun.web.domain
 * User: diyaguang
 * Date: 2017-09-07 5:50 PM
 */
@Repository
public interface UserDao extends BaseRepository<UsersEntity,String> {
}
