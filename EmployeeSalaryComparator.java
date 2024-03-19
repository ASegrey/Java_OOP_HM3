package home_made_03;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        Integer salary1 = o1.getSalary();
        Integer salary2 = o2.getSalary();
        if (salary1 > salary2) {
            return 1;
        } else if (salary1< salary2) {
            return -1;
        } else {
            return 0;
        }
    }
    
}
