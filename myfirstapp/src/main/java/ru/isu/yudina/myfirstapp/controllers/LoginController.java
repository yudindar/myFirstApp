package ru.isu.yudina.myfirstapp.controllers;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {


    public AnchorPane login_ap;

    private void close(){
        Stage s = (Stage) login_ap.getScene().getWindow();
        s.close();
    }

    @FXML
    void backward(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getClassLoader().
                getResource("views/main.fxml"));
        stage.setTitle("Hello World");
        stage.setScene(new Scene(root));
        stage.show();
        close();

    }
//    @FXML
//    void inLogin(ActionEvent event) throws IOException {
//        Stage stage = new Stage();
//        Parent root = FXMLLoader.load(getClass().getClassLoader().
//                getResource("views/mainLogin.fxml"));
//        stage.setTitle("Hello World");
//        stage.setScene(new Scene(root));
//        stage.show();
//        close();
//
//    }

}
