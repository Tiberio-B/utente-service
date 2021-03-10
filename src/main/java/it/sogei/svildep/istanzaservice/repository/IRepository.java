package it.sogei.svildep.istanzaservice.repository;

import it.sogei.svildep.istanzaservice.model.Entity;

import java.util.List;
import java.util.Map;

public interface IRepository<E extends Entity> {

    Map<Long, E> getDatabase();

    E get(Long id);

    List<E> getAll();
    
    E insert(E entity);
    
    boolean update(E entity);
    
    E delete(E entity);
    
    E delete(Long id);
    
    boolean deleteEffective(E entity);
    
    boolean deleteEffective(Long id);

    void drop();
}
