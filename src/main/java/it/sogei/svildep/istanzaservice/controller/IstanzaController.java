package it.sogei.svildep.istanzaservice.controller;

import it.sogei.svildep.istanzaservice.dto.istanza.IstanzaDto;
import it.sogei.svildep.istanzaservice.model.Role;
import it.sogei.svildep.istanzaservice.model.istanza.Istanza;
import it.sogei.svildep.istanzaservice.service.IstanzaService;
import it.sogei.svildep.istanzaservice.validator.IstanzaValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("istanza")
public class IstanzaController extends Controller<Istanza, IstanzaDto> {

    @Autowired
    IstanzaController(IstanzaService service, IstanzaValidator validator) {
        super(service, validator, Role.OPERATORE_RTS_ROLE);
    }
}
