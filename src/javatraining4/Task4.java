package javatraining4;

public class Task4 {
    public static void main(String[] args) {
        weekDay(5);
    }
    public static void weekDay (int day) {
        switch (day) {
            case 0:
                System.out.println("Sunday");

            case 1:
                System.out.println("Monday");

            case 2:
                System.out.println("Tuesday");

            case 3:
                System.out.println("Wednesday");

            case 4:
                System.out.println("Thursday");

            case 5:
                System.out.println("Friday");

            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Not a valid day.");
        }
    }
}
