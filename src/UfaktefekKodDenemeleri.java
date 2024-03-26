//import FileNotFoundException;

import Servisler.TransactionService;
import Veri.DOMAIN_CONSTANT;
import VeriselTipler.Transaction;
import VeriselTipler.User;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;
public class UfaktefekKodDenemeleri {
/*
    private static void dosyaVarMi() {
    }
*/
    private static void dosyaOlustur() {
        User user = new User();
//
//        User user1=new User(){ };
//        user.name="Akın";

        //user.tckn={'1','0','2','3','4','5','6','7','8','9','1','9','4','4','4','4','4','4',exit
        // rtrtrr};
        //user.tckn={'1','2','3','4','5','6','7','8','9','0','1'};
        user.tckn[0] = '0';
        user.tckn[1] = '0';
        user.tckn[2] = '0';
        user.tckn[3] = '1';
        user.tckn[4] = '1';
        user.tckn[5] = '1';
        user.tckn[6] = '2';
        user.tckn[7] = '2';
        user.tckn[8] = '2';
        user.tckn[9] = '3';
        user.tckn[10] = '3';
        try {
            String metin = user.tckn.toString();
            metin = Arrays.toString(user.tckn);
            PrintWriter transactionPrintWriter = new PrintWriter(DOMAIN_CONSTANT.TRANSACTION_DATAPATH + metin + ".txt");

        } catch (Exception e)         // (IOException ioException)
        {

        }
    }

    private static void zamani() {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        //LocalTime localTime=new LocalTime();
        LocalTime now = LocalTime.now();
        System.out.println(LocalTime.now());
        //today.atTime()
//        System.out.println(
//                today.now(Clock)
//        );
    }
    private static void  zamani2(){
        System.out.println(LocalTime.now().toString());
        System.out.println(LocalDate.now());
        String an=LocalDate.now().toString()+ " "+LocalTime.now().toString();
        System.out.println(an);
    }


    static void veriEkleDene() {
        Transaction transaction = new Transaction();
        try {
            FileWriter transactionfileWriter = new FileWriter(DOMAIN_CONSTANT.TRANSACTION_DATAPATH + "12345678901.txt", true);
            transactionfileWriter.write(System.lineSeparator());
            transactionfileWriter.write(LocalTime.now().toString());
            transactionfileWriter.close();
        } catch (FileNotFoundException fileNotFoundException)// buraya gerçekten gerek var mı bilemedim
        {

        } catch (IOException ioException) {

        } catch (Exception e) {
            System.out.println("Anlamlandırılamayan bir hata oluştu.");
        }// burayı iyileştirmeli . şu an için ikisine de  print s t yapacağım galiba


    }

    private static void oku1() {
        File userFile = new File(DOMAIN_CONSTANT.USERDATAPATH2);//burası iyileşek .gerek olmayan bilir referans tipe
        //userFile.                toURI();
        Scanner fileScanner;
        String satir = "";// "" KOYMAYA MECBUR KALdık. bilgi eksiğim mi var ki böyle aveni yoöntem kullandım?
        try {
            fileScanner = new Scanner(userFile);
            satir = fileScanner.nextLine();
            satir = fileScanner.nextLine();
        } catch (FileNotFoundException fileNotFoundException) {
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

    static void tekKullaniciOku() {
        File userFile = new File(DOMAIN_CONSTANT.USER_DATAPATH);//burası iyileşek .gerek olmayan bilir referans tipe
//        userFile.    toURI();

        Scanner fileScanner;
        String satir = "";// "" KOYMAYA MECBUR KALdık. bilgi eksiğim mi var ki böyle aveni yoöntem kullandım?
        try {
            fileScanner = new Scanner(userFile);
            satir = fileScanner.nextLine();
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println(DOMAIN_CONSTANT.FILE_NOT_FOUND_MESSAGE);
            //System.out.println(fileNotFoundException);
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            System.out.println(DOMAIN_CONSTANT.IOEXCEPTION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(DOMAIN_CONSTANT.UNKNOWN_EXCEPTION_MESSAGE);
        }

        //BURAYA kendi mesajlarımı yazdım çünkü  kullanıcının bilmemei gereken şeyler olabilir. printstacktrace yapmadım
        //System.out.println(fileScanner.nextLine());
        System.out.println(satir);
    }

    static void Login(String loginAttempUserName, String loginAttempPassword) {
        File userFile = new File(DOMAIN_CONSTANT.USER_DATAPATH);//burası iyileşek .gerek olmayan bilir referans tipe
        Scanner fileScanner;
        String satir = "";// "" KOYMAYA MECBUR KALdık. bilgi eksiğim mi var ki böyle aveni yoöntem kullandım?
        try {
            fileScanner = new Scanner(userFile);
            satir = fileScanner.nextLine();
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println(DOMAIN_CONSTANT.FILE_NOT_FOUND_MESSAGE);
            //System.out.println(fileNotFoundException);
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            System.out.println(DOMAIN_CONSTANT.IOEXCEPTION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(DOMAIN_CONSTANT.UNKNOWN_EXCEPTION_MESSAGE);
        }

        //buray akoruma bkodu gelmeli. | tanbelli bir sayıda varsa bu data dır.

        System.out.println(satir);

        String recordedUserName, recordedPassword;
        int pipe = satir.indexOf('|');
        recordedUserName = satir.substring(0, pipe);
        System.out.println(recordedUserName);

        satir = satir.substring(pipe + 1, satir.length());
        System.out.println(satir);
        pipe = satir.indexOf('|');
        recordedPassword = satir.substring(0, pipe);
        System.out.println(recordedPassword);
        TransactionService.readTransactionFFileByTC("");

/*
her biri tek düze olmasına rağmen neden bu işler çalışmadı anlamadım. hepsi = ile .
eğer nhepsi new new li olup çalışmasa hatay ıkendimde arardım.
        if (loginAttempUserName==recordedUserName){
            if (loginAttempPassword==recordedPassword){
                System.out.println("doğrulandınız");
            } else {System.out.println("giriş başarısız");}
        }
*/
        if (loginAttempUserName.equals(recordedUserName)) {
            if (loginAttempPassword.equals(recordedPassword)) {
                System.out.println("doğrulandınız");
            } else {
                System.out.println("giriş başarısız");
            }
        }

    }

    /*
    string diziye eri koyacaksak user okuma ile transacriob okumayı aynı yapan bir mryfoum olur
    parametreli motod olur.
    çatırayan gönderdiği praametreyi elbet bilir. bilince gelen veriye ona göre muamee eder.

     */
    static void readTransactionFFileByTC() {
/*
    pdf de açıklama yoksa sola kayık geliyor.sütün ile içerik tür /anlambakımından uyumsuz. sonra düzeltilebilir.
    açıklamayı sütün olarak DOMANIN_CONTSTANT'TA mı tutsam?
*/

/*
    while (input.hasNextLine()) {
            input.nextLine();
            count++;
    }
*/
        String TC = "11111111111";
        String satir;
        int rowCount=0;
        Scanner fileScanner;
        File transactionFile = new File(DOMAIN_CONSTANT.TRANSACTION_DATAPATH + TC+".txt");//burası iyileşek .gerek olmayan bilir referans tipe

        try {
            fileScanner = new Scanner(transactionFile);
            while (fileScanner.hasNextLine()){rowCount++;fileScanner.nextLine();}
            //System.out.println(rowCount);
            fileScanner = new Scanner(transactionFile);
            for (int i = 0; i < rowCount; i++) {
                System.out.println(fileScanner.nextLine());
            }

        }

        //bu ve user okuyan  metoduun catch leri aynı.bu iki metodu çağıran metd ortak olduğu z
        // zaman o yere hava le ederim/rücu.
        //eğe fata process sınıfımı ayarlayaabilirsem iyi olur.
        catch (FileNotFoundException fileNotFoundException) {
            System.out.println(DOMAIN_CONSTANT.FILE_NOT_FOUND_MESSAGE);
            //System.out.println(fileNotFoundException);
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            System.out.println(DOMAIN_CONSTANT.IOEXCEPTION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(DOMAIN_CONSTANT.UNKNOWN_EXCEPTION_MESSAGE);
        }


    }

    public static void main(String[] args) {
      // zamani();
        zamani2();
//        oku1();
        //veriEkleDene();
//        dosyaOlustur();
//        dosyaVarMi();
        //tekKullaniciOku();
        //Login("asimkilic","123123");//burası devam edilecek
        //readTransactionFFileByTC();
        //DataFileProcess.addData(DOMAIN_CONSTANT.TRANSACTION_DATAPATH + "12345678901.txt","DataFileProcess addData");
        //DataFileProcess.addData(DOMAIN_CONSTANT.USER_DATAPATH ,"DataFileProcess addData");
//DataFileProcess.getData(DOMAIN_CONSTANT.TRANSACTION_DATAPATH+"12345678901.txt");
        //ataFileProcess.readData(DOMAIN_CONSTANT.TRANSACTION_DATAPATH+"12345678901.txt");
        //System.out.println(    DataFileProcess.getData
               // (DOMAIN_CONSTANT.TRANSACTION_DATAPATH+"12345678901.txt"));
    }
}//m
