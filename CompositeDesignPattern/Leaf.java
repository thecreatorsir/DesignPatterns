package CompositeDesignPattern;

public class Leaf implements Component {
  private String name;
  private int price;

  Leaf(String name, int price) {
    this.name = name;
    this.price = price;
  }

  @Override
  public void getPrice() {
    System.out.println(name + " : " + price);

  }

}
