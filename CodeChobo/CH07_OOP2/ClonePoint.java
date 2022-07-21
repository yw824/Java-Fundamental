package CodeChobo.CH07_OOP2;

class Point implements Cloneable {
    int x, y ; 

    public Point( int x, int y ) {
        this.x = x; this.y = y;
    }

    @Override 
    public String toString() { 
        return "Point( " + x + " , " + y + ")" ; 
    }

    @Override 
    public Object clone() throws CloneNotSupportedException {
        return super.clone() ; 
    }
}

public class ClonePoint {
    public static void main(String[] args ) {
        Point p1 = new Point( 2, 4 ) ;
        System.out.println(p1) ; 

        try {
            Point p2 = (Point)p1.clone() ; 
            System.out.println(p2) ; 

        } catch( CloneNotSupportedException e ) {
            e.printStackTrace();
        }
    }
}
