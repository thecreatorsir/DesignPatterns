package AdapterDesignPattern;

public class Iphone13 {

  private AppleCharger appleCharger;

  Iphone13(AppleCharger appleCharger) {
    this.appleCharger = appleCharger;
  }

  public void chargeIphone() {
    appleCharger.chargePhone();
  }
}
