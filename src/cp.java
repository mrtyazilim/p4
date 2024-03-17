





/*
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
    }}*/
