import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your birth year: ");
        int birthYear = scanner.nextInt();
        int chineseZodiac = birthYear % 12; // calculate result
        if (chineseZodiac == 0) {
            System.out.println("MONKEY");
        } else if (chineseZodiac == 1) {
            System.out.println("ROOSTER");
        } else if (chineseZodiac == 2) {
            System.out.println("DOG");
        } else if (chineseZodiac == 3) {
            System.out.println("PIG");
        } else if (chineseZodiac == 4) {
            System.out.println("RAT");
        } else if (chineseZodiac == 5) {
            System.out.println("OX");
        } else if (chineseZodiac == 6) {
            System.out.println("TIGER");
        } else if (chineseZodiac == 7) {
            System.out.println("RABBIT");
        } else if (chineseZodiac == 8) {
            System.out.println("DRAGON");
        } else if (chineseZodiac == 9) {
            System.out.println("SNAKE");
        } else if (chineseZodiac == 10) {
            System.out.println("HORSE");
        } else if (chineseZodiac == 11) {
            System.out.println("GOAT");
        }

        scanner.close();
    }
}
