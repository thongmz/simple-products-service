package com.fleta.productsservice.adapter.rest;

import com.fleta.productsservice.adapter.rest.errors.BadRequestAlertException;
import com.fleta.productsservice.domain.model.PtPdPackageSub;
import com.fleta.productsservice.port.inbound.PtPdPackageServices;
import com.megazone.framework.web.util.HeaderUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * REST controller for managing {@link com.fleta.productsservice.domain.model.PtPdPackageSub}.
 */
@RestController
@RequestMapping("/api")
@Transactional
public class PtPdPackageSubController {

    private final Logger log = LoggerFactory.getLogger(PtPdPackageSubController.class);

    private static final String ENTITY_NAME = "productsServicePtPdPackageSub";

    @Value("${mega.clientApp.name}")
    private String applicationName;

    private final PtPdPackageServices packageServices;

    public PtPdPackageSubController(PtPdPackageServices ptpdPackageServices) {
        this.packageServices = ptpdPackageServices;
    }

    /**
     * {@code POST  /pt-pd-package-subs} : Create a new ptPdPackageSub.
     *
     * @param ptPdPackageSub the ptPdPackageSub to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new ptPdPackageSub, or with status {@code 400 (Bad Request)} if the ptPdPackageSub has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/pt-pd-package-subs")
    public ResponseEntity<PtPdPackageSub> createPtPdPackageSub(@Valid @RequestBody PtPdPackageSub ptPdPackageSub)
        throws URISyntaxException {
        log.debug("REST request to save PtPdPackageSub : {}", ptPdPackageSub);
        if (ptPdPackageSub.getId() != null) {
            throw new BadRequestAlertException("A new ptPdPackageSub cannot already have an ID", ENTITY_NAME, "idexists");
        }

        PtPdPackageSub packageSub = packageServices.savePackageSub(ptPdPackageSub);
        return ResponseEntity
                .created(new URI("/api/pt-pd-package-subs/" + packageSub.getId()))
                .headers(HeaderUtil.createEntityCreationAlert(applicationName, true, ENTITY_NAME, packageSub.getId().toString()))
                .body(packageSub);
    }

    /**
     * {@code PUT  /pt-pd-package-subs/:id} : Updates an existing ptPdPackageSub.
     *
     * @param id the id of the ptPdPackageSub to save.
     * @param ptPdPackageSub the ptPdPackageSub to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated ptPdPackageSub,
     * or with status {@code 400 (Bad Request)} if the ptPdPackageSub is not valid,
     * or with status {@code 500 (Internal Server Error)} if the ptPdPackageSub couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/pt-pd-package-subs/{id}")
    public ResponseEntity<PtPdPackageSub> updatePtPdPackageSub(
        @PathVariable(value = "id", required = false) final Long id,
        @Valid @RequestBody PtPdPackageSub ptPdPackageSub
    ) throws URISyntaxException {
        log.debug("REST request to update PtPdPackageSub : {}, {}", id, ptPdPackageSub);
        if (ptPdPackageSub.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, ptPdPackageSub.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        boolean isExist = packageServices.existsPackageSubById(id);
        if (isExist == Boolean.FALSE) {
            new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }
        PtPdPackageSub updated = packageServices.savePackageSub(ptPdPackageSub);

        return ResponseEntity
                .ok()
                .headers(
                        HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, updated.getId())
                )
                .body(updated);
    }

    /**
     * {@code PATCH  /pt-pd-package-subs/:id} : Partial updates given fields of an existing ptPdPackageSub, field will ignore if it is null
     *
     * @param id the id of the ptPdPackageSub to save.
     * @param ptPdPackageSub the ptPdPackageSub to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated ptPdPackageSub,
     * or with status {@code 400 (Bad Request)} if the ptPdPackageSub is not valid,
     * or with status {@code 404 (Not Found)} if the ptPdPackageSub is not found,
     * or with status {@code 500 (Internal Server Error)} if the ptPdPackageSub couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PatchMapping(value = "/pt-pd-package-subs/{id}", consumes = "application/merge-patch+json")
    public ResponseEntity<PtPdPackageSub> partialUpdatePtPdPackageSub(
        @PathVariable(value = "id", required = false) final Long id,
        @NotNull @RequestBody PtPdPackageSub ptPdPackageSub
    ) throws URISyntaxException {
        log.debug("REST request to partial update PtPdPackageSub partially : {}, {}", id, ptPdPackageSub);
        if (ptPdPackageSub.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, ptPdPackageSub.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        Optional<PtPdPackageSub> packageSubOptional = packageServices.findPackageSubById(id);
        if (!packageSubOptional.isPresent()) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }

        PtPdPackageSub existingPtPdPackageSub = packageSubOptional.get();

        if (ptPdPackageSub.getProductId() != null) {
            existingPtPdPackageSub.setProductId(ptPdPackageSub.getProductId());
        }
        if (ptPdPackageSub.getConcurrentCount() != null) {
            existingPtPdPackageSub.setConcurrentCount(ptPdPackageSub.getConcurrentCount());
        }
        if (ptPdPackageSub.getPpvBlockYn() != null) {
            existingPtPdPackageSub.setPpvBlockYn(ptPdPackageSub.getPpvBlockYn());
        }
        if (ptPdPackageSub.getNscreenYn() != null) {
            existingPtPdPackageSub.setNscreenYn(ptPdPackageSub.getNscreenYn());
        }
        if (ptPdPackageSub.getProductTitle() != null) {
            existingPtPdPackageSub.setProductTitle(ptPdPackageSub.getProductTitle());
        }
        if (ptPdPackageSub.getProductGb() != null) {
            existingPtPdPackageSub.setProductGb(ptPdPackageSub.getProductGb());
        }
        if (ptPdPackageSub.getSummaryPromotion() != null) {
            existingPtPdPackageSub.setSummaryPromotion(ptPdPackageSub.getSummaryPromotion());
        }
        if (ptPdPackageSub.getPromotionStartDate() != null) {
            existingPtPdPackageSub.setPromotionStartDate(ptPdPackageSub.getPromotionStartDate());
        }
        if (ptPdPackageSub.getPromotionEndDate() != null) {
            existingPtPdPackageSub.setPromotionEndDate(ptPdPackageSub.getPromotionEndDate());
        }
        if (ptPdPackageSub.getPromotionImageName() != null) {
            existingPtPdPackageSub.setPromotionImageName(ptPdPackageSub.getPromotionImageName());
        }
        if (ptPdPackageSub.getAppCtrl() != null) {
            existingPtPdPackageSub.setAppCtrl(ptPdPackageSub.getAppCtrl());
        }

        packageServices.savePackageSub(existingPtPdPackageSub);
        return  ResponseEntity
                .ok()
                .headers(HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, existingPtPdPackageSub.getId().toString()))
                .body(existingPtPdPackageSub);
    }

    /**
     * {@code GET  /pt-pd-package-subs} : get all the ptPdPackageSubs.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of ptPdPackageSubs in body.
     */
    @GetMapping("/pt-pd-package-subs")
    public List<PtPdPackageSub> getAllPtPdPackageSubs() {
        log.debug("REST request to get all PtPdPackageSubs");

        return packageServices.findAllPackageSub();
    }

    /**
     * {@code GET  /pt-pd-package-subs} : get all the ptPdPackageSubs as a stream.
     * @return the {@link Flux} of ptPdPackageSubs.
     */
//    @GetMapping(value = "/pt-pd-package-subs", produces = MediaType.APPLICATION_NDJSON_VALUE)
//    public Flux<PtPdPackageSub> getAllPtPdPackageSubsAsStream() {
//        log.debug("REST request to get all PtPdPackageSubs as a stream");
//        return ptPdPackageSubRepository.findAll();
//    }

    /**
     * {@code GET  /pt-pd-package-subs/:id} : get the "id" ptPdPackageSub.
     *
     * @param id the id of the ptPdPackageSub to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the ptPdPackageSub, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/pt-pd-package-subs/{id}")
    public ResponseEntity<PtPdPackageSub> getPtPdPackageSub(@PathVariable Long id) {
        log.debug("REST request to get PtPdPackageSub : {}", id);
        Optional<PtPdPackageSub> ptPdPackageSubOptional = packageServices.findPackageSubById(id);
        if (!ptPdPackageSubOptional.isPresent()) {
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        PtPdPackageSub packageSub = ptPdPackageSubOptional.get();
        return  ResponseEntity
                .ok()
                .headers(HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, packageSub.getId().toString()))
                .body(packageSub);
    }

    /**
     * {@code DELETE  /pt-pd-package-subs/:id} : delete the "id" ptPdPackageSub.
     *
     * @param id the id of the ptPdPackageSub to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/pt-pd-package-subs/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public ResponseEntity<Void> deletePtPdPackageSub(@PathVariable Long id) {
        log.debug("REST request to delete PtPdPackageSub : {}", id);
        packageServices.deletePackageSubById(id);
        return ResponseEntity
                .noContent()
                .headers(HeaderUtil.createEntityDeletionAlert(applicationName, true, ENTITY_NAME, id.toString()))
                .build();
    }
}
