import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter radius of the circle: ");
        double radius = input.nextDouble();
        System.out.print("Please, enter center angle of the circle: ");
        double centerAngle = input.nextDouble();
        input.close();
        double PI = 3.14;
        double area = (PI * (Math.pow(radius, 2)) * centerAngle) / 360;
        System.out.print("\nArea: " + area);
    }
}
