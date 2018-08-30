package application;

import application.gui.SceneManager;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * Class that combines a stage with its SceneManager
 */
@SuppressWarnings("WeakerAccess")
public class Window {

    private Stage stage;
    private String title;
    private SceneManager sceneManager;

    public Window(Stage stage, String title) {
        this.stage = stage;
        this.title = title;
        this.stage.setTitle(this.title);
        sceneManager = new SceneManager(this.stage);
    }

    public Window(Stage stage) {
        this(stage, "");
    }

    public Window(StageStyle stageStyle, String title) {
        this(new Stage(stageStyle), title);
    }

    public Stage getStage() {
        return stage;
    }

    public String getTitle() {
        return title;
    }

    public SceneManager getSceneManager() {
        return sceneManager;
    }

    public void show() {
        stage.show();
    }

    public void hide() {
        stage.hide();
    }
}
