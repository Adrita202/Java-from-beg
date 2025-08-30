
public class Car {

    static int wheels = 4;
    static int doors = 4;
    int seats;
    int speed;
    String brand;
    String model;
    String color;
  
    static void start() 
    {
      System.out.println("Starting the car....");
    }
  
    void accelerate() 
    {
      System.out.println("Accelerating....");
    }
  
    void brake() 
    {
      System.out.println("Applying brakes....");
    }
    
  
    void getDetails() {
      System.out.println("Brand: " + brand);
      System.out.println("Model: " + model);
      System.out.println("Color: " + color);
      System.out.println("Wheels: " + wheels);
      System.out.println("Doors: " + doors);
      System.out.println("Seats: " + seats);
      System.out.println("Speed: " + speed + " mph");
    }
  
    Car(String brand, String model, String color, int seats) {
      Car.count++;
      this.brand = brand;
      this.model = model;
      this.color = color;
      this.seats = seats;
    }
  
    static int count = 0;
  
    Car() {
      Car.count++;
    }
  
    static void getCount() {
      System.out.println("Car instances created: " + count);
    }
  
    public static void main(String[] args) {
  
      Car toyota = new Car("Kia", "Sonnet", "Blue", 5);
      Car bmw = new Car("BMW", "X5", "Black", 7);
  
      Car ford, mahindra, audi;
      ford = new Car();
      mahindra = new Car();
      audi = new Car();
  
      ford.brand = "Ford";
      ford.model = "Ecosport";
      ford.color = "Red";
      ford.seats = 4;
  
      mahindra.brand = "Mahindra";
      mahindra.model = "Thar";
      mahindra.color = "Black";
      mahindra.seats = 5;
  
      audi.brand = "Audi";
      audi.model = "TT";
      audi.color = "Silver";
      audi.seats = 2;
  
      toyota.getDetails();
      bmw.getDetails();
      bmw.accelerate();
      ford.getDetails();
      ford.brake();
      mahindra.getDetails();
      audi.getDetails();
  
      Car.getCount();
    }
  
  }
  