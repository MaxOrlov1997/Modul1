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
        System.out.println(compareArray(array));
    }

    public static int compareArray(int[] comArray) {
        int compare = 1;
        Arrays.copyOf(comArray, comArray.length);
        Arrays.sort(comArray);
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