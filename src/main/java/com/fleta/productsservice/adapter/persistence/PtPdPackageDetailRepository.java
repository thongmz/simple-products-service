package com.fleta.productsservice.adapter.persistence;

import com.fleta.productsservice.domain.model.PtPdPackageDetail;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PtPdPackageDetailRepository extends JpaRepository<PtPdPackageDetail, Long> {
}
