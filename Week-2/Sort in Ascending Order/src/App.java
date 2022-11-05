import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numberList = new ArrayList<Integer>();
        // get input 3 numbers and add in a list
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            numberList.add(number);
        }
        Collections.sort(numberList); // sorting list
        System.out.println(numberList); // print list
        scanner.close();
    }
}
