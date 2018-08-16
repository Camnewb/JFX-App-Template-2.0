package application;

import application.gui.InterfaceManager;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    public InterfaceManager interfaceManager;

    @Override
    public void start(Stage primaryStage){

        this.interfaceManager = new InterfaceManager(primaryStage);
        interfaceManager.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
