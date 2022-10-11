public class App {
    public static void main(String[] args) throws Exception {
        Employee emp1 = new Employee("Hümeyra Sezgin", 10000, 25, 2018);
        Employee emp2 = new Employee("Samed Gür", 10000, 40, 2017);
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
    }
}
