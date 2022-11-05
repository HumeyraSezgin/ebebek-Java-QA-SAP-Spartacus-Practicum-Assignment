import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the month you were born:");
        int month = scanner.nextInt();
        System.out.print("Please enter the day you were born:");
        int day = scanner.nextInt();

        if ((month == 1) && (day <= 31)) {
            if (day > 22) {
                System.out.println("Aquarius");
            } else {
                System.out.println("Capricorn");
            }
        }

        if ((month == 2) && (day <= 29)) {
            if (day > 20) {
                System.out.println("Pisces");
            } else {
                System.out.println("Aquarius");
            }
        }

        if ((month == 3) && (day <= 31)) {
            if (day > 20) {
                System.out.println("Aries");
            } else {
                System.out.println("Pisces");
            }
        }

        if ((month == 4) && (day <= 30)) {
            if (day > 20) {
                System.out.println("Taurus");
            } else {
                System.out.println("Aries");
            }
        }

        if ((month == 5) && (day <= 31)) {
            if (day > 21) {
                System.out.println("Gemini");
            } else {
                System.out.println("Taurus");
            }
        }

        if ((month == 6) && (day <= 30)) {
            if (day > 22) {
                System.out.println("Cancer");
            } else {
                System.out.println("Gemini");
            }
        }

        if ((month == 7) && (day <= 31)) {
            if (day > 22) {
                System.out.println("Leo");
            } else {
                System.out.println("Cancer");
            }
        }

        if ((month == 8) && (day <= 31)) {
            if (day > 22) {
                System.out.println("Virgo");
            } else {
                System.out.println("Leo");
            }
        }

        if ((month == 9) && (day <= 30)) {
            if (day > 22) {
                System.out.println("Libra");
            } else {
                System.out.println("Virgo");
            }
        }

        if ((month == 10) && (day <= 31)) {
            if (day > 22) {
                System.out.println("Scorpio");
            } else {
                System.out.println("Libra");
            }
        }

        if ((month == 11) && (day <= 30)) {
            if (day > 21) {
                System.out.println("Sagittarius");
            } else {
                System.out.println("Scorpio");
            }
        }

        if ((month == 12) && (day <= 31)) {
            if (day > 21) {
                System.out.println("Capricorn");
            } else {
                System.out.println("Sagittarius");
            }
        }
        scanner.close();
    }
}
