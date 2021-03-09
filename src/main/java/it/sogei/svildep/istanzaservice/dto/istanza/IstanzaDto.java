package it.sogei.svildep.istanzaservice.dto.istanza;

import it.sogei.svildep.istanzaservice.dto.*;
import it.sogei.svildep.istanzaservice.model.istanza.Istanza;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public abstract class IstanzaDto extends Dto<Istanza> {

    private String qualitaRichiedente;

    private SoggettoDto richiedente;

    private DepositoDto datiDeposito;
    private String categoriaDeposito;

    private RichiestaDto datiRichiesta;
    private ProtocolloDto datiProtocollo;

    private RtsDto rtsInoltro;

    private String stato;

    private Set<DocumentoDto> allegati;

    public IstanzaDto(SoggettoDto richiedente, DepositoDto datiDeposito, String categoriaDeposito) {
        this.richiedente = richiedente;
        this.datiDeposito = datiDeposito;
        this.categoriaDeposito = categoriaDeposito;
    }
}
