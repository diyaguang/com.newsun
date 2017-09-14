package com.newsun.web.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "LendDetail", schema = "dygstudio", catalog = "")
public class LendDetailEntity {
    private String id;
    private String lendId;
    private Integer isLargess;
    private String productId;
    private BigDecimal price;
    private BigDecimal money;
    private BigDecimal amount;
    private BigDecimal realPrice;
    private BigDecimal realMoney;
    private String note;
    private BigDecimal discount;
    private Integer depotCount;
    private String priceTypeName;
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
    @Column(name = "IsLargess")
    public Integer getIsLargess() {
        return isLargess;
    }

    public void setIsLargess(Integer isLargess) {
        this.isLargess = isLargess;
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
    @Column(name = "RealPrice")
    public BigDecimal getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(BigDecimal realPrice) {
        this.realPrice = realPrice;
    }

    @Basic
    @Column(name = "RealMoney")
    public BigDecimal getRealMoney() {
        return realMoney;
    }

    public void setRealMoney(BigDecimal realMoney) {
        this.realMoney = realMoney;
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
    @Column(name = "Discount")
    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    @Basic
    @Column(name = "DepotCount")
    public Integer getDepotCount() {
        return depotCount;
    }

    public void setDepotCount(Integer depotCount) {
        this.depotCount = depotCount;
    }

    @Basic
    @Column(name = "PriceTypeName")
    public String getPriceTypeName() {
        return priceTypeName;
    }

    public void setPriceTypeName(String priceTypeName) {
        this.priceTypeName = priceTypeName;
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

        LendDetailEntity that = (LendDetailEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (lendId != null ? !lendId.equals(that.lendId) : that.lendId != null) return false;
        if (isLargess != null ? !isLargess.equals(that.isLargess) : that.isLargess != null) return false;
        if (productId != null ? !productId.equals(that.productId) : that.productId != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (money != null ? !money.equals(that.money) : that.money != null) return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
        if (realPrice != null ? !realPrice.equals(that.realPrice) : that.realPrice != null) return false;
        if (realMoney != null ? !realMoney.equals(that.realMoney) : that.realMoney != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (discount != null ? !discount.equals(that.discount) : that.discount != null) return false;
        if (depotCount != null ? !depotCount.equals(that.depotCount) : that.depotCount != null) return false;
        if (priceTypeName != null ? !priceTypeName.equals(that.priceTypeName) : that.priceTypeName != null)
            return false;
        if (bookId != null ? !bookId.equals(that.bookId) : that.bookId != null) return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (lendId != null ? lendId.hashCode() : 0);
        result = 31 * result + (isLargess != null ? isLargess.hashCode() : 0);
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (money != null ? money.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (realPrice != null ? realPrice.hashCode() : 0);
        result = 31 * result + (realMoney != null ? realMoney.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (discount != null ? discount.hashCode() : 0);
        result = 31 * result + (depotCount != null ? depotCount.hashCode() : 0);
        result = 31 * result + (priceTypeName != null ? priceTypeName.hashCode() : 0);
        result = 31 * result + (bookId != null ? bookId.hashCode() : 0);
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        return result;
    }
}
