public class first {
    public static void main(String[] args) {
        int[] tariq = new int[5];
        tariq[0] = 20;
        tariq[1] = 13;
        tariq[2] = 16;
        tariq[3] = 29;
        tariq[4] = 36;
        String[] anun = {"Anna", "Armen", "Karen", "Hovo", "Armine"};


        for (int i=0; i<5; i++){
            if (tariq[i]%2 == 0)
            System.out.println(anun[i] + tariq[i]);
        }


    }
}
