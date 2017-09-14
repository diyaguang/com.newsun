package com.newsun.web.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "LendLog", schema = "dygstudio", catalog = "")
public class LendLogEntity {
    private String id;
    private String lendId;
    private BigDecimal changeSaleAmount;
    private BigDecimal changeSaleMoney;
    private BigDecimal amount;
    private BigDecimal money;
    private Timestamp opDate;
    private Integer opUser;
    private String productId;
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
    @Column(name = "LendID")
    public String getLendId() {
        return lendId;
    }

    public void setLendId(String lendId) {
        this.lendId = lendId;
    }

    @Basic
    @Column(name = "ChangeSaleAmount")
    public BigDecimal getChangeSaleAmount() {
        return changeSaleAmount;
    }

    public void setChangeSaleAmount(BigDecimal changeSaleAmount) {
        this.changeSaleAmount = changeSaleAmount;
    }

    @Basic
    @Column(name = "ChangeSaleMoney")
    public BigDecimal getChangeSaleMoney() {
        return changeSaleMoney;
    }

    public void setChangeSaleMoney(BigDecimal changeSaleMoney) {
        this.changeSaleMoney = changeSaleMoney;
    }

    @Basic
    @Column(name = "Amount")
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "Money")
    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    @Basic
    @Column(name = "OpDate")
    public Timestamp getOpDate() {
        return opDate;
    }

    public void setOpDate(Timestamp opDate) {
        this.opDate = opDate;
    }

    @Basic
    @Column(name = "OpUser")
    public Integer getOpUser() {
        return opUser;
    }

    public void setOpUser(Integer opUser) {
        this.opUser = opUser;
    }

    @Basic
    @Column(name = "ProductID")
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
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

        LendLogEntity that = (LendLogEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (lendId != null ? !lendId.equals(that.lendId) : that.lendId != null) return false;
        if (changeSaleAmount != null ? !changeSaleAmount.equals(that.changeSaleAmount) : that.changeSaleAmount != null)
            return false;
        if (changeSaleMoney != null ? !changeSaleMoney.equals(that.changeSaleMoney) : that.changeSaleMoney != null)
            return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
        if (money != null ? !money.equals(that.money) : that.money != null) return false;
        if (opDate != null ? !opDate.equals(that.opDate) : that.opDate != null) return false;
        if (opUser != null ? !opUser.equals(that.opUser) : that.opUser != null) return false;
        if (productId != null ? !productId.equals(that.productId) : that.productId != null) return false;
        if (bookId != null ? !bookId.equals(that.bookId) : that.bookId != null) return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (lendId != null ? lendId.hashCode() : 0);
        result = 31 * result + (changeSaleAmount != null ? changeSaleAmount.hashCode() : 0);
        result = 31 * result + (changeSaleMoney != null ? changeSaleMoney.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (money != null ? money.hashCode() : 0);
        result = 31 * result + (opDate != null ? opDate.hashCode() : 0);
        result = 31 * result + (opUser != null ? opUser.hashCode() : 0);
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + (bookId != null ? bookId.hashCode() : 0);
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        return result;
    }
}
