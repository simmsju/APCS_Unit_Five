public class Square {

    // Create a private double variable called side. It will NOT be static.
    private double side;

    public Square(double s) {
        side = s;
    }
    // Create the constructor for Square. It will take one parameter and assign that value to side.


    public double calculateArea() {
        return side*side;
    }
    /**
     * calcuateArea will take no parameters and returns the area of the square
     * @return the area of the square as a double
     */
}
