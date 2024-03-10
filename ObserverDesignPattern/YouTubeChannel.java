package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject {
  private List<Observer> subscribers = new ArrayList<>();

  @Override
  public void notifySubscriber() {
    for (Observer observer : this.subscribers) {
      observer.getNotified();
    }
  }

  @Override
  public void subscribe(Observer observer) {
    subscribers.add(observer);

  }

  @Override
  public void unsubscribe(Observer oberver) {
    subscribers.remove(oberver);
  }

}
