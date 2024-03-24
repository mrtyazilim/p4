
//vma 07.02.2024 12:07


import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class StudentList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç tane farklı öğrenci seçmek istiyorsun? ");
        int numberOfStudents = scanner.nextInt();

        String[] studentList = process();
        String[] selectedStudents = new String[numberOfStudents];

        if(numberOfStudents >= studentList.length){
            System.out.println("Listede sadece " + studentList.length + " öğrenci vardır.\n");
            return;
        }

        for (int i = 0; i < numberOfStudents; i++) {
            String selectedStudent = selectStudent(studentList, selectedStudents);
            selectedStudents[i] = selectedStudent;

            System.out.println((i + 1) + " - Seçilen Öğrenci: " + selectedStudent);
        }

        writeToFile("Seçilen Ögrenciler.txt", selectedStudents);

        scanner.close();
    }

    private static String selectStudent(String[] studentList, String[] selectedStudents) {
        Random random = new Random();
        String selectedStudent;

        do {
            int randomIndex = random.nextInt(studentList.length);
            selectedStudent = studentList[randomIndex];
        } while (isSelected(selectedStudent, selectedStudents));

        return selectedStudent;
    }

    private static boolean isSelected(String selectedStudent, String[] selectedStudents) {
        for (String selected : selectedStudents) {
            if (selectedStudent.equals(selected)) {
                return true;
            }
        }
        return false;
    }

    private static void writeToFile(String fileName, String[] content) {
        try {
            PrintWriter writer = new PrintWriter(fileName);
            for (String line : content) {
                writer.println(line);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String[] process() {
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
                    newLine = str2[0] + " " + gender;
                }
                str[i] = newLine;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return str;
    }
}
