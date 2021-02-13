import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class WindowOneController {
    public AnchorPane window1;

    public void backToHomeOnAction(ActionEvent actionEvent) throws IOException {
       /* Window */ Stage window = (Stage) window1.getScene().getWindow();
       window.setScene
               (new Scene(FXMLLoader.load(this.getClass().
                       getResource("MainForm.fxml"))));
       window.centerOnScreen();
    }
}
