package FactoryDesignPattern;

public class Main {
  public static void main(String[] args) {
    Employee employee1 = EmployeeFactory.getEmployee("android dev");
    System.out.println(employee1.salary());
    Employee employee2 = EmployeeFactory.getEmployee("web dev");
    System.out.println(employee2.salary());
  }
}
