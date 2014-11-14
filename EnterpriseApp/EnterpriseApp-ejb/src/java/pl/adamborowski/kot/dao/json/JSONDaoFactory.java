/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.adamborowski.kot.dao.json;

import java.io.File;
import pl.adamborowski.kot.dao.AbstractDAO;
import pl.adamborowski.kot.dao.IDAOFactory;
import pl.adamborowski.kot.data.Cat;
import pl.adamborowski.kot.util.JSONTableFile;

/**
 *
 * @author adam
 */
public class JSONDaoFactory implements IDAOFactory {

    @Override
    public void createConnection() {
        catFile = new JSONTableFile<>(new File("cat.json"));
    }
    private JSONTableFile<Cat> catFile;

    @Override
    public AbstractDAO<Cat> getCatDAO() {
        return new CatDAO(catFile);
    }

}
