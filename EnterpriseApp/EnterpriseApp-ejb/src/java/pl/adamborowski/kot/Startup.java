/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.adamborowski.kot;

import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import pl.adamborowski.kot.dao.AbstractDAO;
import pl.adamborowski.kot.dao.IDAOFactory;
import pl.adamborowski.kot.data.Cat;
import pl.adamborowski.kot.dao.json.JSONDaoFactory;

/**
 *
 * @author adam
 */
public final class Startup
        implements ServletContextListener, HttpSessionListener {

    private ServletContext context = null;

    /**
     *
     * @param event
     */
    public void contextInitialized(ServletContextEvent event) {
        IDAOFactory factory = new JSONDaoFactory();
        factory.createConnection();
        AbstractDAO<Cat> catDao = factory.getCatDAO();
        catDao.insert(new Cat("Felek", (int) Math.round(Math.random() * 1000f)));
    }

    @Override
    public void contextDestroyed(ServletContextEvent event) {
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        int a = 0;
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {

    }
}
