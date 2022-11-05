import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // constants
        double PEAR_PRICE = 2.14;
        double APPLE_PRICE = 3.67;
        double TOMATO_PRICE = 1.11;
        double BANANA_PRICE = 0.95;
        double AUBERGINE_PRICE = 5.00;

        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter pear kg: ");
        double pearKG = input.nextDouble();
        System.out.print("Please, enter apple kg: ");
        double appleKG = input.nextDouble();
        System.out.print("Please, enter tomato kg: ");
        double tomatoKG = input.nextDouble();
        System.out.print("Please, enter banana kg: ");
        double bananaKG = input.nextDouble();
        System.out.print("Please, enter aubergine kg: ");
        double aubergineKG = input.nextDouble();
        input.close();
        // calculating the total price
        double totalPrice = PEAR_PRICE * pearKG + APPLE_PRICE * appleKG + TOMATO_PRICE * tomatoKG
                + BANANA_PRICE * bananaKG + AUBERGINE_PRICE * aubergineKG;
        System.out.print("Total Price: " + totalPrice + " TL");

    }
}
