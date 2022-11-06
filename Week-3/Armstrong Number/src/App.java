import java.util.Scanner;

import javax.swing.ScrollPaneConstants;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int digitCount = 0;
        int digitValue = 0;
        int digitSum = 0;

        while (number != 0) {
            digitValue = number % 10; // finding digit value
            digitSum += digitValue; // adding digit value to sum
            number /= 10; // push digit
        }
        System.out.println("Digits sum: " + digitSum);
        scanner.close();
    }
}
