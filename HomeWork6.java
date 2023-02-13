/* 6. Задать целочисленный массив, состоящий из элементов 0 и 1.
Например [1, 1, 0, 0, 1, 0, 1, 1, 0, 0]
С помощью цикла и условия заменить 0 на 1, 1 на 0.*/

import java.util.Arrays;

public class HomeWork6 {
    public static void main(String[] args) {
        int[] newArray = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        System.out.println("Исходный массив: " + Arrays.toString(newArray));
        System.out.print("Измененный массив: [ ");
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] == 1) {
                newArray[i] = 0;
            } else
                newArray[i] = 1;
            System.out.print(newArray[i] + " ");
        }
        System.out.print("]");
    }

}