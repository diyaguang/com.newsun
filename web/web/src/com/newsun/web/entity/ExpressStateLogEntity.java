package com.newsun.web.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "ExpressStateLog", schema = "dygstudio", catalog = "")
public class ExpressStateLogEntity {
    private String id;
    private Integer expressStateId;
    private Timestamp opDate;
    private Integer stateType;
    private String userId;
    private String note;
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
    @Column(name = "ExpressStateID")
    public Integer getExpressStateId() {
        return expressStateId;
    }

    public void setExpressStateId(Integer expressStateId) {
        this.expressStateId = expressStateId;
    }

    @Basic
    @Column(name = "OpDate")
    public Timestamp getOpDate() {
        return opDate;
    }

    public void setOpDate(Timestamp opDate) {
        this.opDate = opDate;
    }

    @Basic
    @Column(name = "StateType")
    public Integer getStateType() {
        return stateType;
    }

    public void setStateType(Integer stateType) {
        this.stateType = stateType;
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
    @Column(name = "Note")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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

        ExpressStateLogEntity that = (ExpressStateLogEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (expressStateId != null ? !expressStateId.equals(that.expressStateId) : that.expressStateId != null)
            return false;
        if (opDate != null ? !opDate.equals(that.opDate) : that.opDate != null) return false;
        if (stateType != null ? !stateType.equals(that.stateType) : that.stateType != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (bookId != null ? !bookId.equals(that.bookId) : that.bookId != null) return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (expressStateId != null ? expressStateId.hashCode() : 0);
        result = 31 * result + (opDate != null ? opDate.hashCode() : 0);
        result = 31 * result + (stateType != null ? stateType.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (bookId != null ? bookId.hashCode() : 0);
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        return result;
    }
}
