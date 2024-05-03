import java.util.Scanner;

public class Example6 {
    /*
    * Ввести 5 чисел сать их в массив, и изних ввыести максимальное и минимальное
    * */

    public static void main(String[] args) {
        //определяем переменные
        Scanner scanner = new Scanner(System.in);
        int[] ints = new int[5];
        //заполняем массив данными
        System.out.println("Ввести 5 чисел");
        for(int i = 0; i < ints.length; i++) {
            ints[i] = scanner.nextInt();
        }
        //max and min
        int max = ints[0];
        int min = ints[0];
        for (int number : ints) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Минимальное = " + min + " Максимальное = " + max);
    }
}
