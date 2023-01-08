package command.demoprogram;

import java.util.LinkedList;
import java.util.List;

public class Switch {
    private List<Command> historyCommand;
    public Switch() {
        historyCommand = new LinkedList<>();
    }
    public void store(Command command) {
        historyCommand.add(command);
    }

    public void execute(Command command) {
        command.execute();
    }

    public void executeAndStore(Command command) {
        execute(command);
        store(command);
    }

    public void executeAllCommand() {
        for (Command command : historyCommand) {
            execute(command);
        }
    }
}
