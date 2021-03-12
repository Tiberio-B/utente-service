package it.sogei.svildep.interrogazioneservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan(basePackages = "it.sogei.svildep.interrogazioneservice.repository")
public class InterrogazioneServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InterrogazioneServiceApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
