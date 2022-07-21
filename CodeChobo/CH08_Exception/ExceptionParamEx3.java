package CodeChobo.CH08_Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionParamEx3 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("some.txt");
            reader.close(); 
            // public void close() throws IOException
        }  catch( IOException e ) {
            System.err.println("IO Error Occur");
        } 
        /*
        catch( FileNotFoundException e ) {
            System.err.println("File not Found");
        }
        */
    }
}
