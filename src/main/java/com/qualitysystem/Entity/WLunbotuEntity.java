package com.qualitysystem.Entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "w_lunbotu", schema = "dbo", catalog = "hengshui_jiliang")
public class WLunbotuEntity {
    private int fId;
    private String fPicUrl;
    private Timestamp fFoundTime;

    @Basic
    @Column(name = "f_id")
    public int getfId() {
        return fId;
    }

    public void setfId(int fId) {
        this.fId = fId;
    }

    @Basic
    @Column(name = "f_pic_url")
    public String getfPicUrl() {
        return fPicUrl;
    }

    public void setfPicUrl(String fPicUrl) {
        this.fPicUrl = fPicUrl;
    }

    @Basic
    @Column(name = "f_found_time")
    public Timestamp getfFoundTime() {
        return fFoundTime;
    }

    public void setfFoundTime(Timestamp fFoundTime) {
        this.fFoundTime = fFoundTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WLunbotuEntity that = (WLunbotuEntity) o;
        return fId == that.fId &&
                Objects.equals(fPicUrl, that.fPicUrl) &&
                Objects.equals(fFoundTime, that.fFoundTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(fId, fPicUrl, fFoundTime);
    }
}
