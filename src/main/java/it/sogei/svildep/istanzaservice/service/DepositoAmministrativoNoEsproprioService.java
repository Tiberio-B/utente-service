package it.sogei.svildep.istanzaservice.service;

import it.sogei.svildep.istanzaservice.dto.istanza.DepositoAmministrativoNoEsproprioDto;
import it.sogei.svildep.istanzaservice.mapper.istanza.DepositoAmministrativoNoEsproprioMapper;
import it.sogei.svildep.istanzaservice.model.istanza.DepositoAmministrativoNoEsproprio;
import it.sogei.svildep.istanzaservice.repository.DepositoAmministrativoNoEsproprioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DepositoAmministrativoNoEsproprioService extends IstanzaService<DepositoAmministrativoNoEsproprio, DepositoAmministrativoNoEsproprioDto> {

    private final DepositoAmministrativoNoEsproprioRepository repository;
    private final DepositoAmministrativoNoEsproprioMapper mapper;
}
