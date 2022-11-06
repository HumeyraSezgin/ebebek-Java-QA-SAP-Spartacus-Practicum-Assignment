import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Size of fibonacci: ");
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.print(fibonacci(i) + " ");// call fibonacci in a recursive way
        }
    }

    static int fibonacci(int size) {
        if (size == 0)// if size is 0 return 0
            return 0;
        else if (size == 1 || size == 2) // fibonacci starts with 0 1 1 2
            return 1;
        return fibonacci(size - 2) + fibonacci(size - 1);
    }
}
