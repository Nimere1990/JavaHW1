/*4. Написать метод, которому в качестве аргумента передаётся строка и число,
метод должен отпечатать в консоль указанную строку, указанное количество раз. */

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку:");
        String a = sc.nextLine();
        System.out.println("Введите число:");
        int b = sc.nextInt();
        String repeated = a.repeat(b);
        System.out.println(repeated);
        sc.close();
    }
}