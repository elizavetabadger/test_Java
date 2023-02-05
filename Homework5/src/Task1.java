import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

/*
Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
 */
public class Task1 {
    public static void main(String[] args) {
        HashMap<String, List<String>> phoneBook = new HashMap<>();

        phoneBook.put("Судзуки", List.of("+001-321641", "+001-65487"));
        phoneBook.put("Хару", List.of("+002-654654", "+7002-635469"));
        phoneBook.put("Сайотомэ", List.of("+003-653411", "+003-56416"));
        phoneBook.put("Няко", List.of("+004-564689", "+004-89754"));
        phoneBook.put("Мито", List.of("+005-71549", "+005-789131"));

        for (Map.Entry entry : phoneBook.entrySet()) {
            System.out.println(entry);
        }

        System.out.println(phoneBook);
    }
}

/*
    public static void main(String[] args) {
        HashMap<ArrayList<String>, HashMap<String, String>> phoneBook = new HashMap<>();
        ArrayList<String> numPhone = new ArrayList<>();
        HashMap<String, String> keyValues = new HashMap<>();

        phoneBook.put(addNumPhone(numPhone), addDescription(keyValues));
        System.out.println(phoneBook);
    }

    public static ArrayList<String> addNumPhone(ArrayList<String> number) {
        Scanner isScanner = new Scanner(System.in);
        System.out.println("Введите номер телефона:");
        String phone = isScanner.nextLine();
        number.add(phone);
        return number;
    }

    public static HashMap<String, String> addDescription(HashMap<String, String> keyValue) {
        Scanner isScanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String firstNameValue = isScanner.nextLine();
        System.out.println("Введите фамилию:");
        String secondNameValue = isScanner.nextLine();

        keyValue.put("firstName", firstNameValue);
        keyValue.put("secondName", secondNameValue);

        return keyValue;
    }
}
*/