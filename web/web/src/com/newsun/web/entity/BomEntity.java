package com.newsun.web.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

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
    @Column(name = "Code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    @Column(name = "Amount")
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
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
    @Column(name = "State")
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Basic
    @Column(name = "InputUserID")
    public String getInputUserId() {
        return inputUserId;
    }

    public void setInputUserId(String inputUserId) {
        this.inputUserId = inputUserId;
    }

    @Basic
    @Column(name = "InputDate")
    public Date getInputDate() {
        return inputDate;
    }

    public void setInputDate(Date inputDate) {
        this.inputDate = inputDate;
    }

    @Basic
    @Column(name = "ModfiyUserID")
    public String getModfiyUserId() {
        return modfiyUserId;
    }

    public void setModfiyUserId(String modfiyUserId) {
        this.modfiyUserId = modfiyUserId;
    }

    @Basic
    @Column(name = "ModifyDate")
    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Basic
    @Column(name = "IsDel")
    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
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
    @Column(name = "EditID")
    public String getEditId() {
        return editId;
    }

    public void setEditId(String editId) {
        this.editId = editId;
    }

    @Basic
    @Column(name = "ApproveState")
    public Integer getApproveState() {
        return approveState;
    }

    public void setApproveState(Integer approveState) {
        this.approveState = approveState;
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
        if (bookId != null ? !bookId.equals(bomEntity.bookId) : bomEntity.bookId != null) return false;
        if (companyId != null ? !companyId.equals(bomEntity.companyId) : bomEntity.companyId != null) return false;

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
        result = 31 * result + (bookId != null ? bookId.hashCode() : 0);
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        return result;
    }
}
