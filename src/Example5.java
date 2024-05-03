public class Example5 {

    /*
     * дан массив перезаполнить его данными перемножив значение на самом себя
     *
     * */

    public static void main(String[] args) {

        int[] numbers = new int[5];
        //как заполнить руками
        numbers[0] = 0;
        numbers[1] = 1;
        numbers[2] = 2;
        numbers[3] = 3;
        numbers[4] = 4;
        // int[] numbers = {0,1,2,3,4};
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

     /*   for (int a : numbers) {
            System.out.println(a);
        }*/

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Before  : " + numbers[i]);
            numbers[i] = numbers[i] * numbers[i];
            System.out.println("After : " + numbers[i]);
        }
    }


}
