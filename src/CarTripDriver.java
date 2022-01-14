public class CarTripDriver {
    public static void main(String[] args) {
        CarTrip trip1 = new CarTrip();
        CarTrip trip2 = new CarTrip(425, 612, 5.45, 4.25);
        System.out.println(trip2.getTripDistance());
        System.out.println(trip2.getAverageSpeed());
        System.out.println(trip2.getGasMileage());
        System.out.println(trip2.getTotalGasPrice(2.37));
        System.out.println(trip2.toString());
    }
}
