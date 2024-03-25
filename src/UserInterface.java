import Servisler.UserService;
import java.util.Scanner;

/**
son kullanıcı genel amaçlı ekrandan iletişim ve  seçmleribi alma
 form işlemleri


@annotation userNameAndPassword() metodu ile giriş ve kayıt için ortak noktalar toğlanacak. implementasyonu şu an için boş.

*/
public class UserInterface {
    static Scanner choiceScanner=new Scanner(System.in);
    static int choice;

    static void ShowEntrance(){
        System.out.println("Hoşgeldiniz. \n Lütfen rakamlar yardımıyla seçiminizi yapınız.");
        System.out.println("1 :Üye oturum girişi.\n2 :Üye ol.\n3 :Çıkış ");
        System.out.print("Seçim :");
    }
    static void askInEntrance(){

        choice=choiceScanner.nextLine().charAt(0);
        switch (choice){
            case '1' -> {
               askUserLogin();}
            case '2'->{
                userSingUp();}
            case '3'->{
                return;}
            default ->{
                UserInterface.ShowEntrance() ; askInEntrance();}
        }
    }
    public     static void askUserLogin(){///Ask
        //static boolean askUserLogin() mi lmalı?
        //bu metod soru soru çağrıldığı yere

        String userName,password;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Kullanıcı adı :");
        userName=scanner.nextLine();
        System.out.print("Parola :");
        password=scanner.nextLine();
        UserService.Login(userName,password);
    }
    static void userNameAndPassword(){}
    private static void userSingUp() {
        System.out.println("Kaydol.");
        System.out.println("Lütfen sizden istenecek bilgileri veriniz.");
        System.out.print("Kullanıcı adı :");
        System.out.print("Parola :");
        System.out.print("Ad :");
        System.out.print("Soyad :");
        System.out.print("TC k. no :");
        System.out.print("Cinsiyet :");
        System.out.print("");
    }


}
