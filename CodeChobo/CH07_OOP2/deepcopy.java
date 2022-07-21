package CodeChobo.CH07_OOP2;

class Circle1 implements Cloneable {
    Point center ; 
    int radius ;

    Circle1( Point center, int radius ) {
        this.center = center ;
        this.radius = radius ; 
    }

    void setCenter( int x, int y ) { center.x = x; center.y = y; }
    void setRadius( int radius ) { this.radius = radius ; }

    @Override 
    public String toString() {
        return "Circle(center = " + center + " , radius = " + radius + " )" ; 
    }

    @Override 
    public Object clone() throws CloneNotSupportedException {
        Circle1 c = ( Circle1 )super.clone() ; 
        c.center = (Point)center.clone() ; 
        return c ; 
    }
}

class Point implements Cloneable {
    int x, y ; 
    public Point( int x, int y ) {
        this.x = x; this.y = y;
    }

    @Override
    public String toString() {
        return "Point( " + x + " , " + y + " )" ; 
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone() ; 
    }
}

public class deepcopy {
    public static void main(String[] args ) {
        try {
            Circle1 c1 = new Circle1( new Point( 3, 4), 2) ;
            System.out.println(c1) ; 

            Circle1 c2 = (Circle1)c1.clone() ; 
            System.out.println(c2) ; 

            c2.setCenter(30,40 );
            c2.setRadius(20) ;

            System.out.println(c1) ; 
            System.out.println(c2) ; 
        } catch( CloneNotSupportedException e ) {
            e.printStackTrace();
        }
    }
}
