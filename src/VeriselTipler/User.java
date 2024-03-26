package VeriselTipler;
//import Veri.Dataable;
/**
 @author Murat Değirmenci,UPoDer
 verinin dosyada sıralaması asgari olarak şu şekildedir
 kullanıcı adı,şifre,ad,soyad,tc,cinsiyet
 AYRAÇ İSE DATA_ROW_SEPERATOR daki gibi olmalıdır
 Veriyi işleyen tipler de buna göre işlem yapmaldır. aksi takdirde karmaşa çıkar.

 */

/*
1.get , set, üye değişken tanımlamaları için ide destekleri öğrenilmeli
git git hub öğrenilmeli

*/
//Dataable
public class User  implements Dataable {
    public String username,password,name,surname;
    //public char[] tckn= {'1','1','2','2','3','4','4','5','5','5','5'};
    public char[] tckn=new char[11];
    // burası belki de string olmalı
    //tarih saat ekle
    //zorunlu alanarı nasıl yapmalıyım

    enum gender {  K,    E  };
    long balance;//bakiye
}
