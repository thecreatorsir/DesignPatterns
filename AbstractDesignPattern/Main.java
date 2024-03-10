package AbstractDesignPattern;

public class Main {
  public static void main(String[] args) {
    Employee employee1 = EmployeeFactory.getEmployee(new AndroidDevFactory());
    System.out.println(employee1.salary());
    Employee employee2 = EmployeeFactory.getEmployee(new WebDevFactory());
    System.out.println(employee2.salary());
  }
}
