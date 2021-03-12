package it.sogei.svildep.interrogazioneservice.service;

import it.sogei.svildep.interrogazioneservice.dto.TesoreriaDto;
import it.sogei.svildep.interrogazioneservice.mapper.Mapper;
import it.sogei.svildep.interrogazioneservice.model.Tesoreria;
import it.sogei.svildep.interrogazioneservice.repository.IRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Getter
@RequiredArgsConstructor
public class TesoreriaService implements IService<Tesoreria, TesoreriaDto> {
    
    private final IRepository<Tesoreria> repository;
    private final Mapper<Tesoreria, TesoreriaDto> mapper;

    @Override
    public TesoreriaDto get(Long id) {
        return null;
    }

    @Override
    public List<TesoreriaDto> getAll() {
        return null;
    }

    public TesoreriaDto get(String codice) {
        return null;
    }
}
