package ProxyDesignPattern;

public class UserProxy implements UserData {
  private UserData realUser = null;

  @Override
  public String getName() {
    // Additional proxy behavior - Logging
    System.out.println("Getting name through proxy");

    // Lazy initialization - Create real user only when needed

    if (realUser == null) {
      realUser = new User();
    }

    return realUser.getName();
  }
}