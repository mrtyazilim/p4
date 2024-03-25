
//vma 07.02.2024 11:56


package Deneme.Lab1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class StudentList {
    public static void main(String[] args) {

        log();


    }
    public static void random(){
        Random random = new Random();

    }

    public static String[] log() {
        String[] str;
        String[] str2;
        String gender;
        String newLine = null;
        try {
            Scanner input = new Scanner(new File("StudentList1.txt"));

            int count = 0;

            while (input.hasNextLine()) {
                input.nextLine();
                count++;
            }
            str = new String[count];
            input = new Scanner(new File("StudentList1.txt"));

            for (int i = 0; i < str.length; i++) {
                String fullName = input.nextLine();

                str2 = fullName.split("\\|");
                if (str2.length == 2) {
                    gender = str2[1].trim();
                    if (gender.equals("E")) {
                        gender = "Bey";
                    } else if(gender.equals("K")){
                        gender = "Hanım";
                    }else {
                        gender = "Cinsiyet Belirlenemedi.";
                    }
                    newLine = str2[0] + gender;
                }
                str[i] = newLine;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return str;
    }
}


