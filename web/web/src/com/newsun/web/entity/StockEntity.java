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
@Table(name = "Stock", schema = "dygstudio", catalog = "")
public class StockEntity {
    private String id;
    private String code;
    private String providerId;
    private Date bespeakDate;
    private Date forecastDate;
    private String inDepotCode;
    private String depotId;
    private String userId;
    private Integer stockType;
    private Integer conveyanceType;
    private String payNote;
    private String note;
    private Integer productState;
    private BigDecimal amount;
    private BigDecimal money;
    private Integer state;
    private Integer isDel;
    private String inputUserId;
    private Date inputDate;
    private String modifyUserId;
    private Date modifyDate;
    private Integer approveState;
    private String editId;
    private String inDepotId;
    private Date inDepotDate;

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
    @Column(name = "ProviderID", nullable = true, length = 40)
    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    @Basic
    @Column(name = "BespeakDate", nullable = true)
    public Date getBespeakDate() {
        return bespeakDate;
    }

    public void setBespeakDate(Date bespeakDate) {
        this.bespeakDate = bespeakDate;
    }

    @Basic
    @Column(name = "ForecastDate", nullable = true)
    public Date getForecastDate() {
        return forecastDate;
    }

    public void setForecastDate(Date forecastDate) {
        this.forecastDate = forecastDate;
    }

    @Basic
    @Column(name = "InDepotCode", nullable = true, length = 100)
    public String getInDepotCode() {
        return inDepotCode;
    }

    public void setInDepotCode(String inDepotCode) {
        this.inDepotCode = inDepotCode;
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
    @Column(name = "UserID", nullable = true, length = 40)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "StockType", nullable = true)
    public Integer getStockType() {
        return stockType;
    }

    public void setStockType(Integer stockType) {
        this.stockType = stockType;
    }

    @Basic
    @Column(name = "ConveyanceType", nullable = true)
    public Integer getConveyanceType() {
        return conveyanceType;
    }

    public void setConveyanceType(Integer conveyanceType) {
        this.conveyanceType = conveyanceType;
    }

    @Basic
    @Column(name = "PayNote", nullable = true, length = 500)
    public String getPayNote() {
        return payNote;
    }

    public void setPayNote(String payNote) {
        this.payNote = payNote;
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
    @Column(name = "ProductState", nullable = true)
    public Integer getProductState() {
        return productState;
    }

    public void setProductState(Integer productState) {
        this.productState = productState;
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
    @Column(name = "State", nullable = true)
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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
    @Column(name = "ModifyUserID", nullable = true, length = 40)
    public String getModifyUserId() {
        return modifyUserId;
    }

    public void setModifyUserId(String modifyUserId) {
        this.modifyUserId = modifyUserId;
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
    @Column(name = "ApproveState", nullable = true)
    public Integer getApproveState() {
        return approveState;
    }

    public void setApproveState(Integer approveState) {
        this.approveState = approveState;
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
    @Column(name = "InDepotID", nullable = true, length = 40)
    public String getInDepotId() {
        return inDepotId;
    }

    public void setInDepotId(String inDepotId) {
        this.inDepotId = inDepotId;
    }

    @Basic
    @Column(name = "InDepotDate", nullable = true)
    public Date getInDepotDate() {
        return inDepotDate;
    }

    public void setInDepotDate(Date inDepotDate) {
        this.inDepotDate = inDepotDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StockEntity that = (StockEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (providerId != null ? !providerId.equals(that.providerId) : that.providerId != null) return false;
        if (bespeakDate != null ? !bespeakDate.equals(that.bespeakDate) : that.bespeakDate != null) return false;
        if (forecastDate != null ? !forecastDate.equals(that.forecastDate) : that.forecastDate != null) return false;
        if (inDepotCode != null ? !inDepotCode.equals(that.inDepotCode) : that.inDepotCode != null) return false;
        if (depotId != null ? !depotId.equals(that.depotId) : that.depotId != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (stockType != null ? !stockType.equals(that.stockType) : that.stockType != null) return false;
        if (conveyanceType != null ? !conveyanceType.equals(that.conveyanceType) : that.conveyanceType != null)
            return false;
        if (payNote != null ? !payNote.equals(that.payNote) : that.payNote != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (productState != null ? !productState.equals(that.productState) : that.productState != null) return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
        if (money != null ? !money.equals(that.money) : that.money != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (isDel != null ? !isDel.equals(that.isDel) : that.isDel != null) return false;
        if (inputUserId != null ? !inputUserId.equals(that.inputUserId) : that.inputUserId != null) return false;
        if (inputDate != null ? !inputDate.equals(that.inputDate) : that.inputDate != null) return false;
        if (modifyUserId != null ? !modifyUserId.equals(that.modifyUserId) : that.modifyUserId != null) return false;
        if (modifyDate != null ? !modifyDate.equals(that.modifyDate) : that.modifyDate != null) return false;
        if (approveState != null ? !approveState.equals(that.approveState) : that.approveState != null) return false;
        if (editId != null ? !editId.equals(that.editId) : that.editId != null) return false;
        if (inDepotId != null ? !inDepotId.equals(that.inDepotId) : that.inDepotId != null) return false;
        if (inDepotDate != null ? !inDepotDate.equals(that.inDepotDate) : that.inDepotDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (providerId != null ? providerId.hashCode() : 0);
        result = 31 * result + (bespeakDate != null ? bespeakDate.hashCode() : 0);
        result = 31 * result + (forecastDate != null ? forecastDate.hashCode() : 0);
        result = 31 * result + (inDepotCode != null ? inDepotCode.hashCode() : 0);
        result = 31 * result + (depotId != null ? depotId.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (stockType != null ? stockType.hashCode() : 0);
        result = 31 * result + (conveyanceType != null ? conveyanceType.hashCode() : 0);
        result = 31 * result + (payNote != null ? payNote.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (productState != null ? productState.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (money != null ? money.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (isDel != null ? isDel.hashCode() : 0);
        result = 31 * result + (inputUserId != null ? inputUserId.hashCode() : 0);
        result = 31 * result + (inputDate != null ? inputDate.hashCode() : 0);
        result = 31 * result + (modifyUserId != null ? modifyUserId.hashCode() : 0);
        result = 31 * result + (modifyDate != null ? modifyDate.hashCode() : 0);
        result = 31 * result + (approveState != null ? approveState.hashCode() : 0);
        result = 31 * result + (editId != null ? editId.hashCode() : 0);
        result = 31 * result + (inDepotId != null ? inDepotId.hashCode() : 0);
        result = 31 * result + (inDepotDate != null ? inDepotDate.hashCode() : 0);
        return result;
    }
}
