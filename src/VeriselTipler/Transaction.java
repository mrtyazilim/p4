/*
description (boş olabilir)
transactionDate (tarih ve saat - istenilen biçimde tutulabilir)
amount
*/
/**
 verinin dosyada sıralaması asgari olarak şu şekildedir

 açıklama,zaman,tutar

 avans çekildi|01.03.2024 14:23|-1750.50
 AYRAÇ İSE DATA_ROW_SEPERATOR daki gibi olmalıdır
 Veriyi işleyen tipler de buna göre işlem yapmaldır. aksi takdirde karmaşa çıkar.
*/

package VeriselTipler;
import java.time.LocalDate;
import java.time.LocalTime;

public class Transaction implements Dataable {
    String[] description={"avans çekildi","malzeme alındı"};
    String transactionDate = LocalDate.now().toString()+ " "+ LocalTime.now().toString();
    //buranın iyileşmesi lazım.sınıf kullanım anı değil, diske yazma anı gelmeli belki de.
    Long amount;

}



