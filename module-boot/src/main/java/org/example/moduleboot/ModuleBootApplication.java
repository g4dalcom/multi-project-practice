package org.example.moduleboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
public class ModuleBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModuleBootApplication.class, args);
    }

}
