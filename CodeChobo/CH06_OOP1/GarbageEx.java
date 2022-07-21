package CodeChobo.CH06_OOP1;

public class GarbageEx
{
	public static void main(String[] args)
	{
		String a = new String("Good");
		String b = new String("Bad");
		String c = new String("Normal");

		String d , e ; 
		a = null ; // Good String 객체가 가비지가 된다.
		d = c ; 
		c = null ; // c도 가비지가 되고, d만 Normal을 가리킨다.
		// d도 가비지가 되는 것은 아니다.
	}
}
