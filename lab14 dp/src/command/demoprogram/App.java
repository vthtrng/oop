package command.demoprogram;

public class App {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Switch switcher = new Switch();

        Command command1 = new RestartCommand(computer);
        Command command2 = new ShutDownCommand(computer);

        switcher.executeAndStore(command1);
        switcher.executeAndStore(command2);
    }


}
