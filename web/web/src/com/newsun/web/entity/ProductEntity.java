package com.newsun.web.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * Created with IntelliJ IDEA.
 * Description: com.newsun.web.entity
 * User: diyaguang
 * Date: 2017-09-07 4:22 PM
 */
@Entity
@Table(name = "Product", schema = "dygstudio", catalog = "")
public class ProductEntity {
    private String id;
    private String name;
    private String code;
    private String model;
    private String area;
    private String barCode;
    private BigDecimal duty;
    private Integer masterUnit;
    private Integer assistUnit;
    private BigDecimal unitChange;
    private Integer type;
    private String providerId;
    private String depositPlace;
    private String note;
    private String inputUserId;
    private Date inputDate;
    private String modifyUserId;
    private Date modifyDate;
    private Integer state;
    private Integer isDel;
    private String imagePath;
    private String shortName;
    private String categoryOne;
    private String categoryTwo;
    private String depotId;

    @Id
    @Column(name = "ID", nullable = false, length = 40)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Name", nullable = true, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    @Column(name = "Model", nullable = true, length = 300)
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Basic
    @Column(name = "Area", nullable = true, length = 50)
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Basic
    @Column(name = "BarCode", nullable = true, length = 100)
    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    @Basic
    @Column(name = "Duty", nullable = true, precision = 2)
    public BigDecimal getDuty() {
        return duty;
    }

    public void setDuty(BigDecimal duty) {
        this.duty = duty;
    }

    @Basic
    @Column(name = "MasterUnit", nullable = true)
    public Integer getMasterUnit() {
        return masterUnit;
    }

    public void setMasterUnit(Integer masterUnit) {
        this.masterUnit = masterUnit;
    }

    @Basic
    @Column(name = "AssistUnit", nullable = true)
    public Integer getAssistUnit() {
        return assistUnit;
    }

    public void setAssistUnit(Integer assistUnit) {
        this.assistUnit = assistUnit;
    }

    @Basic
    @Column(name = "UnitChange", nullable = true, precision = 2)
    public BigDecimal getUnitChange() {
        return unitChange;
    }

    public void setUnitChange(BigDecimal unitChange) {
        this.unitChange = unitChange;
    }

    @Basic
    @Column(name = "Type", nullable = true)
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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
    @Column(name = "DepositPlace", nullable = true, length = 200)
    public String getDepositPlace() {
        return depositPlace;
    }

    public void setDepositPlace(String depositPlace) {
        this.depositPlace = depositPlace;
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
    @Column(name = "ImagePath", nullable = true, length = 300)
    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    @Basic
    @Column(name = "ShortName", nullable = true, length = 50)
    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @Basic
    @Column(name = "CategoryOne", nullable = true, length = 40)
    public String getCategoryOne() {
        return categoryOne;
    }

    public void setCategoryOne(String categoryOne) {
        this.categoryOne = categoryOne;
    }

    @Basic
    @Column(name = "CategoryTwo", nullable = true, length = 40)
    public String getCategoryTwo() {
        return categoryTwo;
    }

    public void setCategoryTwo(String categoryTwo) {
        this.categoryTwo = categoryTwo;
    }

    @Basic
    @Column(name = "DepotID", nullable = true, length = 40)
    public String getDepotId() {
        return depotId;
    }

    public void setDepotId(String depotId) {
        this.depotId = depotId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductEntity that = (ProductEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (model != null ? !model.equals(that.model) : that.model != null) return false;
        if (area != null ? !area.equals(that.area) : that.area != null) return false;
        if (barCode != null ? !barCode.equals(that.barCode) : that.barCode != null) return false;
        if (duty != null ? !duty.equals(that.duty) : that.duty != null) return false;
        if (masterUnit != null ? !masterUnit.equals(that.masterUnit) : that.masterUnit != null) return false;
        if (assistUnit != null ? !assistUnit.equals(that.assistUnit) : that.assistUnit != null) return false;
        if (unitChange != null ? !unitChange.equals(that.unitChange) : that.unitChange != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (providerId != null ? !providerId.equals(that.providerId) : that.providerId != null) return false;
        if (depositPlace != null ? !depositPlace.equals(that.depositPlace) : that.depositPlace != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (inputUserId != null ? !inputUserId.equals(that.inputUserId) : that.inputUserId != null) return false;
        if (inputDate != null ? !inputDate.equals(that.inputDate) : that.inputDate != null) return false;
        if (modifyUserId != null ? !modifyUserId.equals(that.modifyUserId) : that.modifyUserId != null) return false;
        if (modifyDate != null ? !modifyDate.equals(that.modifyDate) : that.modifyDate != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (isDel != null ? !isDel.equals(that.isDel) : that.isDel != null) return false;
        if (imagePath != null ? !imagePath.equals(that.imagePath) : that.imagePath != null) return false;
        if (shortName != null ? !shortName.equals(that.shortName) : that.shortName != null) return false;
        if (categoryOne != null ? !categoryOne.equals(that.categoryOne) : that.categoryOne != null) return false;
        if (categoryTwo != null ? !categoryTwo.equals(that.categoryTwo) : that.categoryTwo != null) return false;
        if (depotId != null ? !depotId.equals(that.depotId) : that.depotId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (area != null ? area.hashCode() : 0);
        result = 31 * result + (barCode != null ? barCode.hashCode() : 0);
        result = 31 * result + (duty != null ? duty.hashCode() : 0);
        result = 31 * result + (masterUnit != null ? masterUnit.hashCode() : 0);
        result = 31 * result + (assistUnit != null ? assistUnit.hashCode() : 0);
        result = 31 * result + (unitChange != null ? unitChange.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (providerId != null ? providerId.hashCode() : 0);
        result = 31 * result + (depositPlace != null ? depositPlace.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (inputUserId != null ? inputUserId.hashCode() : 0);
        result = 31 * result + (inputDate != null ? inputDate.hashCode() : 0);
        result = 31 * result + (modifyUserId != null ? modifyUserId.hashCode() : 0);
        result = 31 * result + (modifyDate != null ? modifyDate.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (isDel != null ? isDel.hashCode() : 0);
        result = 31 * result + (imagePath != null ? imagePath.hashCode() : 0);
        result = 31 * result + (shortName != null ? shortName.hashCode() : 0);
        result = 31 * result + (categoryOne != null ? categoryOne.hashCode() : 0);
        result = 31 * result + (categoryTwo != null ? categoryTwo.hashCode() : 0);
        result = 31 * result + (depotId != null ? depotId.hashCode() : 0);
        return result;
    }
}
