package BuilderDesignPattern;

public class Main {
  public static void main(String[] args) {
    User user1 = User.UserBuilder.getUserBuilder().setUserEmail("s.psharma887@gmail.com").setUserId("12")
        .setUserName("SHUBHAM")
        .build();

    System.out.println(user1);

    User user2 = User.UserBuilder.getUserBuilder().setUserEmail("satyam02983@gmail.com").setUserId("13")
        .setUserName("Satyam")
        .build();
    System.out.println(user2);

  }
}
