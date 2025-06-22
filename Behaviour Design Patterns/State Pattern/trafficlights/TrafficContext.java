package trafficlights;

import trafficlights.states.State;

public class TrafficContext {
    private State curState;

    public TrafficContext(State newState) { this.curState = newState; }

    public void setState(State nextState) { this.curState = nextState; }
    public String getStateColor() { return curState.getStateColor(); }

    public void changeState() { curState.nextState(this); }
}
