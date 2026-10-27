public class ProxyVideo implements Video {
    private RealVideo realVideo;
    private String title;
    private int viewCount = 0;

    public ProxyVideo(String title) {
        this.title = title;
    }

    public void play() {
        viewCount++;
        System.out.println("--> [AUDIT] Video has been played " + viewCount + " time(s).");

        if (realVideo == null) {
            realVideo = new RealVideo(title);
        }

        realVideo.play();
    }
}