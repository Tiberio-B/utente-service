package it.sogei.svildep.istanzaservice.mapper.istanza;

import it.sogei.svildep.istanzaservice.dto.istanza.IstanzaDto;
import it.sogei.svildep.istanzaservice.mapper.*;
import it.sogei.svildep.istanzaservice.model.istanza.Istanza;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@NoArgsConstructor
public abstract class IstanzaMapper<I extends Istanza, D extends IstanzaDto> implements Mapper<I, D> {

    @Getter
    @Autowired private SoggettoMapper soggettoMapper;
    @Autowired private DepositoMapper depositoMapper;
    @Autowired private RichiestaMapper richiestaMapper;
    @Autowired private ProtocolloMapper protocolloMapper;
    @Autowired private RtsMapper rtsMapper;
    @Autowired private DocumentoMapper documentoMapper;

    public void mapPropertyIstanzaEntityToDto(I entity, D dto) {
        dto.setQualitaRichiedente(entity.getQualitaRichiedente().name());
        dto.setCategoriaDeposito(entity.getCategoriaDeposito().name());
        dto.setStato(entity.getStato().name());
        dto.setRichiedente(soggettoMapper.convertEntityToDto(entity.getRichiedente()));
        dto.setDatiDeposito(depositoMapper.convertEntityToDto(entity.getDatiDeposito()));
        dto.setDatiRichiesta(richiestaMapper.convertEntityToDto(entity.getDatiRichiesta()));
        dto.setDatiProtocollo(protocolloMapper.convertEntityToDto(entity.getDatiProtocollo()));
        dto.setRtsInoltro(rtsMapper.convertEntityToDto(entity.getRtsInoltro()));
        dto.setAllegati(documentoMapper.convertEntityToDto(entity.getAllegati()));
    }

    public void mapPropertyIstanzaDtoToEntity(D dto, I entity) {
        entity.setRichiedente(soggettoMapper.convertDtoToEntity(dto.getRichiedente()));
        entity.setDatiDeposito(depositoMapper.convertDtoToEntity(dto.getDatiDeposito()));
    }
}
