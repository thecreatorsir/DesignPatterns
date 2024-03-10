package ObserverDesignPattern;

public interface Subject {
  void subscribe(Observer observer);

  void unsubscribe(Observer oberver);

  void notifySubscriber();
}
