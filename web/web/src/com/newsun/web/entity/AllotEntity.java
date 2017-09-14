package com.newsun.web.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Allot", schema = "dygstudio", catalog = "")
public class AllotEntity {
    private String id;
    private String code;
    private String inDepotId;
    private String outDepotId;
    private String userId;
    private String carId;
    private String address;
    private Integer isUseCar;
    private Date outDate;
    private Date inDate;
    private String note;
    private Integer state;
    private Integer approveState;
    private String inputUserId;
    private Date inputDate;
    private String modifyUserId;
    private Date modifyDate;
    private Integer isDel;
    private String editId;
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
    @Column(name = "InDepotID")
    public String getInDepotId() {
        return inDepotId;
    }

    public void setInDepotId(String inDepotId) {
        this.inDepotId = inDepotId;
    }

    @Basic
    @Column(name = "OutDepotID")
    public String getOutDepotId() {
        return outDepotId;
    }

    public void setOutDepotId(String outDepotId) {
        this.outDepotId = outDepotId;
    }

    @Basic
    @Column(name = "UserID")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "CarID")
    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    @Basic
    @Column(name = "Address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "IsUseCar")
    public Integer getIsUseCar() {
        return isUseCar;
    }

    public void setIsUseCar(Integer isUseCar) {
        this.isUseCar = isUseCar;
    }

    @Basic
    @Column(name = "OutDate")
    public Date getOutDate() {
        return outDate;
    }

    public void setOutDate(Date outDate) {
        this.outDate = outDate;
    }

    @Basic
    @Column(name = "InDate")
    public Date getInDate() {
        return inDate;
    }

    public void setInDate(Date inDate) {
        this.inDate = inDate;
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
    @Column(name = "ApproveState")
    public Integer getApproveState() {
        return approveState;
    }

    public void setApproveState(Integer approveState) {
        this.approveState = approveState;
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
    @Column(name = "ModifyUserID")
    public String getModifyUserId() {
        return modifyUserId;
    }

    public void setModifyUserId(String modifyUserId) {
        this.modifyUserId = modifyUserId;
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
    @Column(name = "EditID")
    public String getEditId() {
        return editId;
    }

    public void setEditId(String editId) {
        this.editId = editId;
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

        AllotEntity that = (AllotEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (inDepotId != null ? !inDepotId.equals(that.inDepotId) : that.inDepotId != null) return false;
        if (outDepotId != null ? !outDepotId.equals(that.outDepotId) : that.outDepotId != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (carId != null ? !carId.equals(that.carId) : that.carId != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (isUseCar != null ? !isUseCar.equals(that.isUseCar) : that.isUseCar != null) return false;
        if (outDate != null ? !outDate.equals(that.outDate) : that.outDate != null) return false;
        if (inDate != null ? !inDate.equals(that.inDate) : that.inDate != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (approveState != null ? !approveState.equals(that.approveState) : that.approveState != null) return false;
        if (inputUserId != null ? !inputUserId.equals(that.inputUserId) : that.inputUserId != null) return false;
        if (inputDate != null ? !inputDate.equals(that.inputDate) : that.inputDate != null) return false;
        if (modifyUserId != null ? !modifyUserId.equals(that.modifyUserId) : that.modifyUserId != null) return false;
        if (modifyDate != null ? !modifyDate.equals(that.modifyDate) : that.modifyDate != null) return false;
        if (isDel != null ? !isDel.equals(that.isDel) : that.isDel != null) return false;
        if (editId != null ? !editId.equals(that.editId) : that.editId != null) return false;
        if (bookId != null ? !bookId.equals(that.bookId) : that.bookId != null) return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (inDepotId != null ? inDepotId.hashCode() : 0);
        result = 31 * result + (outDepotId != null ? outDepotId.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (carId != null ? carId.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (isUseCar != null ? isUseCar.hashCode() : 0);
        result = 31 * result + (outDate != null ? outDate.hashCode() : 0);
        result = 31 * result + (inDate != null ? inDate.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (approveState != null ? approveState.hashCode() : 0);
        result = 31 * result + (inputUserId != null ? inputUserId.hashCode() : 0);
        result = 31 * result + (inputDate != null ? inputDate.hashCode() : 0);
        result = 31 * result + (modifyUserId != null ? modifyUserId.hashCode() : 0);
        result = 31 * result + (modifyDate != null ? modifyDate.hashCode() : 0);
        result = 31 * result + (isDel != null ? isDel.hashCode() : 0);
        result = 31 * result + (editId != null ? editId.hashCode() : 0);
        result = 31 * result + (bookId != null ? bookId.hashCode() : 0);
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        return result;
    }
}
