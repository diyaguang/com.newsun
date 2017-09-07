package com.newsun.web.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created with IntelliJ IDEA.
 * Description: com.newsun.web.entity
 * User: diyaguang
 * Date: 2017-09-07 4:22 PM
 */
@Entity
@Table(name = "SMS", schema = "dygstudio", catalog = "")
public class SmsEntity {
    private String id;
    private String code;
    private String message;
    private String userId;
    private Timestamp createDate;
    private String errorInfo;
    private Integer opType;
    private Integer createType;
    private String address;
    private Timestamp sendDate;
    private Integer status;
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
    @Column(name = "Message", nullable = true, length = 1000)
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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
    @Column(name = "CreateDate", nullable = true)
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "ErrorInfo", nullable = true, length = 1000)
    public String getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
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
    @Column(name = "CreateType", nullable = true)
    public Integer getCreateType() {
        return createType;
    }

    public void setCreateType(Integer createType) {
        this.createType = createType;
    }

    @Basic
    @Column(name = "Address", nullable = true, length = 20)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "SendDate", nullable = true)
    public Timestamp getSendDate() {
        return sendDate;
    }

    public void setSendDate(Timestamp sendDate) {
        this.sendDate = sendDate;
    }

    @Basic
    @Column(name = "Status", nullable = true)
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

        SmsEntity smsEntity = (SmsEntity) o;

        if (id != null ? !id.equals(smsEntity.id) : smsEntity.id != null) return false;
        if (code != null ? !code.equals(smsEntity.code) : smsEntity.code != null) return false;
        if (message != null ? !message.equals(smsEntity.message) : smsEntity.message != null) return false;
        if (userId != null ? !userId.equals(smsEntity.userId) : smsEntity.userId != null) return false;
        if (createDate != null ? !createDate.equals(smsEntity.createDate) : smsEntity.createDate != null) return false;
        if (errorInfo != null ? !errorInfo.equals(smsEntity.errorInfo) : smsEntity.errorInfo != null) return false;
        if (opType != null ? !opType.equals(smsEntity.opType) : smsEntity.opType != null) return false;
        if (createType != null ? !createType.equals(smsEntity.createType) : smsEntity.createType != null) return false;
        if (address != null ? !address.equals(smsEntity.address) : smsEntity.address != null) return false;
        if (sendDate != null ? !sendDate.equals(smsEntity.sendDate) : smsEntity.sendDate != null) return false;
        if (status != null ? !status.equals(smsEntity.status) : smsEntity.status != null) return false;
        if (isDel != null ? !isDel.equals(smsEntity.isDel) : smsEntity.isDel != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (message != null ? message.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (errorInfo != null ? errorInfo.hashCode() : 0);
        result = 31 * result + (opType != null ? opType.hashCode() : 0);
        result = 31 * result + (createType != null ? createType.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (sendDate != null ? sendDate.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (isDel != null ? isDel.hashCode() : 0);
        return result;
    }
}
