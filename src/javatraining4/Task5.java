package javatraining4;

public class Task5 {
    public static void main(String[] args) {
        String text = "anna poghosyan%67* shdjcj %^*(*";

        System.out.println(toUppercase(text));

    }

    public static String toUppercase(String lowerText) {
        char[] textArray = lowerText.toCharArray();
        String upperText="";
        char[] upperTextChar=new char[textArray.length];
        for (int i=0; i<textArray.length; i++)
        {
            int num;
            if (textArray[i]<97 || textArray[i]>122){
                 num = textArray[i];
            }
            else {
                 num = textArray[i] - 32;
            }
            char letter=(char)num;
            upperTextChar[i]=letter;

        }
        upperText = new String(upperTextChar);
        return upperText;
    }

}
