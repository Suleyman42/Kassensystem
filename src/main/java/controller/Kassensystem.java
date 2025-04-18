package controller;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class Kassensystem extends Application {


    @FXML
    void offneAdminPanel(MouseEvent event) {
        try {
            // Admin-FXML laden
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/controller/admin_panel.fxml"));

            Parent root = fxmlLoader.load();

            // Neues Fenster (Stage) erstellen
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setTitle("Admin Panel");
            stage.setScene(new Scene(root));
            stage.show();

            System.out.println("AdminPanel geöffnet");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }




    @FXML
    void offneBedienerPanel(MouseEvent event) {
        try {
            // Admin-FXML laden
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/controller/bediener_panel.fxml"));

            Parent root = fxmlLoader.load();

            // Neues Fenster (Stage) erstellen
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setTitle("Bediener Panel");
            stage.setScene(new Scene(root));
            stage.show();

            System.out.println("Bediener geöffnet");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }








    public static void main(String[] args) {
        launch(args);


    }

    @Override
    public void start(Stage stage) throws Exception {


        Parent root = FXMLLoader.load(getClass().getResource("/controller/Kassensystem.fxml"));
        stage.setTitle("Kassensystem Siebenkorn");
        stage.setScene(new Scene(root,800,800));
        stage.show();

    }
}
