public class Truck {
    private String truckID;
    private double odometer;
    private double mpg;
    private double fuel;
    private final double CAPACITY = 20.0;
    private static double totalFuel;
    public Truck(String truckID) {
        this.truckID = truckID;
    }
    public Truck(String truckID, double odometer, double mpg, double fuel) {
        this.truckID = truckID;
        this.odometer = odometer;
        this.mpg = mpg;
        this.fuel = fuel;
    }
    public String getTruckID() {
        return truckID;
    }
    public double getOdometer() {
        return odometer;
    }
    public double getMpg() {
        return mpg;
    }
    public double getFuel() {
        return fuel;
    }
    public void setMpg(double mpg) {
        this.mpg = mpg;
    }
    public boolean enoughFuel(int miles) {
        if(miles / mpg > fuel)
            return false;
        else
            return true;
    }
    public int drive(int miles) {
        if (enoughFuel(miles)) {
            odometer += miles;
            fuel -= miles / mpg;
            return 1;
        } else {
            return 0;
        }
    }
    public void fill() {
        double adding = CAPACITY - fuel;
        fuel += adding;
        totalFuel += adding;
    }
    public int fill(double gallons) {
        if (fuel + gallons > CAPACITY) {
            return 0;
        } else {
            fuel += gallons;
            totalFuel += gallons;
            return 1;
        }
    }
    public static double getTotalFuel() {
        return totalFuel;
    }
    public String toString() {
        return "Truck: " + truckID + "\nOdometer: " + odometer + "\nMiles Per Gallon: " + mpg + "\nFuel: " + fuel;
    }
}
