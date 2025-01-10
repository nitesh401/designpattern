package AbstractFactory;

public class Main {
    public static void main(String[] args) {
        // Example: Using Light Theme Factory
        GUIFactory lightFactory = new LightThemeFactory();
        Button lightButton = lightFactory.createButton();
        Checkbox lightCheckbox = lightFactory.createCheckbox();
        lightButton.render();
        lightCheckbox.render();

        // Example: Using Dark Theme Factory
        GUIFactory darkFactory = new DarkThemeFactory();
        Button darkButton = darkFactory.createButton();
        Checkbox darkCheckbox = darkFactory.createCheckbox();
        darkButton.render();
        darkCheckbox.render();
    }
}
