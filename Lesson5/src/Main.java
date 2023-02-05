import java.rmi.MarshalledObject;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    Map
}


/*Task1
        Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
        123456 Иванов
        321456 Васильев
        234561 Петрова
        234432 Иванов
        654321 Петрова
        345678 Иванов
        Вывести данные по сотрудникам с фамилией Иванов.

Task2
Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. (Например, add - egg изоморфны)
буква может не меняться, а остаться такой же. (Например, note - code)
Пример 1:
Input: s = "foo", t = "bar"
Output: false
Пример 2:
Input: s = "paper", t = "title"
Output: true


Task3
Написать программу, определяющую правильность расстановки скобок в выражении.
Пример 1: a+(d*3) - истина
Пример 2: [a+(1*3) - ложь
Пример 3: [6+(3*3)] - истина
Пример 4: {a}[+]{(d*3)} - истина
Пример 5: <{a}+{(d*3)}> - истина
Пример 6: {a+]}{(d*3)} - ложь

Task4
Взять набор строк, например,Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись.
Написать метод, который отсортирует эти строки по длине с помощью TreeMap. Строки с одинаковой длиной не должны “потеряться”.

*/
import java.io.FileWriter;
        import java.io.IOException;
        import java.util.*;
        import java.util.logging.FileHandler;
        import java.util.logging.Level;
        import java.util.logging.Logger;
        import java.util.logging.SimpleFormatter;

public class Main {
    public static void main(String[] args) {
//        System.out.println(ex2("<{a}+{(d*3)}>"));
        System.out.println(ex3("РњРѕСЂРѕР· Рё СЃРѕР»РЅС†Рµ РґРµРЅСЊ С‡СѓРґРµСЃРЅС‹Р№ " +
                "Р•С‰Рµ С‚С‹ РґСЂРµРјР»РµС€СЊ РґСЂСѓРі РїСЂРµР»РµСЃС‚РЅС‹Р№ " +
                "РџРѕСЂР° РєСЂР°СЃР°РІРёС†Р° РїСЂРѕСЃРЅРёСЃСЊ."));
    }

    static TreeMap<Integer, List<String>> ex3(String s){
        /*
        Р’Р·СЏС‚СЊ РЅР°Р±РѕСЂ СЃС‚СЂРѕРє, РЅР°РїСЂРёРјРµСЂ,

        РњРѕСЂРѕР· Рё СЃРѕР»РЅС†Рµ РґРµРЅСЊ С‡СѓРґРµСЃРЅС‹Р№
        Р•С‰Рµ С‚С‹ РґСЂРµРјР»РµС€СЊ РґСЂСѓРі РїСЂРµР»РµСЃС‚РЅС‹Р№
        РџРѕСЂР° РєСЂР°СЃР°РІРёС†Р° РїСЂРѕСЃРЅРёСЃСЊ.

        РќР°РїРёСЃР°С‚СЊ РјРµС‚РѕРґ, РєРѕС‚РѕСЂС‹Р№ РѕС‚СЃРѕСЂС‚РёСЂСѓРµС‚ СЌС‚Рё СЃС‚СЂРѕРєРё РїРѕ РґР»РёРЅРµ СЃ РїРѕРјРѕС‰СЊСЋ TreeMap.
        РЎС‚СЂРѕРєРё СЃ РѕРґРёРЅР°РєРѕРІРѕР№ РґР»РёРЅРѕР№ РЅРµ РґРѕР»Р¶РЅС‹ вЂњРїРѕС‚РµСЂСЏС‚СЊСЃСЏвЂќ.
         */
        s = s.replace(".", "");
        String[] words = s.split(" ");
        TreeMap<Integer, List<String>> treeMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o2, o1);
            }
        });
        for (String word: words){
            if (treeMap.containsKey(word.length())){
                List<String> list = treeMap.get(word.length());
                list.add(word);
            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                treeMap.put(word.length(), list);
            }
        }
        return treeMap;
    }
    static boolean ex2(String s){
        /*
        РќР°РїРёСЃР°С‚СЊ РїСЂРѕРіСЂР°РјРјСѓ, РѕРїСЂРµРґРµР»СЏСЋС‰СѓСЋ РїСЂР°РІРёР»СЊРЅРѕСЃС‚СЊ СЂР°СЃСЃС‚Р°РЅРѕРІРєРё СЃРєРѕР±РѕРє РІ РІС‹СЂР°Р¶РµРЅРёРё.
        РџСЂРёРјРµСЂ 1: a+(d*3) - РёСЃС‚РёРЅР°
        РџСЂРёРјРµСЂ 2: [a+(1*3) - Р»РѕР¶СЊ
        РџСЂРёРјРµСЂ 3: [6+(3*3)] - РёСЃС‚РёРЅР°
        РџСЂРёРјРµСЂ 4: {a}[+]{(d*3)} - РёСЃС‚РёРЅР°
        РџСЂРёРјРµСЂ 5: <{a}+{(d*3)}> - РёСЃС‚РёРЅР°
        РџСЂРёРјРµСЂ 6: {a+]}{(d*3)} - Р»РѕР¶СЊ
        */
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('>', '<');
        map.put('}', '{');
        for (int i = 0; i < s.length(); i++) {
            if (map.containsValue(s.charAt(i))){
                stack.push(s.charAt(i));
            }
            if (map.containsKey(s.charAt(i))){
                if (stack.isEmpty() || stack.pop() != map.get(s.charAt(i))){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    static boolean ex1(String s1, String s2){
        /*
        Р”Р°РЅС‹ 2 СЃС‚СЂРѕРєРё, РЅР°РїРёСЃР°С‚СЊ РјРµС‚РѕРґ, РєРѕС‚РѕСЂС‹Р№ РІРµСЂРЅРµС‚ true,
        РµСЃР»Рё СЌС‚Рё СЃС‚СЂРѕРєРё СЏРІР»СЏСЋС‚СЃСЏ РёР·РѕРјРѕСЂС„РЅС‹РјРё Рё false, РµСЃР»Рё РЅРµС‚.
        РЎС‚СЂРѕРєРё РёР·РѕРјРѕСЂС„РЅС‹, РµСЃР»Рё РѕРґРЅСѓ Р±СѓРєРІСѓ РІ РїРµСЂРІРѕРј СЃР»РѕРІРµ РјРѕР¶РЅРѕ Р·Р°РјРµРЅРёС‚СЊ РЅР° РЅРµРєРѕС‚РѕСЂСѓСЋ Р±СѓРєРІСѓ РІРѕ РІС‚РѕСЂРѕРј СЃР»РѕРІРµ, РїСЂРё СЌС‚РѕРј
        РїРѕРІС‚РѕСЂСЏСЋС‰РёРµСЃСЏ Р±СѓРєРІС‹ РѕРґРЅРѕРіРѕ СЃР»РѕРІР° РјРµРЅСЏСЋС‚СЃСЏ РЅР° РѕРґРЅСѓ Рё С‚Сѓ Р¶Рµ Р±СѓРєРІСѓ СЃ СЃРѕС…СЂР°РЅРµРЅРёРµРј РїРѕСЂСЏРґРєР° СЃР»РµРґРѕРІР°РЅРёСЏ.
        (РќР°РїСЂРёРјРµСЂ, add - egg РёР·РѕРјРѕСЂС„РЅС‹)
        Р±СѓРєРІР° РјРѕР¶РµС‚ РЅРµ РјРµРЅСЏС‚СЊСЃСЏ, Р° РѕСЃС‚Р°С‚СЊСЃСЏ С‚Р°РєРѕР№ Р¶Рµ. (РќР°РїСЂРёРјРµСЂ, note - code)
        РџСЂРёРјРµСЂ 1:
        Input: s = "foo", t = "bar"
        Output: false
        РџСЂРёРјРµСЂ 2:
        Input: s = "paper", t = "title"
        Output: true
         */
        if (s1.length() != s2.length()){
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        for (int i = 0; i < c1.length; i++) {
            if (map.containsKey(c1[i])){
                if (c2[i] != map.get(c1[i])){
                    return false;
                }
            } else {
                map.put(c1[i], c2[i]);
            }
        }
        return true;
    }
    static void ex0(){
        /*
        РЎРѕР·РґР°С‚СЊ СЃС‚СЂСѓРєС‚СѓСЂСѓ РґР»СЏ С…СЂР°РЅРµРЅРёСЏ РќРѕРјРµСЂРѕРІ РїР°СЃРїРѕСЂС‚РѕРІ Рё Р¤Р°РјРёР»РёР№ СЃРѕС‚СЂСѓРґРЅРёРєРѕРІ РѕСЂРіР°РЅРёР·Р°С†РёРё.
        123456 РРІР°РЅРѕРІ
        321456 Р’Р°СЃРёР»СЊРµРІ
        234561 РџРµС‚СЂРѕРІР°
        234432 РРІР°РЅРѕРІ
        654321 РџРµС‚СЂРѕРІР°
        345678 РРІР°РЅРѕРІ
        Р’С‹РІРµСЃС‚Рё РґР°РЅРЅС‹Рµ РїРѕ СЃРѕС‚СЂСѓРґРЅРёРєР°Рј СЃ С„Р°РјРёР»РёРµР№ РРІР°РЅРѕРІ.
         */
        Map<Integer, String> map = new HashMap<>();
        map.put(123456, "РРІР°РЅРѕРІ");
        map.put(321456, "Р’Р°СЃРёР»СЊРµРІ");
        map.put(234561, "РџРµС‚СЂРѕРІР°");
        map.put(234432, "РРІР°РЅРѕРІ");
        map.put(654321, "РџРµС‚СЂРѕРІР°");
        map.put(345678, "РРІР°РЅРѕРІ");

        for (Map.Entry entry: map.entrySet()){
            if (entry.getValue().equals("РРІР°РЅРѕРІ")){
                System.out.println(entry);
            }
        }
    }
    static void test() {
        Logger logger = Logger.getAnonymousLogger();
        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler("log.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.addHandler(fileHandler);

        MyQueue myQueue = new MyQueue();
        int a = 0;
        try {
            a = (int)myQueue.dequeue();
        } catch (Exception e){
            logger.warning("Р§С‚Рѕ-С‚Рѕ РїРѕС€Р»Рѕ РЅРµ С‚Р°Рє: " + "");
        }
        System.out.println(a);

        fileHandler.close();
    }
}
