package AdapterDesignPattern;

public class Adapter implements AppleCharger {
  private AndroidCharger androidCharger;

  Adapter(AndroidCharger androidCharger) {
    this.androidCharger = androidCharger;
  }

  @Override
  public void chargePhone() {
    androidCharger.chargeAndroid();

  }

}
