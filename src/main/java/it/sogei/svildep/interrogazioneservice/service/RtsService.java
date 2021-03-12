package it.sogei.svildep.interrogazioneservice.service;

import it.sogei.svildep.interrogazioneservice.dto.RtsDto;
import it.sogei.svildep.interrogazioneservice.mapper.Mapper;
import it.sogei.svildep.interrogazioneservice.model.Rts;
import it.sogei.svildep.interrogazioneservice.repository.IRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Getter
@RequiredArgsConstructor
public class RtsService implements IService<Rts, RtsDto> {

    private final IRepository<Rts> repository;
    private final Mapper<Rts, RtsDto> mapper;

    @Override
    public RtsDto get(Long id) {
        return null;
    }

    @Override
    public List<RtsDto> getAll() {
        return null;
    }
}
