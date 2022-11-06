import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int number;
        int total = 0;
        do {
            System.out.println("Enter a number: ");
            number = scanner.nextInt();
            if (number % 2 == 0 && number % 4 == 0) { // if even number end degree of 4
                total += number;
            }
        } while (number % 2 != 1);// if odd number break
        System.out.println(total);
        scanner.close();
    }
}
