public class RoomDemo {
    public static void main(String[] args) {
        Room room1 = new Room(3.5, 4.2, 5.1);
        Room room2 = new Room(2.8, 3.9, 4.7);

        System.out.println("Volume of Room 1: " + room1.calculateVolume() );
        System.out.println("Volume of Room 2: " + room2.calculateVolume());
    }
}

class Room {
    private double height;
    private double width;
    private double breadth;
    public Room(double height, double width, double breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }
    public double calculateVolume() {
        return height * width * breadth;
    }
}

