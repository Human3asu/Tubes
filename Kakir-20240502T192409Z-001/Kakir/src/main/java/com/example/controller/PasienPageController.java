package com.example.controller;

import com.example.Dao.DaoObat;
import com.example.Database.ControllerDataBase;
import com.example.kasir.Obat;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;

public class PasienPageController {
    @FXML
    private TextField namaPasien;
    @FXML
    private TextField umurPasien;
    @FXML
    private TextField keluhanPasien;
    @FXML
    private TableView<Obat> tableObat;
    @FXML
    private TableColumn<Obat, String> namaObatColumn;
    @FXML
    private TableColumn<Obat, String> jenisObatcolumn;
    @FXML
    private TableColumn<Obat, Integer> dosisObatcolumn;
    @FXML
    private TableColumn<Obat, Double> hargaObatcolumn;

    @FXML
    static Connection conn = ControllerDataBase.getConnection();
    static DaoObat daoObat = new DaoObat(conn);

    @FXML
    private void initialize(){
        namaObatColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNameObat()));
        jenisObatcolumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getJenisObat()));
        dosisObatcolumn.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getDosis()).asObject());
        hargaObatcolumn.setCellValueFactory(cellData -> new SimpleDoubleProperty(cellData.getValue().getHarga()).asObject());
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
        System.out.println(keluhanPasien.getText());
    }
}