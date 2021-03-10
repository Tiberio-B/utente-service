package it.sogei.svildep.istanzaservice.repository;

import it.sogei.svildep.istanzaservice.model.istanza.IstanzaRestituzioneDeposito;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class IstanzaRestituzioneDepositoRepository extends IstanzaRepository<IstanzaRestituzioneDeposito> {

    @Override
    public Map<Long, IstanzaRestituzioneDeposito> getDatabase() {
        return new HashMap<>();
    }
}
