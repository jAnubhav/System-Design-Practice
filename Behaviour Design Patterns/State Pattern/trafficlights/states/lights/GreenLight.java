package trafficlights.states.lights;

import trafficlights.TrafficContext;
import trafficlights.states.State;

public class GreenLight extends State {
    public GreenLight() { super("Green"); }

    @Override
    public void nextState(TrafficContext context) {
        System.out.println("Changing Green to Yellow.");
        context.setState(new YellowLight());
    }
}
