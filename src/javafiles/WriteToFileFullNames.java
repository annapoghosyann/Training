package javafiles;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class WriteToFileFullNames {
    public static void main(String[] args) {
        Person[] person = new Person[4];
        for (int i = 0; i < person.length; i++) {
            person[i] = new Person();  // creates each actual Person
        }

        person[0].setFirstName("Hayk");
        person[0].setLastName("Arabyan");
        person[0].setGender('m');
        person[0].setBirthYear(1998);
        person[0].setMark(77.5);

        person[1].setFirstName("Ani");
        person[1].setLastName("Babayan");
        person[1].setGender('f');
        person[1].setBirthYear(1980);
        person[1].setMark(47.5);

        person[2].setFirstName("Karine");
        person[2].setLastName("Vancyan");
        person[2].setGender('f');
        person[2].setBirthYear(2000);
        person[2].setMark(87.5);

        person[3].setFirstName("Karen");
        person[3].setLastName("Martirosyan");
        person[3].setGender('m');
        person[3].setBirthYear(1997);
        person[3].setMark(90);

        try {
            FileWriter myWriter = new FileWriter("person.txt");

            for (int i = 0; i < person.length; i++) {

                for (String s : Arrays.asList(person[i].getFirstName(), " ", person[i].getLastName(), "\n")) {
                    myWriter.write(s);
                }

            }
            System.out.println("Successfully wrote to the file.");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
