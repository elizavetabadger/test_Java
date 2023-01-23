import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = a-- - --a;
        System.out.println(b);
    }

    static void ex4(){
        /*
        Р’Рѕ С„СЂР°Р·Рµ "Р”РѕР±СЂРѕ РїРѕР¶Р°Р»РѕРІР°С‚СЊ РЅР° РєСѓСЂСЃ РїРѕ Java"
        РїРµСЂРµСЃС‚Р°РІРёС‚СЊ СЃР»РѕРІР° РІ РѕР±СЂР°С‚РЅРѕРј РїРѕСЂСЏРґРєРµ.
         */
        int a = 5;
        String s = "Р”РѕР±СЂРѕ РїРѕР¶Р°Р»РѕРІР°С‚СЊ РЅР° РєСѓСЂСЃ РїРѕ Java";
        String[] arr = s.split(" ");
        String res = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            res += arr[i];
            res += " ";
        }
        System.out.println(res);
    }
    static void ex3(){
        /*
        Р”Р°РЅ РјР°СЃСЃРёРІ nums = [3,2,5,3] Рё С‡РёСЃР»Рѕ val = 3.
Р•СЃР»Рё РІ РјР°СЃСЃРёРІРµ РµСЃС‚СЊ С‡РёСЃР»Р°, СЂР°РІРЅС‹Рµ Р·Р°РґР°РЅРЅРѕРјСѓ,
РЅСѓР¶РЅРѕ РїРµСЂРµРЅРµСЃС‚Рё СЌС‚Рё СЌР»РµРјРµРЅС‚С‹ РІ РєРѕРЅРµС† РјР°СЃСЃРёРІР°.
РўР°РєРёРј РѕР±СЂР°Р·РѕРј, РїРµСЂРІС‹Рµ РЅРµСЃРєРѕР»СЊРєРѕ (РёР»Рё РІСЃРµ)
СЌР»РµРјРµРЅС‚РѕРІ РјР°СЃСЃРёРІР° РґРѕР»Р¶РЅС‹ Р±С‹С‚СЊ РѕС‚Р»РёС‡РЅС‹ РѕС‚ Р·Р°РґР°РЅРЅРѕРіРѕ, Р° РѕСЃС‚Р°Р»СЊРЅС‹Рµ - СЂР°РІРЅС‹ РµРјСѓ.
         */
        int[] arr = new int[]{3,2,5,3};
        int[] res = new int[arr.length];
        int val = 3;
        Arrays.fill(res, val);

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] != val){
                res[j] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(res));

    }
    static void ex2(){
        int[] arr = new int[10];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(2);
        }

        System.out.println(Arrays.toString(arr));
        int res = ex2_1(arr, 1);
        System.out.println("РњР°РєСЃРёРјР°Р»СЊРЅРѕРµ РєРѕР»РёС‡РµСЃС‚РІРѕ РїРѕРґСЂСЏРґ РёРґСѓС‰РёС… 1 СЂР°РІРЅРѕ " + res);
    }
    static int ex2_1(int[] arr, int num) {
        /*
        Р”Р°РЅ РјР°СЃСЃРёРІ РґРІРѕРёС‡РЅС‹С… С‡РёСЃРµР»,
        РЅР°РїСЂРёРјРµСЂ [1,1,0,1,1,1], РІС‹РІРµСЃС‚Рё РјР°РєСЃРёРјР°Р»СЊРЅРѕРµ РєРѕР»РёС‡РµСЃС‚РІРѕ РїРѕРґСЂСЏРґ РёРґСѓС‰РёС… 1
         */
        int maxCount = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num){
                count++;
            } else {
                if (maxCount < count) {
                    maxCount = count;
                }
                count = 0;
            }
        }
        if (maxCount < count) {
            maxCount = count;
        }
        return maxCount;
    }
    static void ex1() {
        /*
Р’ РєРѕРЅСЃРѕР»Рё Р·Р°РїСЂРѕСЃРёС‚СЊ РёРјСЏ РїРѕР»СЊР·РѕРІР°С‚РµР»СЏ. Р’ Р·Р°РІРёСЃРёРјРѕСЃС‚Рё РѕС‚ С‚РµРєСѓС‰РµРіРѕ РІСЂРµРјРµРЅРё,
РІС‹РІРµСЃС‚Рё РїСЂРёРІРµС‚СЃС‚РІРёРµ РІРёРґР°
"Р”РѕР±СЂРѕРµ СѓС‚СЂРѕ, <РРјСЏ>!", РµСЃР»Рё РІСЂРµРјСЏ РѕС‚ 05:00 РґРѕ 11:59
"Р”РѕР±СЂС‹Р№ РґРµРЅСЊ, <РРјСЏ>!", РµСЃР»Рё РІСЂРµРјСЏ РѕС‚ 12:00 РґРѕ 17:59;
"Р”РѕР±СЂС‹Р№ РІРµС‡РµСЂ, <РРјСЏ>!", РµСЃР»Рё РІСЂРµРјСЏ РѕС‚ 18:00 РґРѕ 22:59;
"Р”РѕР±СЂРѕР№ РЅРѕС‡Рё, <РРјСЏ>!", РµСЃР»Рё РІСЂРµРјСЏ РѕС‚ 23:00 РґРѕ 4:59

 */
        System.out.println("РљР°Рє С‚РµР±СЏ Р·РѕРІСѓС‚?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        LocalTime localTime = LocalTime.now();
        int hour = localTime.getHour();
        if (hour >= 5 && hour < 12) {
            System.out.println("Р”РѕР±СЂРѕРµ СѓС‚СЂРѕ, " + name + "!");
        } else if (hour >= 12 && hour < 18) {
            System.out.println("Р”РѕР±СЂС‹Р№ РґРµРЅСЊ, " + name + "!");
        } else if (hour >= 18 && hour < 23) {
            System.out.println("Р”РѕР±СЂС‹Р№ РІРµС‡РµСЂ, " + name + "!");
        } else {
            System.out.println("Р”РѕР±СЂРѕР№ РЅРѕС‡Рё, " + name + "!");
        }
    }
    static void ex0() {
/*
    РќР°РїРёСЃР°С‚СЊ РїСЂРѕРіСЂР°РјРјСѓ, РєРѕС‚РѕСЂР°СЏ Р·Р°РїСЂРѕСЃРёС‚ РїРѕР»СЊР·РѕРІР°С‚РµР»СЏ РІРІРµСЃС‚Рё <РРјСЏ> РІ РєРѕРЅСЃРѕР»Рё.
    РџРѕР»СѓС‡РёС‚ РІРІРµРґРµРЅРЅСѓСЋ СЃС‚СЂРѕРєСѓ Рё РІС‹РІРµРґРµС‚ РІ РєРѕРЅСЃРѕР»СЊ СЃРѕРѕР±С‰РµРЅРёРµ вЂњРџСЂРёРІРµС‚, <РРјСЏ>!вЂќ
 */
        System.out.println("РљР°Рє С‚РµР±СЏ Р·РѕРІСѓС‚?");
        try (Scanner scanner = new Scanner(System.in)) {
            String name = scanner.nextLine();
            System.out.printf("РџСЂРёРІРµС‚, %s", name);
        }
    }
}
