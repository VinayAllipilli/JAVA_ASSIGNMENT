import java.util.*;


class Circle implements Comparable<Circle>{
    private double x;
    private double y;
    private double radius;

    public Circle(double x,double y,double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public String toString(){
        return "[x="+getX()+",y="+getY()+",radius="+getRadius()+"]";
    }

    @Override
    public int compareTo(Circle o){
        return Double.compare(this.radius,o.radius);
    }
}
public class FortyOne {
    public static void main(String[] args) {
        Set<Circle> a = new HashSet<>();
        a.add(new Circle(1,2,6));
        a.add(new Circle(3,2,8));
        a.add(new Circle(2,5,7));

        System.out.println(a);
        Set<Circle> b = new TreeSet<>();
        b.add(new Circle(1,2,6));
        b.add(new Circle(3,2,8));
        b.add(new Circle(2,5,7));
        System.out.println(b);


    }


    
}
