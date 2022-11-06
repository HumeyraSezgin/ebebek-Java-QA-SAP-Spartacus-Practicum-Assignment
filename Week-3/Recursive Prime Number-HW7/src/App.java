import java.util.Scanner;

public class App {

    static void prime(int number, int i) {
        if (i == number) {// if no number remaining 0, it is a prime number
            System.out.println(number + " is a prime number.");
            return;
        } else if (number % i == 0) {// if i lower than number and remaining is 0, it is not a prime number
            System.out.println(number + " is not a prime number.");
            return;
        }
        prime(number, i + 1);// call until i == number
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz:  ");
        int sayi = scanner.nextInt();
        prime(sayi, 2);
        scanner.close();
    }
}
