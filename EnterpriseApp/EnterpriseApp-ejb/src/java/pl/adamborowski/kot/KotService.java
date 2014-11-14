/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.adamborowski.kot;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.jws.WebMethod;
import pl.adamborowski.kot.data.Cat;

/**
 *
 * @author adam
 */
@Stateless @LocalBean
@WebService(serviceName = "KotService")
public class KotService {

    @PostConstruct
    public void ready() {
        int a = 1;
    }

    @EJB
    public CatManager catManager;

    @WebMethod
    public int addCat(Cat cat) {
        return catManager.insert(cat);
    }
    @WebMethod
    public boolean updateCat(Cat cat) {
        return catManager.update(cat);
    }

    @WebMethod
    public Cat findCat(int id) {
        return catManager.find(id);
    }

    @WebMethod
    public List<Cat> getCats() {
        return catManager.find();
    }

    @WebMethod
    public List<Cat> getCatsPaged(int offset, int limit) {
        return catManager.find(offset, limit);
    }

    @WebMethod
    public boolean deleteCat(int id) {
        return catManager.delete(id);
    }
    ////////////////////
    int pageSize = 10;

    @EJB
    private ValueListService valueListService;

    /**
     * This is a sample web service operation
     */
    @WebMethod
    public List<Cat> search() {
        valueListService.refresh();
        return valueListService.getNextElements(pageSize);
    }

    @WebMethod
    public List<Cat> nextPage() {
        return valueListService.getNextElements(pageSize);
    }

    @WebMethod
    public List<Cat> prevPage() {
        return valueListService.getPreviousElements(pageSize);
    }
}
