package it.sogei.svildep.istanzaservice.service;

import it.sogei.svildep.istanzaservice.dto.Dto;
import it.sogei.svildep.istanzaservice.mapper.Mapper;
import it.sogei.svildep.istanzaservice.model.Entity;
import it.sogei.svildep.istanzaservice.repository.Repository;

import java.util.List;

public abstract class Service<E extends Entity, D extends Dto<E>> {

    private final Repository<E> repository;
    private final Mapper<E, D> mapper;

    Service(Repository<E> repository, Mapper<E, D> mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public D get(Long id) { return mapper.convertEntityToDto(repository.get(id)); }

    public List<D> getAll() { return mapper.convertEntityToDto(repository.getAll()); }

    public abstract void prepareInsert(D dto);

    public D insert(D dto) { return mapper.convertEntityToDto(repository.insert(mapper.convertDtoToEntity(dto))); }

    public boolean update(D dto) { return repository.update(mapper.convertDtoToEntity(dto)); }

    public D delete(Long id) { return mapper.convertEntityToDto(repository.delete(id)); }

    public D delete(D dto) { return mapper.convertEntityToDto(repository.delete(mapper.convertDtoToEntity(dto))); }

    public boolean deleteEffective(D dto) { return repository.deleteEffective(mapper.convertDtoToEntity(dto)); }

}
