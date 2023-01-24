public class Employee {
    private String surname;
    private String name;
    private String patronymic;
    private int department;
    private int salary;
    private static int count = 0;
   private int id ;


    public  Employee (String surname, String name, String patronymic, int department, int salary) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        this.id = count++;
    }

    public String getSurname (){
        return surname;
    }
    public String getName() {
        return name;
    }
    public String getPatronymic() {
        return patronymic;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return
                "id:" + id +
                        "; Сотрудник: " + surname + name+ patronymic +
                        "; Зарплата: " + salary +
                        "; Отдел: " + department +
                        ";";

    }


}
