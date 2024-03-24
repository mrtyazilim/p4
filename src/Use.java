import Veri.DOMAIN_CONSTANT;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Use   {
   static Scanner choiceScanner=new Scanner(System.in);
    static int choice;
    public static void main(String[] args) {
        ShowEntrance();
        System.out.print("Seçim :");
        choice=choiceScanner.nextInt();
        switch (choice){
            case 1 -> {
                userLogin();
            }
            case 2->{
                userSingUp();
            } case 3->{ return;}
            default ->{ main(new String[1]);}
        }

    }

    private static void userSingUp() {
    }

    static void ShowEntrance(){
        System.out.println("Hoşgeldiniz. \n Lütfen rakamlar yardımıyla seçiminizi yapınız.");
        System.out.println("1 :Üye oturum girişi.\n2 :Üye ol.\n3 :Çıkış ");
    }
    static void userLogin(){///Ask
        //static boolean userLogin(){///Ask
        //bu metod soru soru çağrıldığı yere

        String userName,password;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Kullanıcı adı :");
        userName=scanner.nextLine();
        System.out.print("Parola :");
        password=scanner.nextLine();
    }

//    static void askUserInfo(){
//
//
//    }
//

}
