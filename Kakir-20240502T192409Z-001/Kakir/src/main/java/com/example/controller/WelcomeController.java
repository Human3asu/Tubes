package com.example.controller;

import com.example.kasir.Obat;
import com.example.Database.ControllerDataBase;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.sql.Connection;

public class WelcomeController {
    @FXML
    private void toHomePage(ActionEvent event) throws IOException {
        Connection connection = ControllerDataBase.getConnection();
        System.out.println(connection);
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/main Hole.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setResizable(false);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
