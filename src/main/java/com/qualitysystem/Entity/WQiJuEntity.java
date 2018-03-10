package com.qualitysystem.Entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "w_QiJu", schema = "dbo", catalog = "hengshui_jiliang")
public class WQiJuEntity {
    private int fId;
    private String fDanWei;
    private Integer fQijuId;
    private Integer fStatus;

    @Basic
    @Column(name = "f_id")
    public int getfId() {
        return fId;
    }

    public void setfId(int fId) {
        this.fId = fId;
    }

    @Basic
    @Column(name = "f_DanWei")
    public String getfDanWei() {
        return fDanWei;
    }

    public void setfDanWei(String fDanWei) {
        this.fDanWei = fDanWei;
    }

    @Basic
    @Column(name = "f_qiju_id")
    public Integer getfQijuId() {
        return fQijuId;
    }

    public void setfQijuId(Integer fQijuId) {
        this.fQijuId = fQijuId;
    }

    @Basic
    @Column(name = "f_status")
    public Integer getfStatus() {
        return fStatus;
    }

    public void setfStatus(Integer fStatus) {
        this.fStatus = fStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WQiJuEntity that = (WQiJuEntity) o;
        return fId == that.fId &&
                Objects.equals(fDanWei, that.fDanWei) &&
                Objects.equals(fQijuId, that.fQijuId) &&
                Objects.equals(fStatus, that.fStatus);
    }

    @Override
    public int hashCode() {

        return Objects.hash(fId, fDanWei, fQijuId, fStatus);
    }
}
