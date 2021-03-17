package it.sogei.svildep.utenteservice.service;

import it.sogei.svildep.utenteservice.dto.DepositoDto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static it.sogei.svildep.utenteservice.MockDataLoader.databaseDeposito;

@Service
@Getter
@RequiredArgsConstructor
public class DepositoService {

    public List<DepositoDto> getAll() { return new ArrayList<>(databaseDeposito.values()); }

    public DepositoDto get(String numeroNazionale) { return databaseDeposito.get(numeroNazionale); }

    public List<DepositoDto> getAllByCfSoggetto(String cf) { return Arrays.asList(databaseDeposito.get(cf)); }
}
