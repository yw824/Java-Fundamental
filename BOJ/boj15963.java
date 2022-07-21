package BOJ;
import java.util.Scanner;
public class boj15963
{
    public static void main(String[] args)
    {
        long a ; 
        long b ;
        
        Scanner sc = new Scanner(System.in);
        a = sc.nextLong();
        b = sc.nextLong();
        if( a == b )
            System.out.println(1);
        else
            System.out.println(0);
        sc.close();
    }
}