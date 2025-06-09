/**
 *  RectPrism.java
 ***********************************************************************************************
 ***********************************************************************************************
 *
 * Bruce Gavins
 * MSI-5030
 * Assignment 5.1
 * Rectangular Prism class
 */

/**
 * This class represents a rectangular prizm which extends the rectangle class.
 * This class adds a depth dimension to the previous rectangle class which only included width
 * and height.  It also keeps track of how many rectangular prism objects have been created.
 */
public class RectPrism extends Rectangle {
    //Instance variable for the added dimension
    private double depth;

    //Static variable to count number of rectangular prisms created.
    private static int count = 0;

    /**
     * Constructor that intializes all 3 dimensions of the rectangular prizm and calls the parent class
     * constructor using super().
     *
     * parameter 1 width of the rect prism
     * parameter 2 height of the rect prism
     * parameter 3 depth of the rect prism
     */
    public RectPrism(double width, double height, double depth) {
	super(width, height); //Calls parent constructor to initialize width and heigth variables
	this.depth = depth;
	count++; //Increments the count of the created rect prism object.
    }

    /**
     * Accessor method for the depth dimension.
     *
     * returns the depth of the rect prism.
     */
    public double getDepth() {
	return depth;
    }

    /**
     * Mutator method for the depth dimension.
     *
     * parameter is depth value to set as new depth
     */
    public void setDepth(double depth) {
	this.depth = depth;
    }

    /**
     * Accessor method for the static count variable.
     *
     * returns the number of rectangular prism objects created so far.
     public static int getCount() {
     return count;
     }

     /**
      * Calculates the volume of the rectangular prism.
      *
      * returns the volume value (width * height * depth).
      * calls public methods from rectangle class (parent class)
      */
    public double computeVolume() {
	return getWidth() * getHeight() * depth;
    }

    /**
     * Overrides the parent class, rectangle's, computeSurfaceArea method to calculate
     * the surface area of the rectangular prism.
     *
     * returns the surface area of the rectangular prism.
     */
    @Override
    public double computeSurfaceArea() {
	return 2 * (getWidth() * getHeight() + getWidth() * depth + getHeight() * depth);
    }

    /**
     * Overrides the parent class's toString method to provide a new
     * string representation of the rectangular prism object.
     *
     * returns string containing the dimensions and volume, and surface area of the rectangular prism.
     */
    @Override
    public String toString() {
	return "rectPrism [width=" + getWidth() + ", height=" + getHeight() + ", depth=" + depth + ", volume=" + computeVolume()
	    + ", surface area=" + computeSurfaceArea() + "]";
    }
}
  
      
 
