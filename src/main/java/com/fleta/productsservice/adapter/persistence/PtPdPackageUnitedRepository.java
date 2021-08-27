package com.fleta.productsservice.adapter.persistence;

import com.fleta.productsservice.domain.model.PtPdPackageUnited;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PtPdPackageUnitedRepository extends JpaRepository<PtPdPackageUnited, String> {
}
