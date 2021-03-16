package javatraining3;

class Task6 {
    public static void main(String[] args) {

        int evens[] = {14, 47, 40, 100, 5, 3, 16, 20, 31, 2};
        int count=0;
        for (int i=0; i<10; i++){
            if (evens[i]%2==0) {
                count++;
            }
        }
        System.out.println(count);

    }
}