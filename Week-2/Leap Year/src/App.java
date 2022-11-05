import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0) {
                System.out.println(year + " is not a Lear Year.");
            } else {
                System.out.println(year + " is a Leap Year.");
            }
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

        scanner.close();
    }
}
