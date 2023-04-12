package ua.orlov.module1;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/*Найти количество различных элементов массива. Пример: для 1 4 5 1 1 3 ответ 4.
 * *Создать метод, который принимает массив и возвращает количество  различных  элементов.*/
public class task1 {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(0, 10);
        }
        System.out.println(Arrays.toString(array));
        int[] sorted = arrayCopy(array);
        sort(sorted);
        System.out.println(Arrays.toString(sorted));
        int compare = 1;
        System.out.println(compareArray(sorted, compare));

    }

    public static int[] arrayCopy(int[] intilianArray) {
        return Arrays.copyOf(intilianArray, intilianArray.length);
    }

    public static void sort(int[] array) {
        boolean isChanget;
        int changeAmount = 0;
        do {
            isChanget = false;
            for (int i = 0; i < array.length - 1 - changeAmount; i++) {
                if (array[i] > array[i + 1]) {
                    int rev = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = rev;
                    isChanget = true;
                }
            }
            changeAmount++;
        }
        while (isChanget);
    }


    public static int compareArray(int[] comArray, int compare) {

        for (int i = 0; i < comArray.length - 1; i++) {
            if (comArray[i] == comArray[i + 1]) {
                continue;
            } else {
                ++compare;
            }
        }

        return compare;
    }

}