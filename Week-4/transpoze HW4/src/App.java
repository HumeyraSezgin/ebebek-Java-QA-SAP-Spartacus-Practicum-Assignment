import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Row count : ");
        int row = scanner.nextInt();

        System.out.print("Column count : ");
        int column = scanner.nextInt();

        int[][] matrix = new int[row][column];
        int[][] transpoze = new int[column][row];
        // User input matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("[" + i + "][" + j + "]. item : ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        // Print matrix
        System.out.println("Matrix : ");
        for (int i[] : matrix) {
            for (int j : i) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }
        // transpoze matrix if matrix[i][j], transpoze matrix[j][i]
        System.out.println("\nTranspoze matrix : ");
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                transpoze[i][j] = matrix[j][i];
                System.out.print(transpoze[i][j] + "  ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
