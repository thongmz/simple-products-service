package com.fleta.productsservice.domain.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fleta.productsservice.domain.dto.*;
import com.fleta.productsservice.grpc.*;
import com.fleta.productsservice.port.outbound.ProductsRepository;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class ProductsServiceGrpc extends com.fleta.productsservice.grpc.ProductsServiceGrpc.ProductsServiceImplBase {

    private final ProductsRepository productsRepository;

    public ProductsServiceGrpc(ProductsRepository repository) {
        this.productsRepository = repository;
    }

    @Override
    public StreamObserver<AlbumGroupReq> nxvod211TobeSql00502(StreamObserver<AlbumGroupInfo> response) {
        StreamObserver<AlbumGroupReq> so = new StreamObserver<AlbumGroupReq>() {
            List<ProductsParam> lstParams = new ArrayList<>();

            @Override
            public void onNext(AlbumGroupReq req) {
                System.out.println("onNext from server");
                ProductsParam productsParam = new ProductsParam();
                productsParam.setAlbum_group_id(req.getAlbumGroupId());
                productsParam.setOrder_no(req.getAlbumGroupId());
                productsParam.setAlbum_group_nm(req.getAlbumGroupNm());
                productsParam.setQuality_type(req.getQualityType());
                productsParam.setSeries_no(req.getSeriesNo());
                productsParam.setRank_no(req.getRankNo());
                productsParam.setContents_id(req.getContentsId());
                productsParam.setDubbing_yn(req.getDubbingYn());
                productsParam.setCaption_yn(req.getCaptionYn());
                productsParam.setOrder_no(req.getOrderNo());
                lstParams.add(productsParam);
                ObjectMapper objectMapper = new ObjectMapper();
                String strJson = "";
                try {
                    strJson = objectMapper.writeValueAsString(lstParams);

                log.info("getTestApi-------------()" + strJson);
                } catch (JsonProcessingException e) {
                    e.printStackTrace();
                }
                List<ProductsDto> pvsCustomersDtoList =  productsRepository.nxvod211TobeSql00502(strJson);
                response.onNext(pvsCustomersDtoList.stream().map(ProductsDto::toAlbumGroupInfo).findFirst().get());
            }

            @Override
            public void onError(Throwable t) {
                System.out.println("on error");
                t.printStackTrace();
            }

            @Override
            public void onCompleted() {
                System.out.println("on completed");
            }
        };
        return so;
    }

    @Override
    public StreamObserver<AlbumReq> nxvod211TobeSql00602(StreamObserver<AlbumInfo> response) {
        StreamObserver<AlbumReq> so = new StreamObserver<AlbumReq>() {
            List<ProductsDetailParam> lstParams = new ArrayList<>();

            @Override
            public void onNext(AlbumReq albumReq) {
                System.out.println("onNext from server");
                ProductsDetailParam prodDtlParam = new ProductsDetailParam();
                prodDtlParam.setAlbum_id				(albumReq.getAlbumId			 ());
                prodDtlParam.setAlbum_name              (albumReq.getAlbumName           ());
                prodDtlParam.setSeries_desc             (albumReq.getSeriesDesc          ());
                prodDtlParam.setOnair_date              (albumReq.getOnairDate           ());
                prodDtlParam.setRelease_date            (albumReq.getReleaseDate         ());
                prodDtlParam.setWatch_2ndtv_yn          (albumReq.getWatch2NdtvYn        ());
                prodDtlParam.setHigh_quality_type       (albumReq.getHighQualityType     ());
                prodDtlParam.setRun_time                (albumReq.getRunTime             ());
                prodDtlParam.setEvent_info              (albumReq.getEventInfo           ());
                prodDtlParam.setService_icon            (albumReq.getServiceIcon         ());
                prodDtlParam.setTerr_yn                 (albumReq.getTerrYn              ());
                prodDtlParam.setTerr_ed_date            (albumReq.getTerrEdDate          ());
                prodDtlParam.setSmi_yn                  (albumReq.getSmiYn               ());
                prodDtlParam.setSmi_language            (albumReq.getSmiLanguage         ());
                prodDtlParam.setRating_cd               (albumReq.getRatingCd            ());
                prodDtlParam.setKids_grade              (albumReq.getKidsGrade           ());
                prodDtlParam.setCountry_of_origin_cd    (albumReq.getCountryOfOriginCd   ());
                prodDtlParam.setDirector_display        (albumReq.getDirectorDisplay     ());
                prodDtlParam.setProducer                (albumReq.getProducer            ());
                prodDtlParam.setStarring_actor          (albumReq.getStarringActor       ());
                prodDtlParam.setActors_display          (albumReq.getActorsDisplay       ());
                prodDtlParam.setVoice_actor             (albumReq.getVoiceActor          ());
                prodDtlParam.setStudio                  (albumReq.getStudio              ());
                prodDtlParam.setGenre_large             (albumReq.getGenreLarge          ());
                prodDtlParam.setGenre_mid               (albumReq.getGenreMid            ());
                prodDtlParam.setGenre_small             (albumReq.getGenreSmall          ());
                prodDtlParam.setIntroduction            (albumReq.getIntroduction        ());
                prodDtlParam.setSub_title               (albumReq.getSubTitle            ());
                prodDtlParam.setSummary_medium          (albumReq.getSummaryMedium       ());
                prodDtlParam.setSummary_long            (albumReq.getSummaryLong         ());
                prodDtlParam.setAvg_rating              (albumReq.getAvgRating           ());
                prodDtlParam.setTot_rating_count        (albumReq.getTotRatingCount      ());
                prodDtlParam.setComment_cnt             (albumReq.getCommentCnt          ());
                prodDtlParam.setCine_id                 (albumReq.getCineId              ());
                prodDtlParam.setCine_avg_point          (albumReq.getCineAvgPoint        ());
                prodDtlParam.setCine_count              (albumReq.getCineCount           ());
                prodDtlParam.setSeries_no               (albumReq.getSeriesNo            ());
                prodDtlParam.setViewing_flag            (albumReq.getViewingFlag         ());
                prodDtlParam.setRank_no                 (albumReq.getRankNo              ());
                prodDtlParam.setDubbing_yn              (albumReq.getDubbingYn           ());
                prodDtlParam.setCaption_yn              (albumReq.getCaptionYn           ());
                prodDtlParam.setQuality_type            (albumReq.getQualityType         ());
                prodDtlParam.setDubbing                 (albumReq.getDubbing             ());
                prodDtlParam.setSummary_promotion       (albumReq.getSummaryPromotion    ());
                prodDtlParam.setSale_type               (albumReq.getSaleType            ());
                prodDtlParam.setAlbum_group_nm          (albumReq.getAlbumGroupNm        ());
                prodDtlParam.setSuper_yn                (albumReq.getSuperYn             ());
                prodDtlParam.setPromotion_copy          (albumReq.getPromotionCopy       ());
                prodDtlParam.setAudio_type              (albumReq.getAudioType           ());
                prodDtlParam.setPoster_type             (albumReq.getPosterType          ());
                prodDtlParam.setService_yn              (albumReq.getServiceYn           ());
                prodDtlParam.setContent_value           (albumReq.getContentValue        ());
                prodDtlParam.setReserved_flag           (albumReq.getReservedFlag        ());
                prodDtlParam.setReserved_date           (albumReq.getReservedDate        ());
                prodDtlParam.setAsset_id                (albumReq.getAssetId             ());
                lstParams.add(prodDtlParam);
                ObjectMapper objectMapper = new ObjectMapper();
                String strJson = "";
                try {
                    strJson = objectMapper.writeValueAsString(lstParams);

                    log.info("getTestApi-------------()" + strJson);
                } catch (JsonProcessingException e) {
                    e.printStackTrace();
                }
                List<ProductsDetailDto> pvsCustomersDtoList =  productsRepository.nxvod211TobeSql00602(strJson);
                response.onNext(pvsCustomersDtoList.stream().map(ProductsDetailDto::toAlbumInfo).findFirst().get());
            }

            @Override
            public void onError(Throwable t) {
                System.out.println("on error");
                t.printStackTrace();
            }

            @Override
            public void onCompleted() {
                System.out.println("on completed");
            }
        };
        return so;
    }

    @Override
    public StreamObserver<ContentsExpiredReq> nxvod211TobeSql01903(StreamObserver<ContentsExpired> response) {
        StreamObserver<ContentsExpiredReq> so = new StreamObserver<ContentsExpiredReq>() {
            List<ContentsParam> lstParams = new ArrayList<>();

            @Override
            public void onNext(ContentsExpiredReq contentsExpiredReq) {
                System.out.println("onNext from server");
                ContentsParam contentsParam = new ContentsParam();
                contentsParam.setProduct_id(contentsExpiredReq.getProductId());
                contentsParam.setExpired_date(contentsExpiredReq.getExpiredDate());
                lstParams.add(contentsParam);
                ObjectMapper objectMapper = new ObjectMapper();
                String strJson = "";
                try {
                    strJson = objectMapper.writeValueAsString(lstParams);
                } catch (JsonProcessingException e) {
                    e.printStackTrace();
                }
                List<ContentsDto> pvsCustomersDtoList =  productsRepository.nxvod211TobeSql01903(strJson);
                response.onNext(pvsCustomersDtoList.stream().map(ContentsDto::toContentsExpired).findFirst().get());
            }

            @Override
            public void onError(Throwable t) {
                System.out.println("on error");
                t.printStackTrace();
            }

            @Override
            public void onCompleted() {
                System.out.println("on completed");
            }
        };
        return so;
    }
}
