package it.sogei.svildep.istanzaservice.service;

import it.sogei.svildep.istanzaservice.dto.Dto;
import it.sogei.svildep.istanzaservice.mapper.Mapper;
import it.sogei.svildep.istanzaservice.model.Entity;
import it.sogei.svildep.istanzaservice.repository.IRepository;

import java.util.List;

interface IService<E extends Entity, D extends Dto> {

    Mapper<E, D> getMapper();

    IRepository<E> getRepository();

    D get(Long id);

    List<D> getAll();

    D insert(D dto);

    boolean update(D dto);

    D delete(Long id);

    D delete(D dto);

    boolean deleteEffective(D dto);

    void drop();
}
