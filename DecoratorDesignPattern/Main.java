package DecoratorDesignPattern;

public class Main {
  public static void main(String[] args) {
    House houseWithBedandWindow = new HouseWithWindow(new HouseWithBed(new SimpleHouse()));
    houseWithBedandWindow.thingsHouseHas();
  }
}
