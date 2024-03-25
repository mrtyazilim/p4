


package Servisler;
import Veri.DOMAIN_CONSTANT;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TransactionService {
    static public void readTransactionFFileByTC() {
/*
    pdf de açıklama yoksa sola kayık geliyor.sütün ile içerik tür /anlambakımından uyumsuz. sonra düzeltilebilir.
    açıklamayı sütün olarak DOMANIN_CONTSTANT'TA mı tutsam?
*/

/*
    while (input.hasNextLine()) {
            input.nextLine();
            count++;
    }
*/
        String TC = "11111111111";
        String satir;
        int rowCount = 0;
        Scanner fileScanner;
        File transactionFile = new File(DOMAIN_CONSTANT.TRANSACTION_DATAPATH + TC + ".txt");//burası iyileşek .gerek olmayan bilir referans tipe
        try {
            fileScanner = new Scanner(transactionFile);
            while (fileScanner.hasNextLine()) {
                rowCount++;
                fileScanner.nextLine();
            }
            //System.out.println(rowCount);
            fileScanner = new Scanner(transactionFile);
            for (int i = 0; i < rowCount; i++) {
                System.out.println(fileScanner.nextLine());
            }
        }

        //bu ve user okuyan  metoduun catch leri aynı.bu iki metodu çağıran metd ortak olduğu z
        // zaman o yere hava le ederim/rücu.
        //eğe fata process sınıfımı ayarlayaabilirsem iyi olur.
        catch (FileNotFoundException fileNotFoundException) {
            System.out.println(DOMAIN_CONSTANT.FILE_NOT_FOUND_MESSAGE);
            //System.out.println(fileNotFoundException);
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            System.out.println(DOMAIN_CONSTANT.IOEXCEPTION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(DOMAIN_CONSTANT.UNKNOWN_EXCEPTION_MESSAGE);
        }
    }
}
