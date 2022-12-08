// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package HomeWorks.Seminar1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.printf("Введите число: ");
        Scanner iScanner = new Scanner(System.in);
        int num = iScanner.nextInt();
        int res = (num*(num+1))/2;
        int res2 = fact(num);
        System.out.printf("Треугольное число %d = %d\n", num, res);
        System.out.printf("Факториал числа %d = %d", num, res2);
        iScanner.close();
    }
    static int fact(int n) {
        if (n==1) return 1;
        return n*fact(n-1);
    }
}
