package it.sogei.svildep.istanzaservice.service;

import it.sogei.svildep.istanzaservice.dto.istanza.DepositoAmministrativoDto;
import it.sogei.svildep.istanzaservice.mapper.istanza.DepositoAmministrativoMapper;
import it.sogei.svildep.istanzaservice.model.istanza.DepositoAmministrativo;
import it.sogei.svildep.istanzaservice.repository.DepositoAmministrativoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DepositoAmministrativoService extends IstanzaService<DepositoAmministrativo, DepositoAmministrativoDto> {

    private final DepositoAmministrativoRepository repository;
    private final DepositoAmministrativoMapper mapper;
}
