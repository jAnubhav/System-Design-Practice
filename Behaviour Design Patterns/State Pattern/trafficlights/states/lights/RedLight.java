package trafficlights.states.lights;

import trafficlights.TrafficContext;
import trafficlights.states.State;

public class RedLight extends State {
    public RedLight() { super("Red"); }

    @Override
    public void nextState(TrafficContext context) {
        System.out.println("Changing Red to Green.");
        context.setState(new GreenLight());
    }
}
