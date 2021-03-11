package it.sogei.svildep.istanzaservice.repository;

import it.sogei.svildep.istanzaservice.model.istanza.DepositoAmministrativo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class DepositoAmministrativoRepository extends IstanzaRepository<DepositoAmministrativo> {

    @Override
    public Map<Long, DepositoAmministrativo> getDatabase() {
        return new HashMap<>();
    }
}
