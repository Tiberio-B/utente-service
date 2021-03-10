package it.sogei.svildep.istanzaservice.service;

import it.sogei.svildep.istanzaservice.dto.istanza.IstanzaDepositoCauzionaleDto;
import it.sogei.svildep.istanzaservice.mapper.istanza.IstanzaDepositoCauzionaleMapper;
import it.sogei.svildep.istanzaservice.model.istanza.IstanzaDepositoCauzionale;
import it.sogei.svildep.istanzaservice.repository.IstanzaDepositoCauzionaleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class IstanzaDepositoCauzionaleService extends IstanzaService<IstanzaDepositoCauzionale, IstanzaDepositoCauzionaleDto> {

    private final IstanzaDepositoCauzionaleRepository repository;
    private final IstanzaDepositoCauzionaleMapper mapper;
}
