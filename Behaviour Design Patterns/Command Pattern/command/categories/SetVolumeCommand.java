package command.categories;

import command.Command;
import tv.Television;

public class SetVolumeCommand implements Command {
    private int volume;

    public SetVolumeCommand(int volume) { this.volume = volume; }

    @Override public void execute(Television television) {
        television.setVolume(volume);
    }
}
