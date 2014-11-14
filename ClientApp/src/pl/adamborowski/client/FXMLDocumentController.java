/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.adamborowski.client;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

/**
 *
 * @author adam
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TableView<Cat> table;
    @FXML
    private TableColumn<Cat, String> nameColumn;
    @FXML
    private TableColumn<Cat, String> ageColumn;

    @FXML
    private void prevAction(ActionEvent event) {
        table.setItems(FXCollections.observableArrayList(service.prevPage()));
    }

    @FXML
    private void nextAction(ActionEvent event) {
        table.setItems(FXCollections.observableArrayList(service.nextPage()));
    }

    @FXML
    private void refreshAction(ActionEvent event) {
        table.setItems(FXCollections.observableArrayList(service.search()));
    }

    @FXML
    private void addAction(ActionEvent event) {
        final Cat cat = new Cat();
        cat.setName("Nowicjusz");
        cat.setAge(new Random().nextInt(40));
        service.addCat(cat);
        refreshAction(null);
    }

    @FXML
    private void removeAction(ActionEvent event) {
        final Cat selectedItem = table.getSelectionModel().getSelectedItem();
        if (selectedItem != null) {
            service.deleteCat(selectedItem.getId());
            refreshAction(null);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        nameColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getName()));
        ageColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getAge().toString()));
//        ageColumn.setCellValueFactory(new PropertyValueFactory<>("age"));
        ageColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        nameColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        ageColumn.setOnEditCommit(t -> {
            t.getRowValue().setAge(Integer.valueOf(t.getNewValue()));
            service.updateCat(t.getRowValue());
        });
        nameColumn.setOnEditCommit(t -> {
            t.getRowValue().setName(t.getNewValue());
            service.updateCat(t.getRowValue());
        });

        KotService_Service ser = new KotService_Service();
        service = ser.getKotServicePort();
        refreshAction(null);
    }
    private KotService service;

}
