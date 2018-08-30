package application.utils;

import javafx.event.EventHandler;
import javafx.scene.control.Button;

/**
 * Utility functions for management of smaller gui elements
 */
@SuppressWarnings({"unchecked", "unused"})
public class ElementUtils {

    /**
     * Method for succinct creation of buttons
     * @param width Width of the button
     * @param autoWidth Whether the width of the button will wrap to the text(true), or use the width argument (false)
     * @param event The button's action
     */
    public static Button createButton(String text, double width, boolean autoWidth, EventHandler event) {
        Button button = new Button(text);
        if (!autoWidth) {
            if (text.length() <= 10) {
                button.setPrefWidth(80);
            }
        } else {
            button.setMinWidth(width);
        }
        button.setOnAction(event);
        return button;
    }

    public static Button createButton(String text, EventHandler event) {
        return createButton(text, 80, true, event);
    }

    public static Button createButton(String text) {
        return createButton(text, null);
    }



}
