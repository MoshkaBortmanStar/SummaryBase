import java.util.Scanner;

public class Example1 {
    /*
    * Программа принимает значение из терминала и ввыодит в консоль что ввы ввели "Input : {}"
    * программа завершается когда воодимое строка = exit;
    *
    * */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do  {
            input = scanner.nextLine();
            System.out.println("Input : " + input);
        } while (!input.equals("exit"));

        System.out.println("Finish");
        scanner.close();
    }
}
