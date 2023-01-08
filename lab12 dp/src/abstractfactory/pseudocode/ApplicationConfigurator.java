package abstractfactory.pseudocode;

public class ApplicationConfigurator {
    public static void main(String[] args) {
        String configOS = System.getProperty("os.name").toLowerCase();;
        //        String configOS = "Mac";
        GUIFactory factory;
        if (configOS.contains("win")) {
            factory = new WindowsFactory();
        } else {
            factory = new MacFactory();
        }
        Application app = new Application(factory);
        app.createUI();
        app.paint();

    }
}
