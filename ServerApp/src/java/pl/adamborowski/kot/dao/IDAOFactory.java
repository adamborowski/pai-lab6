/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.adamborowski.kot.dao;

import pl.adamborowski.kot.data.Cat;

/**
 *
 * @author adam
 */
public interface IDAOFactory {

    void createConnection();

    AbstractDAO<Cat> getCatDAO();
}
