import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        double temperature = scanner.nextDouble();
        if (temperature < 5) {
            System.out.print("Suggestion: Ski");
        } else if (temperature < 15) {
            System.out.print("Suggestion: Cinema");
        } else if (temperature < 25) {
            System.out.print("Suggestion: Picnic");
        } else {
            System.out.print("Suggestion: Swimming");
        }

        scanner.close();
    }
}
