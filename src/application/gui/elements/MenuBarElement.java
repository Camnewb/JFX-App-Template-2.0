package application.gui.elements;

import javafx.event.EventHandler;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.input.KeyCombination;

/**
 * Class that extends MenuBar and provides an easier way to add menus
 */
@SuppressWarnings({"unused", "WeakerAccess", "unchecked"})
public class MenuBarElement extends MenuBar {

    public MenuBarElement() {
    }

    public static Menu createMenu(String title) {
        return new Menu(title);
    }

    public void addMenu(String title) {
        super.getMenus().add(new Menu(title));
    }

    public void addSubMenu(int menuIndex, Menu menu) {
        super.getMenus().get(menuIndex).getItems().add(menu);
    }

    public void addMenuItem(int menuIndex, String title, EventHandler eventHandler, KeyCombination keyCombo, boolean disabled) {
        MenuItem menuItem = new MenuItem(title);
        if (eventHandler != null) {
            menuItem.setOnAction(eventHandler);
        }
        if (keyCombo != null) {
            menuItem.setAccelerator(keyCombo);
        }
        if (disabled) {
            menuItem.setDisable(true);
        }
        super.getMenus().get(menuIndex).getItems().add(menuItem);
    }

    public void addMenuItem(int menuIndex, String title, EventHandler eventHandler, KeyCombination keyCombo) {
        addMenuItem(menuIndex, title, eventHandler, keyCombo, false);
    }

    public void addMenuItem(int menuIndex, String title, boolean disabled) {
        addMenuItem(menuIndex, title, null, null, disabled);
    }

    public void addMenuItem(int menuIndex, String title) {
        addMenuItem(menuIndex, title, null, null, false);
    }

    public void addMenuItem(int menuIndex, String title, KeyCombination keyCombo) {
        addMenuItem(menuIndex, title, null, keyCombo, false);
    }

    public void addSubMenuItem(int menuIndex, int subMenuIndex, String title, EventHandler eventHandler, KeyCombination keyCombo, boolean disabled) {
        MenuItem menuItem = new MenuItem(title);
        menuItem.setOnAction(eventHandler);
        if (keyCombo != null) {
            menuItem.setAccelerator(keyCombo);
        }
        if (disabled) {
            menuItem.setDisable(true);
        }
        ((Menu) super.getMenus().get(menuIndex).getItems().get(subMenuIndex)).getItems().add(menuItem);
    }

    public void addSubMenuItem(int menuIndex, int subMenuIndex, String title, EventHandler eventHandler, KeyCombination keyCombo) {
        addSubMenuItem(menuIndex, subMenuIndex, title, eventHandler, keyCombo, false);
    }

    public void addMenuSeparator(int menuIndex) {
        super.getMenus().get(menuIndex).getItems().add(new SeparatorMenuItem());
    }

    public void addSubMenuSeparator(int menuIndex, int subMenuIndex) {
        ((Menu) super.getMenus().get(menuIndex).getItems().get(subMenuIndex)).getItems().add(new SeparatorMenuItem());
    }
}