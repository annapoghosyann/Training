package javafiles;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;

// not done yet

public class WriteFemaleStudentsByYear {
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

            Person k = new Person();
            for (int i = 1; i < person.length; i++) {
                for (int j = 0; j < person.length - i; j++) {
                    if (person[j + 1].getBirthYear() < person[j].getBirthYear()) {
                        k = person[j];
                        person[j] = person[j + 1];
                        person[j + 1] = k;
                    }
                }
            }


            for (int i=0; i< person.length; i++) {
                if (person[i].getGender() == 'f') {
                    for (Serializable s : Arrays.asList(person[i].getFirstName(), " ", person[i].getLastName(), " ", person[i].getBirthYear(),
                            " ", person[i].getGender(), " ", person[i].getMark(), "\n")) {
                        myWriter.write(String.valueOf(s));
                    }
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
