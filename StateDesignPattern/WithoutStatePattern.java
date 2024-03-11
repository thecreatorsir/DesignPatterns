package StateDesignPattern;

public class WithoutStatePattern {

  private String state;

  public WithoutStatePattern() {
    System.out.println("WithoutStatePattern");
    state = "Ready";
  }

  public void insertCoin() {
    if (state.equals("Ready")) {
      System.out.println("Coin inserted. Now dispensing...");
      state = "Dispensing";
    } else if (state.equals("Dispensing")) {
      System.out.println("Already dispensing. Please wait...");
    }
  }

  public void dispenseItem() {
    if (state.equals("Dispensing")) {
      System.out.println("Item dispensed. Ready for next transaction.");
      state = "Ready";
    } else if (state.equals("Ready")) {
      System.out.println("No coin inserted.");
    }
  }

}
