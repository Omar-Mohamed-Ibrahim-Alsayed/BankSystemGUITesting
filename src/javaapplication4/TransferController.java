/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;
import java.io.IOException;
import static java.lang.String.valueOf;
import java.util.ArrayList;
import java.util.InputMismatchException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
/**
 *
 * @author moham
 */
public class TransferController {
    private Scene scene;
    Stage stage ;
 @FXML
    Label failed;
    @FXML
    Button LogOut,MainWindow,Transfer;
    @FXML
    TextField Amount;
     @FXML
    TextField From;
      @FXML
    TextField To;
   @FXML
    Label omar;
   @FXML
   private Parent root;
    public void logout (ActionEvent e) throws IOException{
    FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
     root = loader.load();
    LoginController c = loader.getController();
  root = FXMLLoader.load(getClass().getResource("Login.fxml"));
  stage = (Stage)((Node)e.getSource()).getScene().getWindow();
  scene = new Scene(root,1600,800);
  stage.setScene(scene);
  stage.show();
  stage.setMaximized(true);
}
    public void MainWindow (ActionEvent e) throws IOException{
    FXMLLoader loader = new FXMLLoader(getClass().getResource("MainWindow.fxml"));
     root = loader.load();
    MainWindowController c = loader.getController();
  root = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
  stage = (Stage)((Node)e.getSource()).getScene().getWindow();
  scene = new Scene(root,1600,800);
  stage.setScene(scene);
  stage.show();
  stage.setMaximized(true);
}
    public void Transfer (ActionEvent e) throws IOException{
    int x,y;
    double z;
    failed.setText("Transferred Successfully !");
try {
    z=Double.parseDouble(Amount.getText());
    //failed.setText("Done");
    } 
catch (NumberFormatException ex) 

{failed.setText("Amount must be a number !");}
        try {
    y = Integer.parseInt(To.getText());
    //failed.setText("Done");
    } 
catch (NumberFormatException ex)
{failed.setText("Receiving Account must be a number !");}
    
    try {
    x = Integer.parseInt(From.getText());
    //failed.setText("Done");
    } 
catch (NumberFormatException ex) 

{failed.setText("Sending Account must be a number !");}
    //x=Integer.parseInt(From.getText());
    //y=Integer.parseInt(To.getText());
    //z=Double.parseDouble(Amount.getText());
    // client.transfer(x,y,z);
}
}
