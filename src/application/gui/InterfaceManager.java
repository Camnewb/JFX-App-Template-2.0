package application.gui;

import application.Window;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

/**
 * Manages the windows and the big-picture gui experience
 */
public class InterfaceManager {

    private Window mainWindow;
    private Stage primaryStage;
    private List<Window> extraWindows;

    public InterfaceManager(Window window) {
        this.mainWindow = window;
        this.primaryStage = window.getStage();
        extraWindows = new ArrayList<>();
    }

    public void openNewWindow(Window window) {
        extraWindows.add(window);
        window.getStage().show();
    }

    public void openNewWindow(Stage stage) {
        Window window = new Window(stage);
        extraWindows.add(window);
        window.getStage().show();
    }

    public void show() {
        primaryStage.show();
    }

    public void showAll() {
        show();
        extraWindows.stream().map(Window::getStage).forEach(Stage::show);
    }

    public void hideWindows() {
        extraWindows.stream().map(Window::getStage).forEach(Stage::hide);
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
