package bridge.demoprogram;

public class App {
    public static void main(String[] args) {
        OperatingSystem macOS = new MacOS();
        OperatingSystem windowsOS = new WindowsOS();

        Computer laptop1 = new Laptop(macOS);
        Computer laptop2 = new Laptop(windowsOS);

        Computer pc1 = new PC(macOS);
        Computer pc2 = new PC(windowsOS);

        laptop1.startup();
        laptop1.browseInternet("refactoring.guru");

    }
}
