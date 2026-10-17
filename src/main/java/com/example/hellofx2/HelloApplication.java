package com.example.hellofx2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {

        Group root = new Group();
        Scene scene = new Scene(root, Color.BLACK);

        stage.setTitle("Guillaume hates JavaFx");
        Image icon = new Image("images.jpg");
        stage.getIcons().add(icon);
        //stage.setWidth(420);
        //stage.setHeight(420);
        //stage.setResizable(false);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("You cant escpae unless you press q");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));

        stage.setScene(scene);
        stage.show();


    }
}




//Stage window for app
//Scene add scene to stage, drawing surf
// scene graph, tree data structure hold and arrange nodes, diff comp (buttons , text buttons...)