import java.net.Socket;
public class HumanClass 
{
    
    int eyes=2;
    int legs=2;
    int nose=1;
    int ears=2;
    int mouth=1;
    String name;

    boolean canRun()
    {
        return true;
    }
    boolean canWalk()
    {
        return true;
    }
    boolean canFly(String name)
    {
        if(name=="jane")
            return true;
        return false;

    }
    void run()
    {
        System.out.println("Running...");
    }
    void fly()
    {
        System.out.println("Flying...");
    }
    void walk()
    {
        System.out.println("Walking...");
    }
    void getDetails()
    {
        System.out.println("Name: "+name);
        System.out.println("Eyes: "+eyes);
        System.out.println("Legs: "+legs);
        System.out.println("Nose: "+nose);
        System.out.println("Ears: "+ears);
        System.out.println("Mouth: "+mouth);
        if(canFly(name))
            fly();
        if(canRun())
            run();
        if(canWalk())
            walk();
        System.out.println("..............................");
    }
    public static void main(String[] args)
    {
        HumanClass jane, mini, bhut;

        jane=new HumanClass();
        jane.name="Jane";
        jane.legs=1;

        mini=new HumanClass();
        mini.name="Mini";
        mini.mouth=2;
        mini.eyes=3;

        bhut=new HumanClass();
        bhut.name="Bhut";
        bhut.eyes=1;
        bhut.nose=2;
        bhut.ears=4;
        bhut.legs=1;

        bhut.getDetails();
        jane.getDetails();
        mini.getDetails();
    }
}
