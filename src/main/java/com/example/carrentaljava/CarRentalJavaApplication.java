package com.example.carrentaljava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class CarRentalJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarRentalJavaApplication.class, args);
    }

}
