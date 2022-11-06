import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        double total = 0;
        for (double n = 1; n < number + 1; n++) { // harmonic series like 1+1/2+1/3+....+1/n
            total += (1.0 / n);
        }
        System.out.println("total: " + total);
        scanner.close();

    }
}
