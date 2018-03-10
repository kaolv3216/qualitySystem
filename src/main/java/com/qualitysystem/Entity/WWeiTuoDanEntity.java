package com.qualitysystem.Entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "w_WeiTuoDan", schema = "dbo", catalog = "hengshui_jiliang")
public class WWeiTuoDanEntity {
    private int fWeiTuoId;
    private String fNo;
    private String fDanWei;
    private Timestamp fRiQi;
    private String fDiZhi;
    private String fLianXiRen;
    private String fDianHua;
    private String fYouBian;
    private String fJieShouRen;
    private String fWeiTuoRen;
    private String fTiHuoRiQi;
    private String fTiHuoRen;
    private String fShiZhuRen;
    private String fBuMen;
    private Integer fStatus;
    private Integer fBuMenId;
    private float fJinE;
    private Boolean fXuPiZhun;
    private Integer fPiZhunRenId;
    private Timestamp fJieShuRiQi;
    private Integer fJieShuRenYanId;
    private String fQuXiang;
    private Boolean fYiWan;
    private Boolean fJiaofei;
    private String fBz;
    private String fSongjianren;
    private String fSongjianrenDianhua;
    private Double fJiaotongfei;
    private Boolean fJiaotongfeiJiaofei;
    private String fYoujian;
    private String fYaoqiu;
    private String fDidian;
    private Integer fLaji;
    private Integer fCaozuozheKeshi;
    private Integer fFenzu;
    private Timestamp fCreatdate;
    private String fXiugairen;
    private Boolean fShenpi;
    private String fShiyongKeshi;
    private String fFafang;
    private String fTijiao;
    private Integer fFasong;
    private Integer fZongshu;
    private int fZhengshushu;
    private String fQujianRen;
    private String fChuanzhen;
    private String fTijiaoren;
    private Timestamp fTijiaoTime;
    private Integer fShanChuZhuangTai;
    private Integer fShenheZhuangtai;
    private String fJujueyuanyin;
    private String fShouliren;
    private Timestamp fShouliTime;
    private Timestamp fDaisongjianTime;
    private String fBeizhu;
    private Integer fTWeiTuoId;
    private Integer fQiangjian;

    @Id
    @Column(name = "f_WeiTuo_id")
    public int getfWeiTuoId() {
        return fWeiTuoId;
    }

    public void setfWeiTuoId(int fWeiTuoId) {
        this.fWeiTuoId = fWeiTuoId;
    }

    @Basic
    @Column(name = "f_NO")
    public String getfNo() {
        return fNo;
    }

    public void setfNo(String fNo) {
        this.fNo = fNo;
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
    @Column(name = "f_RiQi")
    public Timestamp getfRiQi() {
        return fRiQi;
    }

    public void setfRiQi(Timestamp fRiQi) {
        this.fRiQi = fRiQi;
    }

    @Basic
    @Column(name = "f_DiZhi")
    public String getfDiZhi() {
        return fDiZhi;
    }

    public void setfDiZhi(String fDiZhi) {
        this.fDiZhi = fDiZhi;
    }

    @Basic
    @Column(name = "f_LianXiRen")
    public String getfLianXiRen() {
        return fLianXiRen;
    }

    public void setfLianXiRen(String fLianXiRen) {
        this.fLianXiRen = fLianXiRen;
    }

    @Basic
    @Column(name = "f_DianHua")
    public String getfDianHua() {
        return fDianHua;
    }

    public void setfDianHua(String fDianHua) {
        this.fDianHua = fDianHua;
    }

    @Basic
    @Column(name = "f_YouBian")
    public String getfYouBian() {
        return fYouBian;
    }

    public void setfYouBian(String fYouBian) {
        this.fYouBian = fYouBian;
    }

    @Basic
    @Column(name = "f_JieShouRen")
    public String getfJieShouRen() {
        return fJieShouRen;
    }

    public void setfJieShouRen(String fJieShouRen) {
        this.fJieShouRen = fJieShouRen;
    }

    @Basic
    @Column(name = "f_WeiTuoRen")
    public String getfWeiTuoRen() {
        return fWeiTuoRen;
    }

    public void setfWeiTuoRen(String fWeiTuoRen) {
        this.fWeiTuoRen = fWeiTuoRen;
    }

    @Basic
    @Column(name = "f_TiHuoRiQi")
    public String getfTiHuoRiQi() {
        return fTiHuoRiQi;
    }

    public void setfTiHuoRiQi(String fTiHuoRiQi) {
        this.fTiHuoRiQi = fTiHuoRiQi;
    }

    @Basic
    @Column(name = "f_TiHuoRen")
    public String getfTiHuoRen() {
        return fTiHuoRen;
    }

    public void setfTiHuoRen(String fTiHuoRen) {
        this.fTiHuoRen = fTiHuoRen;
    }

    @Basic
    @Column(name = "f_ShiZhuRen")
    public String getfShiZhuRen() {
        return fShiZhuRen;
    }

    public void setfShiZhuRen(String fShiZhuRen) {
        this.fShiZhuRen = fShiZhuRen;
    }

    @Basic
    @Column(name = "f_BuMen")
    public String getfBuMen() {
        return fBuMen;
    }

    public void setfBuMen(String fBuMen) {
        this.fBuMen = fBuMen;
    }

    @Basic
    @Column(name = "f_Status")
    public Integer getfStatus() {
        return fStatus;
    }

    public void setfStatus(Integer fStatus) {
        this.fStatus = fStatus;
    }

    @Basic
    @Column(name = "f_BuMen_id")
    public Integer getfBuMenId() {
        return fBuMenId;
    }

    public void setfBuMenId(Integer fBuMenId) {
        this.fBuMenId = fBuMenId;
    }

    @Basic
    @Column(name = "f_JinE")
    public float getfJinE() {
        return fJinE;
    }

    public void setfJinE(float fJinE) {
        this.fJinE = fJinE;
    }

    @Basic
    @Column(name = "f_XuPiZhun")
    public Boolean getfXuPiZhun() {
        return fXuPiZhun;
    }

    public void setfXuPiZhun(Boolean fXuPiZhun) {
        this.fXuPiZhun = fXuPiZhun;
    }

    @Basic
    @Column(name = "f_PiZhunRen_id")
    public Integer getfPiZhunRenId() {
        return fPiZhunRenId;
    }

    public void setfPiZhunRenId(Integer fPiZhunRenId) {
        this.fPiZhunRenId = fPiZhunRenId;
    }

    @Basic
    @Column(name = "f_JieShuRiQi")
    public Timestamp getfJieShuRiQi() {
        return fJieShuRiQi;
    }

    public void setfJieShuRiQi(Timestamp fJieShuRiQi) {
        this.fJieShuRiQi = fJieShuRiQi;
    }

    @Basic
    @Column(name = "f_JieShuRenYan_id")
    public Integer getfJieShuRenYanId() {
        return fJieShuRenYanId;
    }

    public void setfJieShuRenYanId(Integer fJieShuRenYanId) {
        this.fJieShuRenYanId = fJieShuRenYanId;
    }

    @Basic
    @Column(name = "f_QuXiang")
    public String getfQuXiang() {
        return fQuXiang;
    }

    public void setfQuXiang(String fQuXiang) {
        this.fQuXiang = fQuXiang;
    }

    @Basic
    @Column(name = "f_YiWan")
    public Boolean getfYiWan() {
        return fYiWan;
    }

    public void setfYiWan(Boolean fYiWan) {
        this.fYiWan = fYiWan;
    }

    @Basic
    @Column(name = "f_Jiaofei")
    public Boolean getfJiaofei() {
        return fJiaofei;
    }

    public void setfJiaofei(Boolean fJiaofei) {
        this.fJiaofei = fJiaofei;
    }

    @Basic
    @Column(name = "f_bz")
    public String getfBz() {
        return fBz;
    }

    public void setfBz(String fBz) {
        this.fBz = fBz;
    }

    @Basic
    @Column(name = "f_songjianren")
    public String getfSongjianren() {
        return fSongjianren;
    }

    public void setfSongjianren(String fSongjianren) {
        this.fSongjianren = fSongjianren;
    }

    @Basic
    @Column(name = "f_songjianren_dianhua")
    public String getfSongjianrenDianhua() {
        return fSongjianrenDianhua;
    }

    public void setfSongjianrenDianhua(String fSongjianrenDianhua) {
        this.fSongjianrenDianhua = fSongjianrenDianhua;
    }

    @Basic
    @Column(name = "f_jiaotongfei")
    public Double getfJiaotongfei() {
        return fJiaotongfei;
    }

    public void setfJiaotongfei(Double fJiaotongfei) {
        this.fJiaotongfei = fJiaotongfei;
    }

    @Basic
    @Column(name = "f_jiaotongfei_jiaofei")
    public Boolean getfJiaotongfeiJiaofei() {
        return fJiaotongfeiJiaofei;
    }

    public void setfJiaotongfeiJiaofei(Boolean fJiaotongfeiJiaofei) {
        this.fJiaotongfeiJiaofei = fJiaotongfeiJiaofei;
    }

    @Basic
    @Column(name = "f_youjian")
    public String getfYoujian() {
        return fYoujian;
    }

    public void setfYoujian(String fYoujian) {
        this.fYoujian = fYoujian;
    }

    @Basic
    @Column(name = "f_yaoqiu")
    public String getfYaoqiu() {
        return fYaoqiu;
    }

    public void setfYaoqiu(String fYaoqiu) {
        this.fYaoqiu = fYaoqiu;
    }

    @Basic
    @Column(name = "f_didian")
    public String getfDidian() {
        return fDidian;
    }

    public void setfDidian(String fDidian) {
        this.fDidian = fDidian;
    }

    @Basic
    @Column(name = "f_laji")
    public Integer getfLaji() {
        return fLaji;
    }

    public void setfLaji(Integer fLaji) {
        this.fLaji = fLaji;
    }

    @Basic
    @Column(name = "f_caozuozhe_keshi")
    public Integer getfCaozuozheKeshi() {
        return fCaozuozheKeshi;
    }

    public void setfCaozuozheKeshi(Integer fCaozuozheKeshi) {
        this.fCaozuozheKeshi = fCaozuozheKeshi;
    }

    @Basic
    @Column(name = "f_fenzu")
    public Integer getfFenzu() {
        return fFenzu;
    }

    public void setfFenzu(Integer fFenzu) {
        this.fFenzu = fFenzu;
    }

    @Basic
    @Column(name = "f_creatdate")
    public Timestamp getfCreatdate() {
        return fCreatdate;
    }

    public void setfCreatdate(Timestamp fCreatdate) {
        this.fCreatdate = fCreatdate;
    }

    @Basic
    @Column(name = "f_xiugairen")
    public String getfXiugairen() {
        return fXiugairen;
    }

    public void setfXiugairen(String fXiugairen) {
        this.fXiugairen = fXiugairen;
    }

    @Basic
    @Column(name = "f_shenpi")
    public Boolean getfShenpi() {
        return fShenpi;
    }

    public void setfShenpi(Boolean fShenpi) {
        this.fShenpi = fShenpi;
    }

    @Basic
    @Column(name = "f_shiyong_keshi")
    public String getfShiyongKeshi() {
        return fShiyongKeshi;
    }

    public void setfShiyongKeshi(String fShiyongKeshi) {
        this.fShiyongKeshi = fShiyongKeshi;
    }

    @Basic
    @Column(name = "f_fafang")
    public String getfFafang() {
        return fFafang;
    }

    public void setfFafang(String fFafang) {
        this.fFafang = fFafang;
    }

    @Basic
    @Column(name = "f_tijiao")
    public String getfTijiao() {
        return fTijiao;
    }

    public void setfTijiao(String fTijiao) {
        this.fTijiao = fTijiao;
    }

    @Basic
    @Column(name = "f_fasong")
    public Integer getfFasong() {
        return fFasong;
    }

    public void setfFasong(Integer fFasong) {
        this.fFasong = fFasong;
    }

    @Basic
    @Column(name = "f_zongshu")
    public Integer getfZongshu() {
        return fZongshu;
    }

    public void setfZongshu(Integer fZongshu) {
        this.fZongshu = fZongshu;
    }

    @Basic
    @Column(name = "f_zhengshushu")
    public int getfZhengshushu() {
        return fZhengshushu;
    }

    public void setfZhengshushu(int fZhengshushu) {
        this.fZhengshushu = fZhengshushu;
    }

    @Basic
    @Column(name = "f_qujian_ren")
    public String getfQujianRen() {
        return fQujianRen;
    }

    public void setfQujianRen(String fQujianRen) {
        this.fQujianRen = fQujianRen;
    }

    @Basic
    @Column(name = "f_Chuanzhen")
    public String getfChuanzhen() {
        return fChuanzhen;
    }

    public void setfChuanzhen(String fChuanzhen) {
        this.fChuanzhen = fChuanzhen;
    }

    @Basic
    @Column(name = "f_tijiaoren")
    public String getfTijiaoren() {
        return fTijiaoren;
    }

    public void setfTijiaoren(String fTijiaoren) {
        this.fTijiaoren = fTijiaoren;
    }

    @Basic
    @Column(name = "f_tijiao_time")
    public Timestamp getfTijiaoTime() {
        return fTijiaoTime;
    }

    public void setfTijiaoTime(Timestamp fTijiaoTime) {
        this.fTijiaoTime = fTijiaoTime;
    }

    @Basic
    @Column(name = "f_ShanChu_ZhuangTai")
    public Integer getfShanChuZhuangTai() {
        return fShanChuZhuangTai;
    }

    public void setfShanChuZhuangTai(Integer fShanChuZhuangTai) {
        this.fShanChuZhuangTai = fShanChuZhuangTai;
    }

    @Basic
    @Column(name = "f_shenhe_zhuangtai")
    public Integer getfShenheZhuangtai() {
        return fShenheZhuangtai;
    }

    public void setfShenheZhuangtai(Integer fShenheZhuangtai) {
        this.fShenheZhuangtai = fShenheZhuangtai;
    }

    @Basic
    @Column(name = "f_jujueyuanyin")
    public String getfJujueyuanyin() {
        return fJujueyuanyin;
    }

    public void setfJujueyuanyin(String fJujueyuanyin) {
        this.fJujueyuanyin = fJujueyuanyin;
    }

    @Basic
    @Column(name = "f_shouliren")
    public String getfShouliren() {
        return fShouliren;
    }

    public void setfShouliren(String fShouliren) {
        this.fShouliren = fShouliren;
    }

    @Basic
    @Column(name = "f_shouli_time")
    public Timestamp getfShouliTime() {
        return fShouliTime;
    }

    public void setfShouliTime(Timestamp fShouliTime) {
        this.fShouliTime = fShouliTime;
    }

    @Basic
    @Column(name = "f_daisongjian_time")
    public Timestamp getfDaisongjianTime() {
        return fDaisongjianTime;
    }

    public void setfDaisongjianTime(Timestamp fDaisongjianTime) {
        this.fDaisongjianTime = fDaisongjianTime;
    }

    @Basic
    @Column(name = "f_beizhu")
    public String getfBeizhu() {
        return fBeizhu;
    }

    public void setfBeizhu(String fBeizhu) {
        this.fBeizhu = fBeizhu;
    }

    @Basic
    @Column(name = "f_tWeiTuo_id")
    public Integer getfTWeiTuoId() {
        return fTWeiTuoId;
    }

    public void setfTWeiTuoId(Integer fTWeiTuoId) {
        this.fTWeiTuoId = fTWeiTuoId;
    }

    @Basic
    @Column(name = "f_qiangjian")
    public Integer getfQiangjian() {
        return fQiangjian;
    }

    public void setfQiangjian(Integer fQiangjian) {
        this.fQiangjian = fQiangjian;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WWeiTuoDanEntity that = (WWeiTuoDanEntity) o;
        return fWeiTuoId == that.fWeiTuoId &&
                Float.compare(that.fJinE, fJinE) == 0 &&
                fZhengshushu == that.fZhengshushu &&
                Objects.equals(fNo, that.fNo) &&
                Objects.equals(fDanWei, that.fDanWei) &&
                Objects.equals(fRiQi, that.fRiQi) &&
                Objects.equals(fDiZhi, that.fDiZhi) &&
                Objects.equals(fLianXiRen, that.fLianXiRen) &&
                Objects.equals(fDianHua, that.fDianHua) &&
                Objects.equals(fYouBian, that.fYouBian) &&
                Objects.equals(fJieShouRen, that.fJieShouRen) &&
                Objects.equals(fWeiTuoRen, that.fWeiTuoRen) &&
                Objects.equals(fTiHuoRiQi, that.fTiHuoRiQi) &&
                Objects.equals(fTiHuoRen, that.fTiHuoRen) &&
                Objects.equals(fShiZhuRen, that.fShiZhuRen) &&
                Objects.equals(fBuMen, that.fBuMen) &&
                Objects.equals(fStatus, that.fStatus) &&
                Objects.equals(fBuMenId, that.fBuMenId) &&
                Objects.equals(fXuPiZhun, that.fXuPiZhun) &&
                Objects.equals(fPiZhunRenId, that.fPiZhunRenId) &&
                Objects.equals(fJieShuRiQi, that.fJieShuRiQi) &&
                Objects.equals(fJieShuRenYanId, that.fJieShuRenYanId) &&
                Objects.equals(fQuXiang, that.fQuXiang) &&
                Objects.equals(fYiWan, that.fYiWan) &&
                Objects.equals(fJiaofei, that.fJiaofei) &&
                Objects.equals(fBz, that.fBz) &&
                Objects.equals(fSongjianren, that.fSongjianren) &&
                Objects.equals(fSongjianrenDianhua, that.fSongjianrenDianhua) &&
                Objects.equals(fJiaotongfei, that.fJiaotongfei) &&
                Objects.equals(fJiaotongfeiJiaofei, that.fJiaotongfeiJiaofei) &&
                Objects.equals(fYoujian, that.fYoujian) &&
                Objects.equals(fYaoqiu, that.fYaoqiu) &&
                Objects.equals(fDidian, that.fDidian) &&
                Objects.equals(fLaji, that.fLaji) &&
                Objects.equals(fCaozuozheKeshi, that.fCaozuozheKeshi) &&
                Objects.equals(fFenzu, that.fFenzu) &&
                Objects.equals(fCreatdate, that.fCreatdate) &&
                Objects.equals(fXiugairen, that.fXiugairen) &&
                Objects.equals(fShenpi, that.fShenpi) &&
                Objects.equals(fShiyongKeshi, that.fShiyongKeshi) &&
                Objects.equals(fFafang, that.fFafang) &&
                Objects.equals(fTijiao, that.fTijiao) &&
                Objects.equals(fFasong, that.fFasong) &&
                Objects.equals(fZongshu, that.fZongshu) &&
                Objects.equals(fQujianRen, that.fQujianRen) &&
                Objects.equals(fChuanzhen, that.fChuanzhen) &&
                Objects.equals(fTijiaoren, that.fTijiaoren) &&
                Objects.equals(fTijiaoTime, that.fTijiaoTime) &&
                Objects.equals(fShanChuZhuangTai, that.fShanChuZhuangTai) &&
                Objects.equals(fShenheZhuangtai, that.fShenheZhuangtai) &&
                Objects.equals(fJujueyuanyin, that.fJujueyuanyin) &&
                Objects.equals(fShouliren, that.fShouliren) &&
                Objects.equals(fShouliTime, that.fShouliTime) &&
                Objects.equals(fDaisongjianTime, that.fDaisongjianTime) &&
                Objects.equals(fBeizhu, that.fBeizhu) &&
                Objects.equals(fTWeiTuoId, that.fTWeiTuoId) &&
                Objects.equals(fQiangjian, that.fQiangjian);
    }

    @Override
    public int hashCode() {

        return Objects.hash(fWeiTuoId, fNo, fDanWei, fRiQi, fDiZhi, fLianXiRen, fDianHua, fYouBian, fJieShouRen, fWeiTuoRen, fTiHuoRiQi, fTiHuoRen, fShiZhuRen, fBuMen, fStatus, fBuMenId, fJinE, fXuPiZhun, fPiZhunRenId, fJieShuRiQi, fJieShuRenYanId, fQuXiang, fYiWan, fJiaofei, fBz, fSongjianren, fSongjianrenDianhua, fJiaotongfei, fJiaotongfeiJiaofei, fYoujian, fYaoqiu, fDidian, fLaji, fCaozuozheKeshi, fFenzu, fCreatdate, fXiugairen, fShenpi, fShiyongKeshi, fFafang, fTijiao, fFasong, fZongshu, fZhengshushu, fQujianRen, fChuanzhen, fTijiaoren, fTijiaoTime, fShanChuZhuangTai, fShenheZhuangtai, fJujueyuanyin, fShouliren, fShouliTime, fDaisongjianTime, fBeizhu, fTWeiTuoId, fQiangjian);
    }
}
