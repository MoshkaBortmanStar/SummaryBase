import java.util.Scanner;

public class Example2 {

    enum Weekday {
        ПОНЕДЕЛЬНИК(1),
        ВТОРНИК(2),
        СРЕДА(3),
        ЧЕТВЕРГ(4),
        ПЯТНИЦА(5),
        СУББОТА(6),
        ВОСКРЕСЕНЬЕ(7),
        UKNOWN(0);
        
        private int numberOfDay;

        Weekday(int numberOfDay) {
            this.numberOfDay = numberOfDay;
        }
        
        public static Weekday getDay(int input){
            if (1 == input) {
                return Weekday.ПОНЕДЕЛЬНИК;
            } else if (2 == input) {
                return Weekday.ВТОРНИК;
            } else if (3 == input) {
                return Weekday.СРЕДА;
            } else if (4 == input) {
                return Weekday.ЧЕТВЕРГ;
            } else if (5 == input) {
                return Weekday.ПЯТНИЦА;
            } else if (6 == input) {
                return Weekday.СУББОТА;
            } else if (7 == input) {
                return Weekday.ВОСКРЕСЕНЬЕ;
            } else {
                return UKNOWN;
            }
        }
    }

    /*
     * Написать программу, которая принимает номер дня недели (1 - 7), и печатает название дня.
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(Weekday.getDay(input));
      //  switchExample(input);

        
    }
/*
    private static void switchExample(int input) {
        switch (input) {
            case (1):
                return Weekday.ПОНЕДЕЛЬНИК;
                return;
            case (2):
                return Weekday.ВТОРНИК);
                break;
            case (3):
                return Weekday.СРЕДА);
                break;
            case (4):
                return Weekday.ЧЕТВЕРГ);
                break;
            case (5):
                return Weekday.ПЯТНИЦА);
                break;
            case (6):
                return Weekday.СУББОТА);
                break;
            case (7):
                return Weekday.ВОСКРЕСЕНЬЕ);
                break;
            default:
                return "Такого дня нет");
        }
    }*/

}
