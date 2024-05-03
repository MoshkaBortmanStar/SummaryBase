import java.util.Scanner;

public class Example4 {
    /*
    *  Программа должна принимать два числа и операцию (например, +, -, *, /)
    * */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Input 1-st number");
            int x = scanner.nextInt();
            System.out.println("Input 2-st number");
            int y = scanner.nextInt();
            System.out.println("Input operation");
            var operation = scanner.next().charAt(0);
            if (operation == '=') return;
            switch (operation) {
                case ('+') -> System.out.println("Result = " + (x + y) );
                case ('-') -> System.out.println("Result = " + (x - y) );
                case ('*') -> System.out.println("Result = " + (x * y) );
                case ('/') -> System.out.println("Result = " + (x / y) );
            }
        }
    }


}
