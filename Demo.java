/**
 * Demo.java
 *******************************************************************************************************
 *******************************************************************************************************
 * Bruce Gavins
 * MSI-5030
 * Assignment 5.1
 * Demo class/ main method for program execution
 */
public class Demo {
    /**
     * Main method to execute the program.
     * Creates instances of rectangle and rectPrism, tests their methods, and demonstrates that the count
     * variable track the objects correctly.
     *
     */
    public static void main(String[] args) {
	//Creates a rectangle object
	System.out.println("Creating rectangle with width=5.0 and height=3.0");
	Rectangle rectangle = new Rectangle(5.0, 3.0);

	//Tests Rectangle class methods
	System.out.println("\nTesting Rectangle methods:");
	System.out.println("Width: " +rectangle.getWidth());
	System.out.println("Height: " +rectangle.getHeight());
	System.out.println("Surface Area: " +rectangle.computeSurfaceArea());
	System.out.println("ToString: " +rectangle.toString());

	//Create another Rectangle to test count variable
	Rectangle anotherRectangle = new Rectangle(7.0, 2.0);
	System.out.println("\nCreated another rectangle");
	System.out.println("Total rectangles created: " +Rectangle.getCount());

	//Create a RectPrism object
	System.out.println("\nCreating a rectangular prism with width=4.0, height=3.0, depth=2.0");
	RectPrism prism = new RectPrism(4.0,3.0,2.0);

	//Tests RectPrism class methods
	System.out.println("\nTesting RectPrism methods:");
	System.out.println("Width: " +prism.getWidth());
        System.out.println("Height: " +prism.getHeight());
	System.out.println("Depth: " +prism.getDepth());
	System.out.println("Volume: " +prism.computeVolume());
	System.out.println("Surface Area: " +prism.computeSurfaceArea());
	System.out.println("ToString: " +prism.toString());

	//Create another RectPrism to test count variable
	RectPrism anotherPrism = new RectPrism(2.0, 2.0, 2.0);
	System.out.println("\nCreated another rectangular prism");
	System.out.println("Total rectangular prisms created: " + RectPrism.getCount());

	//Demonstrate that the count variable in both classes are correct
	System.out.println("\nVerifying count variables:");
	System.out.println("Total Rectangle objects (should be 4, including RectPrisms): " + Rectangle.getCount());
	System.out.println("Total RectPrism objects (should be 2): " + RectPrism.getCount());

	//Testing setter methods
	System.out.println("\nTesting setter methods:");
	rectangle.setWidth(10.0);
	rectangle.setHeight(8.0);
	System.out.println("After modification of dimensions - Rectangle: " + rectangle);

	prism.setWidth(6.0);
	prism.setHeight(5.0);
	prism.setDepth(4.0);
	System.out.println("After modification of dimensions - RectPrism: " + prism);
    }
}


       
	
