/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.adamborowski.kot;

import java.util.ArrayList;
import java.util.Arrays;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import pl.adamborowski.kot.data.Kot;

/**
 *
 * @author adam
 */
@WebService(serviceName = "KotService")
public class KotService {

    /**
     * Web service operation
     * @param name
     * @return 
     */
    @WebMethod(operationName = "getKotek")
    public Kot getKotek(@WebParam(name = "name") String name) {
        //TODO write your implementation code here:
        return new Kot(name,new ArrayList<>( Arrays.asList(1, 4, 6, 8)));
    }
}
