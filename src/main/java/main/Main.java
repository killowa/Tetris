package main;

import decorates.Color;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import shapes.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Main extends Application{

        @Override
        public void start(Stage stage) throws Exception {
            Shape shape = new Line(Color.BLUE);

            for (int[] v : shape.getShapeCoordinates()) {
                System.out.println(Arrays.toString(v));
            }
            System.out.println("------------");
            shape.rotateRight();

            for (int[] v : shape.getShapeCoordinates()) {
                System.out.println(Arrays.toString(v));
            }
        }

        public static void main(String[] args) {
            launch(args);
        }

}

