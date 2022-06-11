/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package javaapplication4;


import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

import javaapplication4.Override;
import javaapplication4.PayBillController;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 *
 * @author Mohamed Hatem
 */
public class JavaApplication4 extends Application {

    @Override
    public void start(Stage stage) throws Exception {
  //FXMLLoader fxmlLoader=new FXMLLoader (JavaFXApplication13.class.getResource ("FXML.fxml"));
//Parent root =fxmlLoader.load ();

        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
          Scene scene = new Scene(root,1600, 800);
        stage.setScene(scene);
//        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        stage.show();
        Image icon = new Image ("icon.png");
        stage.getIcons().add(icon);
        stage.setTitle("Online Banking");
        stage.setMaximized(true);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);

    }
    
}