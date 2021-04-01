package javatraining4;

public class Task6 {
    public static void main(String[] args) {
        int inputDay=3;
        System.out.println(dayWithSuffix(inputDay));
    }

    public static String dayWithSuffix (int dayOfMonth) {
        String result = "Not Valid Day of Month";

        if (dayOfMonth < 1 || dayOfMonth > 31)
            return result;

        else {
            if (dayOfMonth % 10 == 1) {
                result = dayOfMonth + "st";
            }
            if (dayOfMonth % 10 == 2) {
                result = dayOfMonth + "nd";
            }
            if (dayOfMonth % 10 == 3) {
                result = dayOfMonth + "rd";
            }
            if ((dayOfMonth % 10 > 3 && dayOfMonth % 10 < 10) || dayOfMonth % 10 == 0) {
                result = dayOfMonth + "th";
            }
            return result;
        }
    }

}
