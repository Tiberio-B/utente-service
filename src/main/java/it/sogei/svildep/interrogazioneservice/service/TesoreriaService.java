package it.sogei.svildep.interrogazioneservice.service;

import it.sogei.svildep.interrogazioneservice.dto.TesoreriaDto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static it.sogei.svildep.interrogazioneservice.MockDataLoader.databaseTesoreria;

@Service
@Getter
@RequiredArgsConstructor
public class TesoreriaService {

    public List<TesoreriaDto> getAll() { return new ArrayList<>(databaseTesoreria.values()); }

    public TesoreriaDto get(String codice) { return databaseTesoreria.get(codice); }
}
