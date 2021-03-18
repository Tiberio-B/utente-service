package it.sogei.svildep.utenteservice;

import it.sogei.svildep.utenteservice.dto.UtenteDto;
import it.sogei.svildep.utenteservice.util.GeneratoreCasuale;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MockDataLoader implements ApplicationRunner {

    public static final int NUM_ISTANZE = 10;

    private GeneratoreCasuale random = new GeneratoreCasuale();

    public static Map<String, UtenteDto> databaseUtente = new HashMap<>();

    public void run(ApplicationArguments args) {
        initUtenti(NUM_ISTANZE);
    }

    private void initUtenti(int numDepositi) {
        for (int i=0; i < numDepositi; i++) {
            UtenteDto utente = random.utenteCasuale(i);
            databaseUtente.put(utente.getId(), utente);
        }
    }

}
