/**
 * 
 */
package fr.epita.shapes.launcher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fr.epita.shapes.datamodel.Circle;
import fr.epita.shapes.datamodel.Shape;
import fr.epita.shapes.datamodel.Square;
import fr.epita.shapes.datamodel.Triangle;

/**
 * @author tbrou
 *
 */
public class ConsoleLauncher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		List<Shape> list = new ArrayList<Shape>();
		
		Shape shape1 = new Circle(20);
		Shape square = new Square(10);
		
	
		if (shape1 instanceof Circle){
			System.out.println("detected a circle");
		}
		System.out.println("Hello, how many triangles would you like?");
		
		int wishedTriangles = scanner.nextInt();
		for (int i = 0; i < wishedTriangles ; i++){
			list.add(getTriangleFromUser(scanner));
			
		}
		
		
		System.out.println(" how many squares would you like?");
		int wishedSquares = scanner.nextInt();
		for (int i = 0; i < wishedSquares ; i++){
			list.add(getSquareFromUser(scanner));
			
		}
		double globalArea = 0.0;
		double globalPerimeter = 0.0;
		for (int i = 0; i <wishedTriangles ; i ++){
			globalArea += list.get(i).calculateArea(); 
			globalPerimeter += list.get(i).calculatePerimeter();
		}
		
		
		scanner.close();
	}

	/**
	 * @param scanner
	 */
	private static Triangle getTriangleFromUser(Scanner scanner) {
		System.out.println("Please input a value for side1");
		double side1 = scanner.nextDouble();
		System.out.println("Please input a value for side2");
		double side2 = scanner.nextDouble();
		System.out.println("Please input a value for side3");
		double side3 = scanner.nextDouble();
		System.out.println("Please input a value for the height (side2)");
		double heightForSide2 = scanner.nextDouble();
		
		
		Triangle triangle = new Triangle(side1, side2, side3, heightForSide2);
		System.out.println("this is the triangle area : " + triangle.calculateArea());
		System.out.println("this is the triangle perimeter : " + triangle.calculatePerimeter());
		return triangle;
	}

	/**
	 * @param scanner
	 */
	private static Square getSquareFromUser(Scanner scanner) {
		System.out.println("Please input a value for the square side ");
		double side = scanner.nextDouble();
		
		Square square = new Square(side);
		System.out.println("this is the square area : " + square.calculateArea());
		System.out.println("this is the square perimeter : " + square.calculatePerimeter());
		return square;
	}

	
}
