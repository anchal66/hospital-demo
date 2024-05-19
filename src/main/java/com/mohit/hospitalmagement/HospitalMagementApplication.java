package com.mohit.hospitalmagement;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HospitalMagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(HospitalMagementApplication.class, args);
    }

    @Bean
    public OpenAPI setOpenAPI(){
        return new OpenAPI()
                .info(new Info()
                        .title("Hospital Manage APIs")
                        .version("1.0.0")
                        .description("Api for managing mohit's hospital project"));
    }
}
