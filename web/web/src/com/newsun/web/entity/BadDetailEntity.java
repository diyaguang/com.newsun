package com.newsun.web.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "BadDetail", schema = "dygstudio", catalog = "")
public class BadDetailEntity {
    private String id;
    private String badId;
    private String productId;
    private BigDecimal price;
    private BigDecimal money;
    private BigDecimal amount;
    private String note;
    private BigDecimal bzPrice;
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
    @Column(name = "BadID")
    public String getBadId() {
        return badId;
    }

    public void setBadId(String badId) {
        this.badId = badId;
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
    @Column(name = "Price")
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
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
    @Column(name = "Amount")
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "Note")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Basic
    @Column(name = "BzPrice")
    public BigDecimal getBzPrice() {
        return bzPrice;
    }

    public void setBzPrice(BigDecimal bzPrice) {
        this.bzPrice = bzPrice;
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

        BadDetailEntity that = (BadDetailEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (badId != null ? !badId.equals(that.badId) : that.badId != null) return false;
        if (productId != null ? !productId.equals(that.productId) : that.productId != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (money != null ? !money.equals(that.money) : that.money != null) return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (bzPrice != null ? !bzPrice.equals(that.bzPrice) : that.bzPrice != null) return false;
        if (bookId != null ? !bookId.equals(that.bookId) : that.bookId != null) return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (badId != null ? badId.hashCode() : 0);
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (money != null ? money.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (bzPrice != null ? bzPrice.hashCode() : 0);
        result = 31 * result + (bookId != null ? bookId.hashCode() : 0);
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        return result;
    }
}
