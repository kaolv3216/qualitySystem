package com.qualitysystem.Entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "w_guanliyuan", schema = "dbo", catalog = "hengshui_jiliang")
public class WGuanliyuanEntity {
    private int fGuanliyuanId;
    private String fMingcheng;
    private String fMima;

    @Basic
    @Column(name = "f_guanliyuan_id")
    public int getfGuanliyuanId() {
        return fGuanliyuanId;
    }

    public void setfGuanliyuanId(int fGuanliyuanId) {
        this.fGuanliyuanId = fGuanliyuanId;
    }

    @Basic
    @Column(name = "f_mingcheng")
    public String getfMingcheng() {
        return fMingcheng;
    }

    public void setfMingcheng(String fMingcheng) {
        this.fMingcheng = fMingcheng;
    }

    @Basic
    @Column(name = "f_mima")
    public String getfMima() {
        return fMima;
    }

    public void setfMima(String fMima) {
        this.fMima = fMima;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WGuanliyuanEntity that = (WGuanliyuanEntity) o;
        return fGuanliyuanId == that.fGuanliyuanId &&
                Objects.equals(fMingcheng, that.fMingcheng) &&
                Objects.equals(fMima, that.fMima);
    }

    @Override
    public int hashCode() {

        return Objects.hash(fGuanliyuanId, fMingcheng, fMima);
    }
}
