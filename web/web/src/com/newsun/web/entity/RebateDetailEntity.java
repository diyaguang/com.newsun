package com.newsun.web.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created with IntelliJ IDEA.
 * Description: com.newsun.web.entity
 * User: diyaguang
 * Date: 2017-09-07 4:22 PM
 */
@Entity
@Table(name = "RebateDetail", schema = "dygstudio", catalog = "")
public class RebateDetailEntity {
    private String id;
    private String rebateId;
    private String balanceId;

    @Basic
    @Column(name = "ID", nullable = false, length = 40)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "RebateID", nullable = true, length = 40)
    public String getRebateId() {
        return rebateId;
    }

    public void setRebateId(String rebateId) {
        this.rebateId = rebateId;
    }

    @Basic
    @Column(name = "BalanceID", nullable = true, length = 40)
    public String getBalanceId() {
        return balanceId;
    }

    public void setBalanceId(String balanceId) {
        this.balanceId = balanceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RebateDetailEntity that = (RebateDetailEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (rebateId != null ? !rebateId.equals(that.rebateId) : that.rebateId != null) return false;
        if (balanceId != null ? !balanceId.equals(that.balanceId) : that.balanceId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (rebateId != null ? rebateId.hashCode() : 0);
        result = 31 * result + (balanceId != null ? balanceId.hashCode() : 0);
        return result;
    }
}
