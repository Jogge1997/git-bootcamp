public class Main {

    public static void main(String[] args) {
        String myUsername = "Jogge1997";
        String myPassword = "Joachimekmann1";

        if(!User.validateUsername(myUsername)) {
            System.out.println("Username doesn't fit the rules. Please check the User class.");
        } else {
            User u = new User(myUsername, User.hashPassword(myPassword));
            System.out.println(u);
        }
    }
}
