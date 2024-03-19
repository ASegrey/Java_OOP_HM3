package home_made_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {

         MyLinkedList <String> myLinkedList = new MyLinkedList<String>();
        myLinkedList.add("First");          //Добавление элемента
        myLinkedList.add("Second");
        myLinkedList.add("Third");
        myLinkedList.add("Fourth");
        myLinkedList.printList();                   // печать for-each
        myLinkedList.delToElement("Second");   // удаление эемента
        myLinkedList.printList();                   // печать for-each
        System.out.println("Элемент индекса 0 -> " + myLinkedList.getItem(0)); 

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Первый рабочий", 20, 500));
        employees.add(new Employee("Второй рабочий", 19, 1500));
        employees.add(new Employee("Третий рабочий", 25, 800));
        employees.add(new Employee("Четвертый рабочий", 18, 2500));
        employees.sort(null);
        for (Employee element : employees) {
            System.out.println(element.toString());
        }
        
        System.out.println("Сортировка по зарплате");
        Collections.sort(employees,new EmployeeSalaryComparator());

        for (Employee element : employees) {
            System.out.println(element.toString());
        }

    }
}