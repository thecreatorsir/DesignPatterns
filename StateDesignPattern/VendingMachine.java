package StateDesignPattern;

public class VendingMachine {
  private State state;

  public VendingMachine() {
    state = new ReadyState(this);
  }

  public void setState(State state) {
    this.state = state;
  }

  public void insertCoin() {
    state.insertCoin();
  }

  public void dispenseItem() {
    state.dispenseItem();
  }
}
