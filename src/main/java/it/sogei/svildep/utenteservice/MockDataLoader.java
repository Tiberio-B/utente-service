package it.sogei.svildep.utenteservice;

import it.sogei.svildep.utenteservice.dto.DepositoDto;
import it.sogei.svildep.utenteservice.dto.RtsDto;
import it.sogei.svildep.utenteservice.dto.TesoreriaDto;
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

    public static Map<String, DepositoDto> databaseDeposito = new HashMap<>();
    public static Map<String, TesoreriaDto> databaseTesoreria = new HashMap<>();
    public static Map<String, RtsDto> databaseRts = new HashMap<>();

    public void run(ApplicationArguments args) {
        initDepositi(NUM_ISTANZE);
        initTesorerie(NUM_ISTANZE);
        initRts(NUM_ISTANZE);
    }

    private void initDepositi(int numDepositi) {
        for (int i=0; i < numDepositi; i++) {
            databaseDeposito.put(String.valueOf(i), random.depositoCasuale());
        }
    }

    private void initTesorerie(int numTesorerie) {
        for (int i=0; i < numTesorerie; i++) {
            databaseTesoreria.put(String.valueOf(i), random.tesoreriaCasuale());
        }
    }

    private void initRts(int numRts) {
        for (int i=0; i < numRts; i++) {
            databaseRts.put(String.valueOf(i), random.rtsCasuale());
        }
    }

}
