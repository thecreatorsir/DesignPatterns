package DecoratorDesignPattern;

public class HouseWithBed extends HouseDecorator {

  HouseWithBed(House house) {
    super(house);
  }

  public void thingsHouseHas() {
    newHouse.thingsHouseHas();
    System.out.println("has Bed");
  }
}
