public class Example3 {
    /*
     * Напишите программу, которая выводит на экран таблицу умножения от 1 до 10 с использованием
     * 1 x 1 = 1
     * 1 x 2 = 2
     *
     *
     * */

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) { //O - сложность алгоритма обозначает количество итераций
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }

}
