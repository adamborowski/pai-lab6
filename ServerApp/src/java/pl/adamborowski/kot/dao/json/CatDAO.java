/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.adamborowski.kot.dao.json;

import java.util.List;
import pl.adamborowski.kot.dao.AbstractDAO;
import pl.adamborowski.kot.data.Cat;
import util.JSONTableFile;

/**
 *
 * @author adam
 */
public class CatDAO extends AbstractDAO<Cat> {

    private final JSONTableFile<Cat> catFile;

    public CatDAO(JSONTableFile<Cat> catFile) {
        this.catFile = catFile;
    }

    @Override
    public int insert(Cat object) {
        catFile.add(object);
        object.setId(catFile.getLastInsertId());
        return object.getId();
    }

    @Override
    public boolean delete(int id) {
        catFile.remove(find(id));
        return true;
    }

    @Override
    public Cat find(int id) {
        List<Cat> cats = catFile.getItems();
        return cats.stream().filter((e) -> e.getId() == id).findAny().get();
    }

    @Override
    public List<Cat> find(int offest, int limit) {
        List<Cat> cats = catFile.getItems();
        if(limit==0){
            return cats;
        }
        return cats.subList(offest, offest + limit);
    }

    @Override
    public boolean update(Cat object) {
        List<Cat> cats = catFile.getItems();
        Cat inListObject = cats.stream().filter((e) -> e.getId() == object.getId()).findAny().get();
        int index = cats.indexOf(inListObject);
        cats.remove(inListObject);
        cats.add(index, object);
        catFile.setItems(cats);
        return true;
    }

}
