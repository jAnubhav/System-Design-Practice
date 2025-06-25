package video.service.concrete;

import video.Video;
import video.service.Service;

public class VideoService implements Service {
    private static VideoService videoService;

    private VideoService() { /* Something */ }

    public static VideoService getService() {
        if (videoService == null) {
            videoService = new VideoService();
        } return videoService;
    }

    @Override public void playVideo(Video video) {
        System.out.println("Playing"); video.play();
    }
}
