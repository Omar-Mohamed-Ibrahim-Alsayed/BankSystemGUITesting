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
public class MainWindowController {
        private Scene scene;
    Stage stage ;
 @FXML
    Label failed;
    @FXML
    Button LogOut,BuyItem,PayBill,Transfer,Info;
    @FXML
    TextField Category;
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
   public void BuyItem (ActionEvent e) throws IOException{
    FXMLLoader loader = new FXMLLoader(getClass().getResource("BuyItem.fxml"));
     root = loader.load();
    BuyItemController c = loader.getController();
  root = FXMLLoader.load(getClass().getResource("BuyItem.fxml"));
  stage = (Stage)((Node)e.getSource()).getScene().getWindow();
  scene = new Scene(root,1600,800);
  stage.setScene(scene);
  stage.show();
  stage.setMaximized(true);
}
   public void Transfer (ActionEvent e) throws IOException{
    FXMLLoader loader = new FXMLLoader(getClass().getResource("Transfer.fxml"));
     root = loader.load();
    TransferController c = loader.getController();
  root = FXMLLoader.load(getClass().getResource("Transfer.fxml"));
  stage = (Stage)((Node)e.getSource()).getScene().getWindow();
  scene = new Scene(root,1600,800);
  stage.setScene(scene);
  stage.show();
  stage.setMaximized(true);
}
   public void PayBill (ActionEvent e) throws IOException{
    FXMLLoader loader = new FXMLLoader(getClass().getResource("PayBill.fxml"));
     root = loader.load();
    PayBillController c = loader.getController();
  root = FXMLLoader.load(getClass().getResource("PayBill.fxml"));
  stage = (Stage)((Node)e.getSource()).getScene().getWindow();
  scene = new Scene(root,1600,800);
  stage.setScene(scene);
  stage.show();
  stage.setMaximized(true);
}
   public void Info (ActionEvent e) throws IOException{
    FXMLLoader loader = new FXMLLoader(getClass().getResource("Info.fxml"));
     root = loader.load();
    InfoController c = loader.getController();
  root = FXMLLoader.load(getClass().getResource("Info.fxml"));
  stage = (Stage)((Node)e.getSource()).getScene().getWindow();
  scene = new Scene(root,1600,800);
  stage.setScene(scene);
  stage.show();
  stage.setMaximized(true);
}
}