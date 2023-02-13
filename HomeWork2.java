/*2. Написать метод, которому в качестве параметра передаётся целое число, 
метод должен напечатать в консоль положительное ли число передали 
или отрицательное. Ноль считаем положительным числом. */

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = sc.nextInt();
        sc.close();
        if (a >= 0) {
            System.out.println("Число " + a + " положительное");
        } else {
            System.out.println("Число " + a + " отрицательное");
        }
    }
}