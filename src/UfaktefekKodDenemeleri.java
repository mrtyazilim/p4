//import FileNotFoundException;
import Veri.DOMAIN_CONSTANT;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;
public class UfaktefekKodDenemeleri {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        //today.atTime()

        oku1();
        //https://we.tl/t-9ZNzQ5tGeM
        //https://we.tl/t-cLqBdNArQJ
    }

    private static void oku1() {
        File userFile=new File(DOMAIN_CONSTANT.OBJECTDATAPATH);
        userFile.
                toURI();
        Scanner fileScanner;
        String satir="";// "" KOYMAYA MECBUR KALdık. bilgi eksiğim mi var ki böyle aveni yoöntem kullandım?
        try {
            fileScanner = new Scanner(userFile);
            satir=fileScanner.nextLine();satir=fileScanner.nextLine();
        } catch (FileNotFoundException fileNotFoundException){
            //fileNotFoundException.
            System.out.println("Dosya bulunamadı.");
            //System.out.println(fileNotFoundException);
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            System.out.println("Dosyaya ulaşmada sorun oldu veya dosya yok.");
        }
        //System.out.println(fileScanner.nextLine());
        System.out.println(satir);
    }
}
