/*3. Написать метод, которому в качестве параметра передаётся целое число, 
Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.*/

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = sc.nextInt();
        sc.close();
        boolean b = (a <= 0);
        System.out.println(b);
    }
}
