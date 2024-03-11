package CompositeDesignPattern;

import java.util.*;

public class Composite implements Component {
  private String name;
  private List<Component> components = new ArrayList<>();

  public Composite(String name, List<Component> components) {
    this.name = name;
    this.components = components;
  }

  @Override
  public void getPrice() {
    System.out.println(name);
    for (Component c : components) {
      c.getPrice();
    }
  }

}
