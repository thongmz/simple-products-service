package com.fleta.productsservice.port.inbound;

import com.fleta.productsservice.domain.model.PtPdPackageDetail;
import com.fleta.productsservice.domain.model.PtPdPackageSub;
import com.fleta.productsservice.domain.model.PtPdPackageUnited;

import java.util.List;
import java.util.Optional;

public interface PtPdPackageServices {

    PtPdPackageDetail savePackageDetail(PtPdPackageDetail packageDetail);

    boolean existsPackageDetailById(Long id);

    Optional<PtPdPackageDetail> findPackageDetailById(Long id);

    void deletePackageDetailById(Long id);

    List<PtPdPackageDetail> findAllPackageDetail();


    PtPdPackageSub savePackageSub(PtPdPackageSub packageSub);

    boolean existsPackageSubById(Long id);

    Optional<PtPdPackageSub> findPackageSubById(Long id);

    void deletePackageSubById(Long id);

    List<PtPdPackageSub> findAllPackageSub();


//    PtPdPackageUnited savePackageUnited(PtPdPackageUnited packageUnited);
//
//    boolean existsPackageUnitedById(String id);
//
    Optional<PtPdPackageUnited> findPackageUnitedById(String id);
//
//    void deletePackageUnitedById(String id);

    List<PtPdPackageUnited> findAllPackageUnited();

}
