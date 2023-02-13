/* 5. Написать метод, который определяят, является ли год високосным.
Каждый 4 год - високосный, кроме каждого 100-го, при этом каждый 400-ый - високосный. 
 */

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = sc.nextInt();
        sc.close();
        if (year % 100 == 0 && year % 400 == 0) {
            System.out.println("Год високосный");
        } else if (year % 100 == 0) {
            System.out.println("Год не високосный");
        } else if (year % 4 == 0 && year % 100 > 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }
}