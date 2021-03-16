package it.sogei.svildep.interrogazioneservice.service;

import it.sogei.svildep.interrogazioneservice.MockDataLoader;
import it.sogei.svildep.interrogazioneservice.dto.DepositoDto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static it.sogei.svildep.interrogazioneservice.MockDataLoader.databaseDeposito;


@Service
@Getter
@RequiredArgsConstructor
public class DepositoService {

    public List<DepositoDto> getAll() { return new ArrayList<>(databaseDeposito.values()); }

    public DepositoDto get(String numeroNazionale) {
        return databaseDeposito.get(numeroNazionale);
    }

    public List<DepositoDto> getAllByCfSoggetto(String cf) {
        DepositoDto dep = databaseDeposito.get(cf);
        List<DepositoDto> ret = new ArrayList<>();
        ret.add(dep);
        return ret;
    }
}
