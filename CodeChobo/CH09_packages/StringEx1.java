package CodeChobo.CH09_packages;

class StringEx1 {
    public static void main(String[] args) 
    {
        String str1 = "abc" ; 
        String str2 = "abc" ; 
        System.out.printf("str1 : \"%s\"\n", str1) ;
        System.out.printf("str2 : \"%s\"\n", str2) ; 

        System.out.println("str1 == str2  ? " + str1 == str2) ;
        System.out.println("str1.equals(str2) ? " + str1.equals(str2)) ;

        String str3 = new String("abc") ; 
        String str4 = new String("abc") ; 

        System.out.printf("str3 = new String(\"%s\")", str3);
        System.out.printf("str4 = new String(\"%s\")", str4);

        System.out.println("str3 == str1  ? " + str3 == str1) ;
        System.out.println("str3.equals(str1) ? " + str3.equals(str1)) ;

        System.out.println("str4 == str2  ? " + str4 == str2) ;
        System.out.println("str4.equals(str2) ? " + str4.equals(str2)) ;

        System.out.println("str3 == str4  ? " + str3 == str4) ;
        System.out.println("str3.equals(str4) ? " + str3.equals(str4)) ;
    }
}