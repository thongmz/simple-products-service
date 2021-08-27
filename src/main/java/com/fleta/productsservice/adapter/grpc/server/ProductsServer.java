package com.fleta.productsservice.adapter.grpc.server;

import com.fleta.productsservice.domain.service.ProductsServiceGrpc;
import com.fleta.productsservice.port.outbound.ProductsRepository;
import io.grpc.ServerBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ProductsServer implements ApplicationRunner {

    @Value("${grpc.products.port}")
    public int port;

    @Value("${grpc.products.host}")
    public String host;

    @Autowired
    private ProductsRepository productsRepository;

//    private final ProductsRepository productsRepository;
//
//    public ProductsServer(ProductsRepository productsRepository) {
//        this.productsRepository = productsRepository;
//    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("host {} {}", host, port);
        ServerBuilder.forPort(port)
            .addService(new ProductsServiceGrpc(productsRepository))
            .build().start();
    }

}
