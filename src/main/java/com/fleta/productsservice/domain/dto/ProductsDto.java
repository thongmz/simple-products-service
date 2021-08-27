package com.fleta.productsservice.domain.dto;

import com.fleta.productsservice.grpc.AlbumGroupInfo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
public class ProductsDto {

    private String	superYn             ;
    private String	albumGroupNm        ;
    private String	qualityType         ;
    private String	seriesNo            ;
    private String	contentsId          ;
    private String	rankNo              ;
    private String	saleType            ;
    private String	viewingFlag         ;
    private String	summaryPromotion    ;
    private String	dubbingYn           ;
    private String	captionYn           ;

    public AlbumGroupInfo toAlbumGroupInfo() {
        return AlbumGroupInfo.newBuilder()
                .setSuperYn            (this.getSuperYn            ())
                .setAlbumGroupNm       (this.getAlbumGroupNm       ())
                .setQualityType        (this.getQualityType        ())
                .setSeriesNo           (this.getSeriesNo           ())
                .setContentsId         (this.getContentsId         ())
                .setRankNo             (this.getRankNo             ())
                .setSaleType           (this.getSaleType           ())
                .setViewingFlag        (this.getViewingFlag        ())
                .setSummaryPromotion   (this.getSummaryPromotion   ())
                .setDubbingYn          (this.getDubbingYn          ())
                .setCaptionYn          (this.getCaptionYn          ())
                .build();
    }
}
