package CodeChobo.CH08_Exception;

// InvalidInputException.java 별도의 파일로 존재해야 함

public class InvalidInputExceptionEx {
    public static void main(String[] args) {
        try {
            int result = subtract( 5 , 100 ) ;
            System.out.println(result) ; 
        } catch( InvalidInputException e ) {
            System.err.println(e.getMessage()) ; 
        }
    }
    
    static int subtract( int a , int b )  throws InvalidInputException {
        if( a < b )
            throw new InvalidInputException() ; 
        return a - b ; 
    }
}
