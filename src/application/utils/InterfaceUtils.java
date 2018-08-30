package application.utils;

import javafx.scene.control.Alert;
import javafx.stage.Stage;

/**
 * Utility functions that have to do with big-picture stage management
 */
@SuppressWarnings("unused")
public class InterfaceUtils {

    public static Stage createStage() {
        return new Stage();
    }

    public static void createAlert(Alert.AlertType alertType, String text) {
       Alert alert = new Alert(alertType);
       alert.setContentText(text);
       alert.show();
    }

}
