import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String inputStr = scanner.nextLine();
        String reverseNumber = new StringBuffer(inputStr).reverse().toString();
        if (inputStr.equals(reverseNumber)) {
            System.out.println(inputStr + " is a Palindrome");
        } else {
            System.out.println(inputStr + " is not a Palindrome");
        }
    }
}
