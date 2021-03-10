package it.sogei.svildep.istanzaservice.repository;

import it.sogei.svildep.istanzaservice.model.istanza.IstanzaDepositoCauzionale;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class IstanzaDepositoCauzionaleRepository extends IstanzaRepository<IstanzaDepositoCauzionale> {

    @Override
    public Map<Long, IstanzaDepositoCauzionale> getDatabase() {
        return new HashMap<>();
    }
}
