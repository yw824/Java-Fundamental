package CodeChobo.CH06_OOP1;

class Circle
{
	int radius ; 
	public Circle(int radius)
	{
		this.radius = radius ; 
	}
	public double getArea()
	{ return 3.14 * radius * radius ; }
}

public class Class_Array {
    public static void main( String[] args )
		{
			Circle[] c ;
			c = new Circle[5];

			for( int i = 0 ; i < c.length ; i++ )
			{
				c[ i ] = new Circle( i ) ;
				System.out.printf( "%d ", (int)c[ i ].getArea() ) ; 
			}
		}
}
