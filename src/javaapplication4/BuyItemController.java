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
public class BuyItemController {
    private Scene scene;
    Stage stage ;
 @FXML
    Label failed;
    @FXML
    Button LogOut,MainWindow,Buy;
    @FXML
    TextField ID;
    @FXML
     TextField StoreName;
    @FXML
            TextField ProductName;
    @FXML
            TextField Price;
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
    public void Buy (ActionEvent e) throws IOException{
        //int id =Integer.parseInt(ID.getText());
        String s =StoreName.getText();
        String d =ProductName.getText();
        //double p=Double.parseDouble(Price.getText());
  
failed.setText("Bought Successfully !");
        
try {
    double p=Double.parseDouble(Price.getText());
    //failed.setText("Done");
    } 
catch (NumberFormatException ex) 

{failed.setText("Price must be a number !");}



try {
    int val = Integer.parseInt(ProductName.getText());
    failed.setText("Product name can't be a number");
    } 
catch (NumberFormatException ex) 

{}
 if(d.compareTo("")==0)
{
  failed.setText("Enter a vaild Product name !");
}

try {
    int val = Integer.parseInt(StoreName.getText());
    failed.setText("Store name can't be a number");
    } 
catch (NumberFormatException ex) 
{}
        if(s.compareTo("")==0)
{
  failed.setText("Enter a vaild Store name !");
}
try {
    int id = Integer.parseInt(ID.getText());
    //failed.setText("Done");
    } 
catch (NumberFormatException ex) 

{failed.setText("Id must be a number !");}


       //Client  c=new Client("Omar","Mohamed","Elsayed",20,false,"Omar","Omar",this);
       // Bank.c.addAcc(1, 10000, "Savings");
       // Bank.c.buy(id, s, d, p);
       // c.addAcc(1, 10000, "Savings");

        
}
    
}
