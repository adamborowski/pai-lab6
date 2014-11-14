/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.adamborowski.kot.dao;

import java.util.List;

/**
 *
 * @author adam
 * @param <D> DataTransferObject
 */
public abstract class AbstractDAO<D extends AbstractObject> {

    public abstract int insert(D object);

    public abstract boolean delete(int id);

    public final boolean delete(D object) {
        return delete(object.getId());
    }

    public abstract D find(int id);

    public abstract List<D> find(int offest, int limit);

    public final List<D> find() {
        return find(0, 0);
    }

    public abstract boolean update(D object);
}
