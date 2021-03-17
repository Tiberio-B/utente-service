package it.sogei.svildep.utenteservice.service;

import it.sogei.svildep.utenteservice.dto.RtsDto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static it.sogei.svildep.utenteservice.MockDataLoader.databaseRts;

@Service
@Getter
@RequiredArgsConstructor
public class RtsService {

    public RtsDto get(Long id) { return databaseRts.get(id.toString()); }

    public List<RtsDto> getAll() { return new ArrayList<>(databaseRts.values()); }
}
