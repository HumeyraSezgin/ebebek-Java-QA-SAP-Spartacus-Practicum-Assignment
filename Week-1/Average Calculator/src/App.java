import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int math, physics, turkish, history, music;
        System.out.print("Please, enter your math grade: ");
        math = input.nextInt();
        System.out.print("\nPlease, enter your physics grade: ");
        physics = input.nextInt();
        System.out.print("\nPlease, enter your turkish grade: ");
        turkish = input.nextInt();
        System.out.print("\nPlease, enter your history grade: ");
        history = input.nextInt();
        System.out.print("\nPlease, enter your music grade: ");
        music = input.nextInt();
        input.close();
        int average = (math + physics + turkish + history + music) / 5;
        boolean result = average > 60;
        // if higher than 60 pass the class
        System.out.println(result ? "Pass the class." : "Failed the class.");
    }
}
