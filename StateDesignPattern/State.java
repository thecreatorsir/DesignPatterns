package StateDesignPattern;

interface State {
  void insertCoin();

  void dispenseItem();
}

class ReadyState implements State {
  private final VendingMachine vendingMachine;

  public ReadyState(VendingMachine vendingMachine) {
    this.vendingMachine = vendingMachine;
  }

  @Override
  public void insertCoin() {
    System.out.println("Coin inserted. Now dispensing...");
    vendingMachine.setState(new DispensingState(vendingMachine));
  }

  @Override
  public void dispenseItem() {
    System.out.println("No coin inserted.");
  }
}

class DispensingState implements State {
  private final VendingMachine vendingMachine;

  public DispensingState(VendingMachine vendingMachine) {
    this.vendingMachine = vendingMachine;
  }

  @Override
  public void insertCoin() {
    System.out.println("Already dispensing. Please wait...");
  }

  @Override
  public void dispenseItem() {
    System.out.println("Item dispensed. Ready for next transaction.");
    vendingMachine.setState(new ReadyState(vendingMachine));
  }
}
