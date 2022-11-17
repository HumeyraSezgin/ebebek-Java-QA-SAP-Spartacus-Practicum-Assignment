import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = { 10, 7, 8, 8, 2, 9, 8, 10, 8, 1, 33, 9, 1 };
        Set<Integer> evenNums = new HashSet<Integer>(); // there is a max one of each number
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] % 2 == 0) {
                if (arr[i] == arr[i + 1]) {
                    evenNums.add(arr[i]);
                }
            }
        }
        System.out.println("Repetitive even numbers :");
        System.out.print(evenNums);
    }
}
