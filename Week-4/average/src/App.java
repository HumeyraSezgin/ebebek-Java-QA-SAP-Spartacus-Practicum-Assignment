public class App {
    public static void main(String[] args) throws Exception {
        int[] numbers = { 1, 2, 3, 4, 5 };
        int sum = 0;
        try {
            for (int i = 1; i < numbers.length; i++) {
                int harmonicItem = 1 / i;
                sum += harmonicItem;
            }
            System.out.println(numbers.length / sum);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

    }
}
