package it.sogei.svildep.interrogazioneservice.service;

import it.sogei.svildep.interrogazioneservice.dto.DepositoDto;
import it.sogei.svildep.interrogazioneservice.mapper.Mapper;
import it.sogei.svildep.interrogazioneservice.model.Deposito;
import it.sogei.svildep.interrogazioneservice.repository.IRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Getter
@RequiredArgsConstructor
public class DepositoService implements IService<Deposito, DepositoDto> {

    private final IRepository<Deposito> repository;
    private final Mapper<Deposito, DepositoDto> mapper;

    @Override
    public DepositoDto get(Long id) {
        return null;
    }

    @Override
    public List<DepositoDto> getAll() {
        return null;
    }

    public DepositoDto get(String numeroNazionale) {
        return null;
    }

    public List<DepositoDto> getAllByCfSoggetto(String cf) {
        return null;
    }
}
