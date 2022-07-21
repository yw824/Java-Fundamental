package CodeChobo.CH06_OOP1;

public class Method_Overloading {
    public int getSum( int i , int j )
	{ return i + j ; }

	public int getSum( int i , int j , int k )
	{ return i + j + k ; }

	public double getSum( double i , double j )
	{ return (double)( i + j ) ; }

	public static void main(String[] args)
	{
        Method_Overloading a = new Method_Overloading() ; 

		int i = a.getSum( 1 , 2 ) ; 
		int j = a.getSum( 1 , 2 , 3 ) ; 
		// int k = a.getSum( 1.1 , 2.2 ) ; overloading fail -> error
        System.out.printf("%d %d\n", i, j);
	}
}
