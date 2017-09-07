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
@Table(name = "BalanceSaleDetail", schema = "dygstudio", catalog = "")
public class BalanceSaleDetailEntity {
    private String id;
    private String balanceId;
    private String accountBillId;
    private BigDecimal balanceMoney;

    @Id
    @Column(name = "ID", nullable = false, length = 40)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "BalanceID", nullable = true, length = 40)
    public String getBalanceId() {
        return balanceId;
    }

    public void setBalanceId(String balanceId) {
        this.balanceId = balanceId;
    }

    @Basic
    @Column(name = "AccountBillID", nullable = true, length = 40)
    public String getAccountBillId() {
        return accountBillId;
    }

    public void setAccountBillId(String accountBillId) {
        this.accountBillId = accountBillId;
    }

    @Basic
    @Column(name = "BalanceMoney", nullable = true, precision = 2)
    public BigDecimal getBalanceMoney() {
        return balanceMoney;
    }

    public void setBalanceMoney(BigDecimal balanceMoney) {
        this.balanceMoney = balanceMoney;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BalanceSaleDetailEntity that = (BalanceSaleDetailEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (balanceId != null ? !balanceId.equals(that.balanceId) : that.balanceId != null) return false;
        if (accountBillId != null ? !accountBillId.equals(that.accountBillId) : that.accountBillId != null)
            return false;
        if (balanceMoney != null ? !balanceMoney.equals(that.balanceMoney) : that.balanceMoney != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (balanceId != null ? balanceId.hashCode() : 0);
        result = 31 * result + (accountBillId != null ? accountBillId.hashCode() : 0);
        result = 31 * result + (balanceMoney != null ? balanceMoney.hashCode() : 0);
        return result;
    }
}
