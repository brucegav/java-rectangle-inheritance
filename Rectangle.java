/**
 *  Rectangle.java
 *******************************************************************************
 *******************************************************************************
 * Bruce Gavins
 * MSI-5030
 * Assignment 5.1
 * Rectangle class file
 */

/**
 *  This class represents a rectangle shape with width and height dimensions.
 *  It keeps track of how many rectangles objects have been created by the program as well.
 */
public class Rectangle {
    //Instance variables
    private double width;
    private double height;

    //Static variable to count number of rectangles created.
    private static int count = 0;

    /**
     *  Constructor that initializes the width and height of the rectangle and increments
     *  the count of rectangles.
     *
     *  takes as 1st parameter the width of the rectangle.
     *  takes as 2nd parameter the height of the rectangle.
     */
    public Rectangle(double width, double height) {
	this.width = width;
	this.height = height;
	count++; // rectangle amount incrementer
    }

    /**
     *  Accessor method for the width.
     *
     *  returns the width of the rectangle.
     */
    public double getWidth() {
	return width;
    }

    /**
     *  Mutator method for the width.
     *
     *  takes as parameter the new width to set.
     */
    public void setWidth(double width) {
	this.width = width;
    }

    /**
     *  Accessor method for the height.
     *
     *  returns the height of the rectangle.
     */
    public double getHeight() {
	return height;
    }

    /**
     *  Mutator method for the height.
     *
     *  takes a parameter the new height to set.
     */
    public void setHeight(double height) {
	this.height = height;
    }

    /**
     *  Accessor method for the static count variable
     *  returns the number of rectangle objects created so far
     */
    public static int getCount() {
	return count;
    }

    /**
     *  Calculates the surface area of the rectangle.
     *
     *  returns the rectangle's surface area value (width * height).
     */
    public double computeSurfaceArea() {
	return width * height;
    }

    /**
     *  uses toString to display a string representing the rectangle
     *
     *  returns a string containing the rectangle's dimensions and area.
     */
    public String toString() {
	return "Rectangle [width=" + width + ", height=" + height + ", area=" + computeSurfaceArea() + "]";
    }
}
    
	 
