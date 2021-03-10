package it.sogei.svildep.istanzaservice.repository;

import it.sogei.svildep.istanzaservice.model.istanza.depositoAmministrativo.IstanzaDepositoAmministrativoNoEsproprio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class IstanzaDepositoAmministrativoNoEsproprioRepository extends IstanzaRepository<IstanzaDepositoAmministrativoNoEsproprio> {

    private final Map<Long, IstanzaDepositoAmministrativoNoEsproprio> database;

    @Override
    public Map<Long, IstanzaDepositoAmministrativoNoEsproprio> getDatabase() {
        return new HashMap<>();
    }
}
