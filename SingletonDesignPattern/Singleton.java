package SingletonDesignPattern;

public class Singleton {

  private Singleton() {

  }

  private static volatile Singleton instanceSingleton;

  public static Singleton getInstance() {
    if (instanceSingleton == null) {
      synchronized (Singleton.class) {
        if (instanceSingleton == null) {
          instanceSingleton = new Singleton();
        }
      }
    }
    return instanceSingleton;
  }
}
