package menuBar;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.io.IOException;
public class MenuBarControl {
    public void close(){
        Platform.exit();
        System.exit(0);
    }
}

