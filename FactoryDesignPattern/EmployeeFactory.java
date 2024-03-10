package FactoryDesignPattern;

public class EmployeeFactory {
  public static Employee getEmployee(String type) {
    if (type.trim().equalsIgnoreCase("Android dev")) {
      return new AndroidDev();
    } else if (type.trim().equalsIgnoreCase("Web dev")) {
      return new WebDev();
    } else
      return null;
  }
}
