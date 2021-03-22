package javatraining3;


class Task7 {
    public static void main(String[] args) {

        int N=40;

        if (N<=0||N>20) {
            System.out.println("N is out of range!");
        }
        else {
            System.out.println("Input N=" + N);
            System.out.println("Output");
            for (int i = 1; i < 11; i++) {
                int s = N * i;
                System.out.println(N + "x" + i + "=" + s);
            }
        }

    }
}