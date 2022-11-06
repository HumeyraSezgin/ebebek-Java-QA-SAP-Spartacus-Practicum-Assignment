import java.util.Scanner;
import java.util.function.Function;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number(n): ");
        int n = scanner.nextInt();
        System.out.println("Enter number(r): ");
        int r = scanner.nextInt();

        double combination = factorial(n) / (factorial(r) * factorial(n - r));
        System.out.println(combination);
        scanner.close();
    }

    // factorial calculator
    static int factorial(int number) {
        int result = 1;
        for (int i = number; i > 0; i--) {
            result *= i;
        }
        System.out.println(result);
        return result;
    }
}
