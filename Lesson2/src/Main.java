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

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println(ex0(6, 'a', 'b'));
//        System.out.println(ex1("aaaabbbcddf"));

//        String s = "TEST";
//        int n = 100;
//        String filePath = "/a/sa/a/a/atest.txt";
//        ex2(s, n, filePath);
        System.out.println(readFile("log.txt"));
    }

    static void ex2(String s, int n, String filePath){
        /*
        РќР°РїРёС€РёС‚Рµ РјРµС‚РѕРґ, РєРѕС‚РѕСЂС‹Р№ СЃРѕСЃС‚Р°РІРёС‚ СЃС‚СЂРѕРєСѓ,
        СЃРѕСЃС‚РѕСЏС‰СѓСЋ РёР· 100 РїРѕРІС‚РѕСЂРµРЅРёР№ СЃР»РѕРІР° TEST Рё РјРµС‚РѕРґ,
        РєРѕС‚РѕСЂС‹Р№ Р·Р°РїРёС€РµС‚ СЌС‚Сѓ СЃС‚СЂРѕРєСѓ РІ РїСЂРѕСЃС‚РѕР№ С‚РµРєСЃС‚РѕРІС‹Р№ С„Р°Р№Р», РѕР±СЂР°Р±РѕС‚Р°Р№С‚Рµ РёСЃРєР»СЋС‡РµРЅРёСЏ.
         */

        Logger logger = Logger.getAnonymousLogger();
        logger.log(Level.INFO, "Р’СЃРµ С…РѕСЂРѕС€Рѕ");
        SimpleFormatter formatter = new SimpleFormatter();
        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler("log.txt");
            fileHandler.setFormatter(formatter);
        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.addHandler(fileHandler);

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append(s);
        }
        try (FileWriter fileWriter = new FileWriter(filePath, false)) {
            fileWriter.write(stringBuilder.toString());
        } catch (Exception e){
            logger.log(Level.WARNING, e.getMessage());
            e.printStackTrace();
        }
    }

    static String readFile(String filePath){
        File file = new File("log.txt");
        StringBuilder stringBuilder = new StringBuilder();
        try (Scanner scanner = new Scanner(file)){
            while (scanner.hasNext()){
                stringBuilder.append(scanner.nextLine());
                stringBuilder.append("\n");
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }
    static String ex0(int n, char c1, char c2){
        /*
Р”Р°РЅРѕ С‡РµС‚РЅРѕРµ С‡РёСЃР»Рѕ N (>0) Рё СЃРёРјРІРѕР»С‹ c1 Рё c2.
РќР°РїРёСЃР°С‚СЊ РјРµС‚РѕРґ, РєРѕС‚РѕСЂС‹Р№ РІРµСЂРЅРµС‚ СЃС‚СЂРѕРєСѓ РґР»РёРЅС‹ N,
РєРѕС‚РѕСЂР°СЏ СЃРѕСЃС‚РѕРёС‚ РёР· С‡РµСЂРµРґСѓСЋС‰РёС…СЃСЏ СЃРёРјРІРѕР»РѕРІ c1 Рё c2, РЅР°С‡РёРЅР°СЏ СЃ c1.
РћС‚РІРµС‚: c1c2c1вЂ¦c2 (РІСЃРµРіРѕ N СЃРёРјРІРѕР»РѕРІ)

 */
        if (n%2 != 0 || n <= 0){
            return "Р·РЅР°С‡РµРЅРёРµ n РЅРµ РїРѕРґС…РѕРґРёС‚ РїРѕРґ СѓСЃР»РѕРІРёРµ Р·Р°РґР°С‡Рё";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n / 2; i++) {
            stringBuilder.append(c1);
            stringBuilder.append(c2);
        }

        return stringBuilder.toString();
    }
    static String ex1(String s){
        /*
РќР°РїРёС€РёС‚Рµ РјРµС‚РѕРґ, РєРѕС‚РѕСЂС‹Р№ СЃР¶РёРјР°РµС‚ СЃС‚СЂРѕРєСѓ.
РџСЂРёРјРµСЂ: РІС…РѕРґ aaaabbbcdd.
Р РµР·СѓР»СЊС‚Р°С‚: a4b3cd2

 */
        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i-1)){
                count++;
            } else {
                stringBuilder.append(s.charAt(i-1));
                if (count != 1){
                    stringBuilder.append(count);
                }
                count = 1;
            }
        }

        stringBuilder.append(s.charAt(s.length()-1));
        if (count != 1){
            stringBuilder.append(count);
        }
        return stringBuilder.toString();
    }
}

