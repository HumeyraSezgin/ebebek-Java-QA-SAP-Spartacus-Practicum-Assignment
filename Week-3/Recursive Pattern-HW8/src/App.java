import java.util.Scanner;

public class App {
    // recursive pattern method
    static void pattern(int number, int controlNumber, boolean isInc) {
        if (number > 0 && !isInc) { // if number higher than 0 and not increasing
            System.out.print(number + " ");
            number -= 5;
            pattern(number, controlNumber, isInc);
        } else if ((number <= 0) && !isInc) { // if number not increasing but lower or equal to 0
            System.out.print(number + " ");
            number += 5;
            isInc = true; // now number start increasing
            pattern(number, controlNumber, isInc);
        } else if ((number > 0) && (number < controlNumber) && isInc) { // if number increasing and higher than 0 but
                                                                        // lower
            // than initial value it going to increasing
            System.out.print(number + " ");
            number += 5;
            isInc = true;
            pattern(number, controlNumber, isInc);
        } else if (number == controlNumber && isInc) { // if number equals to initial value pattern was done.
            System.out.print(number);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = scanner.nextInt();
        boolean isIncreasing = false;
        pattern(number, number, isIncreasing);
    }
}
