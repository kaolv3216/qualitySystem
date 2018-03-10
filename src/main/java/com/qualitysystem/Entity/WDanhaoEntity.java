package com.qualitysystem.Entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "w_danhao", schema = "dbo", catalog = "hengshui_jiliang")
public class WDanhaoEntity {
    private Integer fDanhao;

    @Basic
    @Column(name = "f_danhao")
    public Integer getfDanhao() {
        return fDanhao;
    }

    public void setfDanhao(Integer fDanhao) {
        this.fDanhao = fDanhao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WDanhaoEntity that = (WDanhaoEntity) o;
        return Objects.equals(fDanhao, that.fDanhao);
    }

    @Override
    public int hashCode() {

        return Objects.hash(fDanhao);
    }
}
