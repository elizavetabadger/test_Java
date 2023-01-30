/*
Task1
Дана json строка { { "фамилия":"Иванов","оценка":"5","предмет":"Математика"},
{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}}
Задача написать метод(ы), который распарсить строку и выдаст ответ вида: Студент Иванов получил 5 по предмету Математика.

Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.
Используйте StringBuilder для подготовки ответа


Task2
Создать метод, который запишет результат работы в файл
Обработайте исключения и запишите ошибки в лог файл


Task3
*Получить исходную json строку из файла, используя FileReader или Scanner

Task4
*Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
 */

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String json = "{[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]}";
        json = json.substring(2, json.length() - 2);
        System.out.println(json);
        String[] students = json.split("},");
        System.out.println(students[0]);
        for (int i = 0; i < students.length; i++) {
            String[] data = students[i].split(",");
            String name = data[0].split(":\"")[1];
            name = name.substring(0, name.length() - 1);
            System.out.println(name);

            String value = data[1].split(":\"")[1];
            value = value.substring(0, value.length() - 1);
            System.out.println(value);

            String subject = data[2].split(":\"")[1];
            subject = subject.substring(0, subject.length() - 1);
            System.out.println(subject);

            StringBuilder result = new StringBuilder();
            result.append("Студент ");
            result.append(name);
            result.append(" получил оценку ");
            result.append(value);
            result.append(" по предмету ");
            result.append(subject);

            System.out.print(result);
        }
    }
}


   /* public static StringBuilder PrintLine(String line) {
        String line1 = line.replace("{", "");
        String line2 = line1.replace("}", "");
        String line3 = line2.replaceAll("\"", "");
        String line4 = line3.replace("[", "");
        String line5 = line4.replace("]", "");
        StringBuilder result = new StringBuilder("");
        String [] arrayData = line5.split(",");
        String [] listStudents = {"Студент ", " получил ", " по предмету "};
        for (int i =0; i < arrayData.length; i++) {
            String[] arrData = arrayData[i].split(":");
            result.append(listStudents[i]);
            result.append(arrData[1]);
        }
        return result;
    }
}

    /*Task2 = new task2();
    Logger logger = Logger.getLogger(task2.class.getName()); //создаем лгер для нашего класса

try {
        FileHandler handler = new FileHandler("log.xml"); //создаем файл, куда будут записываться логи
        logger.addHandler(handler);//берем логи в коде
        XMLFormatter xml = new XMLFormatter(); //создаем форматтер
        handler.setFormatter(xml);//форматируем в xml
        } catch (IOException e) {
        e.getStackTrace();
        } // вся эта конструкция может выкинуть исключение, поэтому оборачиваем это все в конструкцию try-catch

        Вставляем строку, там где нужно получит лог:
        logger.log(Level.INFO, "Получили строку для записи");
        или
        logger.log(Level.INFO, "Ошибка записи");

public void writeToFile(StringBuilder stringBuilder) {
        logger.log(Level.INFO, "Начинаем запись в файл");
        try (FileWriter fileWriter = new FileWriter("AAA.txt", false)) {
        fileWriter.write(stringBuilder.toString());
        } catch (Exception e) {
        logger.log(Level.INFO, "Ошибка записи");;
        }
        logger.log(Level.INFO, "Запись завершена");
        }
*/

