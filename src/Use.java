import Veri.DOMAIN_CONSTANT;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Use implements Dataable {
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
    }

//    static void askUserInfo(){
//
//
//    }
//

}
