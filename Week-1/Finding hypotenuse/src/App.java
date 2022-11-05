import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter the first edge length(m): ");
        double firstEdge = input.nextDouble();
        System.out.print("Please, enter the second edge length(m): ");
        double secondEdge = input.nextDouble();
        input.close();
        double hypotenuseLength = Math.sqrt(Math.pow(firstEdge, 2) + Math.pow(secondEdge, 2));
        double perimeter = firstEdge + secondEdge + hypotenuseLength;
        double area = firstEdge * secondEdge / 2;
        System.out.println(
                "Hypotenuse length(m): " + hypotenuseLength + "\nPerimeter(m): " + perimeter + "\nArea(m2): " + area);
    }
}
