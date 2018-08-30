package application.gui;

import application.Window;

import java.util.HashMap;
import java.util.Map;

/**
 * Manages the windows and the big-picture gui experience
 */
@SuppressWarnings("WeakerAccess")
public class InterfaceManager {

    private Window mainWindow;
    private Map<String, Window> extraWindows;

    public InterfaceManager(Window window) {
        window.getStage().setOnCloseRequest(event -> exit());
        this.mainWindow = window;
        extraWindows = new HashMap<>();
    }

    /**
     * Creates a new window with a unique id
     */
    public void openNewWindow(Window window, String id) {
        if (extraWindows.containsKey(id)) {
            openNewWindowRecursive(window, id, 1);
            return;
        } else {
            extraWindows.put(id, window);
        }
        //Ensure that when the window is closed, it is removed from the extraWindows map
        window.getStage().setOnCloseRequest(event -> close(id));
        window.show();
    }

    /**
     * Prevents the creation of windows with the same id by numbering copy id's
     */
    public void openNewWindowRecursive(Window window, String id, int i) {
        if (extraWindows.containsKey(id + " " + i)) {
            openNewWindowRecursive(window, id, ++i);
        } else {
            openNewWindow(window, id + " " + i);
        }
    }

    public Window getMainWindow() {
        return mainWindow;
    }

    public Window getWindow(String id) {
        return extraWindows.get(id);
    }

    public void show() {
        mainWindow.show();
    }

    public void showAll() {
        show();
        extraWindows.values().forEach(Window::show);
    }

    public void hideWindows() {
        extraWindows.values().forEach(Window::hide);
    }

    public void hideAll() {
        hideWindows();
        mainWindow.hide();
    }

    public void refresh() {
        hideAll();
        showAll();
    }

    /**
     * Hides the window and removes it from <code>extraWindows</code>
     * @param id
     */
    public void close(String id) {
        extraWindows.get(id).hide();
        extraWindows.remove(id);
    }

    public void exit() {
        hideAll();
        System.exit(1);
    }

}
