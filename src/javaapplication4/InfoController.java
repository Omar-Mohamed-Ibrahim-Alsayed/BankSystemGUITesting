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
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
/**
 *
 * @author moham
 */
public class InfoController {
    private Scene scene;
    Stage stage ;

    @FXML
    Button LogOut,MainWindow,View;
    @FXML
    TextField Category;
   @FXML
    Label omar;
   @FXML
    ListView list;
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
    public void editView(ActionEvent e) throws IOException
    {
        String arr[]={" Account ID : \n Account Type: \n Account Balance: \n-------------------------------------- "};
      list.getItems().addAll(arr);
    }
    public void editNotification(ActionEvent e) throws IOException
    {
                String arr="";
        for (int i=0;i<Bank.clients.get(0).notifications.size();i++)
        {
                String x=   Bank.clients.get(0).notifications.get(i).src+"\n";
                String y= Bank.clients.get(0).notifications.get(i).time+"\n";
                String z=Bank.clients.get(0).notifications.get(i).content+"\n";
                arr=arr+x+y+z;
        }
        //String arr[]={" Account ID : \n Account Type: \n Account Balance: \n-------------------------------------- "};
      list.getItems().addAll(arr);
    }
}
