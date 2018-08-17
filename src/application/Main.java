package application;

import application.gui.InterfaceManager;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    private Window mainWindow;
    private InterfaceManager interfaceManager;

    @Override
    public void start(Stage primaryStage){
        mainWindow = new Window(primaryStage, "Application");
        interfaceManager = new InterfaceManager(mainWindow);
        Tester tester = new Tester(interfaceManager);
        mainWindow.getSceneManager().setScene(tester.draw());
        interfaceManager.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
