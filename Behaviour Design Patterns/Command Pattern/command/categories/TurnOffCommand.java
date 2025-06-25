package command.categories;

import command.Command;
import tv.Television;

public class TurnOffCommand implements Command {
    @Override public void execute(Television television) {
        television.turnOff();
    }
}
