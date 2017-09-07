package com.newsun.web.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created with IntelliJ IDEA.
 * Description: com.newsun.web.entity
 * User: diyaguang
 * Date: 2017-09-07 4:20 PM
 */
@Entity
@Table(name = "Bad", schema = "dygstudio", catalog = "")
public class BadEntity {
    private String id;
    private String code;
    private String depotId;
    private Timestamp badDate;
    private BigDecimal amount;
    private BigDecimal money;
    private String userId;
    private String note;
    private String editId;
    private Integer approveState;
    private String inputUserId;
    private Timestamp inputDate;
    private String modifyUserId;
    private Timestamp modifyDate;
    private Integer isDel;

    @Id
    @Column(name = "ID", nullable = false, length = 40)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Code", nullable = true, length = 50)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
    @Column(name = "BadDate", nullable = true)
    public Timestamp getBadDate() {
        return badDate;
    }

    public void setBadDate(Timestamp badDate) {
        this.badDate = badDate;
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
    @Column(name = "UserID", nullable = true, length = 40)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
    public Timestamp getInputDate() {
        return inputDate;
    }

    public void setInputDate(Timestamp inputDate) {
        this.inputDate = inputDate;
    }

    @Basic
    @Column(name = "ModifyUserID", nullable = true, length = 40)
    public String getModifyUserId() {
        return modifyUserId;
    }

    public void setModifyUserId(String modifyUserId) {
        this.modifyUserId = modifyUserId;
    }

    @Basic
    @Column(name = "ModifyDate", nullable = true)
    public Timestamp getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Timestamp modifyDate) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BadEntity badEntity = (BadEntity) o;

        if (id != null ? !id.equals(badEntity.id) : badEntity.id != null) return false;
        if (code != null ? !code.equals(badEntity.code) : badEntity.code != null) return false;
        if (depotId != null ? !depotId.equals(badEntity.depotId) : badEntity.depotId != null) return false;
        if (badDate != null ? !badDate.equals(badEntity.badDate) : badEntity.badDate != null) return false;
        if (amount != null ? !amount.equals(badEntity.amount) : badEntity.amount != null) return false;
        if (money != null ? !money.equals(badEntity.money) : badEntity.money != null) return false;
        if (userId != null ? !userId.equals(badEntity.userId) : badEntity.userId != null) return false;
        if (note != null ? !note.equals(badEntity.note) : badEntity.note != null) return false;
        if (editId != null ? !editId.equals(badEntity.editId) : badEntity.editId != null) return false;
        if (approveState != null ? !approveState.equals(badEntity.approveState) : badEntity.approveState != null)
            return false;
        if (inputUserId != null ? !inputUserId.equals(badEntity.inputUserId) : badEntity.inputUserId != null)
            return false;
        if (inputDate != null ? !inputDate.equals(badEntity.inputDate) : badEntity.inputDate != null) return false;
        if (modifyUserId != null ? !modifyUserId.equals(badEntity.modifyUserId) : badEntity.modifyUserId != null)
            return false;
        if (modifyDate != null ? !modifyDate.equals(badEntity.modifyDate) : badEntity.modifyDate != null) return false;
        if (isDel != null ? !isDel.equals(badEntity.isDel) : badEntity.isDel != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (depotId != null ? depotId.hashCode() : 0);
        result = 31 * result + (badDate != null ? badDate.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (money != null ? money.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (editId != null ? editId.hashCode() : 0);
        result = 31 * result + (approveState != null ? approveState.hashCode() : 0);
        result = 31 * result + (inputUserId != null ? inputUserId.hashCode() : 0);
        result = 31 * result + (inputDate != null ? inputDate.hashCode() : 0);
        result = 31 * result + (modifyUserId != null ? modifyUserId.hashCode() : 0);
        result = 31 * result + (modifyDate != null ? modifyDate.hashCode() : 0);
        result = 31 * result + (isDel != null ? isDel.hashCode() : 0);
        return result;
    }
}
