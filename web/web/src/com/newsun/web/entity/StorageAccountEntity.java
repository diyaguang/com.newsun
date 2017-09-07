package com.newsun.web.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * Created with IntelliJ IDEA.
 * Description: com.newsun.web.entity
 * User: diyaguang
 * Date: 2017-09-07 4:23 PM
 */
@Entity
@Table(name = "StorageAccount", schema = "dygstudio", catalog = "")
public class StorageAccountEntity {
    private String id;
    private String depotId;
    private String productId;
    private String billId;
    private String userId;
    private BigDecimal amount;
    private BigDecimal money;
    private Integer opType;
    private Integer opSource;
    private String inputUserId;
    private Date inputDate;
    private Integer isUsed;
    private Integer isDel;
    private String uniqueId;

    @Id
    @Column(name = "ID", nullable = false, length = 40)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "DepotID", nullable = true, length = 40)
    public String getDepotId() {
        return depotId;
    }

    public void setDepotId(String depotId) {
        this.depotId = depotId;
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
    @Column(name = "BillID", nullable = true, length = 200)
    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    @Basic
    @Column(name = "UserID", nullable = true, length = 40)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
    @Column(name = "OpType", nullable = true)
    public Integer getOpType() {
        return opType;
    }

    public void setOpType(Integer opType) {
        this.opType = opType;
    }

    @Basic
    @Column(name = "OpSource", nullable = true)
    public Integer getOpSource() {
        return opSource;
    }

    public void setOpSource(Integer opSource) {
        this.opSource = opSource;
    }

    @Basic
    @Column(name = "InputUserID", nullable = true, length = 40)
    public String getInputUserId() {
        return inputUserId;
    }

    public void setInputUserId(String inputUserId) {
        this.inputUserId = inputUserId;
    }

    @Basic
    @Column(name = "InputDate", nullable = true)
    public Date getInputDate() {
        return inputDate;
    }

    public void setInputDate(Date inputDate) {
        this.inputDate = inputDate;
    }

    @Basic
    @Column(name = "IsUsed", nullable = true)
    public Integer getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(Integer isUsed) {
        this.isUsed = isUsed;
    }

    @Basic
    @Column(name = "IsDel", nullable = true)
    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    @Basic
    @Column(name = "UniqueID", nullable = true, length = 40)
    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StorageAccountEntity that = (StorageAccountEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (depotId != null ? !depotId.equals(that.depotId) : that.depotId != null) return false;
        if (productId != null ? !productId.equals(that.productId) : that.productId != null) return false;
        if (billId != null ? !billId.equals(that.billId) : that.billId != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
        if (money != null ? !money.equals(that.money) : that.money != null) return false;
        if (opType != null ? !opType.equals(that.opType) : that.opType != null) return false;
        if (opSource != null ? !opSource.equals(that.opSource) : that.opSource != null) return false;
        if (inputUserId != null ? !inputUserId.equals(that.inputUserId) : that.inputUserId != null) return false;
        if (inputDate != null ? !inputDate.equals(that.inputDate) : that.inputDate != null) return false;
        if (isUsed != null ? !isUsed.equals(that.isUsed) : that.isUsed != null) return false;
        if (isDel != null ? !isDel.equals(that.isDel) : that.isDel != null) return false;
        if (uniqueId != null ? !uniqueId.equals(that.uniqueId) : that.uniqueId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (depotId != null ? depotId.hashCode() : 0);
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + (billId != null ? billId.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (money != null ? money.hashCode() : 0);
        result = 31 * result + (opType != null ? opType.hashCode() : 0);
        result = 31 * result + (opSource != null ? opSource.hashCode() : 0);
        result = 31 * result + (inputUserId != null ? inputUserId.hashCode() : 0);
        result = 31 * result + (inputDate != null ? inputDate.hashCode() : 0);
        result = 31 * result + (isUsed != null ? isUsed.hashCode() : 0);
        result = 31 * result + (isDel != null ? isDel.hashCode() : 0);
        result = 31 * result + (uniqueId != null ? uniqueId.hashCode() : 0);
        return result;
    }
}
