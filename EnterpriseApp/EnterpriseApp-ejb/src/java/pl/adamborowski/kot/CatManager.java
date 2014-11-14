/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.adamborowski.kot;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateful;
import lombok.Delegate;
import pl.adamborowski.kot.dao.AbstractDAO;
import pl.adamborowski.kot.dao.IDAOFactory;
import pl.adamborowski.kot.dao.json.JSONDaoFactory;
import pl.adamborowski.kot.data.Cat;

/**
 *
 * @author adam
 */
@Stateful @LocalBean
public class CatManager {

    @Delegate
    private AbstractDAO<Cat> catDao;

    @PostConstruct
    public void init() {
        IDAOFactory factory = new JSONDaoFactory();
        factory.createConnection();
        catDao = factory.getCatDAO();
    }
    
    
}
