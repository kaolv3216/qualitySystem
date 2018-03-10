package com.qualitysystem.Entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "w_duanxinyanzhengma", schema = "dbo", catalog = "hengshui_jiliang")
public class WDuanxinyanzhengmaEntity {
    private int fId;
    private String fCellphone;
    private String fIdentifyingCode;
    private Timestamp fSendTime;

    @Basic
    @Column(name = "f_id")
    public int getfId() {
        return fId;
    }

    public void setfId(int fId) {
        this.fId = fId;
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
    @Column(name = "f_identifying_code")
    public String getfIdentifyingCode() {
        return fIdentifyingCode;
    }

    public void setfIdentifyingCode(String fIdentifyingCode) {
        this.fIdentifyingCode = fIdentifyingCode;
    }

    @Basic
    @Column(name = "f_send_time")
    public Timestamp getfSendTime() {
        return fSendTime;
    }

    public void setfSendTime(Timestamp fSendTime) {
        this.fSendTime = fSendTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WDuanxinyanzhengmaEntity that = (WDuanxinyanzhengmaEntity) o;
        return fId == that.fId &&
                Objects.equals(fCellphone, that.fCellphone) &&
                Objects.equals(fIdentifyingCode, that.fIdentifyingCode) &&
                Objects.equals(fSendTime, that.fSendTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(fId, fCellphone, fIdentifyingCode, fSendTime);
    }
}
