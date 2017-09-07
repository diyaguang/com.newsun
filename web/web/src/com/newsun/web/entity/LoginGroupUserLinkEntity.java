package com.newsun.web.entity;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * Description: com.newsun.web.entity
 * User: diyaguang
 * Date: 2017-09-07 4:22 PM
 */
@Entity
@Table(name = "LoginGroup_User_Link", schema = "dygstudio", catalog = "")
public class LoginGroupUserLinkEntity {
    private String userId;
    private String loginGroupId;

    @Id
    @Column(name = "UserID", nullable = false, length = 40)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "LoginGroupID", nullable = true, length = 40)
    public String getLoginGroupId() {
        return loginGroupId;
    }

    public void setLoginGroupId(String loginGroupId) {
        this.loginGroupId = loginGroupId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LoginGroupUserLinkEntity that = (LoginGroupUserLinkEntity) o;

        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (loginGroupId != null ? !loginGroupId.equals(that.loginGroupId) : that.loginGroupId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId != null ? userId.hashCode() : 0;
        result = 31 * result + (loginGroupId != null ? loginGroupId.hashCode() : 0);
        return result;
    }
}
