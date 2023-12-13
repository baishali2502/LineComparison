package LineComparison;

import java.util.*;

public class LineComparison {
	public static double lineLength(double x1, double y1, double x2, double y2)
	{
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}

	private static void isEqual(double x1, double y1, double x2, double y2, double x3, double y3, double x4,
			double y4) {
		double len1 = lineLength(x1, y1, x2, y2);
		double len2 = lineLength(x3, y3, x4, y4);
		
		if (len1 == len2)
			System.out.println("Lines are equal");
		else
			System.out.println("Lines are not equal");
	}

	private static void lineCompare(double x1, double y1, double x2, double y2, double x3, double y3, double x4,
			double y4) {
		double len1 = lineLength(x1, y1, x2, y2);
		double len2 = lineLength(x3, y3, x4, y4);
		if (len1 > len2)
			System.out.println("Line1 greater than Line2");
		else if (len2 > len1)
			System.out.println("Line 2 greater than Line 1");
		else
			System.out.println("Line 1 = Line 2");

	}

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the x-coordinate of the first point: ");
		double x1 = scanner.nextDouble();
		System.out.print("Enter the y-coordinate of the first point: ");
		double y1 = scanner.nextDouble();
		System.out.print("Enter the x-coordinate of the second point: ");
		double x2 = scanner.nextDouble();
		System.out.print("Enter the y-coordinate of the second point: ");
		double y2 = scanner.nextDouble();
		System.out.println("Line Length = " + lineLength(x1, y1, x2, y2));
		System.out.print("Enter the x-coordinate of the 3rd point: ");
		double x3 = scanner.nextDouble();
		System.out.print("Enter the y-coordinate of the 3rd point: ");
		double y3 = scanner.nextDouble();
		System.out.print("Enter the x-coordinate of the 4rth point: ");
		double x4 = scanner.nextDouble();
		System.out.print("Enter the y-coordinate of the 4rth point: ");
		double y4 = scanner.nextDouble();
		isEqual(x1, y1, x2, y2, x3, y3, x4, y4);
		lineCompare(x1, y1, x2, y2, x3, y3, x4, y4);
	}

}
