package trafficlights.states.lights;

import trafficlights.TrafficContext;
import trafficlights.states.State;

public class YellowLight extends State {
    public YellowLight() { super("Yellow"); }

    @Override
    public void nextState(TrafficContext context) {
        System.out.println("Changing Yellow to Red.");
        context.setState(new RedLight());
    }
}
