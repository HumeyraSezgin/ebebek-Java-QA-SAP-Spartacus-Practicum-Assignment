import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Degree of 4");
        for (int i = 1; i < number; i *= 4) { // 4^n
            System.out.println(i);
        }
        System.out.println("Degree of 5");
        for (int i = 1; i < number; i *= 5) { // 5^n
            System.out.println(i);
        }

        scanner.close();
    }
}
