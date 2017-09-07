package com.newsun.web.entity;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * Description: com.newsun.web.entity
 * User: diyaguang
 * Date: 2017-09-07 4:23 PM
 */
@Entity
@Table(name = "StockDetail", schema = "dygstudio", catalog = "")
public class StockDetailEntity {
    private String id;
    private String stockId;
    private String productId;
    private BigDecimal amount;
    private BigDecimal price;
    private BigDecimal money;
    private String note;
    private Integer alreadyArrive;
    private BigDecimal noDutyMoney;
    private BigDecimal noDutyPrice;
    private BigDecimal duty;
    private String stockType;
    private BigDecimal stockTax;

    @Id
    @Column(name = "ID", nullable = false, length = 40)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "StockID", nullable = true, length = 40)
    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
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
    @Column(name = "Amount", nullable = true, precision = 2)
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
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
    @Column(name = "Note", nullable = true, length = 500)
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Basic
    @Column(name = "AlreadyArrive", nullable = true, precision = 0)
    public Integer getAlreadyArrive() {
        return alreadyArrive;
    }

    public void setAlreadyArrive(Integer alreadyArrive) {
        this.alreadyArrive = alreadyArrive;
    }

    @Basic
    @Column(name = "NoDutyMoney", nullable = true, precision = 2)
    public BigDecimal getNoDutyMoney() {
        return noDutyMoney;
    }

    public void setNoDutyMoney(BigDecimal noDutyMoney) {
        this.noDutyMoney = noDutyMoney;
    }

    @Basic
    @Column(name = "NoDutyPrice", nullable = true, precision = 2)
    public BigDecimal getNoDutyPrice() {
        return noDutyPrice;
    }

    public void setNoDutyPrice(BigDecimal noDutyPrice) {
        this.noDutyPrice = noDutyPrice;
    }

    @Basic
    @Column(name = "Duty", nullable = true, precision = 2)
    public BigDecimal getDuty() {
        return duty;
    }

    public void setDuty(BigDecimal duty) {
        this.duty = duty;
    }

    @Basic
    @Column(name = "StockType", nullable = true, length = 50)
    public String getStockType() {
        return stockType;
    }

    public void setStockType(String stockType) {
        this.stockType = stockType;
    }

    @Basic
    @Column(name = "StockTax", nullable = true, precision = 2)
    public BigDecimal getStockTax() {
        return stockTax;
    }

    public void setStockTax(BigDecimal stockTax) {
        this.stockTax = stockTax;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StockDetailEntity that = (StockDetailEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (stockId != null ? !stockId.equals(that.stockId) : that.stockId != null) return false;
        if (productId != null ? !productId.equals(that.productId) : that.productId != null) return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (money != null ? !money.equals(that.money) : that.money != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (alreadyArrive != null ? !alreadyArrive.equals(that.alreadyArrive) : that.alreadyArrive != null)
            return false;
        if (noDutyMoney != null ? !noDutyMoney.equals(that.noDutyMoney) : that.noDutyMoney != null) return false;
        if (noDutyPrice != null ? !noDutyPrice.equals(that.noDutyPrice) : that.noDutyPrice != null) return false;
        if (duty != null ? !duty.equals(that.duty) : that.duty != null) return false;
        if (stockType != null ? !stockType.equals(that.stockType) : that.stockType != null) return false;
        if (stockTax != null ? !stockTax.equals(that.stockTax) : that.stockTax != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (stockId != null ? stockId.hashCode() : 0);
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (money != null ? money.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (alreadyArrive != null ? alreadyArrive.hashCode() : 0);
        result = 31 * result + (noDutyMoney != null ? noDutyMoney.hashCode() : 0);
        result = 31 * result + (noDutyPrice != null ? noDutyPrice.hashCode() : 0);
        result = 31 * result + (duty != null ? duty.hashCode() : 0);
        result = 31 * result + (stockType != null ? stockType.hashCode() : 0);
        result = 31 * result + (stockTax != null ? stockTax.hashCode() : 0);
        return result;
    }
}
