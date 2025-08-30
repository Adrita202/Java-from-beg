class Distance{
    double miles;
    Distance(double miles){
        this.miles=miles;
    }

    void travelTime(){
        double time=miles/60;
        System.out.println("Time taken to travel " + miles + " miles: " + time + " hours");
    }
}
class DistanceMKS extends Distance{
    DistanceMKS(double kilometers){
        super(kilometers*0.62);
    }

    @Override
    void travelTime(){
        double kilometers=miles/0.62;
        double time=kilometers/100;
        System.out.println("Time taken to travel " + kilometers + " kilometers: " + time + " hours");

    }

}


public class DistanceDemo {
    public static void main(String[] args) {
        Distance distanceMiles = new Distance(120); 
        distanceMiles.travelTime();

        DistanceMKS distanceKilometers = new DistanceMKS(200); 
        distanceKilometers.travelTime();
    }
}
