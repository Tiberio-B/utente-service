package it.sogei.svildep.istanzaservice.service;

import it.sogei.svildep.istanzaservice.dto.istanza.IstanzaDto;
import it.sogei.svildep.istanzaservice.mapper.IstanzaMapper;
import it.sogei.svildep.istanzaservice.model.istanza.Istanza;
import it.sogei.svildep.istanzaservice.repository.IstanzaRepository;
import it.sogei.svildep.istanzaservice.service.external.SoggettoService;

@org.springframework.stereotype.Service
public abstract class IstanzaService extends Service<Istanza, IstanzaDto> {

    private final SoggettoService soggettoService;

    IstanzaService(IstanzaRepository repository, IstanzaMapper mapper, SoggettoService soggettoService) {
        super(repository, mapper);
        this.soggettoService = soggettoService;
    }

    @Override
    public void prepareInsert(IstanzaDto dto) {
        soggettoService.verificaSoggetti(dto.getRichiedente());

    }

}
