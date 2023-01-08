package bridge.demoprogram;

public class Laptop extends Computer {
    public Laptop(OperatingSystem os) {
       super(os);
    }
    @Override
    public void startup() {
        this.os.startup();
    }

    @Override
    public void browseInternet(String url) {
        this.os.loadUrl(url);
        System.out.println("Laptop browsing url: " + url);
    }

    @Override
    public boolean canMoveComputer() {
        return true;
    }
}
