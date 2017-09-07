package com.newsun.web.entity;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * Description: com.newsun.web.entity
 * User: diyaguang
 * Date: 2017-09-07 4:20 PM
 */
@Entity
@Table(name = "BalanceAccountDetail", schema = "dygstudio", catalog = "")
public class BalanceAccountDetailEntity {
    private String id;
    private String accountId;
    private BigDecimal realMoney;
    private String balanceId;

    @Id
    @Column(name = "ID", nullable = false, length = 40)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "AccountID", nullable = true, length = 40)
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @Basic
    @Column(name = "RealMoney", nullable = true, precision = 2)
    public BigDecimal getRealMoney() {
        return realMoney;
    }

    public void setRealMoney(BigDecimal realMoney) {
        this.realMoney = realMoney;
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

        BalanceAccountDetailEntity that = (BalanceAccountDetailEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (accountId != null ? !accountId.equals(that.accountId) : that.accountId != null) return false;
        if (realMoney != null ? !realMoney.equals(that.realMoney) : that.realMoney != null) return false;
        if (balanceId != null ? !balanceId.equals(that.balanceId) : that.balanceId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (accountId != null ? accountId.hashCode() : 0);
        result = 31 * result + (realMoney != null ? realMoney.hashCode() : 0);
        result = 31 * result + (balanceId != null ? balanceId.hashCode() : 0);
        return result;
    }
}
