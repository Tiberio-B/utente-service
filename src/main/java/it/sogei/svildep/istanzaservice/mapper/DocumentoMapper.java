package it.sogei.svildep.istanzaservice.mapper;

import it.sogei.svildep.istanzaservice.dto.DocumentoDto;
import it.sogei.svildep.istanzaservice.model.Documento;
import org.springframework.stereotype.Component;

@Component
public class DocumentoMapper implements Mapper<Documento, DocumentoDto> {

    @Override
    public DocumentoDto convertEntityToDtoImpl(Documento entity) {
        return new DocumentoDto();
    }

    @Override
    public Documento convertDtoToEntityImpl(DocumentoDto dto) {
        return new Documento();
    }
}
