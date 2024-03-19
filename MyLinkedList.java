package home_made_03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* 
Итератор и итерируемость (Iterable):
Создайте класс MyLinkedList, который будет представлять собой простую односвязную цепочку.
Реализуйте интерфейс Iterable для этого класса. Это позволит перебирать элементы списка с помощью цикла for-each.
Напишите методы добавления, удаления и получения элементов из списка в классе MyLinkedList.
Создайте тестовый класс для проверки функциональности MyLinkedList, включая использование цикла for-each для перебора элементов списка. */
public class MyLinkedList<T> implements Iterable<T>{
    private List<T> items;  

    public MyLinkedList() {
        this.items = new ArrayList<>();;
    }

    @Override
    public Iterator<T> iterator() {
        return items.iterator();
    }
    /**
     * Возращает весь список
     * @return
     */
    public List<T> getAllItems() {
        return items;
    }
    /**
     * Возращает элемент списка по индексу
     * @param index - индекс в списке 
     * @return
     */
    public T getItem(int index) {
        return items.get(index);
    }    
    /**
     * Добавляем элемент в список
     * @param item - значение элемента
     */
    public void add(T item) {
        items.add(item);
    }
    /**
     * Удалает элемент из списка
     * @param item - элемент для удаления
     */
    public void delToElement(T item) {
        items.remove(item);
        System.out.println("Удалили элемент " + item);
    }
    /**
     * Печать по строчно List
     * 
     */
    public void printList(){
        System.out.println("******Список*******");
        for (T data : this.items) {
            System.out.println(data);
        }
        System.out.println("*******************");
    }

}
