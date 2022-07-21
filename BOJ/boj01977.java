package BOJ;
import java.util.*;
public class boj01977
{
    public static void main(String[] args)
    {
        int start, end;
        Scanner sc = new Scanner(System.in);
        start = sc.nextInt();
        end = sc.nextInt();

        int temp ; 
        int sum = 0 ; 
        int min = 10000 ; 
        for( int i = 1 ; i <= 100 ; i++ )
        {
            temp = i * i ;  
            if( start <= temp && temp <= end )
            {
                sum += temp ; 
                if( min > temp )
                    min = temp ;
            }
        }
        if( sum == 0 )
            System.out.println("-1");
        else{
            System.out.println(sum);
            System.out.println( min );
        }
        sc.close();
    }
}