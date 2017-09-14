package com.newsun.web.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "BalanceSaleDetail", schema = "dygstudio", catalog = "")
public class BalanceSaleDetailEntity {
    private String id;
    private String balanceId;
    private String accountBillId;
    private BigDecimal balanceMoney;
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
    @Column(name = "BalanceID")
    public String getBalanceId() {
        return balanceId;
    }

    public void setBalanceId(String balanceId) {
        this.balanceId = balanceId;
    }

    @Basic
    @Column(name = "AccountBillID")
    public String getAccountBillId() {
        return accountBillId;
    }

    public void setAccountBillId(String accountBillId) {
        this.accountBillId = accountBillId;
    }

    @Basic
    @Column(name = "BalanceMoney")
    public BigDecimal getBalanceMoney() {
        return balanceMoney;
    }

    public void setBalanceMoney(BigDecimal balanceMoney) {
        this.balanceMoney = balanceMoney;
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

        BalanceSaleDetailEntity that = (BalanceSaleDetailEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (balanceId != null ? !balanceId.equals(that.balanceId) : that.balanceId != null) return false;
        if (accountBillId != null ? !accountBillId.equals(that.accountBillId) : that.accountBillId != null)
            return false;
        if (balanceMoney != null ? !balanceMoney.equals(that.balanceMoney) : that.balanceMoney != null) return false;
        if (bookId != null ? !bookId.equals(that.bookId) : that.bookId != null) return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (balanceId != null ? balanceId.hashCode() : 0);
        result = 31 * result + (accountBillId != null ? accountBillId.hashCode() : 0);
        result = 31 * result + (balanceMoney != null ? balanceMoney.hashCode() : 0);
        result = 31 * result + (bookId != null ? bookId.hashCode() : 0);
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        return result;
    }
}
