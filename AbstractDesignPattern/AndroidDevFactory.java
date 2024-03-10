package AbstractDesignPattern;

public class AndroidDevFactory implements AbstactEmployeeFactory {

  @Override
  public Employee getEmployee() {
    return new AndroidDev();
  }

}
