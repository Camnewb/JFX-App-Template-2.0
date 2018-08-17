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
        this.mainWindow = window;
        extraWindows = new HashMap<>();
    }

    public void openNewWindow(Window window, String id) {
        if (extraWindows.containsKey(id)) {
            openNewWindowRecursive(window, id, 1);
        } else {
            extraWindows.put(id, window);
        }
        window.show();
    }

    /**
     * Prevents the creation of windows with the same id by numbering copy windows
     */
    public void openNewWindowRecursive(Window window, String id, int i) {
        if (extraWindows.containsKey(id + " " + i)) {
            openNewWindowRecursive(window, id, ++i);
        } else {
            openNewWindow(window, id + " " + i);
        }
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

    public void exit() {
        hideAll();
        System.exit(1);
    }

}
