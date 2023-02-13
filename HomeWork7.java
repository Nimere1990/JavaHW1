/* 7. Задать пустой целочисленный массив длинной 100.
С помощью цикла заполнить его значениями 1,2,3,4,5 ...100.*/

public class HomeWork7 {
    public static void main(String[] args) {

        int[] array = new int[100];
        int j = 1;
        for (int i = 0; i < array.length; i++, j = j + 1) {
            array[i] = j;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}