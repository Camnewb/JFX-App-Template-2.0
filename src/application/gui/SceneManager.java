package application.gui;

import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Manages what displays inside of the windows and stages.
 */
public class SceneManager {

    private Stage stage;
    private Scene mainScene;

    public SceneManager(Stage stage) {
        this.stage = stage;
    }

    public void setScene(Scene scene) {
        mainScene = scene;
        stage.setScene(mainScene);
    }

    public Scene getScene() {
        return mainScene;
    }

    public void displayScene() {
        stage.setScene(mainScene);
    }


}
