package Servisler;
import Veri.DOMAIN_CONSTANT;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
//import "src".UserInterface;
public  class UserService {
    public static void main(String[] args) {
        Login("ahmet1905","19051905");
    }
    public static void Login(String loginAttempUserName, String loginAttempPassword) {
            //String[] Users=DataFileProcess.getData_v2(DOMAIN_CONSTANT.USER_DATAPATH);
            //BELLkten zarar ama koddan kar . oku-yaz yapan 1 er metod indireceksek dizin dondormeliyiz data sınıfında
        File userFile = new File(DOMAIN_CONSTANT.USER_DATAPATH);//burası iyileşek .gerek olmayan bilir referans tipe
        Scanner fileScanner;
        String satir = "";// "" KOYMAYA MECBUR KALdık. bilgi eksiğim mi var ki böyle aveni yoöntem kullandım?
        try {
            fileScanner = new Scanner(userFile);
            satir = fileScanner.nextLine();}
        catch (FileNotFoundException fileNotFoundException) {  System.out.println(DOMAIN_CONSTANT.FILE_NOT_FOUND_MESSAGE);            //System.out.println(fileNotFoundException);
                fileNotFoundException.printStackTrace(); }
        catch (Exception e) {                                                   //            e.printStackTrace();
            System.out.println(DOMAIN_CONSTANT.UNKNOWN_EXCEPTION_MESSAGE);        }
        //buraya koruma bkodu gelmeli. | tanbelli bir sayıda varsa bu data dır.
        //System.out.println(satir);

        String recordedUserName=null, recordedPassword=null,recordedTC=null;



       /* eski kod, yerine spitl gelecek
        int pipe = satir.indexOf('|');
        recordedUserName = satir.substring(0, pipe);
        //System.out.println(recordedUserName);

        satir = satir.substring(pipe + 1, satir.length());
        //System.out.println(satir);
        pipe = satir.indexOf('|');
        recordedPassword = satir.substring(0, pipe);
        //System.out.println(recordedPassword);

*/



/*28032024 1040
        // | ile spilit çalışmıyor . pamuk elle koda
        int pipepoint=0;
        String[] rowsCells=new String[5];
        //rowsCells[0]=rowsCells[1]=rowsCells[2]=

        rowsCells[0]=satir.substring(0,DOMAIN_CONSTANT.DATA_ROW_SEPERATOR);
        satir=satir.substring(DOMAIN_CONSTANT.DATA_ROW_SEPERATOR,satir.length());
        System.out.println("elle müdahele basşı");
        System.out.println(satir+"              "+rowsCells[0]+"     "+satir);
        System.out.println("elle müdahele sonu");
        for (int i = 0; i < 6; i++) {

        }
*/


/*
        String[] rowsCells=satir.split("|");
        System.out.println(rowsCells[0]+"    "+rowsCells[1]);

        String kelime="transportsocketCeketBARETyelek";
        String[] kelimeler; kelimeler=kelime.split("|");
        System.out.println(kelimeler[0]+"   " +kelimeler[1]);
*/

/*
    2803202
    1042
    recordedUserName=rowsCells[0]; recordedPassword=rowsCells[1];
        //recordedTC=rowsCells[4];
        recordedTC="12345678901";
       for (int i = 0; i < rowsCells.length; i++) {
           //System.out.print(rowsCells[i]);
       }*/
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
                TransactionService.readTransactionFFileByTC(recordedTC);
            } else {
                //SystemColor
                System.out.println("giriş başarısız");
                return;
                //UserInterface.showUnSuccessedLoginAttemptMwnu();
            }
        }
    }
}
