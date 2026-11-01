package task_2_3;

public class EvenSearcher {
    public static void main(String[] args) {

        //Объявление массива
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int length = array.length;

        System.out.print("Четные числа в массиве: ");
        //Отбор четных элементов массива
        for (int i = 0; i < length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i]);
                if (i != length - 1) {
                    System.out.print(", ");
                }
            }
        }
    }
}