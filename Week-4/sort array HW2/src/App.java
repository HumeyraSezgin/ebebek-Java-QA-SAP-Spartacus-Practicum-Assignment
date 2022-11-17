import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int count = scanner.nextInt();
            int[] arr = new int[count];
            for (int i = 0; i < count; i++) { // get input from user
                System.out.print("Enter " + (i + 1) + ". number: ");
                arr[i] = scanner.nextInt();
            }
            Arrays.sort(arr); // use default sort method
            for (int item : arr) { // print each item in array
                System.out.print(item + " ");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
