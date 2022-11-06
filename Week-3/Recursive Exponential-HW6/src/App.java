import java.util.Scanner;

public class App {
    static int result = 1;//

    static double power(double base, double exponent) {
        if (exponent == 0) {
            return 1;
        } else if (base == 0) {
            return 0;
        } else {
            result *= base;
            power(base, exponent - 1); // call this until exponent == 0
            return result;
        }

    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base number: ");
        double base = scanner.nextDouble();
        System.out.print("Enter exponent number: ");
        double exponent = scanner.nextDouble();
        if (base != 0 || exponent != 0) {
            System.out.println(power(base, exponent));
        } else {
            System.out.println("0's 0. power is invalid."); // 0^0 is invalid operation.
        }
    }
}
