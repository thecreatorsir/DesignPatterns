package ProxyDesignPattern;

public class Main {
  public static void main(String[] args) {
    // Creating proxy with real subject injected
    UserData userProxy = new UserProxy();
    // Using the proxy
    System.out.println(userProxy.getName());
  }
}