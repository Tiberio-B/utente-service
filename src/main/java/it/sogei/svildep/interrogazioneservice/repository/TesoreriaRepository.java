package it.sogei.svildep.interrogazioneservice.repository;

import it.sogei.svildep.interrogazioneservice.model.Tesoreria;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@NoArgsConstructor
public class TesoreriaRepository implements IRepository<Tesoreria> {


    @Override
    public Map<Long, Tesoreria> getDatabase() {
        return null;
    }

    @Override
    public Tesoreria get(Long id) {
        return null;
    }

    @Override
    public List<Tesoreria> getAll() {
        return null;
    }

    @Override
    public void drop() {

    }
}
