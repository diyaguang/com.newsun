package com.newsun.web.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "Service", schema = "dygstudio", catalog = "")
public class ServiceEntity {
    private String id;
    private String code;
    private String clientId;
    private String title;
    private String contents;
    private Timestamp inputDate;
    private Integer isRevert;
    private String revertContents;
    private Timestamp revertDate;
    private String userId;
    private Integer isDel;
    private String bookId;
    private String companyId;

    @Id
    @Column(name = "ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "ClientID")
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    @Basic
    @Column(name = "Title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "Contents")
    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    @Basic
    @Column(name = "InputDate")
    public Timestamp getInputDate() {
        return inputDate;
    }

    public void setInputDate(Timestamp inputDate) {
        this.inputDate = inputDate;
    }

    @Basic
    @Column(name = "IsRevert")
    public Integer getIsRevert() {
        return isRevert;
    }

    public void setIsRevert(Integer isRevert) {
        this.isRevert = isRevert;
    }

    @Basic
    @Column(name = "RevertContents")
    public String getRevertContents() {
        return revertContents;
    }

    public void setRevertContents(String revertContents) {
        this.revertContents = revertContents;
    }

    @Basic
    @Column(name = "RevertDate")
    public Timestamp getRevertDate() {
        return revertDate;
    }

    public void setRevertDate(Timestamp revertDate) {
        this.revertDate = revertDate;
    }

    @Basic
    @Column(name = "UserID")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "IsDel")
    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
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

        ServiceEntity that = (ServiceEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (clientId != null ? !clientId.equals(that.clientId) : that.clientId != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (contents != null ? !contents.equals(that.contents) : that.contents != null) return false;
        if (inputDate != null ? !inputDate.equals(that.inputDate) : that.inputDate != null) return false;
        if (isRevert != null ? !isRevert.equals(that.isRevert) : that.isRevert != null) return false;
        if (revertContents != null ? !revertContents.equals(that.revertContents) : that.revertContents != null)
            return false;
        if (revertDate != null ? !revertDate.equals(that.revertDate) : that.revertDate != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (isDel != null ? !isDel.equals(that.isDel) : that.isDel != null) return false;
        if (bookId != null ? !bookId.equals(that.bookId) : that.bookId != null) return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (clientId != null ? clientId.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (contents != null ? contents.hashCode() : 0);
        result = 31 * result + (inputDate != null ? inputDate.hashCode() : 0);
        result = 31 * result + (isRevert != null ? isRevert.hashCode() : 0);
        result = 31 * result + (revertContents != null ? revertContents.hashCode() : 0);
        result = 31 * result + (revertDate != null ? revertDate.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (isDel != null ? isDel.hashCode() : 0);
        result = 31 * result + (bookId != null ? bookId.hashCode() : 0);
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        return result;
    }
}
