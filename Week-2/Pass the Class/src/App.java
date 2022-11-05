import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int PASS_GRADE = 55;
        int lessonNumber = 5;
        Scanner scanner = new Scanner(System.in);
        int Mathematics, Physics, Turkish, Chemistry, Music;
        System.out.print("Please enter mathematics grade: ");
        Mathematics = scanner.nextInt();
        System.out.print("Please enter physics grade: ");
        Physics = scanner.nextInt();
        System.out.print("Please enter turkish grade: ");
        Turkish = scanner.nextInt();
        System.out.print("Please enter chemistry grade: ");
        Chemistry = scanner.nextInt();
        System.out.print("Please enter music grade: ");
        Music = scanner.nextInt();
        // if grades lower than 100 or higher than 0, they accepted for average.
        int total = 0;
        if (Mathematics < 100 || Mathematics > 0) {
            total += Mathematics;
        } else {
            lessonNumber--;
        }
        if (Physics < 100 || Physics > 0) {
            total += Physics;
        } else {
            lessonNumber--;
        }
        if (Turkish < 100 || Turkish > 0) {
            total += Turkish;
        } else {
            lessonNumber--;
        }
        if (Chemistry < 100 || Chemistry > 0) {
            total += Chemistry;
        } else {
            lessonNumber--;
        }
        if (Music < 100 || Music > 0) {
            total += Music;
        } else {
            lessonNumber--;
        }
        double average = total / lessonNumber;
        if (average > PASS_GRADE) { // if average higher than pass grade(55) user pass.
            System.out.println("Passed the class.");
        } else {
            System.out.println("Failed the class.");
        }
        scanner.close();
    }
}
