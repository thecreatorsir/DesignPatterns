package AbstractDesignPattern;

public class EmployeeFactory {
  public static Employee getEmployee(AbstactEmployeeFactory abstactEmployeeFactory) {
    return abstactEmployeeFactory.getEmployee();
  }
}
