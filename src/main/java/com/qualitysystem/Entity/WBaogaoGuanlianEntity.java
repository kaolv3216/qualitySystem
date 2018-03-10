package com.qualitysystem.Entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "w_baogao_guanlian", schema = "dbo", catalog = "hengshui_jiliang")
public class WBaogaoGuanlianEntity {

    private int id;
    private Integer fQijuId;
    private String indexUrl;
    private String zhengUrl;
    private String beiUrl;
    private String name;

    @Basic
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "index_url")
    public String getIndexUrl() {
        return indexUrl;
    }

    public void setIndexUrl(String indexUrl) {
        this.indexUrl = indexUrl;
    }

    @Basic
    @Column(name = "zheng_url")
    public String getZhengUrl() {
        return zhengUrl;
    }

    public void setZhengUrl(String zhengUrl) {
        this.zhengUrl = zhengUrl;
    }

    @Basic
    @Column(name = "bei_url")
    public String getBeiUrl() {
        return beiUrl;
    }

    public void setBeiUrl(String beiUrl) {
        this.beiUrl = beiUrl;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WBaogaoGuanlianEntity that = (WBaogaoGuanlianEntity) o;
        return id == that.id &&
                Objects.equals(fQijuId, that.fQijuId) &&
                Objects.equals(indexUrl, that.indexUrl) &&
                Objects.equals(zhengUrl, that.zhengUrl) &&
                Objects.equals(beiUrl, that.beiUrl) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, fQijuId, indexUrl, zhengUrl, beiUrl, name);
    }
}
