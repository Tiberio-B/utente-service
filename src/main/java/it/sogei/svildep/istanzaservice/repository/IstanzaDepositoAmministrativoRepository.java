package it.sogei.svildep.istanzaservice.repository;

import it.sogei.svildep.istanzaservice.model.istanza.depositoAmministrativo.IstanzaDepositoAmministrativo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class IstanzaDepositoAmministrativoRepository extends IstanzaRepository<IstanzaDepositoAmministrativo> {

    @Override
    public Map<Long, IstanzaDepositoAmministrativo> getDatabase() {
        return new HashMap<>();
    }
}
