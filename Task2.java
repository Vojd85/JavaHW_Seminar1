// Вывести все простые числа от 1 до 1000

package HomeWorks.Seminar1;

public class Task2 {
    public static void main(String[] args) {
        int num = 1000;
        int index = 2;
        while (index < num) {
            for (int i = 2; i <= index; i++) {
                if (i == index) System.out.printf("%d ",index);
                else if (index%i == 0) break;
            }
            index++;
        }
    }
}
