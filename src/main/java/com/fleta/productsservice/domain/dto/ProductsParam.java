package com.fleta.productsservice.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductsParam {

    private String	album_group_id;
    private String	album_group_nm;
    private String	quality_type;
    private String	series_no;
    private String	rank_no;
    private String	contents_id;
    private String	dubbing_yn;
    private String	caption_yn;
    private String	order_no;

}
