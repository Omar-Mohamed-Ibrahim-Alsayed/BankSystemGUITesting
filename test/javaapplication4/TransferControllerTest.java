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

class TransferControllerTest {

        @Start
        public void start(Stage stage) throws Exception {
            Parent root = FXMLLoader.load(getClass().getResource("Transfer.fxml"));
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
            Button Buy = robot.lookup("#Transfer").queryAs(Button.class);
            assertNotNull(Buy);
            robot.clickOn("#From");
            robot.write("1");
            robot.clickOn("#To");
            robot.write("2");
            robot.clickOn("#Amount");
            robot.write("1000");
            robot.clickOn("#Transfer");

        }

        @Test
        void failed(FxRobot robot){
            Button Buy = robot.lookup("#Transfer").queryAs(Button.class);
            assertNotNull(Buy);
            robot.clickOn("#From");
            robot.write("1");
            robot.clickOn("#To");
            robot.write("2");
            robot.clickOn("#Amount");
            robot.write("two thousand");
            robot.clickOn("#Transfer");
            robot.lookup("#failed").tryQuery().isPresent();
            Label failed = robot.lookup("#failed").queryAs(Label.class);
            assertNotNull(failed);
        }

    }
