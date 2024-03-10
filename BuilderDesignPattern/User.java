package BuilderDesignPattern;

class User {
  private final String userId;
  private final String userName;
  private final String userEmail;

  private User(UserBuilder userBuilder) {
    this.userEmail = userBuilder.userEmail;
    this.userId = userBuilder.userId;
    this.userName = userBuilder.userName;
  }

  @Override
  public String toString() {
    String obj = this.userEmail + " " + this.userId + " " + this.userName;
    return obj;
  }

  public String getUserId() {
    return userId;
  }

  public String getUserName() {
    return userName;
  }

  public String getUserEmail() {
    return userEmail;
  }

  static class UserBuilder {
    private String userId;
    private String userName;
    private String userEmail;

    private UserBuilder() {

    }

    public static UserBuilder getUserBuilder() {
      return new UserBuilder();
    }

    public UserBuilder setUserId(String userId) {
      this.userId = userId;
      return this;
    }

    public UserBuilder setUserName(String userName) {
      this.userName = userName;
      return this;
    }

    public UserBuilder setUserEmail(String userEmail) {
      this.userEmail = userEmail;
      return this;
    }

    public User build() {
      return new User(this);
    }
  }

}