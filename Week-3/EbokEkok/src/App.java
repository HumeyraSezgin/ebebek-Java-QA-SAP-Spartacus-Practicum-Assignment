import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n1, n2;
        System.out.print("Enter a positive number(n1) : ");
        n1 = scanner.nextInt();
        System.out.print("Enter a postive number(n2) : ");
        n2 = scanner.nextInt();
        int ekok = 0;
        int ebob = 0;
        if (n1 > 0 && n2 > 0) {
            int maxValue = n1 * n2;
            while (maxValue != 0) {
                if (maxValue % n1 == 0 && maxValue % n2 == 0) {
                    ekok = maxValue;
                }
                maxValue--;
            }
            ebob = (n1 * n2) / ekok; // EKOK = (n1*n2) / EBOB
            System.out.println("EBOB: " + ebob + " EKOK: " + ekok);
        }
        scanner.close();

    }
}
