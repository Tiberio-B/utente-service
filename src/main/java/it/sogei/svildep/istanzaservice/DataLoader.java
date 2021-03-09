package it.sogei.svildep.istanzaservice;

import it.sogei.svildep.istanzaservice.repository.IstanzaRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
	
    private final IstanzaRepository istanzaRepository;

    public DataLoader(IstanzaRepository istanzaRepository) {
    	this.istanzaRepository = istanzaRepository;
    }
    
    private static void initIstanze() {
    }

    public void run(ApplicationArguments args) {
    	initIstanze();
    }
}
