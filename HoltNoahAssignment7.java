
import java.util.Scanner;

public class HoltNoahAssignment7 {

	public static void main(String[] args) {
		/*Noah Holt
		 * CS1150 Principles of computer science
		 * m/w section
		 * Due 17 mar
		 * Assignment 7
		 * This assignment is to create a area calculator to get us 
		 * better oriented with using different methods and so we will
		 * Calculate the area of different shapes with different dimensions
		 * based on user inputs
		 */
		
		Scanner user = new Scanner(System.in);
		
		System.out.println("*********************************");
		System.out.println(" Welcome to the Geometry Program");
		System.out.println("*********************************");
		System.out.println(" ");
		System.out.println("Compute Area (Y/N):");
		
		
		
		user.close();
	}
	
	public static int getShape(Scanner userShape) {
		
		
	}
	
	public static double circleArea(double radius) {
		
		final double pi = 3.14159265359;
		double radiusSquared = Math.pow(radius, 2);
		double areaCircle = pi * radiusSquared;
		
		System.out.println("Circle area = " + areaCircle);
		
	}
	
	public static double pentagonArea(double length) {
		
		final double pi = 3.14159265359;
		double s = 2 * length * Math.sin(pi/5);
		double numerator = 5 * Math.pow(s, 2);
		double denominator = 4 * Math.tan(pi/5);
		double areaPenta = numerator / denominator;
		
		System.out.println("Pentagon area = " + areaPenta);
	}
	
	public static double hexagonArea(double side) {
		
		final double pi = 3.14159265359;
		double numerator = 6 * Math.pow(side, 2);
		double denominator = 4 * Math.tan(pi/6);
		double areaHexa = numerator / denominator;
		
		System.out.println("Hexagon area = " + areaHexa);
		
	}
	
	public static boolean keepGoing(Scanner userInput) {
		
	}

}
