package com.fleta.productsservice.port.outbound;

import com.fleta.productsservice.domain.dto.ContentsDto;
import com.fleta.productsservice.domain.dto.ProductsDetailDto;
import com.fleta.productsservice.domain.dto.ProductsDto;

import java.util.List;

public interface ProductsRepository {

    List<ProductsDto> nxvod211TobeSql00502(String jsonData);
    List<ProductsDetailDto> nxvod211TobeSql00602(String jsonData);
    List<ContentsDto> nxvod211TobeSql01903(String jsonData);
}
