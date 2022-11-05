import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        double kmValue = 2.20;
        double minValue = 20;
        double initialValue = 10;
        System.out.print("Please, enter km: ");
        double kmCount = input.nextDouble();
        input.close();
        double initialPrice = kmCount * kmValue;
        double lastPrice = 0;
        if (initialPrice < 20) {
            lastPrice = minValue;
        } else {
            lastPrice = initialPrice;
        }
        System.out.println("Price: " + lastPrice);
    }
}
