package CodeChobo.CH08_Exception;

public class getMessageEx1 {
    public static void main(String[] args) {
        int num1 = 2 , num2 = 0 ; 
        try {
            int result = num1 / num2 ; 
            System.out.println(result) ; 

        } catch ( ArithmeticException ae ) {
            String str = ae.getMessage() ; 
            System.err.println(str);
        }
    }
}
