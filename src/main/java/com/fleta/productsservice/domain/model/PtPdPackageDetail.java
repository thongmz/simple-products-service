package com.fleta.productsservice.domain.model;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "pt_pd_package_detail")
public class PtPdPackageDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Long id;

    @Column(name = "product_id")
    private String productId;

    @Column(name = "contents_id")
    private String contentsId;

    @Column(name = "contribute_yn")
    private String contributeYn;

    @Column(name = "remark")
    private String remark;

    @Column(name = "drm_send_yn")
    private String drmSendYn;

    @Column(name = "insert_date")
    private String insertDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PtPdPackageDetail id(Long id) {
        this.id = id;
        return this;
    }

    public String getProductId() {
        return this.productId;
    }

    public PtPdPackageDetail productId(String productId) {
        this.productId = productId;
        return this;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getContentsId() {
        return this.contentsId;
    }

    public PtPdPackageDetail contentsId(String contentsId) {
        this.contentsId = contentsId;
        return this;
    }

    public void setContentsId(String contentsId) {
        this.contentsId = contentsId;
    }

    public String getContributeYn() {
        return this.contributeYn;
    }

    public PtPdPackageDetail contributeYn(String contributeYn) {
        this.contributeYn = contributeYn;
        return this;
    }

    public void setContributeYn(String contributeYn) {
        this.contributeYn = contributeYn;
    }

    public String getRemark() {
        return this.remark;
    }

    public PtPdPackageDetail remark(String remark) {
        this.remark = remark;
        return this;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDrmSendYn() {
        return this.drmSendYn;
    }

    public PtPdPackageDetail drmSendYn(String drmSendYn) {
        this.drmSendYn = drmSendYn;
        return this;
    }

    public void setDrmSendYn(String drmSendYn) {
        this.drmSendYn = drmSendYn;
    }

    public String getInsertDate() {
        return this.insertDate;
    }

    public PtPdPackageDetail insertDate(String insertDate) {
        this.insertDate = insertDate;
        return this;
    }

    public void setInsertDate(String insertDate) {
        this.insertDate = insertDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PtPdPackageDetail)) {
            return false;
        }
        return id != null && id.equals(((PtPdPackageDetail) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "PtPdPackageDetail{" +
                "id=" + getId() +
                ", productId='" + getProductId() + "'" +
                ", contentsId='" + getContentsId() + "'" +
                ", contributeYn='" + getContributeYn() + "'" +
                ", remark='" + getRemark() + "'" +
                ", drmSendYn='" + getDrmSendYn() + "'" +
                ", insertDate='" + getInsertDate() + "'" +
                "}";
    }
}
