package com.qualitysystem.Entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "w_yonghu", schema = "dbo", catalog = "hengshui_jiliang")
public class WYonghuEntity {
    private int fId;
    private String fUserName;
    private String fPwd;
    private String fCellphone;
    private String fToken;
    private Timestamp fLastLoginTime;
    private Timestamp fRegistertime;
    private String fCompanyName;
    private String fCompanyAddress;
    private String fCompanyContacts;
    private String fCompanyContactsNumber;
    private String fCompanyFax;
    private String fCompanyCounty;
    private String fZuzhiDaima;
    private String fQiyeId;
    private Integer fWanshan;
    private Integer ifAdmin;

    @Basic
    @Column(name = "f_id")
    public int getfId() {
        return fId;
    }

    public void setfId(int fId) {
        this.fId = fId;
    }

    @Basic
    @Column(name = "f_user_name")
    public String getfUserName() {
        return fUserName;
    }

    public void setfUserName(String fUserName) {
        this.fUserName = fUserName;
    }

    @Basic
    @Column(name = "f_pwd")
    public String getfPwd() {
        return fPwd;
    }

    public void setfPwd(String fPwd) {
        this.fPwd = fPwd;
    }

    @Basic
    @Column(name = "f_cellphone")
    public String getfCellphone() {
        return fCellphone;
    }

    public void setfCellphone(String fCellphone) {
        this.fCellphone = fCellphone;
    }

    @Basic
    @Column(name = "f_token")
    public String getfToken() {
        return fToken;
    }

    public void setfToken(String fToken) {
        this.fToken = fToken;
    }

    @Basic
    @Column(name = "f_last_login_time")
    public Timestamp getfLastLoginTime() {
        return fLastLoginTime;
    }

    public void setfLastLoginTime(Timestamp fLastLoginTime) {
        this.fLastLoginTime = fLastLoginTime;
    }

    @Basic
    @Column(name = "f_registertime")
    public Timestamp getfRegistertime() {
        return fRegistertime;
    }

    public void setfRegistertime(Timestamp fRegistertime) {
        this.fRegistertime = fRegistertime;
    }

    @Basic
    @Column(name = "f_company_name")
    public String getfCompanyName() {
        return fCompanyName;
    }

    public void setfCompanyName(String fCompanyName) {
        this.fCompanyName = fCompanyName;
    }

    @Basic
    @Column(name = "f_company_address")
    public String getfCompanyAddress() {
        return fCompanyAddress;
    }

    public void setfCompanyAddress(String fCompanyAddress) {
        this.fCompanyAddress = fCompanyAddress;
    }

    @Basic
    @Column(name = "f_company_contacts")
    public String getfCompanyContacts() {
        return fCompanyContacts;
    }

    public void setfCompanyContacts(String fCompanyContacts) {
        this.fCompanyContacts = fCompanyContacts;
    }

    @Basic
    @Column(name = "f_company_contacts_number")
    public String getfCompanyContactsNumber() {
        return fCompanyContactsNumber;
    }

    public void setfCompanyContactsNumber(String fCompanyContactsNumber) {
        this.fCompanyContactsNumber = fCompanyContactsNumber;
    }

    @Basic
    @Column(name = "f_company_fax")
    public String getfCompanyFax() {
        return fCompanyFax;
    }

    public void setfCompanyFax(String fCompanyFax) {
        this.fCompanyFax = fCompanyFax;
    }

    @Basic
    @Column(name = "f_company_county")
    public String getfCompanyCounty() {
        return fCompanyCounty;
    }

    public void setfCompanyCounty(String fCompanyCounty) {
        this.fCompanyCounty = fCompanyCounty;
    }

    @Basic
    @Column(name = "f_zuzhi_daima")
    public String getfZuzhiDaima() {
        return fZuzhiDaima;
    }

    public void setfZuzhiDaima(String fZuzhiDaima) {
        this.fZuzhiDaima = fZuzhiDaima;
    }

    @Basic
    @Column(name = "f_qiye_id")
    public String getfQiyeId() {
        return fQiyeId;
    }

    public void setfQiyeId(String fQiyeId) {
        this.fQiyeId = fQiyeId;
    }

    @Basic
    @Column(name = "f_wanshan")
    public Integer getfWanshan() {
        return fWanshan;
    }

    public void setfWanshan(Integer fWanshan) {
        this.fWanshan = fWanshan;
    }

    @Basic
    @Column(name = "if_admin")
    public Integer getIfAdmin() {
        return ifAdmin;
    }

    public void setIfAdmin(Integer ifAdmin) {
        this.ifAdmin = ifAdmin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WYonghuEntity that = (WYonghuEntity) o;
        return fId == that.fId &&
                Objects.equals(fUserName, that.fUserName) &&
                Objects.equals(fPwd, that.fPwd) &&
                Objects.equals(fCellphone, that.fCellphone) &&
                Objects.equals(fToken, that.fToken) &&
                Objects.equals(fLastLoginTime, that.fLastLoginTime) &&
                Objects.equals(fRegistertime, that.fRegistertime) &&
                Objects.equals(fCompanyName, that.fCompanyName) &&
                Objects.equals(fCompanyAddress, that.fCompanyAddress) &&
                Objects.equals(fCompanyContacts, that.fCompanyContacts) &&
                Objects.equals(fCompanyContactsNumber, that.fCompanyContactsNumber) &&
                Objects.equals(fCompanyFax, that.fCompanyFax) &&
                Objects.equals(fCompanyCounty, that.fCompanyCounty) &&
                Objects.equals(fZuzhiDaima, that.fZuzhiDaima) &&
                Objects.equals(fQiyeId, that.fQiyeId) &&
                Objects.equals(fWanshan, that.fWanshan) &&
                Objects.equals(ifAdmin, that.ifAdmin);
    }

    @Override
    public int hashCode() {

        return Objects.hash(fId, fUserName, fPwd, fCellphone, fToken, fLastLoginTime, fRegistertime, fCompanyName, fCompanyAddress, fCompanyContacts, fCompanyContactsNumber, fCompanyFax, fCompanyCounty, fZuzhiDaima, fQiyeId, fWanshan, ifAdmin);
    }
}
