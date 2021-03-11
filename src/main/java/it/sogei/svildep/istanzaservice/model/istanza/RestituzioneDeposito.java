package it.sogei.svildep.istanzaservice.model.istanza;

import it.sogei.svildep.istanzaservice.model.Deposito;
import it.sogei.svildep.istanzaservice.model.Soggetto;
import it.sogei.svildep.istanzaservice.model.pagamento.ModalitaPagamento;

import java.math.BigDecimal;
import java.util.Set;

public class RestituzioneDeposito extends Istanza {

    private BigDecimal importoRichiesto;

    private Set<Soggetto> soggettiObbligatori;
    private Soggetto intestatario;

    private Boolean pagamentoASoggettiDeposito;

    private ModalitaPagamento modalitaPagamento;

    public RestituzioneDeposito() {
        super();
        this.setCategoriaDeposito(Categoria.RESTITUZIONE_DEPOSITO);
    }
}
