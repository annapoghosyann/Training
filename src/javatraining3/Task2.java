package javatraining3;

class Task2 {
    public static void main (String[] args) {

        int numbers[] = new int [1000];
        for (int i=0; i<1000; i++)
        {
            numbers[i]=i+1;
        }

        for (int i=0; i<1000; i++)
        {
            System.out.println(numbers[i]);
        }

    }
}