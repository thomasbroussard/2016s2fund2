/**
 * 
 */
package fr.epita.shapes.datamodel;

/**
 * @author tbrou
 *
 */
public class Circle implements Shape{

	private double radius;


	/**
	 * @param radius
	 */
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}


	@Override
	public double calculatePerimeter() {
		return Math.PI * this.radius * 2;
	} 
	@Override
	public double calculateArea() {
		return Math.PI * this.radius * this.radius;
	}
	

}
