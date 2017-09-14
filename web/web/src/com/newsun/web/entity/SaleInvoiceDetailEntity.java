package com.newsun.web.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name = "SaleInvoiceDetail", schema = "dygstudio", catalog = "")
public class SaleInvoiceDetailEntity {
    private String id;
    private String saleInvoiceId;
    private String saleId;
    private Integer billType;
    private Date billDate;
    private BigDecimal money;
    private String billCode;
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
    @Column(name = "SaleInvoiceID")
    public String getSaleInvoiceId() {
        return saleInvoiceId;
    }

    public void setSaleInvoiceId(String saleInvoiceId) {
        this.saleInvoiceId = saleInvoiceId;
    }

    @Basic
    @Column(name = "SaleID")
    public String getSaleId() {
        return saleId;
    }

    public void setSaleId(String saleId) {
        this.saleId = saleId;
    }

    @Basic
    @Column(name = "BillType")
    public Integer getBillType() {
        return billType;
    }

    public void setBillType(Integer billType) {
        this.billType = billType;
    }

    @Basic
    @Column(name = "BillDate")
    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    @Basic
    @Column(name = "Money")
    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    @Basic
    @Column(name = "BillCode")
    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
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

        SaleInvoiceDetailEntity that = (SaleInvoiceDetailEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (saleInvoiceId != null ? !saleInvoiceId.equals(that.saleInvoiceId) : that.saleInvoiceId != null)
            return false;
        if (saleId != null ? !saleId.equals(that.saleId) : that.saleId != null) return false;
        if (billType != null ? !billType.equals(that.billType) : that.billType != null) return false;
        if (billDate != null ? !billDate.equals(that.billDate) : that.billDate != null) return false;
        if (money != null ? !money.equals(that.money) : that.money != null) return false;
        if (billCode != null ? !billCode.equals(that.billCode) : that.billCode != null) return false;
        if (bookId != null ? !bookId.equals(that.bookId) : that.bookId != null) return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (saleInvoiceId != null ? saleInvoiceId.hashCode() : 0);
        result = 31 * result + (saleId != null ? saleId.hashCode() : 0);
        result = 31 * result + (billType != null ? billType.hashCode() : 0);
        result = 31 * result + (billDate != null ? billDate.hashCode() : 0);
        result = 31 * result + (money != null ? money.hashCode() : 0);
        result = 31 * result + (billCode != null ? billCode.hashCode() : 0);
        result = 31 * result + (bookId != null ? bookId.hashCode() : 0);
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        return result;
    }
}
