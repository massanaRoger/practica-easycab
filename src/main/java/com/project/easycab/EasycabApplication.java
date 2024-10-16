package com.project.easycab;

import com.project.easycab.service.MapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EasycabApplication implements CommandLineRunner {
    @Autowired
    private MapService taxiMapService;

    public static void main(String[] args) {
        SpringApplication.run(EasycabApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        taxiMapService.renderMap();
    }
}
