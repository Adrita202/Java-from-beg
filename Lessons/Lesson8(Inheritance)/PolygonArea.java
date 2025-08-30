// package Lesson8(Inheritance);

public class PolygonArea {
    public static void main(String[] args) {
        Rectangle rec=new Rectangle();
        Triangle tri=new Triangle();

        rec.setValues(10, 5);
        tri.setValues(10, 5);
        System.out.println("Area of rectangle:"+rec.area());
        System.out.println(tri.area());

        
    }
    
}
class Polygon{
    protected int height;
    protected int width;
    public void setValues(int a,int b){
        height=a;
        width=b;
    }
}
class Rectangle extends Polygon{
    public double area(){
        return height*width;
    }


}
class Triangle extends Polygon{
    public double area(){
        return height*width*0.5;
    }


}