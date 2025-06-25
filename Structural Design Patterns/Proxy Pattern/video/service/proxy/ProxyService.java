package video.service.proxy;

import video.Video;

import video.service.Service;
import video.service.concrete.VideoService;

public class ProxyService implements Service {
    private VideoService videoService;

    public ProxyService() {
        videoService = VideoService.getService();
    }

    @Override public void playVideo(Video video) {
        System.out.println("Checking for Proxy...");
        videoService.playVideo(video);
    }
}
