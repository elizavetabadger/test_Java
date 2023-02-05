import java.util.*;

/*
Пусть дан список сотрудников: Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, 
Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, 
Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов.

Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
Отсортировать по убыванию популярности.
Для сортировки использовать TreeMap.
 */
public class Task2 {
    public static void main(String[] arg) {
        Map<String, Integer> nameMap = new TreeMap<>();
        String employees = "Иван Иванов " + "Светлана Петрова " + "Кристина Белова " + "Анна Мусина " + "Анна Крутова " +
        "Иван Юрин " + "Петр Лыков " + "Павел Чернов " + "Петр Чернышов " + "Мария Федорова " + "Марина Светлова " +
        "Мария Савина " + "Мария Рыкова " + "Марина Лугова " + "Анна Владимирова " + "Иван Мечников " + "Петр Петин " +
        "Иван Ежов ";
        String[] name = employees.split(" ");
        for (int i = 0; i < name.length; i += 2) {
            if (nameMap.containsKey(name[i])) {
                nameMap.replace(name[i], nameMap.get(name[i]) + 1);
            } else {
                nameMap.put(name[i], 1);
            }
        }
        System.out.println(nameMap);

        Map<String, Integer> sortnameMap = new TreeMap<>();
        int max = 1;
        for (int value : nameMap.values()) {
            if (value > max) {
                max = value;
            }
        }
        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : nameMap.entrySet()) {
                String key = entry.getKey();
                if (nameMap.get(key) == i) {
                    sortnameMap.put(key, nameMap.get(key));
                }
            }
        }
        System.out.println(sortnameMap);
    }
}