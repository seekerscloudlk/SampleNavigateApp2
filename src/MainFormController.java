import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class MainFormController {
    public AnchorPane root;

    public void openWindowOneOnAction(ActionEvent actionEvent) throws IOException {
        /*Window*/ Stage window = (Stage) root.getScene().getWindow();
        window.
                setScene(new Scene(FXMLLoader.load(getClass().
                        getResource("WindowOne.fxml"))));
        window.centerOnScreen();
    }

    public void openWindowTwoOnAction(ActionEvent actionEvent) {
    }
}
