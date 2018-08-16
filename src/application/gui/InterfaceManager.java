package application.gui;

import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

/**
 * Manages the windows and the big-picture gui experience
 */
public class InterfaceManager {

    private Stage primaryStage;
    private List<Stage> extraWindows;

    public InterfaceManager(Stage primaryStage) {
        this.primaryStage = primaryStage;
        extraWindows = new ArrayList<>();
    }

    public void openNewWindow(Stage window) {
        extraWindows.add(window);
        window.show();
    }

    public void show() {
        primaryStage.show();
    }

    public void showAll() {
        show();
        extraWindows.forEach(Stage::show);
    }

    public void hideWindows() {
        extraWindows.forEach(Stage::hide);
    }

    public void hideAll() {
        hideWindows();
        primaryStage.hide();
    }

    public void refresh() {
        hideAll();
        showAll();
    }

}
