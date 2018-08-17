package application.gui.exceptions;

import javafx.scene.Scene;

public class SceneUninitializedException extends Exception {

    private String message = "";
    private Exception exception = null;

    public SceneUninitializedException(Exception e) {
        this.exception = e;
    }

    public SceneUninitializedException(String e) {
        this.message = e;
    }

    @Override
    public String getMessage() {
        if (this.exception != null) {
            return this.exception.getMessage();
        }
        return this.message;
    }

    public Exception getException() {
        return exception;
    }
}
