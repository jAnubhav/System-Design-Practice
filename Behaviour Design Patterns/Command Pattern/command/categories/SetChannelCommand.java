package command.categories;

import command.Command;
import tv.Television;

public class SetChannelCommand implements Command {
    private int channel;

    public SetChannelCommand(int channel) { this.channel = channel; }

    @Override public void execute(Television television) {
        television.setChannel(channel);
    }
}
