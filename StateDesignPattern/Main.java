package StateDesignPattern;

public class Main {

  public static void main(String[] args) {
    VendingMachine vendingMachine = new VendingMachine();
    vendingMachine.insertCoin();
    vendingMachine.dispenseItem();

    // WithoutStatePattern vendingMachine = new WithoutStatePattern();
    // vendingMachine.insertCoin();
    // vendingMachine.dispenseItem();
  }
}
