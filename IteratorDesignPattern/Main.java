package IteratorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<User> users = new ArrayList<>();
    users.add(new User("shubham"));
    users.add(new User("satyam"));
    users.add(new User("shivam"));
    users.add(new User("abha"));
    users.add(new User("pramod"));

    UserManagement userManagement = new UserManagement();
    userManagement.setUsers(users);

    MyIterator myIterator = userManagement.getIterator();
    while (myIterator.hasNext()) {
      User user = (User) myIterator.next();
      System.out.println(user.getName());
    }
  }
}
