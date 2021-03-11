package it.sogei.svildep.istanzaservice;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    
    private static void initIstanze() {

    }

    public void run(ApplicationArguments args) {
    	initIstanze();
    }
}
