package controller;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.util.Duration;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BedienerPanelController{

    @FXML
    private Label displayLabel;

    @FXML
    private StringBuilder inputBuilder = new StringBuilder();



    @FXML
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

    @FXML
    private Label dateTimeLabel;


    @FXML
    public void initialize() {
        Timeline clock = new Timeline(
                new KeyFrame(Duration.ZERO, e -> {
                    LocalDateTime now = LocalDateTime.now();

                    // ✅ Null-Check hier einfügen
                    if (dateTimeLabel != null) {
                        dateTimeLabel.setText(now.format(formatter));
                    } else {
                        System.out.println("WARNUNG: dateTimeLabel ist null!");
                    }

                }),
                new KeyFrame(Duration.seconds(1))
        );
        clock.setCycleCount(Timeline.INDEFINITE);
        clock.play();
    }

    @FXML
    void handleDigit(ActionEvent event) {
        Button clickedButton = (Button) event.getSource();
        String digit = clickedButton.getText();

        inputBuilder.append(digit);
        displayLabel.setText(inputBuilder.toString());


    }

    @FXML
    private void handleClear() {
        inputBuilder.setLength(0);
        displayLabel.setText("");
    }








}
