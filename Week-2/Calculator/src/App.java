import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.print("Please, enter second number: ");
        double secondNumber = scanner.nextDouble();
        System.out.println("Operations are\naddition: 1\nsubtraction: 2\nmultiplication: 3\ndivision: 4");
        System.out.print("Please, enter operation number number: ");
        int selectedOperation = scanner.nextInt();
        switch (selectedOperation) {
            case 1:
                System.out.println("Result: " + (firstNumber + secondNumber));
                break;
            case 2:
                System.out.println("Result: " + (firstNumber - secondNumber));
                break;
            case 3:
                System.out.println("Result: " + (firstNumber * secondNumber));
                break;
            case 4:
                System.out.println("Result: " + (firstNumber / secondNumber));
                break;
            default:
                System.out.println("Invalid operation!"); // if selection is not 1 or 2 or 3 or 4
                break;
        }

        scanner.close();

    }
}
