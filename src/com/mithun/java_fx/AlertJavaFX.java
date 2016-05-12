package com.mithun.java_fx;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * <h1> The intention of this class to define an alert for  </h1>
 * Created by Mithun Kumer Ghose on 5/12/2016.
 */
public class AlertJavaFX {

    public static void displayAlert(String title, String message) {
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinHeight(200);
        window.setMinWidth(300);

        Label label = new Label();
        label.setText(message);

        Button closeButton = new Button("Close");
        closeButton.setOnAction(event -> window.close());

        VBox verticalLayout = new VBox(20);
        verticalLayout.getChildren().addAll(label, closeButton);
        verticalLayout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(verticalLayout);

        window.setScene(scene);
        window.show();

    }

}
