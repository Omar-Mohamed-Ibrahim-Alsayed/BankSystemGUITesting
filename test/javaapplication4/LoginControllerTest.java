package javaapplication4;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(ApplicationExtension.class)

class LoginControllerTest {

      @Start
      public void start(Stage stage) throws Exception {
          Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
          Scene scene = new Scene(root,1600, 800);
          stage.setScene(scene);
          stage.show();
          Image icon = new Image ("icon.png");
          stage.getIcons().add(icon);
          stage.setTitle("Online Banking");
          stage.setMaximized(true);
          stage.toFront();

      }
      @Test
      @DisplayName("text fields values")
      void priTestFxTest(FxRobot robot){
          Button LoginButton = robot.lookup("#LoginButton").queryAs(Button.class);
          assertNotNull(LoginButton);
          TextField x = robot.lookup("#UserName").queryAs(TextField.class);
          PasswordField y = robot.lookup("#Password").queryAs(PasswordField.class);
          robot.clickOn("#UserName");
          robot.write("user");
          robot.clickOn("#Password");
          robot.write("password");
          assertEquals("user", x.getText() );
          assertEquals("password", y.getText() );
          robot.clickOn("#LoginButton");

      }

       @Test
       @DisplayName("wrong fields values")
       void nextTest(FxRobot robot){
           robot.clickOn("#UserName");
           robot.write("ay haga");
           robot.clickOn("#LoginButton");
           robot.clickOn("#Password");
           robot.lookup("#failed").tryQuery().isPresent();
           Label failed = robot.lookup("#failed").queryAs(Label.class);
           assertNotNull(failed);



       }


}