import video.Video;

import video.service.Service;
import video.service.proxy.ProxyService;

public class Main {
    public static void main(String[] args) {
        Video v1 = new Video(10, "A");
        Video v2 = new Video(20, "B");

        Service service = new ProxyService();
        service.playVideo(v1); service.playVideo(v2);
    }
}