/*
description (boş olabilir)
transactionDate (tarih ve saat - istenilen biçimde tutulabilir)
amount
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



