package com.newsun.web.entity;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * Description: com.newsun.web.entity
 * User: diyaguang
 * Date: 2017-09-07 4:23 PM
 */
@Entity
@Table(name = "WebOption", schema = "dygstudio", catalog = "")
public class WebOptionEntity {
    private String id;
    private String setKey;
    private String setName;
    private String setValue;

    @Id
    @Column(name = "ID", nullable = false, length = 40)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "SetKey", nullable = true, length = 50)
    public String getSetKey() {
        return setKey;
    }

    public void setSetKey(String setKey) {
        this.setKey = setKey;
    }

    @Basic
    @Column(name = "SetName", nullable = true, length = 50)
    public String getSetName() {
        return setName;
    }

    public void setSetName(String setName) {
        this.setName = setName;
    }

    @Basic
    @Column(name = "SetValue", nullable = true, length = 500)
    public String getSetValue() {
        return setValue;
    }

    public void setSetValue(String setValue) {
        this.setValue = setValue;
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

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (setKey != null ? setKey.hashCode() : 0);
        result = 31 * result + (setName != null ? setName.hashCode() : 0);
        result = 31 * result + (setValue != null ? setValue.hashCode() : 0);
        return result;
    }
}
