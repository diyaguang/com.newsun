package com.newsun.web.entity;

import javax.persistence.*;

@Entity
@Table(name = "WebOption", schema = "dygstudio", catalog = "")
public class WebOptionEntity {
    private String id;
    private String setKey;
    private String setName;
    private String setValue;
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
    @Column(name = "SetKey")
    public String getSetKey() {
        return setKey;
    }

    public void setSetKey(String setKey) {
        this.setKey = setKey;
    }

    @Basic
    @Column(name = "SetName")
    public String getSetName() {
        return setName;
    }

    public void setSetName(String setName) {
        this.setName = setName;
    }

    @Basic
    @Column(name = "SetValue")
    public String getSetValue() {
        return setValue;
    }

    public void setSetValue(String setValue) {
        this.setValue = setValue;
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

        WebOptionEntity that = (WebOptionEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (setKey != null ? !setKey.equals(that.setKey) : that.setKey != null) return false;
        if (setName != null ? !setName.equals(that.setName) : that.setName != null) return false;
        if (setValue != null ? !setValue.equals(that.setValue) : that.setValue != null) return false;
        if (bookId != null ? !bookId.equals(that.bookId) : that.bookId != null) return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (setKey != null ? setKey.hashCode() : 0);
        result = 31 * result + (setName != null ? setName.hashCode() : 0);
        result = 31 * result + (setValue != null ? setValue.hashCode() : 0);
        result = 31 * result + (bookId != null ? bookId.hashCode() : 0);
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        return result;
    }
}
