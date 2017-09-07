package com.newsun.web.entity;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * Description: com.newsun.web.entity
 * User: diyaguang
 * Date: 2017-09-07 4:21 PM
 */
@Entity
@Table(name = "CheckDetail", schema = "dygstudio", catalog = "")
public class CheckDetailEntity {
    private String id;
    private String checkId;
    private String productId;
    private BigDecimal checkCount;
    private BigDecimal accountCount;
    private BigDecimal checkMoney;
    private String note;
    private BigDecimal price;
    private BigDecimal amount;

    @Id
    @Column(name = "ID", nullable = false, length = 40)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CheckID", nullable = true, length = 40)
    public String getCheckId() {
        return checkId;
    }

    public void setCheckId(String checkId) {
        this.checkId = checkId;
    }

    @Basic
    @Column(name = "ProductID", nullable = true, length = 40)
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "CheckCount", nullable = true, precision = 2)
    public BigDecimal getCheckCount() {
        return checkCount;
    }

    public void setCheckCount(BigDecimal checkCount) {
        this.checkCount = checkCount;
    }

    @Basic
    @Column(name = "AccountCount", nullable = true, precision = 2)
    public BigDecimal getAccountCount() {
        return accountCount;
    }

    public void setAccountCount(BigDecimal accountCount) {
        this.accountCount = accountCount;
    }

    @Basic
    @Column(name = "CheckMoney", nullable = true, precision = 2)
    public BigDecimal getCheckMoney() {
        return checkMoney;
    }

    public void setCheckMoney(BigDecimal checkMoney) {
        this.checkMoney = checkMoney;
    }

    @Basic
    @Column(name = "Note", nullable = true, length = 100)
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Basic
    @Column(name = "Price", nullable = true, precision = 2)
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Basic
    @Column(name = "Amount", nullable = true, precision = 2)
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CheckDetailEntity that = (CheckDetailEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (checkId != null ? !checkId.equals(that.checkId) : that.checkId != null) return false;
        if (productId != null ? !productId.equals(that.productId) : that.productId != null) return false;
        if (checkCount != null ? !checkCount.equals(that.checkCount) : that.checkCount != null) return false;
        if (accountCount != null ? !accountCount.equals(that.accountCount) : that.accountCount != null) return false;
        if (checkMoney != null ? !checkMoney.equals(that.checkMoney) : that.checkMoney != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (checkId != null ? checkId.hashCode() : 0);
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + (checkCount != null ? checkCount.hashCode() : 0);
        result = 31 * result + (accountCount != null ? accountCount.hashCode() : 0);
        result = 31 * result + (checkMoney != null ? checkMoney.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        return result;
    }
}
