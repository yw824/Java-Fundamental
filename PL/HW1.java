package PL;
import java.util.*;

public class HW1
{
    static int[] num;
    static int n;
    static boolean[] prime;
    static int Max;

    static int getGCD(int left , int right)
    {
        int ans = 1 ; 
        for(int i = 2 ; i <= left ; i++ )
            if( (left % i == 0 ) && (right % i == 0) )
                ans = i ; 
        return ans;
    }

    static void setPrime()
    {
        for(int i = 2 ; i <=Math.sqrt(Max) ; i++)
        {
            if(!prime[i] == true)
                continue;
            
            int j = 2;

            while( i * j <= Max)
            {
                prime[i * j] = false;
                j += 1;
            }
        }
    }

    static int getPrime(int Start , int End)
    {
        int ans = 0;
        for(int i = Start ; i <= End ; i++ )
            if(prime[i])
                ans++;
        return ans;
    }

    public static void main(String[] args)
    {
        long startTime = System.currentTimeMillis();
        //System.out.println(startTime);

        // get n
        Scanner sc = new Scanner(System.in);
        System.out.printf(">> Input the number of numbers to process: ");
        n = sc.nextInt();
        
        
        // set num array
        num = new int[n];
        for( int i = 0 ; i < n ; i++ )
            num[ i ] = (int)(Math.random() * 100000);
        
        Arrays.sort(num);
        System.out.println("Input the numbers to be processed:");
        for( int i = 0 ; i < n ; i++ )
            System.out.printf("%d ", num[i]);
        System.out.println();

        // get GCD Numbers
        int _gcd = num[0];
        for(int i = 1 ; i < n ; i++)
            _gcd = getGCD(_gcd, num[i]);    
        System.out.printf("GCD of input numbers is %d\n", _gcd);

        // get Prime Numbers
        Max = num[n-1];
        prime = new boolean[Max+1];
        for(int i = 0; i <= Max ; i++ )
            prime[i] = true;
        if(Max > 0)
            prime[0] = false;
        if(Max > 1)
            prime[1] = false;
        
        setPrime();
        
        for(int i = 1 ; i < n ; i++)
            if(num[i-1] != num[i])
                System.out.printf("Number of Prime Numbers Between %d , %d : %d\n", num[i-1], num[i], getPrime(num[i-1], num[i]));

        sc.close();

        long endTime = System.currentTimeMillis();
        //System.out.println(endTime);
        long totalTime = ( endTime - startTime ) / 1000 ; 
        System.out.printf("Total execution time using Java is ");
        System.out.print(totalTime);
        System.out.println(" seconds!");
    }

}