package it.sogei.svildep.istanzaservice.repository;

import it.sogei.svildep.istanzaservice.model.istanza.Istanza;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public abstract class IstanzaRepository<I extends Istanza> implements IRepository<I> {

    @Override
    public I get(Long id) { return getDatabase().get(id); }

    @Override
    public List<I> getAll() { return new ArrayList<>(getDatabase().values()); }

    @Override
    public I insert(I entity) { return getDatabase().put(entity.getId(), entity); }

    @Override
    public boolean update(I entity) { return insert(entity) == null; }

    @Override
    public I delete(I entity) { return getDatabase().remove(entity.getId()); }

    @Override
    public I delete(Long id) { return getDatabase().remove(id); }

    @Override
    public boolean deleteEffective(I entity) { return delete(entity) != null; }

    @Override
    public boolean deleteEffective(Long id) { return delete(id) != null; }

    @Override
    public void drop() { getDatabase().clear(); }
}
