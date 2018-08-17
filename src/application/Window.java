package application;

import application.gui.SceneManager;
import javafx.stage.Stage;

/**
 * Class that combines a stage with its SceneManager
 */
public class Window {

    private Stage stage;
    private SceneManager sceneManager;

    public Window(Stage stage) {
        this.stage = stage;
        sceneManager = new SceneManager(this.stage);
    }

    public Stage getStage() {
        return stage;
    }

    public SceneManager getSceneManager() {
        return sceneManager;
    }
}
