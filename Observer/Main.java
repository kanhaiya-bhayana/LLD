public class Main {
    public static void main(String[] args) {
        YouTubeChannel yt = new YouTubeChannel();

        yt.susbcribe(new Subscriber("Chris"));
        yt.susbcribe(new Subscriber("Jef"));
        yt.susbcribe(new Subscriber("Kelly"));

        yt.newVideoUploaded("Coldplay");

    }
}
