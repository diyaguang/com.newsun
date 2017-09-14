package com.newsun.web.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Provider", schema = "dygstudio", catalog = "")
public class ProviderEntity {
    private String id;
    private String code;
    private String name;
    private String companyName;
    private String userId;
    private String industry;
    private String dutyId;
    private String registerAddress;
    private String bank;
    private String bankAccount;
    private String web;
    private Integer provideType;
    private Integer dependencyType;
    private String owenName;
    private String phone;
    private String address;
    private String payMode;
    private String note;
    private String inputUserId;
    private Date inputDate;
    private String modifyUserId;
    private Date modifyDate;
    private Integer state;
    private Integer isDel;
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
    @Column(name = "CompanyName")
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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
    @Column(name = "Industry")
    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    @Basic
    @Column(name = "DutyID")
    public String getDutyId() {
        return dutyId;
    }

    public void setDutyId(String dutyId) {
        this.dutyId = dutyId;
    }

    @Basic
    @Column(name = "RegisterAddress")
    public String getRegisterAddress() {
        return registerAddress;
    }

    public void setRegisterAddress(String registerAddress) {
        this.registerAddress = registerAddress;
    }

    @Basic
    @Column(name = "Bank")
    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    @Basic
    @Column(name = "BankAccount")
    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Basic
    @Column(name = "Web")
    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    @Basic
    @Column(name = "ProvideType")
    public Integer getProvideType() {
        return provideType;
    }

    public void setProvideType(Integer provideType) {
        this.provideType = provideType;
    }

    @Basic
    @Column(name = "DependencyType")
    public Integer getDependencyType() {
        return dependencyType;
    }

    public void setDependencyType(Integer dependencyType) {
        this.dependencyType = dependencyType;
    }

    @Basic
    @Column(name = "OwenName")
    public String getOwenName() {
        return owenName;
    }

    public void setOwenName(String owenName) {
        this.owenName = owenName;
    }

    @Basic
    @Column(name = "Phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
    @Column(name = "PayMode")
    public String getPayMode() {
        return payMode;
    }

    public void setPayMode(String payMode) {
        this.payMode = payMode;
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
    @Column(name = "State")
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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

        ProviderEntity that = (ProviderEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (companyName != null ? !companyName.equals(that.companyName) : that.companyName != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (industry != null ? !industry.equals(that.industry) : that.industry != null) return false;
        if (dutyId != null ? !dutyId.equals(that.dutyId) : that.dutyId != null) return false;
        if (registerAddress != null ? !registerAddress.equals(that.registerAddress) : that.registerAddress != null)
            return false;
        if (bank != null ? !bank.equals(that.bank) : that.bank != null) return false;
        if (bankAccount != null ? !bankAccount.equals(that.bankAccount) : that.bankAccount != null) return false;
        if (web != null ? !web.equals(that.web) : that.web != null) return false;
        if (provideType != null ? !provideType.equals(that.provideType) : that.provideType != null) return false;
        if (dependencyType != null ? !dependencyType.equals(that.dependencyType) : that.dependencyType != null)
            return false;
        if (owenName != null ? !owenName.equals(that.owenName) : that.owenName != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (payMode != null ? !payMode.equals(that.payMode) : that.payMode != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (inputUserId != null ? !inputUserId.equals(that.inputUserId) : that.inputUserId != null) return false;
        if (inputDate != null ? !inputDate.equals(that.inputDate) : that.inputDate != null) return false;
        if (modifyUserId != null ? !modifyUserId.equals(that.modifyUserId) : that.modifyUserId != null) return false;
        if (modifyDate != null ? !modifyDate.equals(that.modifyDate) : that.modifyDate != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (isDel != null ? !isDel.equals(that.isDel) : that.isDel != null) return false;
        if (bookId != null ? !bookId.equals(that.bookId) : that.bookId != null) return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (companyName != null ? companyName.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (industry != null ? industry.hashCode() : 0);
        result = 31 * result + (dutyId != null ? dutyId.hashCode() : 0);
        result = 31 * result + (registerAddress != null ? registerAddress.hashCode() : 0);
        result = 31 * result + (bank != null ? bank.hashCode() : 0);
        result = 31 * result + (bankAccount != null ? bankAccount.hashCode() : 0);
        result = 31 * result + (web != null ? web.hashCode() : 0);
        result = 31 * result + (provideType != null ? provideType.hashCode() : 0);
        result = 31 * result + (dependencyType != null ? dependencyType.hashCode() : 0);
        result = 31 * result + (owenName != null ? owenName.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (payMode != null ? payMode.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (inputUserId != null ? inputUserId.hashCode() : 0);
        result = 31 * result + (inputDate != null ? inputDate.hashCode() : 0);
        result = 31 * result + (modifyUserId != null ? modifyUserId.hashCode() : 0);
        result = 31 * result + (modifyDate != null ? modifyDate.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (isDel != null ? isDel.hashCode() : 0);
        result = 31 * result + (bookId != null ? bookId.hashCode() : 0);
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        return result;
    }
}
