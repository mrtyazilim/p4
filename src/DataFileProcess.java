//import java.time.Clock;


import Veri.DOMAIN_CONSTANT;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class DataFileProcess {
    public static void addData(String pathAndFileName,String data){

        try {
            FileWriter fileWriter=new FileWriter(pathAndFileName,true);
            fileWriter.write(data);
            fileWriter.write(System.lineSeparator());
            fileWriter.close();
        }
        catch (FileNotFoundException fileNotFoundException) {
            System.out.println(DOMAIN_CONSTANT.FILE_NOT_FOUND_MESSAGE);
        }
        catch (IOException ioException){
            System.out.println(DOMAIN_CONSTANT.IOEXCEPTION_MESSAGE);
        }
        catch (Exception exception){ System.out.println(DOMAIN_CONSTANT.UNKNOWN_EXCEPTION_MESSAGE);  }



    }
}