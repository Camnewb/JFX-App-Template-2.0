package application;

import application.gui.InterfaceManager;
import application.gui.elements.MenuBarElement;
import application.utils.ElementUtils;
import application.utils.SceneUtils;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * Class for testing parts of this template application
 */
@SuppressWarnings("WeakerAccess")
public class Tester {

    private InterfaceManager interfaceManager;

    public Tester(InterfaceManager interfaceManager) {
        this.interfaceManager = interfaceManager;
    }

    public Scene draw() {

        MenuBarElement menuBar = new MenuBarElement();

        menuBar.addMenu("_File");
        menuBar.addMenuItem(0, "_Exit", event -> interfaceManager.exit(), null);

        menuBar.addMenu("_Edit");

        menuBar.addMenu("_View");

        menuBar.addMenu("_Help");
        
        Button button1 = ElementUtils.createButton("New Window", event ->
                interfaceManager.openNewWindow(new Window(new Stage(StageStyle.UTILITY), "Window"), "Window"));
        Button button2 = ElementUtils.createButton("Refresh", event -> interfaceManager.refresh());

        ColorPicker colorPicker = new ColorPicker();

        StackPane centerPane = new StackPane(SceneUtils.createVBox(button1, button2, colorPicker));

        BorderPane mainPane = SceneUtils.createBorderPane(centerPane, menuBar);

        return new Scene(mainPane, 800, 600);
    }

}
