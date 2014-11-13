/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.adamborowski.client;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javax.xml.ws.WebServiceRef;
import pl.adamborowski.client.generated.Kot;
import pl.adamborowski.client.generated.KotService;
import pl.adamborowski.client.generated.KotService_Service;

/**
 *
 * @author adam
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        
        label.setText("Hello World!");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        KotService_Service ser = new  KotService_Service();
        service = ser.getKotServicePort();
        Kot a = service.getKotek("miałotek");
        int b = 3;
    }
    private KotService service;

}
