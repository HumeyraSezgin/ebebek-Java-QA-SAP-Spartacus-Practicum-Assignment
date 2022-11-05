import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter the amount to be calculated: ");
        double initialAmount = input.nextDouble();
        input.close();
        double VAT_rate = 0;
        if (initialAmount > 0 && initialAmount < 1000)
            VAT_rate = 18;
        else if (initialAmount > 1000) {
            VAT_rate = 8;
        }
        double VATAmount = initialAmount * VAT_rate / 100;
        double finalPrice = initialAmount + VATAmount;
        System.out.print(
                "Initial Price: " + initialAmount + "\nFinal Price: " + finalPrice + "\nVAT Amount: " + VATAmount);
    }
}
