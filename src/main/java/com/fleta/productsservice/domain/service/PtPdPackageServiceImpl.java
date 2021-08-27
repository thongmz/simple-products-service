package com.fleta.productsservice.domain.service;

import com.fleta.productsservice.adapter.persistence.PtPdPackageDetailRepository;
import com.fleta.productsservice.adapter.persistence.PtPdPackageSubRepository;
import com.fleta.productsservice.adapter.persistence.PtPdPackageUnitedRepository;
import com.fleta.productsservice.domain.model.PtPdPackageDetail;
import com.fleta.productsservice.domain.model.PtPdPackageSub;
import com.fleta.productsservice.domain.model.PtPdPackageUnited;
import com.fleta.productsservice.port.inbound.PtPdPackageServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PtPdPackageServiceImpl implements PtPdPackageServices {

    private final PtPdPackageDetailRepository ptPdPackageDetailRepository;

    private final PtPdPackageUnitedRepository ptPdPackageUnitedRepository;

    private final PtPdPackageSubRepository ptPdPackageSubRepository;

    @Autowired
    PtPdPackageServiceImpl(PtPdPackageDetailRepository detailRepository, PtPdPackageUnitedRepository unitedRepository,
                           PtPdPackageSubRepository subRepository) {
        this.ptPdPackageDetailRepository = detailRepository;
        this.ptPdPackageUnitedRepository = unitedRepository;
        this.ptPdPackageSubRepository = subRepository;
    }

    @Override
    public PtPdPackageDetail savePackageDetail(PtPdPackageDetail packageDetail) {
        return ptPdPackageDetailRepository.save(packageDetail);
    }

    @Override
    public boolean existsPackageDetailById(Long id) {
        return ptPdPackageDetailRepository.existsById(id);
    }

    @Override
    public Optional<PtPdPackageDetail> findPackageDetailById(Long id) {
        return ptPdPackageDetailRepository.findById(id);
    }

    @Override
    public void deletePackageDetailById(Long id) {
        ptPdPackageDetailRepository.deleteById(id);
    }

    @Override
    public List<PtPdPackageDetail> findAllPackageDetail() {
        return ptPdPackageDetailRepository.findAll();
    }

    @Override
    public PtPdPackageSub savePackageSub(PtPdPackageSub packageSub) {
        return ptPdPackageSubRepository.save(packageSub);
    }

    @Override
    public boolean existsPackageSubById(Long id) {
        return ptPdPackageSubRepository.existsById(String.valueOf(id));
    }

    @Override
    public Optional<PtPdPackageSub> findPackageSubById(Long id) {
        return ptPdPackageSubRepository.findById(String.valueOf(id));
    }

    @Override
    public void deletePackageSubById(Long id) {
        ptPdPackageSubRepository.deleteById(String.valueOf(id));
    }

    @Override
    public List<PtPdPackageSub> findAllPackageSub() {
        return ptPdPackageSubRepository.findAll();
    }

//    @Override
//    public PtPdPackageUnited savePackageUnited(PtPdPackageUnited packageUnited) {
//        return ptPdPackageUnitedRepository.save(packageUnited);
//    }
//
//    @Override
//    public boolean existsPackageUnitedById(String id) {
//        return ptPdPackageUnitedRepository.existsById(id);
//    }
//
    @Override
    public Optional<PtPdPackageUnited> findPackageUnitedById(String id) {
        return ptPdPackageUnitedRepository.findById(id);
    }
//
//    @Override
//    public void deletePackageUnitedById(String id) {
//        ptPdPackageUnitedRepository.deleteById(id);
//    }

    @Override
    public List<PtPdPackageUnited> findAllPackageUnited() {
        return null;
    }
}
