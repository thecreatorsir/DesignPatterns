package AbstractDesignPattern;

public class WebDevFactory implements AbstactEmployeeFactory {

  @Override
  public Employee getEmployee() {

    return new WebDev();
  }

}
