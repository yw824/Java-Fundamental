package CodeChobo.CH08_Exception;

public class PrintStackTraceEx {
    public static void main(String[] args) {
        try {
            int[] arr = new int[ 0 ] ; // - length = 0 : 에러 발생
            System.out.println("Sum : " + getTotal(arr)) ;
        } catch( Exception e ) {
            e.printStackTrace();
        }
    }

    static int getTotal(int[] arr) throws Exception {
        if( arr.length == 0 ) {
            throw new Exception("Empty Array") ; 
        }
        int total = 0 ; 
        for( int num: arr)
            total += num ; 
        return total ; 
    }
}
