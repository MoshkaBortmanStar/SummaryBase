import java.util.Scanner;

public class Example7 {

    /*
    *
    *  1 посчитать сумму чисел до N элемента, который вводится в консоль
    * 5
    * 1 + 2 + 3 ... N
    * */

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите N:");
        int N = scanner.nextInt();
        int result = 0;

        for (int i = 1; i <= N; i++) {
            result += i;
        }

        System.out.println("Сумма от 1 до " + N + " = " + result);
    }
}
