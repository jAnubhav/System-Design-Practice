package video;

public class Video {
    private int length; private String name;

    public Video(int length, String name) {
        this.length = length; this.name = name;
    }

    public String getName() { return name; }
    public int getLength() { return length; }

    public void play() {
        System.out.println("Playing " + name);
    }
}
