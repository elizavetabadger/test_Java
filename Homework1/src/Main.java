/*
Task1
Вычислить n-ое треугольного число(сумма чисел от 1 до n)

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int i = iScanner.nextInt();
        System.out.printf("Треугольное число: %d", result(i));
        iScanner.close();
    }
    public static int result(int n) {
        return (n * (n + 1)) / 2;
    }
}

Task2
Вычислить n! (произведение чисел от 1 до n)

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int i = iScanner.nextInt();
        System.out.printf("Произведение чисел от 1 до n: %d", factorial(i));
        iScanner.close();
    }
    public static int factorial(int n) {
        int result = 1;
        if (n == 1 || n == 0) {
            return result;
        }
        result = n * factorial(n-1);
        return result;
    }
}

Task3
Вывести все простые числа от 1 до 1000 (простые числа - это числа которые делятся только на себя и на единицу без остатка. Чтобы найти остаток от деления используйте оператор % , например 10%3 будет равно единице)

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int input = iScanner.nextInt();
        ArrayList<Integer> primes = new ArrayList<>();
        iScanner.close();

        for (int i = 2; i <= input; i++) {
            boolean PrimeNumber = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    PrimeNumber = false;
                    break;
                }
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    PrimeNumber = false;
                    break;
                }
            }

            if (PrimeNumber) {
                primes.add(i);
            }
        }
        System.out.printf("Простые числа от 1 до n: " + primes);
    }
}

Task4
Реализовать простой калькулятор ("введите первое число"... "Введите второе число"... "укажите операцию, которую надо выполнить с этими числами"... "ответ: ...")

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        int num1 = scanNumber();
        System.out.println("Введите оператор: -, +, *, /");
        String operations = scanOperations();
        System.out.println("Введите второе число: ");
        int num2 = scanNumber();
        int result = getResult(operations, num1, num2);
        System.out.printf("%d %s %d = %d", num1, operations, num2, result);

    }
    static int scanNumber() {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        return number;
    }

    static String scanOperations() {
        Scanner scan = new Scanner(System.in);
        String operations = scan.nextLine();
        return operations;

    }

    static int getResult(String opr, int num1, int num2) {
        int result = 0;
        switch (opr) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;

            default:
                System.out.println("Введите оператор: -, +, *, /");
                break;
        }
        return result;

    }
}

Task5*
Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
}