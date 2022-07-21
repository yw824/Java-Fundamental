package CodeChobo.CH08_Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionParamEx2 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("some.txt");
            reader.close(); 
            // public void close() throws IOException
        } catch( FileNotFoundException e ) {
            System.err.println("File not Found");
        } catch( IOException e ) {
            System.err.println("IO Error Occur");
        }
    }
}
