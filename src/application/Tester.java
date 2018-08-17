package application;

import application.gui.InterfaceManager;
import application.utils.ElementUtils;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Class for testing parts of this template application
 */
public class Tester {

    private InterfaceManager interfaceMngr;

    public Tester(InterfaceManager interfaceManager) {
        this.interfaceMngr = interfaceManager;
    }

    public Scene draw() {

        StackPane mainPane = new StackPane();
        
        Button button = ElementUtils.createButton("New Window", event -> interfaceMngr.openNewWindow(new Window(new Stage())));

        mainPane.getChildren().add(button);
        
        return new Scene(mainPane, 800, 600);
    }

}
