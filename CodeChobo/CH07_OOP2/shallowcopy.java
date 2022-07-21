package CodeChobo.CH07_OOP2;

class Circle implements Cloneable {
    Point center ; 
    int radius ;

    Circle( Point center, int radius ) {
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
        return super.clone() ; 
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

public class shallowcopy {
    public static void main(String[] args ) {
        try {
            Circle c1 = new Circle( new Point( 3, 4), 2) ;
            System.out.println(c1) ; 

            Circle c2 = (Circle)c1.clone() ; 
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
