package javaapplication4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

/**
 *
 * @author moham
 */
public class LoginController {
    private Scene scene;
    Stage stage ;

    @FXML
    public Button LoginButton;
    @FXML
    TextField UserName;
    @FXML
    PasswordField Password;
   @FXML
    Label failed;
   @FXML
    Image LoginImage;
   @FXML
    ImageView LoginImageView;
   @FXML
   private Parent root;

   
   public void Login (ActionEvent e) throws IOException{
       String name=UserName.getText();
       String pass = Password.getText();
       if (name.compareTo("user")==0 )
       { if(pass.compareTo("password")==0)
       {
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
       else {failed.setText("Invalid Password !");}
   
       }
       else
       {
         failed.setText("Invalid Username !");
       }
           
}}
