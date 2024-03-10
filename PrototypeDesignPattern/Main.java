package PrototypeDesignPattern;

public class Main {
  public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
    NetworkConnection networkConnection1 = new NetworkConnection();
    networkConnection1.setIp("192.98.6.5");
    networkConnection1.loadCriticalData();

    System.out.println(networkConnection1);

    // Prototype design pattern impl
    NetworkConnection networkConnection2 = (NetworkConnection) networkConnection1.clone();
    System.out.println(networkConnection2);
  }
}
