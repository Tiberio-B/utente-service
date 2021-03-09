package it.sogei.svildep.istanzaservice.mapper;

import it.sogei.svildep.istanzaservice.dto.Dto;
import it.sogei.svildep.istanzaservice.model.Entity;

import java.util.ArrayList;
import java.util.List;

public abstract class Mapper<E extends Entity, D extends Dto<E>> {

    public D convertEntityToDto(E entity) {
        if (entity == null) return null;
        D dto = convertEntityToDtoImpl(entity);
        dto.setId(String.valueOf(entity.getId()));
        return dto;
    }

    public List<D> convertEntityToDto(List<E> entities) {
        if (entities == null) return null;
        List<D> dtos = new ArrayList<>();
        for (E entity : entities) dtos.add(convertEntityToDto(entity));
        return dtos;
    }

    public E convertDtoToEntity(D dto) {
        if (dto == null) return null;
        E entity = convertDtoToEntityImpl(dto);
        entity.setId(Long.parseLong(dto.getId()));
        return entity;
    }

    public List<E> convertDtoToEntity(List<D> dtos) {
        if (dtos == null) return null;
        List<E> entities = new ArrayList<>();
        for (D dto : dtos) entities.add(convertDtoToEntity(dto));
        return entities;
    }

    public abstract D convertEntityToDtoImpl(E entity);

    public abstract E convertDtoToEntityImpl(D dto);

}
