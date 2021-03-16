public class first {
    public static void main(String[] args)
    {
        System.out.println("    -");
        System.out.println("   . .");
        System.out.println("  | | |");
        System.out.println(" - - - -");
        System.out.println("-  Anna  -");
        System.out.println(" - - - -");
        System.out.println("  | | |");
        System.out.println("   . .");
        System.out.println("    -");
    }
}

class Task1 {
    public static void main(String[] args) {

        int array[] = {14, 47};

    }
}

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

class Task4 {
    public static void main(String[] args) {

        int five[] = {14, 47, 45, 100, 5, 3, 15, 20, 31, 40};

        for (int i=0; i<10; i++){
            if (five[i]%5==0){
                System.out.println(five[i]);
            }
        }

    }
}


class Task5 {
    public static void main(String[] args) {

        double between[] = {35.6, 47.2, 1.7, 5.5, 687.2, 1000.1, 467.22, 467.23, 24.121, 30.33};
        for (int i=0; i<10; i++) {
            if ((between[i]>24.12)&&(between[i]<467.23))
                System.out.println(between[i]);

        }


    }
}



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

class Task7 {
    public static void main(String[] args) {

        int N=40;
        System.out.println("Input N="+N);
        System.out.println("Output");
        for (int i=1; i<11; i++) {
            int s=N*i;
            System.out.println(N+"x"+i+"="+s);
        }


    }
}