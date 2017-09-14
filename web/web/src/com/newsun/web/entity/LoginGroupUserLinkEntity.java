package com.newsun.web.entity;

import javax.persistence.*;

@Entity
@Table(name = "LoginGroup_User_Link", schema = "dygstudio", catalog = "")
public class LoginGroupUserLinkEntity {
    private String userId;
    private String loginGroupId;
    private String bookId;
    private String companyId;

    @Id
    @Column(name = "UserID")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "LoginGroupID")
    public String getLoginGroupId() {
        return loginGroupId;
    }

    public void setLoginGroupId(String loginGroupId) {
        this.loginGroupId = loginGroupId;
    }

    @Basic
    @Column(name = "BookID")
    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    @Basic
    @Column(name = "CompanyID")
    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LoginGroupUserLinkEntity that = (LoginGroupUserLinkEntity) o;

        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (loginGroupId != null ? !loginGroupId.equals(that.loginGroupId) : that.loginGroupId != null) return false;
        if (bookId != null ? !bookId.equals(that.bookId) : that.bookId != null) return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId != null ? userId.hashCode() : 0;
        result = 31 * result + (loginGroupId != null ? loginGroupId.hashCode() : 0);
        result = 31 * result + (bookId != null ? bookId.hashCode() : 0);
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        return result;
    }
}
