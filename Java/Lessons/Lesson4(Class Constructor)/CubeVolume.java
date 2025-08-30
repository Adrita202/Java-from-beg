public class CubeVolume{
    public static void main(String[] args) {
        Cube cube1=new Cube();
        System.out.println(cube1.getCubeVolume()); 
        
        Cube cube2=new Cube(20,10,7);
        System.out.println(cube2.getCubeVolume());
    }
}
class Cube
{
    
    int length;
    int breadth;
    int height;
    public int getCubeVolume(){
        return (length*breadth*height);

    }
    //Default constructor
    Cube(){
        System.out.println("Hiii i'm Constructor");
        length=10;
        breadth=20;
        height=3;
    }
    //constructor overloading
    Cube(int l,int b,int h){
        length=l;
        breadth=b;
        height=h;

    }
}

