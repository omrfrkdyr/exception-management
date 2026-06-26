package com.omerduyar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling //zamanlayıcıyı aç = Schedule
public class ExceptionManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExceptionManagementApplication.class, args);
    }

}
