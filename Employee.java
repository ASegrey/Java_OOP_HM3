package home_made_03;
/* 
Создайте класс Employee с полями name, age и salary.
Реализуйте интерфейс Comparable<Employee> для сравнения сотрудников по их возрасту.
Создайте компаратор EmployeeSalaryComparator, который будет сравнивать сотрудников по их зарплате.
Напишите тестовый класс для проверки сортировки массива сотрудников с использованием как Comparable, так и Comparator. 
*/

public class Employee implements Comparable<Employee>{
    private String name;
    private Integer age;
    private Integer salary;
    
    public Employee(String name, Integer age, Integer salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString()
    {
        return "Имя '" + name + "', возраст - "
                                + String.valueOf (age)
                                + ", зарплата - "
                                + String.valueOf (salary);
    }

    @Override
    public int compareTo(Employee o) {
        Employee entry = (Employee) o;
        return this.age - entry.age;
    }
    
}
