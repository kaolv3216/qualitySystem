package com.qualitysystem.Entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "w_jigouxinxi", schema = "dbo", catalog = "hengshui_jiliang")
public class WJigouxinxiEntity {
    private String fDescription;
    private String fAddress;
    private String fContacts;
    private String fCellphone;
    private String fEmail;

    @Basic
    @Column(name = "f_description")
    public String getfDescription() {
        return fDescription;
    }

    public void setfDescription(String fDescription) {
        this.fDescription = fDescription;
    }

    @Basic
    @Column(name = "f_address")
    public String getfAddress() {
        return fAddress;
    }

    public void setfAddress(String fAddress) {
        this.fAddress = fAddress;
    }

    @Basic
    @Column(name = "f_contacts")
    public String getfContacts() {
        return fContacts;
    }

    public void setfContacts(String fContacts) {
        this.fContacts = fContacts;
    }

    @Basic
    @Column(name = "f_cellphone")
    public String getfCellphone() {
        return fCellphone;
    }

    public void setfCellphone(String fCellphone) {
        this.fCellphone = fCellphone;
    }

    @Basic
    @Column(name = "f_email")
    public String getfEmail() {
        return fEmail;
    }

    public void setfEmail(String fEmail) {
        this.fEmail = fEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WJigouxinxiEntity that = (WJigouxinxiEntity) o;
        return Objects.equals(fDescription, that.fDescription) &&
                Objects.equals(fAddress, that.fAddress) &&
                Objects.equals(fContacts, that.fContacts) &&
                Objects.equals(fCellphone, that.fCellphone) &&
                Objects.equals(fEmail, that.fEmail);
    }

    @Override
    public int hashCode() {

        return Objects.hash(fDescription, fAddress, fContacts, fCellphone, fEmail);
    }
}
