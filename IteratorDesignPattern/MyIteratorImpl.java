package IteratorDesignPattern;

import java.util.List;

public class MyIteratorImpl implements MyIterator {
  private int position = 0;
  private int length = 0;

  List<User> users;

  MyIteratorImpl(List<User> users) {
    length = users.size();
    this.users = users;
  }

  @Override
  public boolean hasNext() {
    if (position < length)
      return true;
    return false;
  }

  @Override
  public Object next() {
    User user = users.get(position);
    position += 1;
    return user;
  }

}
