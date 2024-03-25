/** kullanıcı seçimini karater olarak alarak (nextlin ve char at (0))ve recuise kullanarak programın kırılmasını azaltmaya çalışıldı.
 * ne deolsa işlem sayısı, klavyedeki tuş sayısıdan az, kapasite sorunu yok.

*/
import java.util.Scanner;
import Servisler.*;

public class Use   {
   static Scanner choiceScanner=new Scanner(System.in);
    static int choice;
    public static void main(String[] args) {
        ShowEntrance();
        askInEntrance();

/* burayı ayrı metod yapınca bu metod parametreli mi olmalı, parametresiz mi? return lu mu returnsuz mu?
üye seviyesinde scanner tanımlamıştık. buna uygun olarak paametresiz ama hangisi doğru bilmiyorum.
choice=choiceScanner.nextInt();
        switch (choice){
            case 1 -> {
                askUserLogin();
            }
            case 2->{
                userSingUp();
            } case 3->{ return;}
            default ->{ main(new String[1]);}
        }*/
    }
    static void ShowEntrance(){
        System.out.println("Hoşgeldiniz. \n Lütfen rakamlar yardımıyla seçiminizi yapınız.");
        System.out.println("1 :Üye oturum girişi.\n2 :Üye ol.\n3 :Çıkış ");
        System.out.print("Seçim :");
    }
    static void askInEntrance(){
        choice=choiceScanner.nextLine().charAt(0);
        switch (choice){
            case '1' -> {
                askUserLogin();
            }
            case '2'->{
                userSingUp();
            } case '3'->{ return;}
            default ->{ ShowEntrance() ; askInEntrance();}
        }
    }

    static void askUserLogin(){///Ask
        //static boolean askUserLogin(){///Ask
        //bu metod soru soru çağrıldığı yere

        String userName,password;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Kullanıcı adı :");
        userName=scanner.nextLine();
        System.out.print("Parola :");
        password=scanner.nextLine();
        TransactionService.readTransactionFFileByTC();
    }
    private static void userSingUp() {
    }
//    static void askUserInfo(){
//
//
//    }
//

}
