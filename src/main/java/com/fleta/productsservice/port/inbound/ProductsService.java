package com.fleta.productsservice.port.inbound;

import com.fleta.productsservice.domain.dto.ProductsDetailDto;
import com.fleta.productsservice.domain.dto.ProductsDto;

import java.util.List;

public interface ProductsService {

    List<ProductsDto> nxvod211TobeSql00502(String jsonData);


    List<ProductsDetailDto> nxvod211TobeSql00602(String jsonData);
}
