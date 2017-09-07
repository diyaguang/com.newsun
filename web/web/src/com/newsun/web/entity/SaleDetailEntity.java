package com.newsun.web.entity;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * Description: com.newsun.web.entity
 * User: diyaguang
 * Date: 2017-09-07 4:22 PM
 */
@Entity
@Table(name = "SaleDetail", schema = "dygstudio", catalog = "")
public class SaleDetailEntity {
    private String id;
    private String saleId;
    private Integer isLargess;
    private String productId;
    private BigDecimal price;
    private BigDecimal money;
    private BigDecimal amount;
    private BigDecimal realPrice;
    private BigDecimal realMoney;
    private String note;
    private BigDecimal discount;
    private BigDecimal depotCount;
    private String priceTypeName;
    private BigDecimal bzPrice;
    private BigDecimal bzDiscount;

    @Id
    @Column(name = "ID", nullable = false, length = 40)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "SaleID", nullable = true, length = 40)
    public String getSaleId() {
        return saleId;
    }

    public void setSaleId(String saleId) {
        this.saleId = saleId;
    }

    @Basic
    @Column(name = "IsLargess", nullable = true)
    public Integer getIsLargess() {
        return isLargess;
    }

    public void setIsLargess(Integer isLargess) {
        this.isLargess = isLargess;
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
    @Column(name = "Price", nullable = true, precision = 2)
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Basic
    @Column(name = "Money", nullable = true, precision = 2)
    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    @Basic
    @Column(name = "Amount", nullable = true, precision = 2)
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "RealPrice", nullable = true, precision = 2)
    public BigDecimal getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(BigDecimal realPrice) {
        this.realPrice = realPrice;
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
    @Column(name = "Note", nullable = true, length = 500)
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Basic
    @Column(name = "Discount", nullable = true, precision = 2)
    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    @Basic
    @Column(name = "DepotCount", nullable = true, precision = 2)
    public BigDecimal getDepotCount() {
        return depotCount;
    }

    public void setDepotCount(BigDecimal depotCount) {
        this.depotCount = depotCount;
    }

    @Basic
    @Column(name = "PriceTypeName", nullable = true, length = 50)
    public String getPriceTypeName() {
        return priceTypeName;
    }

    public void setPriceTypeName(String priceTypeName) {
        this.priceTypeName = priceTypeName;
    }

    @Basic
    @Column(name = "BzPrice", nullable = true, precision = 2)
    public BigDecimal getBzPrice() {
        return bzPrice;
    }

    public void setBzPrice(BigDecimal bzPrice) {
        this.bzPrice = bzPrice;
    }

    @Basic
    @Column(name = "BzDiscount", nullable = true, precision = 2)
    public BigDecimal getBzDiscount() {
        return bzDiscount;
    }

    public void setBzDiscount(BigDecimal bzDiscount) {
        this.bzDiscount = bzDiscount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SaleDetailEntity that = (SaleDetailEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (saleId != null ? !saleId.equals(that.saleId) : that.saleId != null) return false;
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
        if (bzPrice != null ? !bzPrice.equals(that.bzPrice) : that.bzPrice != null) return false;
        if (bzDiscount != null ? !bzDiscount.equals(that.bzDiscount) : that.bzDiscount != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (saleId != null ? saleId.hashCode() : 0);
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
        result = 31 * result + (bzPrice != null ? bzPrice.hashCode() : 0);
        result = 31 * result + (bzDiscount != null ? bzDiscount.hashCode() : 0);
        return result;
    }
}
