package com.fleta.productsservice.domain.model;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name="pt_pd_package_sub")
public class PtPdPackageSub implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @NotNull(message = "must not be null")
    @Column(name = "product_id")
    private String productId;

    @Column(name = "concurrent_count")
    private Integer concurrentCount;

    @Column(name = "ppv_block_yn")
    private String ppvBlockYn;

    @Column(name = "nscreen_yn")
    private String nscreenYn;

    @Column(name = "product_title")
    private String productTitle;

    @Column(name = "product_gb")
    private String productGb;

    @Column(name = "summary_promotion")
    private String summaryPromotion;

    @Column(name = "promotion_start_date")
    private String promotionStartDate;

    @Column(name = "promotion_end_date")
    private String promotionEndDate;

    @Column(name = "promotion_image_name")
    private String promotionImageName;

    @Column(name = "app_ctrl")
    private String appCtrl;

    public String getId() {
        return productId;
    }

    public void setId(String id) {
        this.productId = id;
    }

    public PtPdPackageSub id(String id) {
        this.productId = id;
        return this;
    }

    public String getProductId() {
        return this.productId;
    }

    public PtPdPackageSub productId(String productId) {
        this.productId = productId;
        return this;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Integer getConcurrentCount() {
        return this.concurrentCount;
    }

    public PtPdPackageSub concurrentCount(Integer concurrentCount) {
        this.concurrentCount = concurrentCount;
        return this;
    }

    public void setConcurrentCount(Integer concurrentCount) {
        this.concurrentCount = concurrentCount;
    }

    public String getPpvBlockYn() {
        return this.ppvBlockYn;
    }

    public PtPdPackageSub ppvBlockYn(String ppvBlockYn) {
        this.ppvBlockYn = ppvBlockYn;
        return this;
    }

    public void setPpvBlockYn(String ppvBlockYn) {
        this.ppvBlockYn = ppvBlockYn;
    }

    public String getNscreenYn() {
        return this.nscreenYn;
    }

    public PtPdPackageSub nscreenYn(String nscreenYn) {
        this.nscreenYn = nscreenYn;
        return this;
    }

    public void setNscreenYn(String nscreenYn) {
        this.nscreenYn = nscreenYn;
    }

    public String getProductTitle() {
        return this.productTitle;
    }

    public PtPdPackageSub productTitle(String productTitle) {
        this.productTitle = productTitle;
        return this;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public String getProductGb() {
        return this.productGb;
    }

    public PtPdPackageSub productGb(String productGb) {
        this.productGb = productGb;
        return this;
    }

    public void setProductGb(String productGb) {
        this.productGb = productGb;
    }

    public String getSummaryPromotion() {
        return this.summaryPromotion;
    }

    public PtPdPackageSub summaryPromotion(String summaryPromotion) {
        this.summaryPromotion = summaryPromotion;
        return this;
    }

    public void setSummaryPromotion(String summaryPromotion) {
        this.summaryPromotion = summaryPromotion;
    }

    public String getPromotionStartDate() {
        return this.promotionStartDate;
    }

    public PtPdPackageSub promotionStartDate(String promotionStartDate) {
        this.promotionStartDate = promotionStartDate;
        return this;
    }

    public void setPromotionStartDate(String promotionStartDate) {
        this.promotionStartDate = promotionStartDate;
    }

    public String getPromotionEndDate() {
        return this.promotionEndDate;
    }

    public PtPdPackageSub promotionEndDate(String promotionEndDate) {
        this.promotionEndDate = promotionEndDate;
        return this;
    }

    public void setPromotionEndDate(String promotionEndDate) {
        this.promotionEndDate = promotionEndDate;
    }

    public String getPromotionImageName() {
        return this.promotionImageName;
    }

    public PtPdPackageSub promotionImageName(String promotionImageName) {
        this.promotionImageName = promotionImageName;
        return this;
    }

    public void setPromotionImageName(String promotionImageName) {
        this.promotionImageName = promotionImageName;
    }

    public String getAppCtrl() {
        return this.appCtrl;
    }

    public PtPdPackageSub appCtrl(String appCtrl) {
        this.appCtrl = appCtrl;
        return this;
    }

    public void setAppCtrl(String appCtrl) {
        this.appCtrl = appCtrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PtPdPackageSub)) {
            return false;
        }
        return productId != null && productId.equals(((PtPdPackageSub) o).productId);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "PtPdPackageSub{" +
                "id=" + getId() +
                ", productId='" + getProductId() + "'" +
                ", concurrentCount=" + getConcurrentCount() +
                ", ppvBlockYn='" + getPpvBlockYn() + "'" +
                ", nscreenYn='" + getNscreenYn() + "'" +
                ", productTitle='" + getProductTitle() + "'" +
                ", productGb='" + getProductGb() + "'" +
                ", summaryPromotion='" + getSummaryPromotion() + "'" +
                ", promotionStartDate='" + getPromotionStartDate() + "'" +
                ", promotionEndDate='" + getPromotionEndDate() + "'" +
                ", promotionImageName='" + getPromotionImageName() + "'" +
                ", appCtrl='" + getAppCtrl() + "'" +
                "}";
    }
}
