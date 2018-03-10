package com.qualitysystem.Entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "w_WeiTuoDanMingXi", schema = "dbo", catalog = "hengshui_jiliang")
public class WWeiTuoDanMingXiEntity {
    private int fWeiTuoDanMingXiId;
    private Integer fWeiTuoDanId;
    private String fQiJuMingCheng;
    private String fZhunQueDuFanWei;
    private String fDengji;
    private String fChuChangBianHao;
    private String fGuiGeXingHao;
    private String fShengChanChang;
    private String fWaiGuan;
    private String fTeShuYaoQiu;
    private Integer fShuLiang;
    private float fJianXiaoFei;
    private float fCaiLiaoFei;
    private float fTiaoXiuFei;
    private float fZengShouFei;
    private float fHeJi;
    private String fFuJiang;
    private Integer fShanchuZhuangtai;
    private String fFuJian;
    private String fFuJianName;
    private Integer fQiJuId;
    private String fQiangjian;
    private String fNeibuBianhao;
    private Timestamp fJiandingRiqi;
    private Timestamp fYouxiaoqi;
    private String fWeizhi;
    private String fTupian;
    private String fQiangjianBiaoshi;
    private String fSuyuanDanwei;
    private String fSongjianFenlei;
    private String fBaogaobianhao;
    private String fZhuangtai;
    private String fJielun;
    private Boolean fQijuLingqu;
    private Boolean fQijuGuihuan;

    @Id
    @Column(name = "f_WeiTuoDanMingXi_id")
    public int getfWeiTuoDanMingXiId() {
        return fWeiTuoDanMingXiId;
    }

    public void setfWeiTuoDanMingXiId(int fWeiTuoDanMingXiId) {
        this.fWeiTuoDanMingXiId = fWeiTuoDanMingXiId;
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
    @Column(name = "f_QiJuMingCheng")
    public String getfQiJuMingCheng() {
        return fQiJuMingCheng;
    }

    public void setfQiJuMingCheng(String fQiJuMingCheng) {
        this.fQiJuMingCheng = fQiJuMingCheng;
    }

    @Basic
    @Column(name = "f_ZhunQueDuFanWei")
    public String getfZhunQueDuFanWei() {
        return fZhunQueDuFanWei;
    }

    public void setfZhunQueDuFanWei(String fZhunQueDuFanWei) {
        this.fZhunQueDuFanWei = fZhunQueDuFanWei;
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
    @Column(name = "f_ChuChangBianHao")
    public String getfChuChangBianHao() {
        return fChuChangBianHao;
    }

    public void setfChuChangBianHao(String fChuChangBianHao) {
        this.fChuChangBianHao = fChuChangBianHao;
    }

    @Basic
    @Column(name = "f_GuiGeXingHao")
    public String getfGuiGeXingHao() {
        return fGuiGeXingHao;
    }

    public void setfGuiGeXingHao(String fGuiGeXingHao) {
        this.fGuiGeXingHao = fGuiGeXingHao;
    }

    @Basic
    @Column(name = "f_ShengChanChang")
    public String getfShengChanChang() {
        return fShengChanChang;
    }

    public void setfShengChanChang(String fShengChanChang) {
        this.fShengChanChang = fShengChanChang;
    }

    @Basic
    @Column(name = "f_WaiGuan")
    public String getfWaiGuan() {
        return fWaiGuan;
    }

    public void setfWaiGuan(String fWaiGuan) {
        this.fWaiGuan = fWaiGuan;
    }

    @Basic
    @Column(name = "f_TeShuYaoQiu")
    public String getfTeShuYaoQiu() {
        return fTeShuYaoQiu;
    }

    public void setfTeShuYaoQiu(String fTeShuYaoQiu) {
        this.fTeShuYaoQiu = fTeShuYaoQiu;
    }

    @Basic
    @Column(name = "f_ShuLiang")
    public Integer getfShuLiang() {
        return fShuLiang;
    }

    public void setfShuLiang(Integer fShuLiang) {
        this.fShuLiang = fShuLiang;
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
    @Column(name = "f_CaiLiaoFei")
    public float getfCaiLiaoFei() {
        return fCaiLiaoFei;
    }

    public void setfCaiLiaoFei(float fCaiLiaoFei) {
        this.fCaiLiaoFei = fCaiLiaoFei;
    }

    @Basic
    @Column(name = "f_TiaoXiuFei")
    public float getfTiaoXiuFei() {
        return fTiaoXiuFei;
    }

    public void setfTiaoXiuFei(float fTiaoXiuFei) {
        this.fTiaoXiuFei = fTiaoXiuFei;
    }

    @Basic
    @Column(name = "f_ZengShouFei")
    public float getfZengShouFei() {
        return fZengShouFei;
    }

    public void setfZengShouFei(float fZengShouFei) {
        this.fZengShouFei = fZengShouFei;
    }

    @Basic
    @Column(name = "f_HeJi")
    public float getfHeJi() {
        return fHeJi;
    }

    public void setfHeJi(float fHeJi) {
        this.fHeJi = fHeJi;
    }

    @Basic
    @Column(name = "f_FuJiang")
    public String getfFuJiang() {
        return fFuJiang;
    }

    public void setfFuJiang(String fFuJiang) {
        this.fFuJiang = fFuJiang;
    }

    @Basic
    @Column(name = "f_shanchu_zhuangtai")
    public Integer getfShanchuZhuangtai() {
        return fShanchuZhuangtai;
    }

    public void setfShanchuZhuangtai(Integer fShanchuZhuangtai) {
        this.fShanchuZhuangtai = fShanchuZhuangtai;
    }

    @Basic
    @Column(name = "f_FuJian")
    public String getfFuJian() {
        return fFuJian;
    }

    public void setfFuJian(String fFuJian) {
        this.fFuJian = fFuJian;
    }

    @Basic
    @Column(name = "f_FuJianName")
    public String getfFuJianName() {
        return fFuJianName;
    }

    public void setfFuJianName(String fFuJianName) {
        this.fFuJianName = fFuJianName;
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
    @Column(name = "f_qiangjian")
    public String getfQiangjian() {
        return fQiangjian;
    }

    public void setfQiangjian(String fQiangjian) {
        this.fQiangjian = fQiangjian;
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
    @Column(name = "f_qiangjian_biaoshi")
    public String getfQiangjianBiaoshi() {
        return fQiangjianBiaoshi;
    }

    public void setfQiangjianBiaoshi(String fQiangjianBiaoshi) {
        this.fQiangjianBiaoshi = fQiangjianBiaoshi;
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

    @Basic
    @Column(name = "f_baogaobianhao")
    public String getfBaogaobianhao() {
        return fBaogaobianhao;
    }

    public void setfBaogaobianhao(String fBaogaobianhao) {
        this.fBaogaobianhao = fBaogaobianhao;
    }

    @Basic
    @Column(name = "f_zhuangtai")
    public String getfZhuangtai() {
        return fZhuangtai;
    }

    public void setfZhuangtai(String fZhuangtai) {
        this.fZhuangtai = fZhuangtai;
    }

    @Basic
    @Column(name = "f_jielun")
    public String getfJielun() {
        return fJielun;
    }

    public void setfJielun(String fJielun) {
        this.fJielun = fJielun;
    }

    @Basic
    @Column(name = "f_qiju_lingqu")
    public Boolean getfQijuLingqu() {
        return fQijuLingqu;
    }

    public void setfQijuLingqu(Boolean fQijuLingqu) {
        this.fQijuLingqu = fQijuLingqu;
    }

    @Basic
    @Column(name = "f_qiju_guihuan")
    public Boolean getfQijuGuihuan() {
        return fQijuGuihuan;
    }

    public void setfQijuGuihuan(Boolean fQijuGuihuan) {
        this.fQijuGuihuan = fQijuGuihuan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WWeiTuoDanMingXiEntity that = (WWeiTuoDanMingXiEntity) o;
        return fWeiTuoDanMingXiId == that.fWeiTuoDanMingXiId &&
                Float.compare(that.fJianXiaoFei, fJianXiaoFei) == 0 &&
                Float.compare(that.fCaiLiaoFei, fCaiLiaoFei) == 0 &&
                Float.compare(that.fTiaoXiuFei, fTiaoXiuFei) == 0 &&
                Float.compare(that.fZengShouFei, fZengShouFei) == 0 &&
                Float.compare(that.fHeJi, fHeJi) == 0 &&
                Objects.equals(fWeiTuoDanId, that.fWeiTuoDanId) &&
                Objects.equals(fQiJuMingCheng, that.fQiJuMingCheng) &&
                Objects.equals(fZhunQueDuFanWei, that.fZhunQueDuFanWei) &&
                Objects.equals(fDengji, that.fDengji) &&
                Objects.equals(fChuChangBianHao, that.fChuChangBianHao) &&
                Objects.equals(fGuiGeXingHao, that.fGuiGeXingHao) &&
                Objects.equals(fShengChanChang, that.fShengChanChang) &&
                Objects.equals(fWaiGuan, that.fWaiGuan) &&
                Objects.equals(fTeShuYaoQiu, that.fTeShuYaoQiu) &&
                Objects.equals(fShuLiang, that.fShuLiang) &&
                Objects.equals(fFuJiang, that.fFuJiang) &&
                Objects.equals(fShanchuZhuangtai, that.fShanchuZhuangtai) &&
                Objects.equals(fFuJian, that.fFuJian) &&
                Objects.equals(fFuJianName, that.fFuJianName) &&
                Objects.equals(fQiJuId, that.fQiJuId) &&
                Objects.equals(fQiangjian, that.fQiangjian) &&
                Objects.equals(fNeibuBianhao, that.fNeibuBianhao) &&
                Objects.equals(fJiandingRiqi, that.fJiandingRiqi) &&
                Objects.equals(fYouxiaoqi, that.fYouxiaoqi) &&
                Objects.equals(fWeizhi, that.fWeizhi) &&
                Objects.equals(fTupian, that.fTupian) &&
                Objects.equals(fQiangjianBiaoshi, that.fQiangjianBiaoshi) &&
                Objects.equals(fSuyuanDanwei, that.fSuyuanDanwei) &&
                Objects.equals(fSongjianFenlei, that.fSongjianFenlei) &&
                Objects.equals(fBaogaobianhao, that.fBaogaobianhao) &&
                Objects.equals(fZhuangtai, that.fZhuangtai) &&
                Objects.equals(fJielun, that.fJielun) &&
                Objects.equals(fQijuLingqu, that.fQijuLingqu) &&
                Objects.equals(fQijuGuihuan, that.fQijuGuihuan);
    }

    @Override
    public int hashCode() {

        return Objects.hash(fWeiTuoDanMingXiId, fWeiTuoDanId, fQiJuMingCheng, fZhunQueDuFanWei, fDengji, fChuChangBianHao, fGuiGeXingHao, fShengChanChang, fWaiGuan, fTeShuYaoQiu, fShuLiang, fJianXiaoFei, fCaiLiaoFei, fTiaoXiuFei, fZengShouFei, fHeJi, fFuJiang, fShanchuZhuangtai, fFuJian, fFuJianName, fQiJuId, fQiangjian, fNeibuBianhao, fJiandingRiqi, fYouxiaoqi, fWeizhi, fTupian, fQiangjianBiaoshi, fSuyuanDanwei, fSongjianFenlei, fBaogaobianhao, fZhuangtai, fJielun, fQijuLingqu, fQijuGuihuan);
    }
}
