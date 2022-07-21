package CodeChobo.CH08_Exception;

public class getMessageEx2 {
    public static void main(String[] args) {
        int num1 = 2 , num2 = 3 ; 
        try {
            int result = num1 - num2 ; 

            if( result < 0 )
                throw new Exception("Wrong Result.") ; 

            System.out.println(result) ; 

        } catch ( Exception e ) {
            String str = e.getMessage() ; 
            System.err.println(str) ; 
        }
    }
}
