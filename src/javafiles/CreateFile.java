package javafiles;
import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {

        File myObj = new File("person.txt");
        try {
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            }
            else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}