public class RealVideo implements Video {
    String title;

    public RealVideo(String title) {
        this.title = title;
        bufferVideo();
    }

    void bufferVideo() {
        System.out.println("--> [DOWNLOADING] Connecting to server & buffering 4K video: " + title);
    }

    public void play() {
        System.out.println("Playing video: " + title);
    }
}