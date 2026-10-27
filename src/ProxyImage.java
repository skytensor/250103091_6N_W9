public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;
    private String userRole;

    public ProxyImage(String fileName, String userRole) {
        this.fileName = fileName;
        this.userRole = userRole;
    }

    public void show() {
        if (!userRole.equals("ADMIN")) {
            System.out.println("[ACCESS DENIED] you lack permission to view: " + fileName);
            return;
        }
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }

        realImage.show();
    }
}