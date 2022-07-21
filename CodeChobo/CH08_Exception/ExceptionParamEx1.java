package CodeChobo.CH08_Exception;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionParamEx1 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("some.txt");
            // public FileReader( String filename ) throws FileNotFoundException
            reader.close(); 
            // public void close() throws IOException
        } catch( IOException e ) {
            System.err.println("IO Error Occur");
            // public class FileNotFoundException extends IOException 
        }
    }
}