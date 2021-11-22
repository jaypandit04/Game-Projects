/* This class is used to give you a handy way to pass a pair of 2D coordinates as a single object. The behavior (methods) of the class should allow for robust options in the future. */

package Data;

public class Vector2D {
	// Fields
		// TODO: Add private class fields to store x and y values given in class constructor
	private int pointX;
	private int pointY;
	
	// Constructor
	public Vector2D(int x, int y){
		// TODO: Save the constructor parameters into class fields
		 this.pointX=x;
		 this.pointY=y;
	}
	
	// Methods
	public int getX(){
		// TODO: Remove my placeholder code below (which is there to prevent an error) and replace it with returning the value of your private field x
		return pointX;
	}
	
	public int getY(){
		// TODO: Remove my placeholder code below (which is there to prevent an error) and replace it with returning the value of your private field y
		return pointY;
	}
	
	public void setX(int newX){
		// TODO: Update the value of x to be the value in newX (Absolute assignment)
		pointX = newX;
	}
	
	public void setY(int newY){
		// TODO: Update the value of y to be the value in newY (Absolute assignment)
		pointY = newY;
	}
	
	public void adjustX(int adjustment){
		// TODO: Change the previous value of x by adding the adjustment to the previous value (Relative assignment)
		// Backward adjustments can be made by passing a negative number as an adjustment
		pointX += adjustment;
	}
	
	public void adjustY(int adjustment){
		// TODO: Change the previous value of y by adding the adjustment to the previous value (Relative assignment)
		// Backward adjustments can be made by passing a negative number as an adjustment
		pointY +=adjustment;
	}
}
