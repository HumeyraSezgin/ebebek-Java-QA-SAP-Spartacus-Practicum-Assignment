public class Employee {
    // CONSTANTS
    int SALARY_SCALE = 1000;
    int WORK_SCALE = 40;
    int EXTRA_WORK_PAYMENT = 30;
    int THIS_YEAR = 2021;
    int FIRST_RAISE_SELECTION_WY = 10;
    int SECOND_RAISE_SELECTION_WY = 20;
    int FIRST_RAISE_PERCENTAGE = 5;
    int SECOND_RAISE_PERCENTAGE = 10;
    int THIRD_RAISE_PERCENTAGE = 15;
    // VARIABLES
    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public int tax(int salary) {
        int tax;
        if (salary > SALARY_SCALE) {
            tax = salary * 3 / 100;
        } else {
            tax = 0;
        }
        return tax;
    }

    public int bonus(int workHours) {
        int extraWorkHours;
        int bonus;
        if (workHours > WORK_SCALE) {
            extraWorkHours = workHours - WORK_SCALE;
            bonus = extraWorkHours * EXTRA_WORK_PAYMENT;
        } else {
            bonus = 0;
        }
        return bonus;
    }

    public int raiseSalary(int hireYear, int salary, int workHours) {
        int netSalary = salary - tax(salary) + bonus(workHours);
        int raiseSalary;
        int workYear = THIS_YEAR - hireYear;
        if (workYear < FIRST_RAISE_SELECTION_WY) {
            raiseSalary = netSalary + (netSalary * FIRST_RAISE_PERCENTAGE / 100);
        } else if (workYear < SECOND_RAISE_SELECTION_WY) {
            raiseSalary = netSalary + (netSalary * SECOND_RAISE_PERCENTAGE / 100);
        } else {
            raiseSalary = netSalary + (netSalary * THIRD_RAISE_PERCENTAGE / 100);
        }
        return raiseSalary;
    }

    @Override
    public String toString() {

        return this.name.toUpperCase() + " isimli çalışanın ;\n" + "Başlangıç Maaşı: " + this.salary + "\n"
                + "Çalışma Saati: " + this.workHours + "\n" + "İşe Başladığı Yıl: " + this.hireYear + "\n"
                + "Vergi Ücreti: " + tax(this.salary) + "\n" + "Bonus Ücreti: " + bonus(this.workHours) + "\n"
                + "Son Maaşı: " + raiseSalary(this.hireYear, this.salary, this.workHours);
    }
}
