package javaapplication4;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(ApplicationExtension.class)

class MainWindowControllerTest {
    @Start
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
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
    @DisplayName("buy trans")
    void b1(FxRobot robot){
        Button LoginButton = robot.lookup("#BuyItem").queryAs(Button.class);
        assertNotNull(LoginButton);
        robot.clickOn("#BuyItem");

    }

    @Test
    @DisplayName("bill trans")
    void b2(FxRobot robot){
        Button LoginButton = robot.lookup("#PayBill").queryAs(Button.class);
        assertNotNull(LoginButton);
        robot.clickOn("#PayBill");

    }

    @Test
    @DisplayName("transfer trans")
    void b3(FxRobot robot){
        Button LoginButton = robot.lookup("#Transfer").queryAs(Button.class);
        assertNotNull(LoginButton);
        robot.clickOn("#Transfer");

    }

    @Test
    @DisplayName("info trans")
    void b4(FxRobot robot){
        Button LoginButton = robot.lookup("#Info").queryAs(Button.class);
        assertNotNull(LoginButton);
        robot.clickOn("#Info");

    }
    }


