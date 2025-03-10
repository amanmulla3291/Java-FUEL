package YouTube;

public class YouTubeV3 extends YouTubeV2{
    @Override
    void display() {
        super.display();
        System.out.println("Version 3: Google Adsense Revenue Started");
    }

    @Override
    void subscribers() {
        super.subscribers();
        System.out.println("Version 3: Creators earned money as subscribers increased.");
    }
    void shorts(){
        System.out.println("Version 3: YouTube introduced 30 sec short videos concept.");
    }

}
