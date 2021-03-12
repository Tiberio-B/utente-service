package it.sogei.svildep.interrogazioneservice.service;

import it.sogei.svildep.interrogazioneservice.dto.Dto;
import it.sogei.svildep.interrogazioneservice.mapper.Mapper;
import it.sogei.svildep.interrogazioneservice.model.Entity;
import it.sogei.svildep.interrogazioneservice.repository.IRepository;

import java.util.List;

interface IService<E extends Entity, D extends Dto> {

    Mapper<E, D> getMapper();

    IRepository<E> getRepository();

    D get(Long id);

    List<D> getAll();

}
