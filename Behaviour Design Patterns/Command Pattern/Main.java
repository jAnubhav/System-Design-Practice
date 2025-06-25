import command.Command;

import command.categories.SetChannelCommand;
import command.categories.SetVolumeCommand;
import command.categories.TurnOffCommand;
import command.categories.TurnOnCommand;

import remote.Remote;
import tv.Television;

public class Main {
    public static void main(String[] args) {
        Television tv = new Television(); Remote remote = new Remote(tv);

        Command onCommand = new TurnOnCommand(), offCommand = new TurnOffCommand();

        remote.performAction(onCommand); System.out.println(tv.getStatus());
        remote.performAction(offCommand); System.out.println(tv.getStatus());

        System.out.println(tv.getVolume()); System.out.println(tv.getChannel());

        Command volumeCommand = new SetVolumeCommand(30);
        Command channelCommand = new SetChannelCommand(20);

        remote.performAction(volumeCommand); System.out.println(tv.getVolume());
        remote.performAction(channelCommand); System.out.println(tv.getChannel());
    }
}