package com.qualitysystem.Entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "w_jigouxiaoxi", schema = "dbo", catalog = "hengshui_jiliang")
public class WJigouxiaoxiEntity {
    private int fId;
    private String fTitle;
    private String fContent;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WJigouxiaoxiEntity that = (WJigouxiaoxiEntity) o;
        return fId == that.fId &&
                Objects.equals(fTitle, that.fTitle) &&
                Objects.equals(fContent, that.fContent);
    }

    @Override
    public int hashCode() {

        return Objects.hash(fId, fTitle, fContent);
    }
}
