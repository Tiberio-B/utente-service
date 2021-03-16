package it.sogei.svildep.interrogazioneservice.service;

import it.sogei.svildep.interrogazioneservice.dto.RtsDto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static it.sogei.svildep.interrogazioneservice.MockDataLoader.databaseRts;

@Service
@Getter
@RequiredArgsConstructor
public class RtsService {

    public RtsDto get(Long id) {
        return databaseRts.get(id);
    }

    public List<RtsDto> getAll() {
        return new ArrayList<>(databaseRts.values());
    }
}
