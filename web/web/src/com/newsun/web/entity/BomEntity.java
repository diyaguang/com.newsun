package com.newsun.web.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * Created with IntelliJ IDEA.
 * Description: com.newsun.web.entity
 * User: diyaguang
 * Date: 2017-09-07 4:21 PM
 */
@Entity
@Table(name = "Bom", schema = "dygstudio", catalog = "")
public class BomEntity {
    private String id;
    private String code;
    private String name;
    private String productId;
    private Integer amount;
    private String note;
    private Integer state;
    private String inputUserId;
    private Date inputDate;
    private String modfiyUserId;
    private Date modifyDate;
    private Integer isDel;
    private BigDecimal price;
    private String editId;
    private Integer approveState;

    @Id
    @Column(name = "ID", nullable = false, length = 40)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Code", nullable = true, length = 100)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "Name", nullable = true, length = 200)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    @Column(name = "Amount", nullable = true, precision = 0)
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
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
    @Column(name = "State", nullable = true)
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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
    @Column(name = "ModfiyUserID", nullable = true, length = 40)
    public String getModfiyUserId() {
        return modfiyUserId;
    }

    public void setModfiyUserId(String modfiyUserId) {
        this.modfiyUserId = modfiyUserId;
    }

    @Basic
    @Column(name = "ModifyDate", nullable = true)
    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
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
    @Column(name = "Price", nullable = true, precision = 2)
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Basic
    @Column(name = "EditID", nullable = true, length = 40)
    public String getEditId() {
        return editId;
    }

    public void setEditId(String editId) {
        this.editId = editId;
    }

    @Basic
    @Column(name = "ApproveState", nullable = true)
    public Integer getApproveState() {
        return approveState;
    }

    public void setApproveState(Integer approveState) {
        this.approveState = approveState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BomEntity bomEntity = (BomEntity) o;

        if (id != null ? !id.equals(bomEntity.id) : bomEntity.id != null) return false;
        if (code != null ? !code.equals(bomEntity.code) : bomEntity.code != null) return false;
        if (name != null ? !name.equals(bomEntity.name) : bomEntity.name != null) return false;
        if (productId != null ? !productId.equals(bomEntity.productId) : bomEntity.productId != null) return false;
        if (amount != null ? !amount.equals(bomEntity.amount) : bomEntity.amount != null) return false;
        if (note != null ? !note.equals(bomEntity.note) : bomEntity.note != null) return false;
        if (state != null ? !state.equals(bomEntity.state) : bomEntity.state != null) return false;
        if (inputUserId != null ? !inputUserId.equals(bomEntity.inputUserId) : bomEntity.inputUserId != null)
            return false;
        if (inputDate != null ? !inputDate.equals(bomEntity.inputDate) : bomEntity.inputDate != null) return false;
        if (modfiyUserId != null ? !modfiyUserId.equals(bomEntity.modfiyUserId) : bomEntity.modfiyUserId != null)
            return false;
        if (modifyDate != null ? !modifyDate.equals(bomEntity.modifyDate) : bomEntity.modifyDate != null) return false;
        if (isDel != null ? !isDel.equals(bomEntity.isDel) : bomEntity.isDel != null) return false;
        if (price != null ? !price.equals(bomEntity.price) : bomEntity.price != null) return false;
        if (editId != null ? !editId.equals(bomEntity.editId) : bomEntity.editId != null) return false;
        if (approveState != null ? !approveState.equals(bomEntity.approveState) : bomEntity.approveState != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (inputUserId != null ? inputUserId.hashCode() : 0);
        result = 31 * result + (inputDate != null ? inputDate.hashCode() : 0);
        result = 31 * result + (modfiyUserId != null ? modfiyUserId.hashCode() : 0);
        result = 31 * result + (modifyDate != null ? modifyDate.hashCode() : 0);
        result = 31 * result + (isDel != null ? isDel.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (editId != null ? editId.hashCode() : 0);
        result = 31 * result + (approveState != null ? approveState.hashCode() : 0);
        return result;
    }
}
