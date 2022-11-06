import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fibonacci series size: ");
        int size = scanner.nextInt();
        int n1 = 0, n2 = 1, n3;
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= size; i++) {
            n3 = n1 + n2;
            System.out.print(n1 + " ");
            n1 = n2;
            n2 = n3;
        }
        scanner.close();

    }
}
