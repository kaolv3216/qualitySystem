package com.qualitysystem.Entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "w_cuowuxinxi", schema = "dbo", catalog = "hengshui_jiliang")
public class WCuowuxinxiEntity {
    private int fId;
    private Integer fWeiTuoId;
    private String fCuowuxinxi;
    private String fShenqingren;
    private Timestamp fCreateTime;
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
    @Column(name = "f_WeiTuo_id")
    public Integer getfWeiTuoId() {
        return fWeiTuoId;
    }

    public void setfWeiTuoId(Integer fWeiTuoId) {
        this.fWeiTuoId = fWeiTuoId;
    }

    @Basic
    @Column(name = "f_cuowuxinxi")
    public String getfCuowuxinxi() {
        return fCuowuxinxi;
    }

    public void setfCuowuxinxi(String fCuowuxinxi) {
        this.fCuowuxinxi = fCuowuxinxi;
    }

    @Basic
    @Column(name = "f_shenqingren")
    public String getfShenqingren() {
        return fShenqingren;
    }

    public void setfShenqingren(String fShenqingren) {
        this.fShenqingren = fShenqingren;
    }

    @Basic
    @Column(name = "f_create_time")
    public Timestamp getfCreateTime() {
        return fCreateTime;
    }

    public void setfCreateTime(Timestamp fCreateTime) {
        this.fCreateTime = fCreateTime;
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
        WCuowuxinxiEntity that = (WCuowuxinxiEntity) o;
        return fId == that.fId &&
                Objects.equals(fWeiTuoId, that.fWeiTuoId) &&
                Objects.equals(fCuowuxinxi, that.fCuowuxinxi) &&
                Objects.equals(fShenqingren, that.fShenqingren) &&
                Objects.equals(fCreateTime, that.fCreateTime) &&
                Objects.equals(fStatus, that.fStatus);
    }

    @Override
    public int hashCode() {

        return Objects.hash(fId, fWeiTuoId, fCuowuxinxi, fShenqingren, fCreateTime, fStatus);
    }
}
