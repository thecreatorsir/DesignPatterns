package CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Component hd = new Leaf("hard drive", 3000);
    Component ram = new Leaf("RAM", 2000);
    Component kb = new Leaf("keyBoard", 500);
    Component mouse = new Leaf("Mouse", 200);
    Component cpu = new Leaf("CPU", 7000);

    List<Component> phList = new ArrayList<>();
    phList.add(mouse);
    phList.add(kb);

    Component ph = new Composite("peripheral", phList);

    List<Component> mbList = new ArrayList<>();
    mbList.add(ram);
    mbList.add(cpu);

    Component mb = new Composite("motherBoard", mbList);

    List<Component> cabinetList = new ArrayList<>();
    cabinetList.add(hd);
    cabinetList.add(mb);

    Component cabinet = new Composite("cabinet", cabinetList);

    List<Component> computerList = new ArrayList<>();
    computerList.add(ph);
    computerList.add(cabinet);

    Component computer = new Composite("Computer", computerList);

    computer.getPrice();

  }
}
