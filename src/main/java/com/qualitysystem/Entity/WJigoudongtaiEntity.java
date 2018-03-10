package com.qualitysystem.Entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "w_jigoudongtai", schema = "dbo", catalog = "hengshui_jiliang")
public class WJigoudongtaiEntity {
    private int fId;
    private String fTitle;
    private String fContent;
    private Timestamp fPublishTime;
    private Integer fStatus;
    private Timestamp fXiugaiTime;

    @Basic
    @Column(name = "f_id")
    public int getfId() {
        return fId;
    }

    public void setfId(int fId) {
        this.fId = fId;
    }

    @Basic
    @Column(name = "f_title")
    public String getfTitle() {
        return fTitle;
    }

    public void setfTitle(String fTitle) {
        this.fTitle = fTitle;
    }

    @Basic
    @Column(name = "f_content")
    public String getfContent() {
        return fContent;
    }

    public void setfContent(String fContent) {
        this.fContent = fContent;
    }

    @Basic
    @Column(name = "f_publish_time")
    public Timestamp getfPublishTime() {
        return fPublishTime;
    }

    public void setfPublishTime(Timestamp fPublishTime) {
        this.fPublishTime = fPublishTime;
    }

    @Basic
    @Column(name = "f_status")
    public Integer getfStatus() {
        return fStatus;
    }

    public void setfStatus(Integer fStatus) {
        this.fStatus = fStatus;
    }

    @Basic
    @Column(name = "f_xiugai_time")
    public Timestamp getfXiugaiTime() {
        return fXiugaiTime;
    }

    public void setfXiugaiTime(Timestamp fXiugaiTime) {
        this.fXiugaiTime = fXiugaiTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WJigoudongtaiEntity that = (WJigoudongtaiEntity) o;
        return fId == that.fId &&
                Objects.equals(fTitle, that.fTitle) &&
                Objects.equals(fContent, that.fContent) &&
                Objects.equals(fPublishTime, that.fPublishTime) &&
                Objects.equals(fStatus, that.fStatus) &&
                Objects.equals(fXiugaiTime, that.fXiugaiTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(fId, fTitle, fContent, fPublishTime, fStatus, fXiugaiTime);
    }
}
