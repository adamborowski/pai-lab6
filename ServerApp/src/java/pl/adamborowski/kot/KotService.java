/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.adamborowski.kot;

import com.sun.xml.ws.developer.servlet.HttpSessionScope;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Stateful;
import javax.faces.bean.SessionScoped;
import javax.jws.WebService;
import javax.jws.WebMethod;
import pl.adamborowski.kot.dao.AbstractDAO;
import pl.adamborowski.kot.dao.IDAOFactory;
import pl.adamborowski.kot.data.Cat;
import pl.adamborowski.kot.dao.json.JSONDaoFactory;

/**
 *
 * @author adam
 */
@HttpSessionScope @WebService(serviceName = "KotService")
public class KotService {

    @PostConstruct
    public void init() {
        IDAOFactory factory = new JSONDaoFactory();
        factory.createConnection();
        catDao = factory.getCatDAO();
    }
    private AbstractDAO<Cat> catDao;

    @WebMethod
    public int addCat(Cat cat) {
        return catDao.insert(cat);
    }

    @WebMethod
    public Cat findCat(int id) {
        return catDao.find(id);
    }

    @WebMethod
    public List<Cat> getCats() {
        return catDao.find();
    }

    @WebMethod
    public List<Cat> getCatsPaged(int offset, int limit) {
        return catDao.find(offset, limit);
    }

    @WebMethod
    public boolean deleteCat(int id) {
        return catDao.delete(id);
    }
}
