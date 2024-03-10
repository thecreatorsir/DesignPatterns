package ObserverDesignPattern;

public class Main {
  public static void main(String[] args) {
    Subject youtubeChannel = new YouTubeChannel();
    youtubeChannel.subscribe(new Subscriber("shubham"));
    youtubeChannel.subscribe(new Subscriber("ravi"));
    Observer Subscriber = new Subscriber("satyam");
    youtubeChannel.subscribe(Subscriber);
    youtubeChannel.notifySubscriber();
    youtubeChannel.unsubscribe(Subscriber);
    youtubeChannel.notifySubscriber();
  }
}
