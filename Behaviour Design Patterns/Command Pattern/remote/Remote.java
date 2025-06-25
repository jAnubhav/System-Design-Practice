package remote;

import command.Command;
import tv.Television;

public class Remote {
    private Television television;

    public Remote(Television television) {
        this.television = television;
    }

    public void performAction(Command command) {
        command.execute(television);
    }
}
