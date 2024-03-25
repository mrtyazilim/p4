package Servisler;

import Veri.DOMAIN_CONSTANT;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public  class UserService {
    public static void main(String[] args) {
        Login("ahmet1905","19051905");
    }
   public static void Login(String loginAttempUserName, String loginAttempPassword) {
        File userFile = new File(DOMAIN_CONSTANT.USER_DATAPATH);//burası iyileşek .gerek olmayan bilir referans tipe
        Scanner fileScanner;
        String satir = "";// "" KOYMAYA MECBUR KALdık. bilgi eksiğim mi var ki böyle aveni yoöntem kullandım?
        try {
            fileScanner = new Scanner(userFile);
            satir = fileScanner.nextLine();
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println(DOMAIN_CONSTANT.FILE_NOT_FOUND_MESSAGE);            //System.out.println(fileNotFoundException);
            fileNotFoundException.printStackTrace(); } catch (Exception e) {                                                   //            e.printStackTrace();
            System.out.println(DOMAIN_CONSTANT.UNKNOWN_EXCEPTION_MESSAGE);
        }

        //buraya koruma bkodu gelmeli. | tanbelli bir sayıda varsa bu data dır.
        //System.out.println(satir);

        String recordedUserName, recordedPassword;
        int pipe = satir.indexOf('|');
        recordedUserName = satir.substring(0, pipe);
        //System.out.println(recordedUserName);

        satir = satir.substring(pipe + 1, satir.length());
        //System.out.println(satir);
        pipe = satir.indexOf('|');
        recordedPassword = satir.substring(0, pipe);
        //System.out.println(recordedPassword);
       String recordedTC="12345678901";
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

            }
        }

    }
}
