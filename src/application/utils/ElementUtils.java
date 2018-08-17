package application.utils;

import javafx.event.EventHandler;
import javafx.scene.control.Button;

/**
 * Utility functions for management of smaller gui elements
 */
public class ElementUtils {

    public static Button createButton(String text, EventHandler event) {
        Button button = new Button(text);
        button.setOnAction(event);
        return button;
    }

    public static Button createButton(String text) {
        return createButton(text, null);
    }

}
