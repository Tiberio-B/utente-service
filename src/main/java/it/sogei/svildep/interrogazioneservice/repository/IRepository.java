package it.sogei.svildep.interrogazioneservice.repository;

import it.sogei.svildep.interrogazioneservice.model.Entity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public interface IRepository<E extends Entity> {

    Map<Long, E> getDatabase();

    default E get(Long id) { return getDatabase().get(id); }

    default List<E> getAll() { return new ArrayList<>(getDatabase().values()); }

    default void drop() { getDatabase().clear(); }
}
