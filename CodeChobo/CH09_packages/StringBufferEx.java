package CodeChobo.CH09_packages;

public class StringBufferEx {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abc") ; 
        StringBuffer sb2 = sb.append(true) ; 
        sb.append('d').append(10.0f) ; 
        StringBuffer sb3 = sb.append("ABC").append(123) ; 
        
        System.out.println(sb.toString()) ; 
        System.out.println(sb2.toString()) ; 
        System.out.println(sb3.toString()) ; 
    }
}
