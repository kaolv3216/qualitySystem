package com.qualitysystem.Entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "w_yonghugaimima", schema = "dbo", catalog = "hengshui_jiliang")
public class WYonghugaimimaEntity {
    private int fId;
    private Integer fUserId;
    private Timestamp fXiuGaiRiQi;
    private Integer fLeiXing;

    @Basic
    @Column(name = "f_id")
    public int getfId() {
        return fId;
    }

    public void setfId(int fId) {
        this.fId = fId;
    }

    @Basic
    @Column(name = "f_user_id")
    public Integer getfUserId() {
        return fUserId;
    }

    public void setfUserId(Integer fUserId) {
        this.fUserId = fUserId;
    }

    @Basic
    @Column(name = "f_XiuGaiRiQi")
    public Timestamp getfXiuGaiRiQi() {
        return fXiuGaiRiQi;
    }

    public void setfXiuGaiRiQi(Timestamp fXiuGaiRiQi) {
        this.fXiuGaiRiQi = fXiuGaiRiQi;
    }

    @Basic
    @Column(name = "f_LeiXing")
    public Integer getfLeiXing() {
        return fLeiXing;
    }

    public void setfLeiXing(Integer fLeiXing) {
        this.fLeiXing = fLeiXing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WYonghugaimimaEntity that = (WYonghugaimimaEntity) o;
        return fId == that.fId &&
                Objects.equals(fUserId, that.fUserId) &&
                Objects.equals(fXiuGaiRiQi, that.fXiuGaiRiQi) &&
                Objects.equals(fLeiXing, that.fLeiXing);
    }

    @Override
    public int hashCode() {

        return Objects.hash(fId, fUserId, fXiuGaiRiQi, fLeiXing);
    }
}
