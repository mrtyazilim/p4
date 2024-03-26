/** kullanıcı seçimini karater olarak alarak (nextlin ve char at (0))ve recuise kullanarak programın kırılmasını azaltmaya çalışıldı.
 * ne deolsa işlem sayısı, klavyedeki tuş sayısıdan az, kapasite sorunu yok.
    recuiseve kullandım
*/
import java.util.Scanner;
import Servisler.*;

public class Use   {

    public static void main(String[] args) {
        UserInterface.ShowEntrance();
        UserInterface.askInEntrance();
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

}
