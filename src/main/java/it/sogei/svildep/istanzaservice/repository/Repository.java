package it.sogei.svildep.istanzaservice.repository;

import it.sogei.svildep.istanzaservice.model.Entity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class Repository<E extends Entity> {

    private Map<Long, E> database;

    public E get(Long id) { return this.database.get(id); }

    public List<E> getAll() { return new ArrayList<>(this.database.values()); }

    /**
     * Inserisce l'entita' nel database.
     * @param  entity entita' da inserire nel database
     * @return il valore precedentemente associato all'id dell'entita' appena inserita
     */
    public E insert(E entity) { return this.database.put(entity.getId(), entity); }

    /**
     * Inserisce l'entita' nel database.
     * @param  entity entita' da inserire nel database
     * @return true se l'entita' e' stata CREATA piuttosto che aggiornata
     *          (il valore precedentemente associato all'id dell'entita' era null),
     *         false altrimenti
     */
    public boolean update(E entity) { return insert(entity) == null; }

    /**
     * Rimuove l'entita' dal database.
     * @param  entity entita' da rimuovere dal database
     * @return il valore precedentemente associato all'id dell'entita' appena rimossa
     */
    public E delete(E entity) { return this.database.remove(entity.getId()); }

    /**
     * Rimuove l'entita' dal database.
     * @param  id id dell'entita' da rimuovere dal database
     * @return il valore precedentemente associato all'id dell'entita' appena rimossa
     */
    public E delete(Long id) { return this.database.remove(id); }

    /**
     * Rimuove l'entita' dal database.
     * @param  entity entita' da rimuovere dal database
     * @return true se l'entita' e' stata EFFETTIVAMENTE rimossa
     *          (il valore precedentemente associato all'id dell'entita' appena rimossa non era null),
     *          false altrimenti
     */
    public boolean deleteEffective(E entity) { return delete(entity) != null; }

    /**
     * Rimuove l'entita' dal database.
     * @param  id id dell'entita' da rimuovere dal database
     * @return true se l'entita' e' stata EFFETTIVAMENTE rimossa
     *          (il valore precedentemente associato all'id dell'entita' appena rimossa non era null),
     *          false altrimenti
     */
    public boolean deleteEffective(Long id) { return delete(id) != null; }

    public void drop() { this.database.clear(); }
}
