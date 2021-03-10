package it.sogei.svildep.istanzaservice.mapper;

import it.sogei.svildep.istanzaservice.dto.Dto;
import it.sogei.svildep.istanzaservice.model.Entity;

import java.util.ArrayList;
import java.util.List;

public interface Mapper<E extends Entity, D extends Dto> {

    default D convertEntityToDto(E entity) {
        if (entity == null) return null;
        D dto = convertEntityToDtoImpl(entity);
        dto.setId(String.valueOf(entity.getId()));
        return dto;
    }

    default List<D> convertEntityToDto(List<E> entities) {
        if (entities == null) return null;
        List<D> dtos = new ArrayList<>();
        for (E entity : entities) dtos.add(convertEntityToDto(entity));
        return dtos;
    }

    default E convertDtoToEntity(D dto) {
        if (dto == null) return null;
        E entity = convertDtoToEntityImpl(dto);
        if (dto.getId() != null) entity.setId(Long.parseLong(dto.getId()));
        return entity;
    }

    default List<E> convertDtoToEntity(List<D> dtos) {
        if (dtos == null) return null;
        List<E> entities = new ArrayList<>();
        for (D dto : dtos) entities.add(convertDtoToEntity(dto));
        return entities;
    }

    D convertEntityToDtoImpl(E entity);

    E convertDtoToEntityImpl(D dto);

}
