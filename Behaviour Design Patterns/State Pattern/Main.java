import trafficlights.TrafficContext;
import trafficlights.states.lights.RedLight;

public class Main {
    public static void main(String[] args) {
        TrafficContext context = new TrafficContext(new RedLight());
        System.out.println(context.getStateColor());
        
        context.changeState();
        System.out.println(context.getStateColor());

        context.changeState();
        System.out.println(context.getStateColor());
    }
}