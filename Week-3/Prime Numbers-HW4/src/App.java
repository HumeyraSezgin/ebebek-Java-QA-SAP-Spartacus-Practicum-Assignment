public class App {
    public static void main(String[] args) throws Exception {
        int counter;
        for (int i = 1; i < 100; i++) {
            counter = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0)
                    counter++;
            }
            if (counter == 1)// if only divide by 1
                System.out.print(i + " ");
        }
    }
}
