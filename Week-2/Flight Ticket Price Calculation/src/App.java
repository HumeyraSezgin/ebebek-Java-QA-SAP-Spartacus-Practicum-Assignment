import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double KM_VALUE = 0.1;
        int FIRST_AGE_LIMIT = 12;
        int SECOND_AGE_LIMIT = 24;
        int THIRD_AGE_LIMIT = 65;
        int DISCOUNT_TRAVEL_TYPE = 2;
        double LOWER_THAN_FAL_DISCOUNT_RATE = 0.5; // FAL -> First Age Limit
        double HIGHER_THAN_FAL_LOWER_THAN_SAL_DISCOUNT_RATE = 0.1; // SAL -> Second Age Limit
        double HIGHER_THAN_TAL_DISCOUNT_RATE = 0.3; // TAL -> Third Age Limit
        double TRAVEL_TYPE_2_DISCOUNT_RATE = 0.2;
        System.out.print("Please enter distance(km): ");
        double distance = scanner.nextDouble();
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Please enter your travel type(one direction: 1 or rount trip: 2): ");
        int travelType = scanner.nextInt();
        // km price
        double initialPrice = KM_VALUE * distance;
        double finalPrice = 0;
        double discountValue = 0;
        // if variables are valid
        if (distance > 0 && age > 0 && (travelType == 1 || travelType == 2)) {
            // calculate age discounts
            if (age < FIRST_AGE_LIMIT) {
                discountValue += initialPrice * LOWER_THAN_FAL_DISCOUNT_RATE;
            } else if (age < SECOND_AGE_LIMIT) {
                discountValue += initialPrice * HIGHER_THAN_FAL_LOWER_THAN_SAL_DISCOUNT_RATE;
            } else if (age > THIRD_AGE_LIMIT) {
                discountValue += initialPrice * HIGHER_THAN_TAL_DISCOUNT_RATE;
            }
            double subtotal = initialPrice - discountValue;
            // calculate travel discounts
            if (travelType == DISCOUNT_TRAVEL_TYPE) {
                discountValue = subtotal * TRAVEL_TYPE_2_DISCOUNT_RATE;
                finalPrice = subtotal - discountValue;
                finalPrice *= 2; // round trip
            } else {
                finalPrice = subtotal; // if travel type is one direction final price equals to subtotal.
            }

            System.out.println("Final Price: " + finalPrice);
        } else { // if variables are invalid
            System.out.println("Invalid information type.");
        }

        scanner.close();
    }
}
