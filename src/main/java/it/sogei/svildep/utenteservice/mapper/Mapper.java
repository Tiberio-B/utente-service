package it.sogei.svildep.utenteservice.mapper;

import it.sogei.svildep.utenteservice.dto.SvildepDto;
import it.sogei.svildep.utenteservice.model.BaseEntity;

public interface Mapper<E extends BaseEntity, D extends SvildepDto> extends EntityToDtoMapper<E, D>, DtoToEntityMapper<E, D> {

}
