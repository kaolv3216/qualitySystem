package com.qualitysystem.Entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "w_DanWeiMingXI", schema = "dbo", catalog = "hengshui_jiliang")
public class WDanWeiMingXiEntity {
    private int fId;
    private String fDanWei;
    private String fNeibuBianhao;
    private String fQijuMingcheng;
    private String fQijuFenlei;
    private String fGuige;
    private String fChuchangBianhao;
    private String fDengji;
    private String fFanwei;
    private Integer fShuliang;
    private String fZhizaoDanwei;
    private String fQiangjian;
    private String fQiangjianBiaoshi;
    private Timestamp fJiandingRiqi;
    private Timestamp fYouxiaoqi;
    private String fShiyongZhuangtai;
    private String fWeizhi;
    private String fTupian;
    private Timestamp fCreateTime;
    private Timestamp fDeleteTime;
    private float fJianXiaoFei;
    private Integer fQiJuId;
    private Integer fBaoGaoId;
    private Integer fWeiTuoDanId;
    private Integer fWeiTuoDanMingXiId;
    private String fSuyuanDanwei;
    private String fSongjianFenlei;

    @Basic
    @Column(name = "f_id")
    public int getfId() {
        return fId;
    }

    public void setfId(int fId) {
        this.fId = fId;
    }

    @Basic
    @Column(name = "f_DanWei")
    public String getfDanWei() {
        return fDanWei;
    }

    public void setfDanWei(String fDanWei) {
        this.fDanWei = fDanWei;
    }

    @Basic
    @Column(name = "f_neibu_bianhao")
    public String getfNeibuBianhao() {
        return fNeibuBianhao;
    }

    public void setfNeibuBianhao(String fNeibuBianhao) {
        this.fNeibuBianhao = fNeibuBianhao;
    }

    @Basic
    @Column(name = "f_qiju_mingcheng")
    public String getfQijuMingcheng() {
        return fQijuMingcheng;
    }

    public void setfQijuMingcheng(String fQijuMingcheng) {
        this.fQijuMingcheng = fQijuMingcheng;
    }

    @Basic
    @Column(name = "f_qiju_fenlei")
    public String getfQijuFenlei() {
        return fQijuFenlei;
    }

    public void setfQijuFenlei(String fQijuFenlei) {
        this.fQijuFenlei = fQijuFenlei;
    }

    @Basic
    @Column(name = "f_guige")
    public String getfGuige() {
        return fGuige;
    }

    public void setfGuige(String fGuige) {
        this.fGuige = fGuige;
    }

    @Basic
    @Column(name = "f_chuchang_bianhao")
    public String getfChuchangBianhao() {
        return fChuchangBianhao;
    }

    public void setfChuchangBianhao(String fChuchangBianhao) {
        this.fChuchangBianhao = fChuchangBianhao;
    }

    @Basic
    @Column(name = "f_dengji")
    public String getfDengji() {
        return fDengji;
    }

    public void setfDengji(String fDengji) {
        this.fDengji = fDengji;
    }

    @Basic
    @Column(name = "f_fanwei")
    public String getfFanwei() {
        return fFanwei;
    }

    public void setfFanwei(String fFanwei) {
        this.fFanwei = fFanwei;
    }

    @Basic
    @Column(name = "f_shuliang")
    public Integer getfShuliang() {
        return fShuliang;
    }

    public void setfShuliang(Integer fShuliang) {
        this.fShuliang = fShuliang;
    }

    @Basic
    @Column(name = "f_zhizao_danwei")
    public String getfZhizaoDanwei() {
        return fZhizaoDanwei;
    }

    public void setfZhizaoDanwei(String fZhizaoDanwei) {
        this.fZhizaoDanwei = fZhizaoDanwei;
    }

    @Basic
    @Column(name = "f_qiangjian")
    public String getfQiangjian() {
        return fQiangjian;
    }

    public void setfQiangjian(String fQiangjian) {
        this.fQiangjian = fQiangjian;
    }

    @Basic
    @Column(name = "f_qiangjian_biaoshi")
    public String getfQiangjianBiaoshi() {
        return fQiangjianBiaoshi;
    }

    public void setfQiangjianBiaoshi(String fQiangjianBiaoshi) {
        this.fQiangjianBiaoshi = fQiangjianBiaoshi;
    }

    @Basic
    @Column(name = "f_jianding_riqi")
    public Timestamp getfJiandingRiqi() {
        return fJiandingRiqi;
    }

    public void setfJiandingRiqi(Timestamp fJiandingRiqi) {
        this.fJiandingRiqi = fJiandingRiqi;
    }

    @Basic
    @Column(name = "f_youxiaoqi")
    public Timestamp getfYouxiaoqi() {
        return fYouxiaoqi;
    }

    public void setfYouxiaoqi(Timestamp fYouxiaoqi) {
        this.fYouxiaoqi = fYouxiaoqi;
    }

    @Basic
    @Column(name = "f_shiyong_zhuangtai")
    public String getfShiyongZhuangtai() {
        return fShiyongZhuangtai;
    }

    public void setfShiyongZhuangtai(String fShiyongZhuangtai) {
        this.fShiyongZhuangtai = fShiyongZhuangtai;
    }

    @Basic
    @Column(name = "f_weizhi")
    public String getfWeizhi() {
        return fWeizhi;
    }

    public void setfWeizhi(String fWeizhi) {
        this.fWeizhi = fWeizhi;
    }

    @Basic
    @Column(name = "f_tupian")
    public String getfTupian() {
        return fTupian;
    }

    public void setfTupian(String fTupian) {
        this.fTupian = fTupian;
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
    @Column(name = "f_delete_time")
    public Timestamp getfDeleteTime() {
        return fDeleteTime;
    }

    public void setfDeleteTime(Timestamp fDeleteTime) {
        this.fDeleteTime = fDeleteTime;
    }

    @Basic
    @Column(name = "f_JianXiaoFei")
    public float getfJianXiaoFei() {
        return fJianXiaoFei;
    }

    public void setfJianXiaoFei(float fJianXiaoFei) {
        this.fJianXiaoFei = fJianXiaoFei;
    }

    @Basic
    @Column(name = "f_QiJu_id")
    public Integer getfQiJuId() {
        return fQiJuId;
    }

    public void setfQiJuId(Integer fQiJuId) {
        this.fQiJuId = fQiJuId;
    }

    @Basic
    @Column(name = "f_BaoGao_id")
    public Integer getfBaoGaoId() {
        return fBaoGaoId;
    }

    public void setfBaoGaoId(Integer fBaoGaoId) {
        this.fBaoGaoId = fBaoGaoId;
    }

    @Basic
    @Column(name = "f_WeiTuoDan_id")
    public Integer getfWeiTuoDanId() {
        return fWeiTuoDanId;
    }

    public void setfWeiTuoDanId(Integer fWeiTuoDanId) {
        this.fWeiTuoDanId = fWeiTuoDanId;
    }

    @Basic
    @Column(name = "f_WeiTuoDanMingXi_id")
    public Integer getfWeiTuoDanMingXiId() {
        return fWeiTuoDanMingXiId;
    }

    public void setfWeiTuoDanMingXiId(Integer fWeiTuoDanMingXiId) {
        this.fWeiTuoDanMingXiId = fWeiTuoDanMingXiId;
    }

    @Basic
    @Column(name = "f_suyuan_danwei")
    public String getfSuyuanDanwei() {
        return fSuyuanDanwei;
    }

    public void setfSuyuanDanwei(String fSuyuanDanwei) {
        this.fSuyuanDanwei = fSuyuanDanwei;
    }

    @Basic
    @Column(name = "f_songjian_fenlei")
    public String getfSongjianFenlei() {
        return fSongjianFenlei;
    }

    public void setfSongjianFenlei(String fSongjianFenlei) {
        this.fSongjianFenlei = fSongjianFenlei;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WDanWeiMingXiEntity that = (WDanWeiMingXiEntity) o;
        return fId == that.fId &&
                Float.compare(that.fJianXiaoFei, fJianXiaoFei) == 0 &&
                Objects.equals(fDanWei, that.fDanWei) &&
                Objects.equals(fNeibuBianhao, that.fNeibuBianhao) &&
                Objects.equals(fQijuMingcheng, that.fQijuMingcheng) &&
                Objects.equals(fQijuFenlei, that.fQijuFenlei) &&
                Objects.equals(fGuige, that.fGuige) &&
                Objects.equals(fChuchangBianhao, that.fChuchangBianhao) &&
                Objects.equals(fDengji, that.fDengji) &&
                Objects.equals(fFanwei, that.fFanwei) &&
                Objects.equals(fShuliang, that.fShuliang) &&
                Objects.equals(fZhizaoDanwei, that.fZhizaoDanwei) &&
                Objects.equals(fQiangjian, that.fQiangjian) &&
                Objects.equals(fQiangjianBiaoshi, that.fQiangjianBiaoshi) &&
                Objects.equals(fJiandingRiqi, that.fJiandingRiqi) &&
                Objects.equals(fYouxiaoqi, that.fYouxiaoqi) &&
                Objects.equals(fShiyongZhuangtai, that.fShiyongZhuangtai) &&
                Objects.equals(fWeizhi, that.fWeizhi) &&
                Objects.equals(fTupian, that.fTupian) &&
                Objects.equals(fCreateTime, that.fCreateTime) &&
                Objects.equals(fDeleteTime, that.fDeleteTime) &&
                Objects.equals(fQiJuId, that.fQiJuId) &&
                Objects.equals(fBaoGaoId, that.fBaoGaoId) &&
                Objects.equals(fWeiTuoDanId, that.fWeiTuoDanId) &&
                Objects.equals(fWeiTuoDanMingXiId, that.fWeiTuoDanMingXiId) &&
                Objects.equals(fSuyuanDanwei, that.fSuyuanDanwei) &&
                Objects.equals(fSongjianFenlei, that.fSongjianFenlei);
    }

    @Override
    public int hashCode() {

        return Objects.hash(fId, fDanWei, fNeibuBianhao, fQijuMingcheng, fQijuFenlei, fGuige, fChuchangBianhao, fDengji, fFanwei, fShuliang, fZhizaoDanwei, fQiangjian, fQiangjianBiaoshi, fJiandingRiqi, fYouxiaoqi, fShiyongZhuangtai, fWeizhi, fTupian, fCreateTime, fDeleteTime, fJianXiaoFei, fQiJuId, fBaoGaoId, fWeiTuoDanId, fWeiTuoDanMingXiId, fSuyuanDanwei, fSongjianFenlei);
    }
}
