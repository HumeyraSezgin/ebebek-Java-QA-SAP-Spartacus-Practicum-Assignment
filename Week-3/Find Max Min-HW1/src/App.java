import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number count: ");
        int count = scanner.nextInt();
        List<Integer> numberList = new ArrayList<Integer>();
        for (int i = 0; i < count; i++) {// enter the list items
            System.out.print("Enter number: ");
            int number = scanner.nextInt();
            numberList.add(number);
        }
        System.out.print("Enter limit number: ");
        int limit = scanner.nextInt();
        Collections.sort(numberList);
        int limitIndex = numberList.indexOf(limit);
        if (limitIndex == 0) {// if limit number is first item in the list, we can not found any number
                              // smaller than
            System.out.println("Nearest number smaller than the entered number: not found");
            System.out.println("Nearest number greater than the entered number: " + numberList.get(limitIndex + 1));
        } else if (limitIndex == numberList.size()) {// if limit number is last item in the list, we can not found any
                                                     // number higher than
            System.out.println("Nearest number smaller than the entered number: " + numberList.get(limitIndex - 1));
            System.out.println("Nearest number greater than the entered number: not found");
        } else {// if limit number is intermediate item in the list, we can find all of them
            System.out.println("Nearest number smaller than the entered number: " + numberList.get(limitIndex - 1));
            System.out.println("Nearest number greater than the entered number: " + numberList.get(limitIndex + 1));
        }
        scanner.close();
    }
}
