package DecoratorDesignPattern;

public class HouseWithWindow extends HouseDecorator {

  HouseWithWindow(House house) {
    super(house);
  }

  public void thingsHouseHas() {
    newHouse.thingsHouseHas();
    System.out.println("has Window");
  }

}
