/**
 * 
 */
package fr.epita.shapes.datamodel;

/**
 * @author tbrou
 *
 */
public class Triangle implements Shape{
	
	private double side1;
	private double side2;
	private double side3;
	private double heightForSide2;
	
	
	/**
	 * @param side1
	 * @param side2
	 * @param side3
	 * @param heightForSide2
	 */
	public Triangle(double side1, double side2, double side3, double heightForSide2) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.heightForSide2 = heightForSide2;
	}
	/**
	 * @return the side1
	 */
	public double getSide1() {
		return side1;
	}
	/**
	 * @param side1 the side1 to set
	 */
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	/**
	 * @return the side2
	 */
	public double getSide2() {
		return side2;
	}
	/**
	 * @param side2 the side2 to set
	 */
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	/**
	 * @return the side3
	 */
	public double getSide3() {
		return side3;
	}
	/**
	 * @param side3 the side3 to set
	 */
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	/**
	 * @return the heightForSide2
	 */
	public double getHeightForSide2() {
		return heightForSide2;
	}
	/**
	 * @param heightForSide2 the heightForSide2 to set
	 */
	public void setHeightForSide2(double heightForSide2) {
		this.heightForSide2 = heightForSide2;
	}
	/**
	 * Calculates the area for the current Triangle
	 * @return the area as a double
	 */
	public double calculateArea() {
		return this.side2 * this.heightForSide2 / 2;
		
	}

	
	/**
	 * Calculates the perimeter for the current Triangle
	 * @return the perimeter as a double
	 */
	public double calculatePerimeter(){
		return this.side1 + this.side2 + this.side3;
	}
	
	
	

}
