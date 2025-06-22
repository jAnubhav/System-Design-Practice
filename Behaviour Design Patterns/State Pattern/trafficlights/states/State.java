package trafficlights.states;

import trafficlights.TrafficContext;

public abstract class State {
    private String color;

    protected State(String color) { this.color = color; }
    public abstract void nextState(TrafficContext context);

    public String getStateColor() { return this.color; };
}