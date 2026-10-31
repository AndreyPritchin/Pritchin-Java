package task_2_1;

import java.util.Scanner;

public class NumberСomparator {
    public static void main(String[] args) {
        //Чтение чисел a, b из консоли
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число a:");
        int numberA = scanner.nextInt();
        System.out.println("Введите целое число b:");
        int numberB = scanner.nextInt();

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

        if (numberB == 0) {
            System.out.println("Делитель b = 0. Деление невозможно");
        }
        else {
            System.out.println("Операция деления a / b = " + ((double) numberA / numberB));
        }
    }
}