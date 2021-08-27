package com.fleta.productsservice.domain.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "pt_pd_package_sub")
public class PtPdPackageUnited implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @NotNull(message = "must not be null")
    @Column(name = "imcs_product_id")
    private String imcsProductId;

    @Column(name = "imcs_product_name")
    private String imcsProductName;

    @Column(name = "imcs_product_kind")
    private String imcsProductKind;

    @Column(name = "imcs_amount_gb")
    private String imcsAmountGb;

    @Column(name = "imcs_isu_description")
    private String imcsIsuDescription;

    @Column(name = "imcs_price")
    private String imcsPrice;

    @Column(name = "imcs_currency_desc")
    private String imcsCurrencyDesc;

    @NotNull(message = "must not be null")
    @Column(name = "imcs_create_date")
    private String imcsCreateDate;

    @Column(name = "imcs_product_type")
    private String imcsProductType;

    @Column(name = "imcs_product_start_datetime")
    private String imcsProductStartDatetime;

    @Column(name = "imcs_product_expiry_datetime")
    private String imcsProductExpiryDatetime;

    @Column(name = "imcs_product_type_id")
    private String imcsProductTypeId;

    @Column(name = "imcs_ca_service_id")
    private String imcsCaServiceId;

    @Column(name = "imcs_ca_template_id")
    private String imcsCaTemplateId;

    @Column(name = "imcs_ps_send_gb")
    private String imcsPsSendGb;

    @Column(name = "imcs_si_send_gb")
    private String imcsSiSendGb;

    @Column(name = "imcs_si_send_name")
    private String imcsSiSendName;

    @Column(name = "imcs_si_package_id")
    private String imcsSiPackageId;

    @Column(name = "imcs_remark")
    private String imcsRemark;

    @Column(name = "imcs_isu_ca_service_id")
    private String imcsIsuCaServiceId;

    @Column(name = "imcs_coupon_cnt")
    private String imcsCouponCnt;

    @Column(name = "imcs_product_info")
    private String imcsProductInfo;

    @Column(name = "imcs_drm_send_gb")
    private String imcsDrmSendGb;

    @Column(name = "imcs_settle_way")
    private String imcsSettleWay;

    @Column(name = "imcs_tax_main")
    private String imcsTaxMain;

    @Column(name = "pvs_svc_id")
    private String pvsSvcId;

    @Column(name = "pvs_appl_id")
    private String pvsApplId;

    @Column(name = "imcs_product_desc")
    private String imcsProductDesc;

    @Column(name = "imcs_isu_yn")
    private String imcsIsuYn;

    @Column(name = "imcs_isu_type")
    private String imcsIsuType;

    @Column(name = "imcs_expired_date")
    private String imcsExpiredDate;

    @Column(name = "imcs_watch_udr_yn")
    private String imcsWatchUdrYn;

    @Column(name = "imcs_isu_short_desc")
    private String imcsIsuShortDesc;

    @Column(name = "imcs_subscription_check_id")
    private String imcsSubscriptionCheckId;

    @Column(name = "imcs_ppm_promotion_yn")
    private String imcsPpmPromotionYn;

    @Column(name = "imcs_pps_prod_desc")
    private String imcsPpsProdDesc;

    @Column(name = "imcs_nsc_prod_kind")
    private String imcsNscProdKind;

    @Column(name = "imcs_prod_event_yn")
    private String imcsProdEventYn;

    @Column(name = "imcs_free_product_id")
    private String imcsFreeProductId;

    @Column(name = "isu_cancel")
    private String isuCancel;

    @Column(name = "imcs_nsc_prod_gb")
    private String imcsNscProdGb;

    @Column(name = "imcs_pps_discount_rate")
    private String imcsPpsDiscountRate;

    @Column(name = "imcs_pps_prod_desc_dtl")
    private String imcsPpsProdDescDtl;

    @Column(name = "imcs_expired_time")
    private String imcsExpiredTime;

    @Column(name = "imcs_uflix_prod_yn")
    private String imcsUflixProdYn;

    @Column(name = "imcs_view_ctrl")
    private String imcsViewCtrl;

    @Column(name = "imcs_use_screen_mobile")
    private String imcsUseScreenMobile;

    @Column(name = "imcs_use_screen_pc")
    private String imcsUseScreenPc;

    @Column(name = "imcs_product_property")
    private String imcsProductProperty;

    @Column(name = "imcs_pre_sale_yn")
    private String imcsPreSaleYn;

    @Column(name = "imcs_close_date")
    private String imcsCloseDate;

    @Column(name = "imcs_expired_day")
    private String imcsExpiredDay;

    public String getImcsProductId() {
        return this.imcsProductId;
    }

    public PtPdPackageUnited imcsProductId(String imcsProductId) {
        this.imcsProductId = imcsProductId;
        return this;
    }

    public void setImcsProductId(String imcsProductId) {
        this.imcsProductId = imcsProductId;
    }

    public String getImcsProductName() {
        return this.imcsProductName;
    }

    public PtPdPackageUnited imcsProductName(String imcsProductName) {
        this.imcsProductName = imcsProductName;
        return this;
    }

    public void setImcsProductName(String imcsProductName) {
        this.imcsProductName = imcsProductName;
    }

    public String getImcsProductKind() {
        return this.imcsProductKind;
    }

    public PtPdPackageUnited imcsProductKind(String imcsProductKind) {
        this.imcsProductKind = imcsProductKind;
        return this;
    }

    public void setImcsProductKind(String imcsProductKind) {
        this.imcsProductKind = imcsProductKind;
    }

    public String getImcsAmountGb() {
        return this.imcsAmountGb;
    }

    public PtPdPackageUnited imcsAmountGb(String imcsAmountGb) {
        this.imcsAmountGb = imcsAmountGb;
        return this;
    }

    public void setImcsAmountGb(String imcsAmountGb) {
        this.imcsAmountGb = imcsAmountGb;
    }

    public String getImcsIsuDescription() {
        return this.imcsIsuDescription;
    }

    public PtPdPackageUnited imcsIsuDescription(String imcsIsuDescription) {
        this.imcsIsuDescription = imcsIsuDescription;
        return this;
    }

    public void setImcsIsuDescription(String imcsIsuDescription) {
        this.imcsIsuDescription = imcsIsuDescription;
    }

    public String getImcsPrice() {
        return this.imcsPrice;
    }

    public PtPdPackageUnited imcsPrice(String imcsPrice) {
        this.imcsPrice = imcsPrice;
        return this;
    }

    public void setImcsPrice(String imcsPrice) {
        this.imcsPrice = imcsPrice;
    }

    public String getImcsCurrencyDesc() {
        return this.imcsCurrencyDesc;
    }

    public PtPdPackageUnited imcsCurrencyDesc(String imcsCurrencyDesc) {
        this.imcsCurrencyDesc = imcsCurrencyDesc;
        return this;
    }

    public void setImcsCurrencyDesc(String imcsCurrencyDesc) {
        this.imcsCurrencyDesc = imcsCurrencyDesc;
    }

    public String getImcsCreateDate() {
        return this.imcsCreateDate;
    }

    public PtPdPackageUnited imcsCreateDate(String imcsCreateDate) {
        this.imcsCreateDate = imcsCreateDate;
        return this;
    }

    public void setImcsCreateDate(String imcsCreateDate) {
        this.imcsCreateDate = imcsCreateDate;
    }

    public String getImcsProductType() {
        return this.imcsProductType;
    }

    public PtPdPackageUnited imcsProductType(String imcsProductType) {
        this.imcsProductType = imcsProductType;
        return this;
    }

    public void setImcsProductType(String imcsProductType) {
        this.imcsProductType = imcsProductType;
    }

    public String getImcsProductStartDatetime() {
        return this.imcsProductStartDatetime;
    }

    public PtPdPackageUnited imcsProductStartDatetime(String imcsProductStartDatetime) {
        this.imcsProductStartDatetime = imcsProductStartDatetime;
        return this;
    }

    public void setImcsProductStartDatetime(String imcsProductStartDatetime) {
        this.imcsProductStartDatetime = imcsProductStartDatetime;
    }

    public String getImcsProductExpiryDatetime() {
        return this.imcsProductExpiryDatetime;
    }

    public PtPdPackageUnited imcsProductExpiryDatetime(String imcsProductExpiryDatetime) {
        this.imcsProductExpiryDatetime = imcsProductExpiryDatetime;
        return this;
    }

    public void setImcsProductExpiryDatetime(String imcsProductExpiryDatetime) {
        this.imcsProductExpiryDatetime = imcsProductExpiryDatetime;
    }

    public String getImcsProductTypeId() {
        return this.imcsProductTypeId;
    }

    public PtPdPackageUnited imcsProductTypeId(String imcsProductTypeId) {
        this.imcsProductTypeId = imcsProductTypeId;
        return this;
    }

    public void setImcsProductTypeId(String imcsProductTypeId) {
        this.imcsProductTypeId = imcsProductTypeId;
    }

    public String getImcsCaServiceId() {
        return this.imcsCaServiceId;
    }

    public PtPdPackageUnited imcsCaServiceId(String imcsCaServiceId) {
        this.imcsCaServiceId = imcsCaServiceId;
        return this;
    }

    public void setImcsCaServiceId(String imcsCaServiceId) {
        this.imcsCaServiceId = imcsCaServiceId;
    }

    public String getImcsCaTemplateId() {
        return this.imcsCaTemplateId;
    }

    public PtPdPackageUnited imcsCaTemplateId(String imcsCaTemplateId) {
        this.imcsCaTemplateId = imcsCaTemplateId;
        return this;
    }

    public void setImcsCaTemplateId(String imcsCaTemplateId) {
        this.imcsCaTemplateId = imcsCaTemplateId;
    }

    public String getImcsPsSendGb() {
        return this.imcsPsSendGb;
    }

    public PtPdPackageUnited imcsPsSendGb(String imcsPsSendGb) {
        this.imcsPsSendGb = imcsPsSendGb;
        return this;
    }

    public void setImcsPsSendGb(String imcsPsSendGb) {
        this.imcsPsSendGb = imcsPsSendGb;
    }

    public String getImcsSiSendGb() {
        return this.imcsSiSendGb;
    }

    public PtPdPackageUnited imcsSiSendGb(String imcsSiSendGb) {
        this.imcsSiSendGb = imcsSiSendGb;
        return this;
    }

    public void setImcsSiSendGb(String imcsSiSendGb) {
        this.imcsSiSendGb = imcsSiSendGb;
    }

    public String getImcsSiSendName() {
        return this.imcsSiSendName;
    }

    public PtPdPackageUnited imcsSiSendName(String imcsSiSendName) {
        this.imcsSiSendName = imcsSiSendName;
        return this;
    }

    public void setImcsSiSendName(String imcsSiSendName) {
        this.imcsSiSendName = imcsSiSendName;
    }

    public String getImcsSiPackageId() {
        return this.imcsSiPackageId;
    }

    public PtPdPackageUnited imcsSiPackageId(String imcsSiPackageId) {
        this.imcsSiPackageId = imcsSiPackageId;
        return this;
    }

    public void setImcsSiPackageId(String imcsSiPackageId) {
        this.imcsSiPackageId = imcsSiPackageId;
    }

    public String getImcsRemark() {
        return this.imcsRemark;
    }

    public PtPdPackageUnited imcsRemark(String imcsRemark) {
        this.imcsRemark = imcsRemark;
        return this;
    }

    public void setImcsRemark(String imcsRemark) {
        this.imcsRemark = imcsRemark;
    }

    public String getImcsIsuCaServiceId() {
        return this.imcsIsuCaServiceId;
    }

    public PtPdPackageUnited imcsIsuCaServiceId(String imcsIsuCaServiceId) {
        this.imcsIsuCaServiceId = imcsIsuCaServiceId;
        return this;
    }

    public void setImcsIsuCaServiceId(String imcsIsuCaServiceId) {
        this.imcsIsuCaServiceId = imcsIsuCaServiceId;
    }

    public String getImcsCouponCnt() {
        return this.imcsCouponCnt;
    }

    public PtPdPackageUnited imcsCouponCnt(String imcsCouponCnt) {
        this.imcsCouponCnt = imcsCouponCnt;
        return this;
    }

    public void setImcsCouponCnt(String imcsCouponCnt) {
        this.imcsCouponCnt = imcsCouponCnt;
    }

    public String getImcsProductInfo() {
        return this.imcsProductInfo;
    }

    public PtPdPackageUnited imcsProductInfo(String imcsProductInfo) {
        this.imcsProductInfo = imcsProductInfo;
        return this;
    }

    public void setImcsProductInfo(String imcsProductInfo) {
        this.imcsProductInfo = imcsProductInfo;
    }

    public String getImcsDrmSendGb() {
        return this.imcsDrmSendGb;
    }

    public PtPdPackageUnited imcsDrmSendGb(String imcsDrmSendGb) {
        this.imcsDrmSendGb = imcsDrmSendGb;
        return this;
    }

    public void setImcsDrmSendGb(String imcsDrmSendGb) {
        this.imcsDrmSendGb = imcsDrmSendGb;
    }

    public String getImcsSettleWay() {
        return this.imcsSettleWay;
    }

    public PtPdPackageUnited imcsSettleWay(String imcsSettleWay) {
        this.imcsSettleWay = imcsSettleWay;
        return this;
    }

    public void setImcsSettleWay(String imcsSettleWay) {
        this.imcsSettleWay = imcsSettleWay;
    }

    public String getImcsTaxMain() {
        return this.imcsTaxMain;
    }

    public PtPdPackageUnited imcsTaxMain(String imcsTaxMain) {
        this.imcsTaxMain = imcsTaxMain;
        return this;
    }

    public void setImcsTaxMain(String imcsTaxMain) {
        this.imcsTaxMain = imcsTaxMain;
    }

    public String getPvsSvcId() {
        return this.pvsSvcId;
    }

    public PtPdPackageUnited pvsSvcId(String pvsSvcId) {
        this.pvsSvcId = pvsSvcId;
        return this;
    }

    public void setPvsSvcId(String pvsSvcId) {
        this.pvsSvcId = pvsSvcId;
    }

    public String getPvsApplId() {
        return this.pvsApplId;
    }

    public PtPdPackageUnited pvsApplId(String pvsApplId) {
        this.pvsApplId = pvsApplId;
        return this;
    }

    public void setPvsApplId(String pvsApplId) {
        this.pvsApplId = pvsApplId;
    }

    public String getImcsProductDesc() {
        return this.imcsProductDesc;
    }

    public PtPdPackageUnited imcsProductDesc(String imcsProductDesc) {
        this.imcsProductDesc = imcsProductDesc;
        return this;
    }

    public void setImcsProductDesc(String imcsProductDesc) {
        this.imcsProductDesc = imcsProductDesc;
    }

    public String getImcsIsuYn() {
        return this.imcsIsuYn;
    }

    public PtPdPackageUnited imcsIsuYn(String imcsIsuYn) {
        this.imcsIsuYn = imcsIsuYn;
        return this;
    }

    public void setImcsIsuYn(String imcsIsuYn) {
        this.imcsIsuYn = imcsIsuYn;
    }

    public String getImcsIsuType() {
        return this.imcsIsuType;
    }

    public PtPdPackageUnited imcsIsuType(String imcsIsuType) {
        this.imcsIsuType = imcsIsuType;
        return this;
    }

    public void setImcsIsuType(String imcsIsuType) {
        this.imcsIsuType = imcsIsuType;
    }

    public String getImcsExpiredDate() {
        return this.imcsExpiredDate;
    }

    public PtPdPackageUnited imcsExpiredDate(String imcsExpiredDate) {
        this.imcsExpiredDate = imcsExpiredDate;
        return this;
    }

    public void setImcsExpiredDate(String imcsExpiredDate) {
        this.imcsExpiredDate = imcsExpiredDate;
    }

    public String getImcsWatchUdrYn() {
        return this.imcsWatchUdrYn;
    }

    public PtPdPackageUnited imcsWatchUdrYn(String imcsWatchUdrYn) {
        this.imcsWatchUdrYn = imcsWatchUdrYn;
        return this;
    }

    public void setImcsWatchUdrYn(String imcsWatchUdrYn) {
        this.imcsWatchUdrYn = imcsWatchUdrYn;
    }

    public String getImcsIsuShortDesc() {
        return this.imcsIsuShortDesc;
    }

    public PtPdPackageUnited imcsIsuShortDesc(String imcsIsuShortDesc) {
        this.imcsIsuShortDesc = imcsIsuShortDesc;
        return this;
    }

    public void setImcsIsuShortDesc(String imcsIsuShortDesc) {
        this.imcsIsuShortDesc = imcsIsuShortDesc;
    }

    public String getImcsSubscriptionCheckId() {
        return this.imcsSubscriptionCheckId;
    }

    public PtPdPackageUnited imcsSubscriptionCheckId(String imcsSubscriptionCheckId) {
        this.imcsSubscriptionCheckId = imcsSubscriptionCheckId;
        return this;
    }

    public void setImcsSubscriptionCheckId(String imcsSubscriptionCheckId) {
        this.imcsSubscriptionCheckId = imcsSubscriptionCheckId;
    }

    public String getImcsPpmPromotionYn() {
        return this.imcsPpmPromotionYn;
    }

    public PtPdPackageUnited imcsPpmPromotionYn(String imcsPpmPromotionYn) {
        this.imcsPpmPromotionYn = imcsPpmPromotionYn;
        return this;
    }

    public void setImcsPpmPromotionYn(String imcsPpmPromotionYn) {
        this.imcsPpmPromotionYn = imcsPpmPromotionYn;
    }

    public String getImcsPpsProdDesc() {
        return this.imcsPpsProdDesc;
    }

    public PtPdPackageUnited imcsPpsProdDesc(String imcsPpsProdDesc) {
        this.imcsPpsProdDesc = imcsPpsProdDesc;
        return this;
    }

    public void setImcsPpsProdDesc(String imcsPpsProdDesc) {
        this.imcsPpsProdDesc = imcsPpsProdDesc;
    }

    public String getImcsNscProdKind() {
        return this.imcsNscProdKind;
    }

    public PtPdPackageUnited imcsNscProdKind(String imcsNscProdKind) {
        this.imcsNscProdKind = imcsNscProdKind;
        return this;
    }

    public void setImcsNscProdKind(String imcsNscProdKind) {
        this.imcsNscProdKind = imcsNscProdKind;
    }

    public String getImcsProdEventYn() {
        return this.imcsProdEventYn;
    }

    public PtPdPackageUnited imcsProdEventYn(String imcsProdEventYn) {
        this.imcsProdEventYn = imcsProdEventYn;
        return this;
    }

    public void setImcsProdEventYn(String imcsProdEventYn) {
        this.imcsProdEventYn = imcsProdEventYn;
    }

    public String getImcsFreeProductId() {
        return this.imcsFreeProductId;
    }

    public PtPdPackageUnited imcsFreeProductId(String imcsFreeProductId) {
        this.imcsFreeProductId = imcsFreeProductId;
        return this;
    }

    public void setImcsFreeProductId(String imcsFreeProductId) {
        this.imcsFreeProductId = imcsFreeProductId;
    }

    public String getIsuCancel() {
        return this.isuCancel;
    }

    public PtPdPackageUnited isuCancel(String isuCancel) {
        this.isuCancel = isuCancel;
        return this;
    }

    public void setIsuCancel(String isuCancel) {
        this.isuCancel = isuCancel;
    }

    public String getImcsNscProdGb() {
        return this.imcsNscProdGb;
    }

    public PtPdPackageUnited imcsNscProdGb(String imcsNscProdGb) {
        this.imcsNscProdGb = imcsNscProdGb;
        return this;
    }

    public void setImcsNscProdGb(String imcsNscProdGb) {
        this.imcsNscProdGb = imcsNscProdGb;
    }

    public String getImcsPpsDiscountRate() {
        return this.imcsPpsDiscountRate;
    }

    public PtPdPackageUnited imcsPpsDiscountRate(String imcsPpsDiscountRate) {
        this.imcsPpsDiscountRate = imcsPpsDiscountRate;
        return this;
    }

    public void setImcsPpsDiscountRate(String imcsPpsDiscountRate) {
        this.imcsPpsDiscountRate = imcsPpsDiscountRate;
    }

    public String getImcsPpsProdDescDtl() {
        return this.imcsPpsProdDescDtl;
    }

    public PtPdPackageUnited imcsPpsProdDescDtl(String imcsPpsProdDescDtl) {
        this.imcsPpsProdDescDtl = imcsPpsProdDescDtl;
        return this;
    }

    public void setImcsPpsProdDescDtl(String imcsPpsProdDescDtl) {
        this.imcsPpsProdDescDtl = imcsPpsProdDescDtl;
    }

    public String getImcsExpiredTime() {
        return this.imcsExpiredTime;
    }

    public PtPdPackageUnited imcsExpiredTime(String imcsExpiredTime) {
        this.imcsExpiredTime = imcsExpiredTime;
        return this;
    }

    public void setImcsExpiredTime(String imcsExpiredTime) {
        this.imcsExpiredTime = imcsExpiredTime;
    }

    public String getImcsUflixProdYn() {
        return this.imcsUflixProdYn;
    }

    public PtPdPackageUnited imcsUflixProdYn(String imcsUflixProdYn) {
        this.imcsUflixProdYn = imcsUflixProdYn;
        return this;
    }

    public void setImcsUflixProdYn(String imcsUflixProdYn) {
        this.imcsUflixProdYn = imcsUflixProdYn;
    }

    public String getImcsViewCtrl() {
        return this.imcsViewCtrl;
    }

    public PtPdPackageUnited imcsViewCtrl(String imcsViewCtrl) {
        this.imcsViewCtrl = imcsViewCtrl;
        return this;
    }

    public void setImcsViewCtrl(String imcsViewCtrl) {
        this.imcsViewCtrl = imcsViewCtrl;
    }

    public String getImcsUseScreenMobile() {
        return this.imcsUseScreenMobile;
    }

    public PtPdPackageUnited imcsUseScreenMobile(String imcsUseScreenMobile) {
        this.imcsUseScreenMobile = imcsUseScreenMobile;
        return this;
    }

    public void setImcsUseScreenMobile(String imcsUseScreenMobile) {
        this.imcsUseScreenMobile = imcsUseScreenMobile;
    }

    public String getImcsUseScreenPc() {
        return this.imcsUseScreenPc;
    }

    public PtPdPackageUnited imcsUseScreenPc(String imcsUseScreenPc) {
        this.imcsUseScreenPc = imcsUseScreenPc;
        return this;
    }

    public void setImcsUseScreenPc(String imcsUseScreenPc) {
        this.imcsUseScreenPc = imcsUseScreenPc;
    }

    public String getImcsProductProperty() {
        return this.imcsProductProperty;
    }

    public PtPdPackageUnited imcsProductProperty(String imcsProductProperty) {
        this.imcsProductProperty = imcsProductProperty;
        return this;
    }

    public void setImcsProductProperty(String imcsProductProperty) {
        this.imcsProductProperty = imcsProductProperty;
    }

    public String getImcsPreSaleYn() {
        return this.imcsPreSaleYn;
    }

    public PtPdPackageUnited imcsPreSaleYn(String imcsPreSaleYn) {
        this.imcsPreSaleYn = imcsPreSaleYn;
        return this;
    }

    public void setImcsPreSaleYn(String imcsPreSaleYn) {
        this.imcsPreSaleYn = imcsPreSaleYn;
    }

    public String getImcsCloseDate() {
        return this.imcsCloseDate;
    }

    public PtPdPackageUnited imcsCloseDate(String imcsCloseDate) {
        this.imcsCloseDate = imcsCloseDate;
        return this;
    }

    public void setImcsCloseDate(String imcsCloseDate) {
        this.imcsCloseDate = imcsCloseDate;
    }

    public String getImcsExpiredDay() {
        return this.imcsExpiredDay;
    }

    public PtPdPackageUnited imcsExpiredDay(String imcsExpiredDay) {
        this.imcsExpiredDay = imcsExpiredDay;
        return this;
    }

    public void setImcsExpiredDay(String imcsExpiredDay) {
        this.imcsExpiredDay = imcsExpiredDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PtPdPackageUnited)) {
            return false;
        }
        return imcsProductId != null && imcsProductId.equals(((PtPdPackageUnited) o).imcsProductId);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "PtPdPackageUnited{" +
                ", imcsProductId='" + getImcsProductId() + "'" +
                ", imcsProductName='" + getImcsProductName() + "'" +
                ", imcsProductKind='" + getImcsProductKind() + "'" +
                ", imcsAmountGb='" + getImcsAmountGb() + "'" +
                ", imcsIsuDescription='" + getImcsIsuDescription() + "'" +
                ", imcsPrice='" + getImcsPrice() + "'" +
                ", imcsCurrencyDesc='" + getImcsCurrencyDesc() + "'" +
                ", imcsCreateDate='" + getImcsCreateDate() + "'" +
                ", imcsProductType='" + getImcsProductType() + "'" +
                ", imcsProductStartDatetime='" + getImcsProductStartDatetime() + "'" +
                ", imcsProductExpiryDatetime='" + getImcsProductExpiryDatetime() + "'" +
                ", imcsProductTypeId='" + getImcsProductTypeId() + "'" +
                ", imcsCaServiceId='" + getImcsCaServiceId() + "'" +
                ", imcsCaTemplateId='" + getImcsCaTemplateId() + "'" +
                ", imcsPsSendGb='" + getImcsPsSendGb() + "'" +
                ", imcsSiSendGb='" + getImcsSiSendGb() + "'" +
                ", imcsSiSendName='" + getImcsSiSendName() + "'" +
                ", imcsSiPackageId='" + getImcsSiPackageId() + "'" +
                ", imcsRemark='" + getImcsRemark() + "'" +
                ", imcsIsuCaServiceId='" + getImcsIsuCaServiceId() + "'" +
                ", imcsCouponCnt='" + getImcsCouponCnt() + "'" +
                ", imcsProductInfo='" + getImcsProductInfo() + "'" +
                ", imcsDrmSendGb='" + getImcsDrmSendGb() + "'" +
                ", imcsSettleWay='" + getImcsSettleWay() + "'" +
                ", imcsTaxMain='" + getImcsTaxMain() + "'" +
                ", pvsSvcId='" + getPvsSvcId() + "'" +
                ", pvsApplId='" + getPvsApplId() + "'" +
                ", imcsProductDesc='" + getImcsProductDesc() + "'" +
                ", imcsIsuYn='" + getImcsIsuYn() + "'" +
                ", imcsIsuType='" + getImcsIsuType() + "'" +
                ", imcsExpiredDate='" + getImcsExpiredDate() + "'" +
                ", imcsWatchUdrYn='" + getImcsWatchUdrYn() + "'" +
                ", imcsIsuShortDesc='" + getImcsIsuShortDesc() + "'" +
                ", imcsSubscriptionCheckId='" + getImcsSubscriptionCheckId() + "'" +
                ", imcsPpmPromotionYn='" + getImcsPpmPromotionYn() + "'" +
                ", imcsPpsProdDesc='" + getImcsPpsProdDesc() + "'" +
                ", imcsNscProdKind='" + getImcsNscProdKind() + "'" +
                ", imcsProdEventYn='" + getImcsProdEventYn() + "'" +
                ", imcsFreeProductId='" + getImcsFreeProductId() + "'" +
                ", isuCancel='" + getIsuCancel() + "'" +
                ", imcsNscProdGb='" + getImcsNscProdGb() + "'" +
                ", imcsPpsDiscountRate='" + getImcsPpsDiscountRate() + "'" +
                ", imcsPpsProdDescDtl='" + getImcsPpsProdDescDtl() + "'" +
                ", imcsExpiredTime='" + getImcsExpiredTime() + "'" +
                ", imcsUflixProdYn='" + getImcsUflixProdYn() + "'" +
                ", imcsViewCtrl='" + getImcsViewCtrl() + "'" +
                ", imcsUseScreenMobile='" + getImcsUseScreenMobile() + "'" +
                ", imcsUseScreenPc='" + getImcsUseScreenPc() + "'" +
                ", imcsProductProperty='" + getImcsProductProperty() + "'" +
                ", imcsPreSaleYn='" + getImcsPreSaleYn() + "'" +
                ", imcsCloseDate='" + getImcsCloseDate() + "'" +
                ", imcsExpiredDay='" + getImcsExpiredDay() + "'" +
                "}";
    }
}
