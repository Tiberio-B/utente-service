package it.sogei.svildep.utenteservice.service;

import it.sogei.svildep.utenteservice.dto.TesoreriaDto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static it.sogei.svildep.utenteservice.MockDataLoader.databaseTesoreria;

@Service
@Getter
@RequiredArgsConstructor
public class TesoreriaService {

    public List<TesoreriaDto> getAll() { return new ArrayList<>(databaseTesoreria.values()); }

    public TesoreriaDto get(String codice) { return databaseTesoreria.get(codice); }
}
