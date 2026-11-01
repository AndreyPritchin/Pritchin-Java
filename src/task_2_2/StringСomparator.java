package task_2_2;

import java.util.Scanner;

public class StringСomparator {
    public static void main(String[] args) {
        //Чтение строк a, b из консоли
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку a:");
        String stringA = scanner.nextLine();
        System.out.println("Введите строку b:");
        String stringB = scanner.nextLine();

        //Сравнение строк a и b
        if (stringA.equals(stringB)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }
}