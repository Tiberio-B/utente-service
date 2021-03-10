package it.sogei.svildep.istanzaservice.repository;

import it.sogei.svildep.istanzaservice.model.istanza.IstanzaDepositoGiudiziario;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class IstanzaDepositoGiudiziarioRepository extends IstanzaRepository<IstanzaDepositoGiudiziario> {

    @Override
    public Map<Long, IstanzaDepositoGiudiziario> getDatabase() {
        return new HashMap<>();
    }
}
