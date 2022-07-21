package CodeChobo.CH09_packages;
class Person { 
    long id ; 

    public boolean equals( Object obj ) {
        if( obj != null && obj instanceof Person )
            return id == ( (Person)obj ).id ; 
        else
            return false ; 
    }

    Person( long id ) { this.id = id ; }
}

public class EqualsEx2 {
    public static void main(String[] args) {
        Person p1 = new Person(801101122L) ;
        Person p2 = new Person(801101122L) ; 

        if( p1 == p2 )
            System.out.println("p1 is p2") ; 
        else    
            System.out.println("p1 isn't p2") ; 

        if( p1.equals(p2)) 
            System.out.println("p1 equals to p2") ; 
        else
            System.out.println("p1 doesn't equals to p2") ;  
        
    }
}
