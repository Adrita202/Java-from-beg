class Vehicle{
    protected String regnNumber;
    protected int speed;
    protected String color;
    protected String ownerName;

    Vehicle(String regnNumber,int speed,String color,String ownerName){
        this.regnNumber=regnNumber;
        this.speed=speed;
        this.color=color;
        this.ownerName=ownerName;
    }
    void showData(){
        System.out.println("This is a vehicle class");
        System.out.println("Registration Number: " + regnNumber);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);

    }
}
class Bus extends Vehicle{
    private int routeNumber;
    Bus(String regnNumber,int speed,String color,String ownerName,int routeNumber){
        super(regnNumber,speed,color,ownerName);
        this.routeNumber=routeNumber;
    }
    @Override
    void showData(){
        super.showData();
        System.out.println("Route Number: " + routeNumber);
    }
}
class Car extends Vehicle{
    private String manufacturerName;
    Car(String regnNumber,int speed,String color,String ownerName,String manufacturerName){
        super(regnNumber, speed, color, ownerName);
        this.manufacturerName=manufacturerName;

    }
    @Override
    void showData(){
        super.showData();
        System.out.println("Manufacturer Name: " + manufacturerName);

    }
}

public class VehicleDemo{
    public static void main(String[] args) {
        Bus bus=new Bus("WB12AB6016",80,"Blue","Mr. Das",27);
        Car car=new Car("WB14AC1244",120,"black","paul","Tata");
        System.out.println("Bus details:");
        bus.showData();
        System.out.println("Car Details:");
        car.showData();
    }
}