package it.sogei.svildep.istanzaservice.service;

import it.sogei.svildep.istanzaservice.dto.istanza.DepositoCauzionaleDto;
import it.sogei.svildep.istanzaservice.mapper.istanza.DepositoCauzionaleMapper;
import it.sogei.svildep.istanzaservice.model.istanza.DepositoCauzionale;
import it.sogei.svildep.istanzaservice.repository.DepositoCauzionaleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DepositoCauzionaleService extends IstanzaService<DepositoCauzionale, DepositoCauzionaleDto> {

    private final DepositoCauzionaleRepository repository;
    private final DepositoCauzionaleMapper mapper;
}
