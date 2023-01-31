/*
Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
 */

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Task3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(0);

        int sum = 0;
        System.out.println("Все элементы LinkedList " + list);
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            sum += integer;
            System.out.println(sum);
        }
    }
}