package DecoratorDesignPattern;

public abstract class HouseDecorator implements House {
  protected House newHouse = null;

  HouseDecorator(House house) {
    newHouse = house;
  }

  // public void thingsHouseHas() {
  // newHouse.thingsHouseHas();
  // }
}
