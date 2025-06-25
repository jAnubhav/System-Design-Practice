package tv;

public class Television {
    private int channel, volume; private String status;

    public Television() { 
        status = "Off"; volume = 25; channel = 100;
    }

    public void turnOn() {
        System.out.println("Turning On"); status = "On";
    }

    public void turnOff() {
        System.out.println("Turning Off"); status = "Off";
    }

    public void setVolume(int volume) { this.volume = volume; }
    public void setChannel(int channel) { this.channel = channel; }

    public int getVolume() { return volume; }
    public int getChannel() { return channel; }
    public String getStatus() { return status; }
}
