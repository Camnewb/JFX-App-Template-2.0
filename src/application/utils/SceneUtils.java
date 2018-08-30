package application.utils;

import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * Utility functions for scene and gui management
 */
@SuppressWarnings({"WeakerAccess", "unused"})
public class SceneUtils {

    public static BorderPane createBorderPane(Node center, Node top, Node left, Node right) {
        BorderPane borderPane = new BorderPane();
        if (center != null) borderPane.setCenter(center);
        if (top != null) borderPane.setTop(top);
        if (left != null) borderPane.setLeft(left);
        if (right != null) borderPane.setRight(right);
        return borderPane;
    }

    public static BorderPane createBorderPane(Node center, Node top) {
        return createBorderPane(center, top, null, null);
    }

    public static BorderPane createBorderPane(Node center) {
        return createBorderPane(center, null);
    }

    public static VBox createVBox(double padding, double spacing, Node ...nodes) {
        VBox vbox = new VBox(nodes);
        vbox.setPadding(new Insets(padding));
        vbox.setSpacing(spacing);
        return vbox;
    }

    public static VBox createVBox(double spacing, Node ...nodes) {
        return createVBox(5.0, spacing, nodes);
    }

    public static VBox createVBox(Node ...nodes) {
        return createVBox(5.0, nodes);
    }

    public static VBox createVBox() {
        return new VBox();
    }

    public static HBox createHBox(double padding, double spacing, Node ...nodes) {
        HBox hbox = new HBox(nodes);
        hbox.setPadding(new Insets(padding));
        hbox.setSpacing(spacing);
        return hbox;
    }

    public static HBox createHBox(double spacing, Node ...nodes) {
        return createHBox(5.0, spacing, nodes);
    }

    public static HBox createHBox(Node ...nodes) {
        return createHBox(5.0, nodes);
    }

}
