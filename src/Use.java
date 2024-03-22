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
    static void ShowUserCredidental(){///Ask
        System.out.println("Kullanıcı adı :");
        System.out.println("Parola :");
    }
//    static void askUserInfo(){
//
//
//    }
//

}
