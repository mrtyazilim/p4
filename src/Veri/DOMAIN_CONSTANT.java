package Veri;
/**

@apiNote  Proje içindedeki klasörlerin Linux OS de çalştığı bilinen yolları burada.

*/

//burası nesne oluşturmak amaçlı olmadığı için abstact sınıf mı olmalı?.

//başkabir bilgisayara (maviye) githubdan alıp repo sahibi olduğumuzu belirtme
public  class DOMAIN_CONSTANT {


    //"Veri/Nesne/denememetin.txt";
    //M1K1Proje1/untitled/src/Veri/Nesne
    // public static final String OBJECTDATAPATH="Veri/Nesne/denememetin.txt";
    public static final String USER_DATAPATH="src/Veri/Nesne/User.txt";
    public static final String USERDATAPATH2="src/Veri/Nesne/denememetin";
    public final static String TRANSACTION_DATAPATH="src/Veri/Olaylar/";
    public final static char DATA_ROW_SEPERATOR='|';

    //İLETİŞİM SIK KULLANILANLAR;
    // hata mesajları
    public final static String UNKNOWN_EXCEPTION_MESSAGE="Anlamlandırılamayan bir hata oluştu.";
    public final static String IOEXCEPTION_MESSAGE="Dosyaya ulaşmada sorun oldu veya dosya yok.";
    public final static String FILE_NOT_FOUND_MESSAGE="Dosya bulunamadı.";
    ;;;;;;
}
