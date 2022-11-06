import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int total = 0;
        int counter = 0;
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                total += i; // add number to total
                counter++; // number count +1
                System.out.println(i);

                System.out.println(counter);
            }
        }
        if (total != 0) {// 0 all division result is 0 so counter -1
            System.out.println(total / counter - 1);
        } else {
            System.out.println("0");
        }
        scanner.close();
    }
}
