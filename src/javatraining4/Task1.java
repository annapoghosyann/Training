package javatraining4;

public class Task1 {
    public static void main(String[] args) {

        int yourAge=ageInDays(20);
        System.out.println(yourAge);
    }

    public static int ageInDays(int age) {
        age=10;
        int days=age*365;
        return days;
    }
}