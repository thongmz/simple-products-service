package com.fleta.productsservice.adapter.grpc.client;

import com.fleta.productsservice.grpc.ProductsServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Slf4j
@Configuration
public class ProductsStub {

    @Value("${grpc.products.host}")
    public String host;

    @Value("${grpc.products.port}")
    public int port;

    @Bean
    public ManagedChannel channel() {
        return ManagedChannelBuilder
            .forAddress(host, port)
            .usePlaintext()
            .build();
    }

    @Bean
    public ProductsServiceGrpc.ProductsServiceStub serviceStub() {
        return ProductsServiceGrpc.newStub(channel());
    }

}
