import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your height(m): ");
        double height = input.nextDouble();
        System.out.print("Please enter your weight(kg): ");
        double weight = input.nextDouble();
        double BMI = weight / Math.pow(height, 2);
        System.out.print("BMI Value: " + BMI);
    }
}
