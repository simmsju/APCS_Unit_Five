import java.util.Scanner;

public class SquareDriver {

    /* Create a main method. In that method create a Scanner object to get a double from the user.
       Create an instance of the Square class and print the area of the square using the calculateArea()
       method of square.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter side length: ");
        double sideL = scan.nextDouble();
        Square square1 = new Square(sideL);
        System.out.println(square1.calculateArea());
    }
}


