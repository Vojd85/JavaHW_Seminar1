// Реализовать простой калькулятор
package HomeWorks.Seminar1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int num1 = iScanner.nextInt();
        System.out.printf("Введите второе число: ");
        int num2 = iScanner.nextInt();
        System.out.printf("Введите операцию (+-*/): ");
        char pref = iScanner.next().charAt(0);
        if (pref == '+') System.out.println(num1+num2);
        else if (pref == '-') System.out.println(num1-num2);
        else if (pref == '*') System.out.println(num1*num2);
        else if (pref == '/') System.out.printf("%.2f",(double)num1/num2);
        else System.out.println("Неверный ввод");
        iScanner.close();
    }
}
