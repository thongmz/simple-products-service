package com.fleta.productsservice.adapter.rest;

import com.fleta.productsservice.domain.model.PtPdPackageUnited;
import com.fleta.productsservice.port.inbound.PtPdPackageServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * REST controller for managing {@link com.fleta.productsservice.domain.model.PtPdPackageUnited}.
 */
@RestController
@RequestMapping("/api")
@Transactional
public class PtPdPackageUnitedController {

    private final Logger log = LoggerFactory.getLogger(PtPdPackageUnitedController.class);

    private static final String ENTITY_NAME = "productsServicePtPdPackageUnited";

    @Value("${mega.clientApp.name}")
    private String applicationName;

    private final PtPdPackageServices ptPdPackageServices;

    public PtPdPackageUnitedController(PtPdPackageServices packageServices) {
        this.ptPdPackageServices = packageServices;
    }

    /**
     * {@code GET  /pt-pd-package-uniteds} : get all the ptPdPackageUniteds.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of ptPdPackageUniteds in body.
     */
    @GetMapping("/pt-pd-package-uniteds")
    public List<PtPdPackageUnited> getAllPtPdPackageUniteds() {
        log.debug("REST request to get all PtPdPackageUniteds");
        return ptPdPackageServices.findAllPackageUnited();
    }

    /**
     * {@code GET  /pt-pd-package-uniteds} : get all the ptPdPackageUniteds as a stream.
     * @return the {@link List} of ptPdPackageUniteds.
     */
    @GetMapping(value = "/pt-pd-package-uniteds", produces = MediaType.APPLICATION_NDJSON_VALUE)
    public List<PtPdPackageUnited> getAllPtPdPackageUnitedsAsStream() {
        log.debug("REST request to get all PtPdPackageUniteds as a stream");
        return ptPdPackageServices.findAllPackageUnited();
    }

    /**
     * {@code GET  /pt-pd-package-uniteds/:id} : get the "id" ptPdPackageUnited.
     *
     * @param imcsProductId the id of the ptPdPackageUnited to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the ptPdPackageUnited, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/pt-pd-package-uniteds/{imcsProductId}")
    public ResponseEntity<PtPdPackageUnited> getPtPdPackageUnited(@PathVariable String imcsProductId) {
        log.debug("REST request to get PtPdPackageUnited : {}", imcsProductId);
        Optional<PtPdPackageUnited> ptPdPackageUnited = ptPdPackageServices.findPackageUnitedById(imcsProductId);
        return ResponseEntity.ok().body(ptPdPackageUnited.get());
    }
}
