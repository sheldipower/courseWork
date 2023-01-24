import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов ", "Иван ", "Иванович ", 1, 45000);
        employees[1] = new Employee("Пертов ", "Петр ", "Семенович ", 3, 50000);
        employees[2] = new Employee("Семенова ", "Наталья ", "Аркадьевна ", 5, 75000);
        employees[3] = new Employee("Корешков ", "Артем ", "Витальевич ", 1, 25000);
        employees[4] = new Employee("Игнатьева ", "Мария ", "Анатольенва ", 2, 47000);
        employees[5] = new Employee("Мурзин ", "Антон ", "Григорьевич ", 4, 15000);
        employees[6] = new Employee("Срамков ", "Игнат ", "Инакентьевич ", 3, 19000);
        employees[7] = new Employee("Мухаметова ", "Наталия ", "Львовна ", 2, 71000);
        employees[8] = new Employee("Козолова ", "Елена ", "Павловна ", 4, 27000);
        employees[9] = new Employee("Выдров ", "Аркадий ", "Викторович ", 5, 56000);

        System.out.println(Arrays.toString(employees));

    }

    public static int calculateTotalSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee minSalary() {
        Employee result = employees[0];
        int minSalary = result.getSalary();
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < minSalary) {
           minSalary = employee.getSalary();
            result = employee;
            }

        }
 return result;
    }
}

