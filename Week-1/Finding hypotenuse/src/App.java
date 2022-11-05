import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter the first edge length(m): ");
        double firstEdge = input.nextDouble();
        System.out.print("Please, enter the second edge length(m): ");
        double secondEdge = input.nextDouble();
        System.out.print("Please, enter the third edge length(m): ");
        double thirdEdge = input.nextDouble();
        input.close();
        double perimeter = firstEdge + secondEdge + thirdEdge;
        double halfPerimeter = perimeter / 2;
        double area = Math
                .sqrt(halfPerimeter * (halfPerimeter - firstEdge) * (halfPerimeter - secondEdge)
                        * (halfPerimeter - thirdEdge));
        System.out.println("Perimeter(m): " + perimeter + "\nArea(m2): " + area);
    }
}
