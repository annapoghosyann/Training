package javatraining4;

public class Task2 {
    public static void main(String[] args) {
        int yourAge=18;
       if (isPersonAllowed(yourAge)==true){
           System.out.println("Person is allowed to enter");
       }
       else {
           System.out.println("Person is NOT allowed to enter");
       }
    }

    public static boolean isPersonAllowed (int age){
        boolean answer=false;
        if (age>18){
            answer=true;
        }
        return answer;
    }

}
