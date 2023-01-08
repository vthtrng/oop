package bridge.demoprogram;

public class MacOS implements OperatingSystem {
    @Override
    public void startup() {
        System.out.println("MacOS starting up!");
    }

    @Override
    public void loadUrl(String url) {
        System.out.println("MacOS loading url: " + url);
    }
}
