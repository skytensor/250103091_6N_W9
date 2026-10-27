public class Main {
    public static void main(String[] args) {
        Image photo = new ProxyImage("dog.png", "GUEST");
        Image photo2 = new ProxyImage("dog.png", "ADMIN");

        Video video = new ProxyVideo("cat.mp4");

        SchoolProxyInternet internet = new SchoolProxyInternet();
        SchoolProxyInternet internet2 = new SchoolProxyInternet();

        internet.connectTo("wikipedia.org");
        internet2.connectTo("gaming.com");

//        video.play();
//        video.play();
//        video.play();

//        photo.show();
//        photo2.show();

//        System.out.println("Step 1 done: Proxy created. Still zero disk activity.\n");
//
//        System.out.println("Step 2: Calling show() for the FIRST time:");
//        photo.show();
//
//        System.out.println("\nStep 3: Calling show() for the SECOND time:");
//        photo.show();
    }
}