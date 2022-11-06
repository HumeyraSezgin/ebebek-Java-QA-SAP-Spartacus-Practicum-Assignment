import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the exponent number: ");
        double exponent = scanner.nextDouble();
        double exponentialNumber = 1;
        for (int i = 0; i < exponent; i++) {
            exponentialNumber *= base;
        }
        System.out.println("Exponential number: " + exponentialNumber);
        scanner.close();
    }
}
