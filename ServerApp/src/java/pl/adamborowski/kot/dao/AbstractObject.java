/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.adamborowski.kot.dao;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author adam
 */
public class AbstractObject implements Serializable {

    @Getter @Setter
    private Integer id;
}
