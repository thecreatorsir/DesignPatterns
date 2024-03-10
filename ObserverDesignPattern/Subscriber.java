package ObserverDesignPattern;

public class Subscriber implements Observer {
  private String name;

  Subscriber(String name) {
    this.name = name;
  }

  public void getNotified() {
    System.out.println("New Video uploaded " + this.name);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
