/*1. Написать метод, принимающий на вход два целых числа и проверяющий,
что их сумма лежит в пределах от 10 до 20 (включительно),
если да - вернуть True, в противном случае - false. */

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = sc.nextInt();
        System.out.println("Введите число:");
        int b = sc.nextInt();
        System.out.println("Сумма чисел:");
        sc.close();
        System.out.println(a + b);
        int c = (a + b);
        if (c >= 10 && c <= 20) {
            System.out.println("True");
        } else {
            System.out.println("false");
        }
    }
}