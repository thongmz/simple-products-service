package com.fleta.productsservice.adapter.rest;

import com.fleta.productsservice.adapter.rest.errors.BadRequestAlertException;
import com.fleta.productsservice.domain.model.PtPdPackageDetail;
import com.fleta.productsservice.port.inbound.PtPdPackageServices;
import com.megazone.framework.web.util.HeaderUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * REST controller for managing {@link PtPdPackageDetail}.
 */
@RestController
@RequestMapping("/api")
@Transactional
public class PtPdPackageDetailController {

    private final Logger log = LoggerFactory.getLogger(PtPdPackageDetailController.class);

    private static final String ENTITY_NAME = "productsServicePtPdPackageDetail";

    @Value("${mega.clientApp.name}")
    private String applicationName;

    private final PtPdPackageServices ptPdPackageDetailService;

    public PtPdPackageDetailController(PtPdPackageServices packageDetailService) {
        this.ptPdPackageDetailService = packageDetailService;
    }

    /**
     * {@code POST  /pt-pd-package-details} : Create a new ptPdPackageDt.
     *
     * @param ptPdPackageDetail the ptPdPackageDt to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new ptPdPackageDt, or with status {@code 400 (Bad Request)} if the ptPdPackageDt has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/pt-pd-package-details")
    public ResponseEntity<PtPdPackageDetail> createPtPdPackageDt(@Valid @RequestBody PtPdPackageDetail ptPdPackageDetail)
        throws URISyntaxException {
        log.debug("REST request to save PtPdPackageDt : {}", ptPdPackageDetail);
        if (ptPdPackageDetail.getId() != null) {
            throw new BadRequestAlertException("A new ptPdPackageDt cannot already have an ID", ENTITY_NAME, "idexists");
        }
        PtPdPackageDetail packageDetail = ptPdPackageDetailService.savePackageDetail(ptPdPackageDetail);
        return ResponseEntity
                .created(new URI("/api/pt-pd-package-details/" + packageDetail.getContentsId()))
                .headers(HeaderUtil.createEntityCreationAlert(applicationName, true, ENTITY_NAME, packageDetail.getProductId()))
                .body(packageDetail);
    }

    /**
     * {@code PUT  /pt-pd-pt_pd_package_details/:id} : Updates an existing ptPdPackageDt.
     *
     * @param id the id of the ptPdPackageDt to save.
     * @param ptPdPackageDetail the ptPdPackageDt to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated ptPdPackageDt,
     * or with status {@code 400 (Bad Request)} if the ptPdPackageDt is not valid,
     * or with status {@code 500 (Internal Server Error)} if the ptPdPackageDt couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/pt-pd-pt_pd_package_details/{id}")
    public ResponseEntity<PtPdPackageDetail> updatePtPdPackageDt(
        @PathVariable(value = "id", required = false) final Long id,
        @Valid @RequestBody PtPdPackageDetail ptPdPackageDetail
    ) throws URISyntaxException {
        log.debug("REST request to update PtPdPackageDt : {}, {}", id, ptPdPackageDetail);
        if (ptPdPackageDetail.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, ptPdPackageDetail.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        try {
            boolean isExist = ptPdPackageDetailService.existsPackageDetailById(id);
            if (isExist == Boolean.FALSE) {
                throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
            }

            PtPdPackageDetail result = ptPdPackageDetailService.savePackageDetail(ptPdPackageDetail);
            return ResponseEntity
                    .ok()
                    .headers(
                            HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, result.getProductId())
                    )
                    .body(result);
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ptPdPackageDetail);
        }

    }

    /**
     * {@code PATCH  /pt-pd-pt_pd_package_details/:id} : Partial updates given fields of an existing ptPdPackageDt, field will ignore if it is null
     *
     * @param id the id of the ptPdPackageDt to save.
     * @param ptPdPackageDetail the ptPdPackageDt to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated ptPdPackageDt,
     * or with status {@code 400 (Bad Request)} if the ptPdPackageDt is not valid,
     * or with status {@code 404 (Not Found)} if the ptPdPackageDt is not found,
     * or with status {@code 500 (Internal Server Error)} if the ptPdPackageDt couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PatchMapping(value = "/pt-pd-pt_pd_package_details/{id}", consumes = "application/merge-patch+json")
    public ResponseEntity<PtPdPackageDetail> partialUpdatePtPdPackageDt(
        @PathVariable(value = "id", required = false) final Long id,
        @NotNull @RequestBody PtPdPackageDetail ptPdPackageDetail
    ) throws URISyntaxException {
        log.debug("REST request to partial update PtPdPackageDt partially : {}, {}", id, ptPdPackageDetail);
        if (ptPdPackageDetail.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, ptPdPackageDetail.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        Optional<PtPdPackageDetail> packageDetailOpt = ptPdPackageDetailService.findPackageDetailById(id);
        if (!packageDetailOpt.isPresent()) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }
        PtPdPackageDetail existingPtPdPackageDt = packageDetailOpt.get();
        if (ptPdPackageDetail.getProductId() != null) {
            existingPtPdPackageDt.setProductId(ptPdPackageDetail.getProductId());
        }
        if (ptPdPackageDetail.getContentsId() != null) {
            existingPtPdPackageDt.setContentsId(ptPdPackageDetail.getContentsId());
        }
        if (ptPdPackageDetail.getContributeYn() != null) {
            existingPtPdPackageDt.setContributeYn(ptPdPackageDetail.getContributeYn());
        }
        if (ptPdPackageDetail.getRemark() != null) {
            existingPtPdPackageDt.setRemark(ptPdPackageDetail.getRemark());
        }
        if (ptPdPackageDetail.getDrmSendYn() != null) {
            existingPtPdPackageDt.setDrmSendYn(ptPdPackageDetail.getDrmSendYn());
        }
        if (ptPdPackageDetail.getInsertDate() != null) {
            existingPtPdPackageDt.setInsertDate(ptPdPackageDetail.getInsertDate());
        }

        PtPdPackageDetail updated = ptPdPackageDetailService.savePackageDetail(existingPtPdPackageDt);
        return ResponseEntity
                .ok()
                .headers(HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, updated.getId().toString()))
                .body(updated);
    }

    /**
     * {@code GET  /pt-pd-pt_pd_package_details} : get all the ptPdPackageDts.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of ptPdPackageDts in body.
     */
    @GetMapping("/pt-pd-pt_pd_package_details")
    public List<PtPdPackageDetail> getAllPtPdPackageDts() {
        log.debug("REST request to get all PtPdPackageDts");
        return ptPdPackageDetailService.findAllPackageDetail();
    }

    /**
     * {@code GET  /pt-pd-pt_pd_package_details/:id} : get the "id" ptPdPackageDt.
     *
     * @param id the id of the ptPdPackageDt to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the ptPdPackageDt, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/pt-pd-pt_pd_package_details/{id}")
    public ResponseEntity<PtPdPackageDetail> getPtPdPackageDt(@PathVariable Long id) {
        log.debug("REST request to get PtPdPackageDt : {}", id);
        Optional<PtPdPackageDetail> ptPdPackageDtOpt = ptPdPackageDetailService.findPackageDetailById(id);
        if (!ptPdPackageDtOpt.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok().body(ptPdPackageDtOpt.get());
    }

    /**
     * {@code DELETE  /pt-pd-pt_pd_package_details/:id} : delete the "id" ptPdPackageDt.
     *
     * @param id the id of the ptPdPackageDt to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/pt-pd-pt_pd_package_details/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public ResponseEntity<Void> deletePtPdPackageDt(@PathVariable Long id) {
        log.debug("REST request to delete PtPdPackageDt : {}", id);
        ptPdPackageDetailService.deletePackageDetailById(id);
        return ResponseEntity
                .noContent()
                .headers(HeaderUtil.createEntityDeletionAlert(applicationName, true, ENTITY_NAME, id.toString()))
                .build();
    }
}
