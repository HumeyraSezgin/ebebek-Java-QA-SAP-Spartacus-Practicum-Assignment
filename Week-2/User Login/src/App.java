import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        // our default userName='patika'
        // our default password='java123'
        String userName, password;
        System.out.print("Please enter your user name: ");
        userName = scanner.nextLine();
        System.out.print("Please enter your password: ");
        password = scanner.nextLine();
        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Login successful.");
        } else {
            System.out.println("Wrong account information.");
            if (!password.equals("java123")) {
                System.out.println("Do you want to change your password(y or n)?: ");
                boolean changePassword = scanner.nextLine().equals("y");
                if (changePassword) { // if user wants to change the password
                    // user try to change password
                    do {
                        System.out.println("Please enter your new password different from your last password: ");
                        password = scanner.nextLine();
                    } while (password.equals("java123")); // if new password equals to java123 user must enter a new one
                    System.out.println("Password created."); // if new password different from java123 print
                }
            }
        }

        scanner.close();

    }
}
