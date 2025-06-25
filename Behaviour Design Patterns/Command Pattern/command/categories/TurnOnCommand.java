package command.categories;

import command.Command;
import tv.Television;

public class TurnOnCommand implements Command {
    @Override public void execute(Television television) {
        television.turnOn();
    }
}
