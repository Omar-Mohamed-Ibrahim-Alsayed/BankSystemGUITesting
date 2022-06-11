package javaapplication4;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
class BuyItemControllerTest {

    @Start
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("BuyItem.fxml"));
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
        Button Buy = robot.lookup("#Buy").queryAs(Button.class);
        assertNotNull(Buy);
        robot.clickOn("#ID");
        robot.write("1");
        robot.clickOn("#StoreName");
        robot.write("store1");
        robot.clickOn("#ProductName");
        robot.write("product1");
        robot.clickOn("#Price");
        robot.write("2000");
        robot.clickOn("#Buy");

    }

    @Test
    void failed(FxRobot robot){
        Button Buy = robot.lookup("#Buy").queryAs(Button.class);
        assertNotNull(Buy);
        robot.clickOn("#ID");
        robot.write("char");
        robot.clickOn("#StoreName");
        robot.write("store1");
        robot.clickOn("#ProductName");
        robot.write("product1");
        robot.clickOn("#Price");
        robot.write("char");
        robot.clickOn("#Buy");
        robot.lookup("#failed").tryQuery().isPresent();
        Label failed = robot.lookup("#failed").queryAs(Label.class);
        assertNotNull(failed);
    }

}