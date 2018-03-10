package com.qualitysystem.Entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "w_YuanShiJiLuGuanXi", schema = "dbo", catalog = "hengshui_jiliang")
public class WYuanShiJiLuGuanXiEntity {
    private int fId;
    private Integer fQijuId;
    private String fUrl;
    private String fTableName;
    private Integer fGeshu;

    @Basic
    @Column(name = "f_id")
    public int getfId() {
        return fId;
    }

    public void setfId(int fId) {
        this.fId = fId;
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
    @Column(name = "f_url")
    public String getfUrl() {
        return fUrl;
    }

    public void setfUrl(String fUrl) {
        this.fUrl = fUrl;
    }

    @Basic
    @Column(name = "f_table_name")
    public String getfTableName() {
        return fTableName;
    }

    public void setfTableName(String fTableName) {
        this.fTableName = fTableName;
    }

    @Basic
    @Column(name = "f_geshu")
    public Integer getfGeshu() {
        return fGeshu;
    }

    public void setfGeshu(Integer fGeshu) {
        this.fGeshu = fGeshu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WYuanShiJiLuGuanXiEntity that = (WYuanShiJiLuGuanXiEntity) o;
        return fId == that.fId &&
                Objects.equals(fQijuId, that.fQijuId) &&
                Objects.equals(fUrl, that.fUrl) &&
                Objects.equals(fTableName, that.fTableName) &&
                Objects.equals(fGeshu, that.fGeshu);
    }

    @Override
    public int hashCode() {

        return Objects.hash(fId, fQijuId, fUrl, fTableName, fGeshu);
    }
}
