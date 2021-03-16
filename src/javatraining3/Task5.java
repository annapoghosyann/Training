package javatraining3;

class Task5 {
    public static void main(String[] args) {

        double between[] = {35.6, 47.2, 1.7, 5.5, 687.2, 1000.1, 467.22, 467.23, 24.121, 30.33};
        for (int i=0; i<10; i++) {
            if ((between[i]>24.12)&&(between[i]<467.23))
                System.out.println(between[i]);

        }

    }
}