package com.fleta.productsservice.domain.dto;

import com.fleta.productsservice.grpc.AlbumInfo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductsDetailDto {

    private String albumId				;
    private String albumName            ;
    private String seriesDesc           ;
    private String onairDate            ;
    private String releaseDate          ;
    private String watch2NdtvYn         ;
    private String highQualityType      ;
    private String runTime              ;
    private String eventInfo            ;
    private String serviceIcon          ;
    private String terrYn               ;
    private String terrEdDate           ;
    private String smiYn                ;
    private String smiLanguage          ;
    private String ratingCd             ;
    private String kidsGrade            ;
    private String countryOfOriginCd    ;
    private String directorDisplay      ;
    private String producer             ;
    private String starringActor        ;
    private String actorsDisplay        ;
    private String voiceActor           ;
    private String studio               ;
    private String genreLarge           ;
    private String genreMid             ;
    private String genreSmall           ;
    private String introduction         ;
    private String subTitle             ;
    private String summaryMedium        ;
    private String summaryLong          ;
    private String avgRating            ;
    private String totRatingCount       ;
    private String commentCnt           ;
    private String cineId               ;
    private String cineAvgPoint         ;
    private String cineCount            ;
    private String seriesNo             ;
    private String viewingFlag          ;
    private String rankNo               ;
    private String dubbingYn            ;
    private String captionYn            ;
    private String qualityType          ;
    private String dubbing              ;
    private String summaryPromotion     ;
    private String saleType             ;
    private String albumGroupNm         ;
    private String superYn              ;
    private String promotionCopy        ;
    private String audioType            ;
    private String posterType           ;
    private String serviceYn            ;
    private String contentValue         ;
    private String reservedFlag         ;
    private String reservedDate         ;


    public AlbumInfo toAlbumInfo() {
        return AlbumInfo.newBuilder()
                .setAlbumId				(this.getAlbumId()          )
                .setAlbumName           (this.getAlbumName()        )
                .setSeriesDesc          (this.getSeriesDesc()       )
                .setOnairDate           (this.getOnairDate()        )
                .setReleaseDate         (this.getReleaseDate()      )
                .setWatch2NdtvYn        (this.getWatch2NdtvYn()     )
                .setHighQualityType     (this.getHighQualityType()  )
                .setRunTime             (this.getRunTime()          )
                .setEventInfo           (this.getEventInfo()        )
                .setServiceIcon         (this.getServiceIcon()      )
                .setTerrYn              (this.getTerrYn()           )
                .setTerrEdDate          (this.getTerrEdDate()       )
                .setSmiYn               (this.getSmiYn()            )
                .setSmiLanguage         (this.getSmiLanguage()      )
                .setRatingCd            (this.getRatingCd()         )
                .setKidsGrade           (this.getKidsGrade()        )
                .setCountryOfOriginCd   (this.getCountryOfOriginCd())
                .setDirectorDisplay     (this.getDirectorDisplay()  )
                .setProducer            (this.getProducer()         )
                .setStarringActor       (this.getStarringActor()    )
                .setActorsDisplay       (this.getActorsDisplay()    )
                .setVoiceActor          (this.getVoiceActor()       )
                .setStudio              (this.getStudio()           )
                .setGenreLarge          (this.getGenreLarge()       )
                .setGenreMid            (this.getGenreMid()         )
                .setGenreSmall          (this.getGenreSmall()       )
                .setIntroduction        (this.getIntroduction()     )
                .setSubTitle            (this.getSubTitle()         )
                .setSummaryMedium       (this.getSummaryMedium()    )
                .setSummaryLong         (this.getSummaryLong()      )
                .setAvgRating           (this.getAvgRating()        )
                .setTotRatingCount      (this.getTotRatingCount()   )
                .setCommentCnt          (this.getCommentCnt()       )
                .setCineId              (this.getCineId()           )
                .setCineAvgPoint        (this.getCineAvgPoint()     )
                .setCineCount           (this.getCineCount()        )
                .setSeriesNo            (this.getSeriesNo()         )
                .setViewingFlag         (this.getViewingFlag()      )
                .setRankNo              (this.getRankNo()           )
                .setDubbingYn           (this.getDubbingYn()        )
                .setCaptionYn           (this.getCaptionYn()        )
                .setQualityType         (this.getQualityType()      )
                .setDubbing             (this.getDubbing()          )
                .setSummaryPromotion    (this.getSummaryPromotion() )
                .setSaleType            (this.getSaleType()         )
                .setAlbumGroupNm        (this.getAlbumGroupNm()     )
                .setSuperYn             (this.getSuperYn()          )
                .setPromotionCopy       (this.getPromotionCopy()    )
                .setAudioType           (this.getAudioType()        )
                .setPosterType          (this.getPosterType()       )
                .setServiceYn           (this.getServiceYn()        )
                .setContentValue        (this.getContentValue()     )
                .setReservedFlag        (this.getReservedFlag()     )
                .setReservedDate        (this.getReservedDate()     )
                .build();
    }

    public static ProductsDetailDto buildFromAlbumInfo(AlbumInfo albumInfo) {
        return new ProductsDetailDto(
                albumInfo.getAlbumId()          ,
                albumInfo.getAlbumName()        ,
                albumInfo.getSeriesDesc()       ,
                albumInfo.getOnairDate()        ,
                albumInfo.getReleaseDate()      ,
                albumInfo.getWatch2NdtvYn()     ,
                albumInfo.getHighQualityType()  ,
                albumInfo.getRunTime()          ,
                albumInfo.getEventInfo()        ,
                albumInfo.getServiceIcon()      ,
                albumInfo.getTerrYn()           ,
                albumInfo.getTerrEdDate()       ,
                albumInfo.getSmiYn()            ,
                albumInfo.getSmiLanguage()      ,
                albumInfo.getRatingCd()         ,
                albumInfo.getKidsGrade()        ,
                albumInfo.getCountryOfOriginCd(),
                albumInfo.getDirectorDisplay()  ,
                albumInfo.getProducer()         ,
                albumInfo.getStarringActor()    ,
                albumInfo.getActorsDisplay()    ,
                albumInfo.getVoiceActor()       ,
                albumInfo.getStudio()           ,
                albumInfo.getGenreLarge()       ,
                albumInfo.getGenreMid()         ,
                albumInfo.getGenreSmall()       ,
                albumInfo.getIntroduction()     ,
                albumInfo.getSubTitle()         ,
                albumInfo.getSummaryMedium()    ,
                albumInfo.getSummaryLong()      ,
                albumInfo.getAvgRating()        ,
                albumInfo.getTotRatingCount()   ,
                albumInfo.getCommentCnt()       ,
                albumInfo.getCineId()           ,
                albumInfo.getCineAvgPoint()     ,
                albumInfo.getCineCount()        ,
                albumInfo.getSeriesNo()         ,
                albumInfo.getViewingFlag()      ,
                albumInfo.getRankNo()           ,
                albumInfo.getDubbingYn()        ,
                albumInfo.getCaptionYn()        ,
                albumInfo.getQualityType()      ,
                albumInfo.getDubbing()          ,
                albumInfo.getSummaryPromotion() ,
                albumInfo.getSaleType()         ,
                albumInfo.getAlbumGroupNm()     ,
                albumInfo.getSuperYn()          ,
                albumInfo.getPromotionCopy()    ,
                albumInfo.getAudioType()        ,
                albumInfo.getPosterType()       ,
                albumInfo.getServiceYn()        ,
                albumInfo.getContentValue()     ,
                albumInfo.getReservedFlag()     ,
                albumInfo.getReservedDate()
        );
    }
}
