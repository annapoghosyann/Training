package javatraining3;

class Task3 {
    public static void main (String[] args) {

        int oddNumbers[] = new int [20];

        int i=0;
        for (int j=-20; j<20; j++) {

            if ((j % 2 == 1) || (j % 2 == -1)) {
                oddNumbers[i] = j;
                i++;
            }
        }


        for (int k=0; k<20; k++)
        {
            System.out.println(oddNumbers[k]);

        }

    }
}