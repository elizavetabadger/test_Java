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
        String employees = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, " +
                "Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, " +
                "Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов";
        String[] people = employees.split(", ");


        for (int i = 0; i < people.length; i++) //индекс человека
        {
            String[] name = people[i].split(" ");
            if (nameMap.containsKey(name[0]))
            {
                nameMap.replace(name[0], nameMap.get(name[0]) + 1);
            }
            else
            {
                nameMap.put(name[0], 1);
            }
        }
        System.out.println(nameMap);

        Map<Integer, List<String>> sortnameMap = new TreeMap<>((int1, int2) -> Integer.compare(int2, int1));
        System.out.println(nameMap.keySet());

        for (String name : nameMap.keySet()) //итерируемся по элементам списка
        {
            Integer countName = nameMap.get(name);
            if (sortnameMap.containsKey(countName))
            {
                sortnameMap.get(countName).add(name); //вернули лист, дальше работаем с листом
            }
            else {
                List listName = new LinkedList<>();
                listName.add(name);
                sortnameMap.put(countName, listName);
            }
        }
        System.out.println(sortnameMap);
    }
}