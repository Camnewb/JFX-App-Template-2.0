package application.utils;

import javafx.scene.Node;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

/**
 * Utility functions for scene and gui management
 */
public class SceneUtils {

    public static BorderPane createBorderPane(Node center) {
        return new BorderPane(center);
    }

    public static VBox createVBox() {
        return new VBox();
    }

}
