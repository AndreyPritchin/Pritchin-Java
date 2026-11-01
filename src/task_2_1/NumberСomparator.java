package task_2_1;

import java.util.Scanner;

public class NumberСomparator {
    public static void main(String[] args) {
        //Чтение чисел a, b из консоли
        Scanner scanner = new Scanner(System.in);

        int numberA = 0;
        int numberB = 0;
        boolean aValidInt = false;
        boolean bValidInt = false;

        //Циклические проверки типа введенных данных
        while (!aValidInt) {
            System.out.println("Введите целое число a:");
            if (scanner.hasNextInt()) {
                numberA = scanner.nextInt();
                aValidInt = true;
            } else {
                System.out.println("Можно вводить только целые числа");
                scanner.next();
            }
        }

        while (!bValidInt) {
            System.out.println("Введите целое число b:");
            if (scanner.hasNextInt()) {
                numberB = scanner.nextInt();
                bValidInt = true;
            } else {
                System.out.println("Можно вводить только целые числа");
                scanner.next();
            }
        }

        //Сравнение чисел a и b
        if (numberA == numberB) {
            System.out.println("a = b");
        } else if (numberA > numberB) {
            System.out.println("a > b");
        } else {
            System.out.println("a < b");
        }

        //Математические операции с числами a и b
        System.out.println("Операция сложения a + b = " + (numberA + numberB));
        System.out.println("Операция вычитания a - b = " + (numberA - numberB));
        System.out.println("Операция умножения a * b = " + (numberA * numberB));

        //Проверка делителя
        if (numberB == 0) {
            System.out.println("Делитель b = 0. Деление невозможно");
        }
        else {
            System.out.println("Операция деления a / b = " + ((double) numberA / numberB));
        }
    }
}