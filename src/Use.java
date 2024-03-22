import Veri.DOMAIN_CONSTANT;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Use {
   static Scanner choiceScanner=new Scanner(System.in);
    static char choice;
    public static void main(String[] args) {
        ShowEntrance();
        choice=choiceScanner.nextLine().charAt(0);

    }

    static void ShowEntrance(){
        System.out.println("Hoşgeldiniz. \n Lütfen rakamlar yardımıyla seçiminizi yapınız.");
        System.out.println("1 :Üye oturum girişi.\n2 :Üye ol. ");
    }
    static void userLogin(){///Ask
        //static boolean userLogin(){///Ask

        //bu metod soru soru çağrıldığı yere

        String userName,password;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Kullanıcı adı :");
        userName=scanner.nextLine();
        System.out.println("Parola :");
        password=scanner.nextLine();



    }/*
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
    }*/

//    static void askUserInfo(){
//
//
//    }
//

}
