package it.sogei.svildep.istanzaservice.service;

import it.sogei.svildep.istanzaservice.dto.istanza.depositoAmministrativo.IstanzaDepositoAmministrativoDto;
import it.sogei.svildep.istanzaservice.mapper.istanza.depositoAmministrativo.IstanzaDepositoAmministrativoMapper;
import it.sogei.svildep.istanzaservice.model.istanza.depositoAmministrativo.IstanzaDepositoAmministrativo;
import it.sogei.svildep.istanzaservice.repository.IstanzaDepositoAmministrativoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class IstanzaDepositoAmministrativoService extends IstanzaService<IstanzaDepositoAmministrativo, IstanzaDepositoAmministrativoDto> {

    private final IstanzaDepositoAmministrativoRepository repository;
    private final IstanzaDepositoAmministrativoMapper mapper;
}
