/* 8. Задать массив [1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1] пройти по нему циклом
и числа меньше 6 умножить на 2. */

import java.util.Arrays;

public class HomeWork8 {
    public static void main(String[] args) {
        int[] newArray = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println("Исходный массив: " + Arrays.toString(newArray));
        System.out.print("Измененный массив: [ ");
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] > 6) {
                newArray[i] *= 2;
            } else
                ;
            System.out.print(newArray[i] + " ");
        }
        System.out.print("]");
    }

}