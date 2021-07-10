package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main extends Application{

        @Override
        public void start(Stage stage) throws Exception {
                Stage stage1 = new Stage();
               Scene scene = new Scene(new Pane(), 500, 500);
               stage1.setScene(scene);
               stage1.showAndWait();
               System.exit(0);
        }

        public static void main(String[] args) {
            launch(args);
        }

}

