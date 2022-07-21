package CodeChobo.CH06_OOP1;

class Circle
{
	int radius ; 
	public Circle( int radius ) { this.radius = radius ; }
	public void set( int radius ) { this.radius = radius ; }
}

public class instance_copy {
    public static void main(String[] args)
	{
		Circle obj1 = new Circle( 1 ) ;
		Circle obj2 = new Circle( 2 ) ;
		obj1 = obj2 ; // 객체 치환

		System.out.println("obj1.radius = " + obj1.radius ) ;
		System.out.println("obj2.radius = " + obj2.radius ) ;
	}
}
