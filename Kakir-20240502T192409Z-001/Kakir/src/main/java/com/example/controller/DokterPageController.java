package com.example.controller;

import com.example.Dao.DaoObat;
import com.example.Database.ControllerDataBase;
import com.example.kasir.Obat;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;

public class DokterPageController {
    @FXML
    private TextField namaPasien;
    @FXML
    private TextField umurPasien;
    @FXML
    private ComboBox keluhanPasien;
    @FXML
    private TableView<Obat> tableObat;
    @FXML
    private TableColumn<Obat, String> namaObatColumn;

    static Connection conn = ControllerDataBase.getConnection();
    static DaoObat daoObat = new DaoObat(conn);

    @FXML
    private void initialize(){
        namaObatColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNameObat()));
//.setCellValueFactory(new PropertyValueFactory<Obat, String>("nameObat"));
        tableObat.getItems().setAll(daoObat.getAll());
    }

    @FXML
    private void toKasirpage(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/kasir page.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setResizable(false);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void savePasien(){
        System.out.println(namaPasien.getText());
        System.out.println(umurPasien.getText());
        System.out.println(keluhanPasien.getValue());
    }
}