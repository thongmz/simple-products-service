package com.fleta.productsservice.domain.service;

import com.fleta.productsservice.domain.dto.ProductsDetailDto;
import com.fleta.productsservice.domain.dto.ProductsDto;
import com.fleta.productsservice.port.inbound.ProductsService;
import com.fleta.productsservice.port.outbound.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsServiceImpl implements ProductsService {

    @Autowired
    private ProductsRepository productRepository;

    @Override
    public List<ProductsDto> nxvod211TobeSql00502(String jsonData) {
        return productRepository.nxvod211TobeSql00502(jsonData);
    }

    @Override
    public List<ProductsDetailDto> nxvod211TobeSql00602(String jsonData) {
        return productRepository.nxvod211TobeSql00602(jsonData);
    }

}
