package it.sogei.svildep.istanzaservice.service;

import it.sogei.svildep.istanzaservice.dto.MessageDto;
import it.sogei.svildep.istanzaservice.dto.istanza.IstanzaDto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.mapper.IstanzaMapper;
import it.sogei.svildep.istanzaservice.model.istanza.Istanza;
import it.sogei.svildep.istanzaservice.repository.IstanzaRepository;
import it.sogei.svildep.istanzaservice.service.external.RtsService;
import it.sogei.svildep.istanzaservice.service.external.SoggettoService;

@org.springframework.stereotype.Service
public class IstanzaService extends Service<Istanza, IstanzaDto> {

    private final SoggettoService soggettoService;
    private final RtsService rtsService;

    IstanzaService(IstanzaRepository istanzaRepository, IstanzaMapper istanzaMapper, SoggettoService soggettoService, RtsService rtsService) {
        super(istanzaRepository, istanzaMapper);
        this.soggettoService = soggettoService;
        this.rtsService = rtsService;
    }

    @Override
    public void prepareInsert(IstanzaDto istanza) throws SvildepException {
        MessageDto soggettoResponse = soggettoService.verificaSoggetti(istanza.getRichiedente());
        if (soggettoResponse.isError()) throw new SvildepException(soggettoResponse);

        MessageDto rtsResponse = rtsService.inserimentoInFascicolo(istanza.getAllegati());
        if (rtsResponse.isError()) throw new SvildepException(rtsResponse);
    }

}
