package it.sogei.svildep.istanzaservice.repository;

import it.sogei.svildep.istanzaservice.model.istanza.IstanzaDepositoVolontario;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class IstanzaDepositoVolontarioRepository extends IstanzaRepository<IstanzaDepositoVolontario> {

    @Override
    public Map<Long, IstanzaDepositoVolontario> getDatabase() {
        return new HashMap<>();
    }
}
