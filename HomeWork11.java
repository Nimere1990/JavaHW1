
/*11. Задать одномерный массив и найти в нём минимальный и максимальный элементы*/
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длинну массива: ");
        int a = sc.nextInt();
        sc.close();
        Random r = new Random();

        int[] array = new int[a];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(-100, 100);
        }

        System.out.println(Arrays.toString(array));

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        System.out.println("Минимальное значение: " + min);

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }

        System.out.println("Максимальное значение: " + max);
    }
}
