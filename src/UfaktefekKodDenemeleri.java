//import FileNotFoundException;
import VarliksalSiniflar.User;
import Veri.DOMAIN_CONSTANT;

import java.io.*;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;
public class UfaktefekKodDenemeleri {
    public static void main(String[] args) {
        zamani();
        oku1();
        veriEkleDene();
        dosyaOlustur();
        dosyaVarMi();
        //https://we.tl/t-9ZNzQ5tGeM
        //https://we.tl/t-cLqBdNArQJ
    }

    private static void dosyaVarMi() {

    }

    private static void dosyaOlustur() {
        User user=new User();
//
//        User user1=new User(){ };
//        user.name="Akın";

        //user.tckn={'1','0','2','3','4','5','6','7','8','9','1','9','4','4','4','4','4','4',};
        //user.tckn={'1','2','3','4','5','6','7','8','9','0','1'};
        user.tckn[0]='0';user.tckn[1]='0';user.tckn[2]='0';    user.tckn[3]='1';user.tckn[4]='1';user.tckn[5]='1';
        user.tckn[6]='2';user.tckn[7]='2';user.tckn[8]='2';    user.tckn[9]='3';user.tckn[10]='3';
        try {
            String metin=user.tckn.toString();
            metin=Arrays.toString(user.tckn);
            PrintWriter transactionPrintWriter=new PrintWriter(DOMAIN_CONSTANT.TRANSACTION_DATAPATH+metin+".txt");

        }catch (Exception e)         // (IOException ioException)
        {

        }
    }

    private static void zamani() {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        //LocalTime localTime=new LocalTime();
        LocalTime now = LocalTime.now();;

        System.out.println(LocalTime.now());
        //today.atTime()
//        System.out.println(
//                today.now(Clock)
//        );
    }

    static void veriEkleDene(){
        Transaction transaction=new Transaction();

        try {
            FileWriter transactionfileWriter=new FileWriter(DOMAIN_CONSTANT.TRANSACTION_DATAPATH+"12345678901.txt",true);
            transactionfileWriter.write(System.lineSeparator());
            transactionfileWriter.write("ilk");

            transactionfileWriter.close();


        }catch (FileNotFoundException fileNotFoundException)// buraya gerçekten gerek var mı bilemedim
        {

        }catch (IOException ioException){

        }catch (Exception e){
            System.out.println("Anlamlandırılamayan bir hata oluştu.");
        }// burayı iyileştirmeli . şu an için ikisine de  print s t yapacağım galiba


    }

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
//
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
    */
    /*

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
    }

    */





    private static void oku1() {
        File userFile=new File(DOMAIN_CONSTANT.USERDATAPATH);//burası iyileşek .gerek olmayan bilir referans tipe
        userFile.
                toURI();
        Scanner fileScanner;
        String satir="";// "" KOYMAYA MECBUR KALdık. bilgi eksiğim mi var ki böyle aveni yoöntem kullandım?
        try {
            fileScanner = new Scanner(userFile);
            satir=fileScanner.nextLine();satir=fileScanner.nextLine();
        } catch (FileNotFoundException fileNotFoundException){
            //fileNotFoundException.
            System.out.println("Dosya bulunamadı.");
            //System.out.println(fileNotFoundException);
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            System.out.println("Dosyaya ulaşmada sorun oldu veya dosya yok.");
        }
        //System.out.println(fileScanner.nextLine());
        System.out.println(satir);
    }




 }//m
