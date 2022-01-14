import java.io.PrintStream;

public class CarTrip {
    private int myStartOdometer;
    private int myEndOdometer;
    private double myTime;
    private double myGallonsUsed;

    public CarTrip(int startOdometer, int endOdometer, double time, double gallonsUsed) {
        myStartOdometer = startOdometer;
        myEndOdometer = endOdometer;
        myTime = time;
        myGallonsUsed = gallonsUsed;
    }

    public CarTrip() {
        myStartOdometer = 0;
        myEndOdometer = 0;
        myTime = 0.0;
        myGallonsUsed = 0.0;
    }

    public int getMyStartOdometer() {
        return myStartOdometer;
    }

    public int getMyEndOdometer() {
        return myEndOdometer;
    }

    public double getMyTime() {
        return myTime;
    }

    public double getMyGallonsUsed() {
        return myGallonsUsed;
    }

    public void setMyStartOdometer(int myStartOdometer) {
        this.myStartOdometer = myStartOdometer;
    }

    public void setMyEndOdometer(int myEndOdometer) {
        this.myEndOdometer = myEndOdometer;
    }

    public void setMyTime(double myTime) {
        this.myTime = myTime;
    }

    public void setMyGallonsUsed(double myGallonsUsed) {
        this.myGallonsUsed = myGallonsUsed;
    }

    public int getTripDistance() {
        return myEndOdometer-myStartOdometer;
    }

    public double getAverageSpeed() {
        return getTripDistance()/myTime;
    }

    public double getGasMileage() {
        return getTripDistance()/myGallonsUsed;
    }

    public double getTotalGasPrice(double pricePerGallon) {
        return ((int)((myGallonsUsed*pricePerGallon)*100+0.5))/100.0;
    }

    public String toString() {
        return "Distance traveled: " + getTripDistance() + " miles";
    }
}
