package com.newsun.web.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created with IntelliJ IDEA.
 * Description: com.newsun.web.entity
 * User: diyaguang
 * Date: 2017-09-07 4:22 PM
 */
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

    @Id
    @Column(name = "ID", nullable = false, length = 40)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "LendID", nullable = true, length = 40)
    public String getLendId() {
        return lendId;
    }

    public void setLendId(String lendId) {
        this.lendId = lendId;
    }

    @Basic
    @Column(name = "ChangeSaleAmount", nullable = true, precision = 2)
    public BigDecimal getChangeSaleAmount() {
        return changeSaleAmount;
    }

    public void setChangeSaleAmount(BigDecimal changeSaleAmount) {
        this.changeSaleAmount = changeSaleAmount;
    }

    @Basic
    @Column(name = "ChangeSaleMoney", nullable = true, precision = 2)
    public BigDecimal getChangeSaleMoney() {
        return changeSaleMoney;
    }

    public void setChangeSaleMoney(BigDecimal changeSaleMoney) {
        this.changeSaleMoney = changeSaleMoney;
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
    @Column(name = "Money", nullable = true, precision = 2)
    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    @Basic
    @Column(name = "OpDate", nullable = true)
    public Timestamp getOpDate() {
        return opDate;
    }

    public void setOpDate(Timestamp opDate) {
        this.opDate = opDate;
    }

    @Basic
    @Column(name = "OpUser", nullable = true)
    public Integer getOpUser() {
        return opUser;
    }

    public void setOpUser(Integer opUser) {
        this.opUser = opUser;
    }

    @Basic
    @Column(name = "ProductID", nullable = true, length = 40)
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
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
        return result;
    }
}
