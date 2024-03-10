package IteratorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class UserManagement {
  private List<User> users = new ArrayList<>();

  public List<User> getUsers() {
    return users;
  }

  public void setUsers(List<User> users) {
    this.users = users;
  }

  public MyIterator getIterator() {
    return new MyIteratorImpl(users);
  }

}
