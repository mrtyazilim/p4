//import java.time.Clock;

import Veri.DOMAIN_CONSTANT;
import VeriselTipler.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
// bu dosyada doğru düzgün açıklama satırı yok. meraka ve görev borcuna dair ihtiyaç az oldu bu dosyada.
public class DataFileProcess {
    public static void addData(String pathAndFileName,String data){
        try {
            FileWriter fileWriter=new FileWriter(pathAndFileName,true);
            fileWriter.write(data);
            fileWriter.write(System.lineSeparator());
            fileWriter.close();
        }
        catch (FileNotFoundException fileNotFoundException) { System.out.println(DOMAIN_CONSTANT.FILE_NOT_FOUND_MESSAGE);  }
        catch (IOException ioException){ System.out.println(DOMAIN_CONSTANT.IOEXCEPTION_MESSAGE); }
        catch (Exception exception){ System.out.println(DOMAIN_CONSTANT.UNKNOWN_EXCEPTION_MESSAGE);  }
    }
    public static void addData(String pathAndFileName, Dataable dataable){}

    public static void readData(String pathAndFileName){
        File dataFile=new File(pathAndFileName);
        Scanner fileScanner;
        String row;
        try {
            fileScanner=new Scanner(dataFile);
            //if (fileScanner.hasl)
            row=fileScanner.nextLine();
            System.out.println(row);
        }
        catch (FileNotFoundException fileNotFoundException) { System.out.println(DOMAIN_CONSTANT.FILE_NOT_FOUND_MESSAGE);  }
        catch (IOException ioException){ System.out.println(DOMAIN_CONSTANT.IOEXCEPTION_MESSAGE); }
        catch (Exception exception){ System.out.println(DOMAIN_CONSTANT.UNKNOWN_EXCEPTION_MESSAGE);  }
    }
    public static String getData(String pathAndFileName){
        File dataFile=new File(pathAndFileName);
        Scanner fileScanner;
        String row=null;
        try {
            fileScanner=new Scanner(dataFile);
            //if (fileScanner.hasl)
            row=fileScanner.nextLine();
            //System.out.println(row);
        }
        catch (FileNotFoundException fileNotFoundException) { System.out.println(DOMAIN_CONSTANT.FILE_NOT_FOUND_MESSAGE);  }
        catch (IOException ioException){ System.out.println(DOMAIN_CONSTANT.IOEXCEPTION_MESSAGE); }
        catch (Exception exception){ System.out.println(DOMAIN_CONSTANT.UNKNOWN_EXCEPTION_MESSAGE);  }

        return row;
    }
        public static String[] getData_v2(String pathAndFileName){
        File dataFile=new File(pathAndFileName);
        Scanner fileScanner;
        int rowCount=0;
        String row; String[] rows=null;
        try {
            fileScanner=new Scanner(dataFile);
            //if (fileScanner.hasl)
            row=fileScanner.nextLine();
            //System.out.println(row);
        }
        catch (FileNotFoundException fileNotFoundException) { System.out.println(DOMAIN_CONSTANT.FILE_NOT_FOUND_MESSAGE);  }
        catch (IOException ioException){ System.out.println(DOMAIN_CONSTANT.IOEXCEPTION_MESSAGE); }
        catch (Exception exception){ System.out.println(DOMAIN_CONSTANT.UNKNOWN_EXCEPTION_MESSAGE);  }

        return rows;
    }
}
