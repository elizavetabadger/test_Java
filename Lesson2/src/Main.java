/*Task1
Дано четное число N (>0) и символы c1 и c2.
Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
Ответ: c1c2c1…c2 (всего N символов)
 */

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) {

    }
    static String ex0(int n, char c1, char c2){
            if (n%2 !=0 || n <= 0){
                return "значение n не подходит под условие задачи";
            }
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < n / 2; i++){
                stringBuilder.append(c1);
                stringBuilder.append(c2);
            }
            return
    }
}

/* Task2
Напишите метод, который сжимает строку.
Пример: вход aaaabbbcdd.
Результат: a4b3cd2

Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.
 */
import netscape.javascript.JSObject;

        import java.io.File;
        import java.io.FileWriter;
        import java.io.IOException;
        import java.util.Scanner;
        import java.util.logging.FileHandler;
        import java.util.logging.Level;
        import java.util.logging.Logger;
        import java.util.logging.SimpleFormatter;


