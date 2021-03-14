
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
		
		boolean computing = keepGoing(user);
		
		while (computing) {

			int shapeChoice = getShape(user);
			
			switch (shapeChoice) {
				
				case 1:
					System.out.println("Please enter the radius of your circle:");
					double radius = user.nextDouble();
					double userCircleArea = circleArea(radius);
					System.out.println("Circle Area = " + userCircleArea);
					break;
				case 2:
					System.out.println("Please enter the length from the center to the vertex of your pentagon:");
					double length = user.nextDouble();
					double userPentaArea = pentagonArea(length);
					System.out.println("Pentagon Area = " + userPentaArea);
					break;
				case 3:
					System.out.println("Please enter the side length of your hexagon:");
					double side = user.nextDouble();
					double userHexaArea = hexagonArea(side);
					System.out.println("Hexagon Area = " + userHexaArea);
					break;
			
			}
			
			System.out.println(" ");
			computing = keepGoing(user);
		}
		
		System.out.println("That was fun, thanks for playing. Goodbye.");
		
		user.close();
	}
	
	public static boolean keepGoing(Scanner user) {
		
		System.out.println("Compute Area (Y/N):");
		char userAnswer = user.next().toUpperCase().charAt(0);
		
		while ((userAnswer != 'Y') && (userAnswer != 'N')) {
			
			System.out.println(userAnswer + " is not a valid answer - try again.");
			userAnswer = user.next().toUpperCase().charAt(0);
			
		}
		
		if (userAnswer == 'Y') {
			return true;
		} else {
			return false;
		}
		
	}

	public static int getShape(Scanner user) {
		
		System.out.println("Option	Shape");
		System.out.println("--------------");
		System.out.println("1	Circle");
		System.out.println("2	Pentagon");
		System.out.println("3	Hexagon");
		System.out.println(" ");
		System.out.println("Select a shape to compute an area for. Select 1, 2, or 3:");
		int userShape = user.nextInt();
		
		while ((userShape > 3) || (userShape < 1)) {
			System.out.println(userShape + " is not a valid shape choice - try again.");
			
			userShape = user.nextInt();
		}
		return userShape;
	}
	
	public static double circleArea(double radius) {
		
		final double pi = 3.14159265359;
		double radiusSquared = Math.pow(radius, 2);
		double areaCircle = pi * radiusSquared;
		
		return areaCircle;
		
	}
	
	public static double pentagonArea(double length) {
		
		final double pi = 3.14159265359;
		double s = 2 * length * Math.sin(pi/5);
		double numerator = 5 * Math.pow(s, 2);
		double denominator = 4 * Math.tan(pi/5);
		double areaPenta = numerator / denominator;
		
		return areaPenta;
	}
	
	public static double hexagonArea(double side) {
		
		final double pi = 3.14159265359;
		double numerator = 6 * Math.pow(side, 2);
		double denominator = 4 * Math.tan(pi/6);
		double areaHexa = numerator / denominator;
		
		return areaHexa;
		
	}
	
}
