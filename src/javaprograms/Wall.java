package javaprograms;

/**Write a class with the name Wall. The class needs two fields (instance variables) with name width
 and height of type double.
 The class needs to have two constructors. The first constructor does not have any parameters (no-arg
 constructor). The second constructor has parameters width and height of type double and it needs to
 initialize the fields. In case the width is less than 0 it needs to set the width field value to 0, in case the
 height parameter is less than 0 it needs to set the height field value to 0.
 Write the following methods (instance methods):
 * Method named getWidth without any parameters, it needs to return the value of width field.
 * Method named getHeight without any parameters, it needs to return the value of height field.
 * Method named setWidth with one parameter of type double, it needs to set the value of the width
 field. If the parameter is less than 0 it needs to set the width field value to 0.
 * Method named setHeight with one parameter of type double, it needs to set the value of the
 height field. If the parameter is less than 0 it needs to set the height field value to 0.
 * Method named getArea without any parameters, it needs to return the area of the wall.
 TEST EXAMPLE
 → TEST CODE: (Write bellow code into main method and run and compare result with OUTPUT)
 Wall wall = new Wall (5, 4);
 System.out.println("area= " + wall.getArea());
 wall.setHeight(-1.5);
 System.out.println("width= " + wall.getWidth());
 System.out.println("height= " + wall.getHeight());
 System.out.println("area= " + wall.getArea());
 → OUTPUT:
 area= 20.0
 width= 5.0
 height= 0.0
 area= 0.0
 NOTE: All methods should be defined as public NOT public static.
 NOTE: In total, you have to write 5 methods and 2 constructors.
 *
 */

public class Wall {

    public static void main(String[] args) {
        // TEST CODE
        Wall wall = new Wall(5, 4);
        System.out.println("area= " + wall.getArea()); // Should print 20.0

        wall.setHeight(-1.5); // Invalid height, should set to 0
        System.out.println("width= " + wall.getWidth());  // Should print 5.0
        System.out.println("height= " + wall.getHeight()); // Should print 0.0
        System.out.println("area= " + wall.getArea());  // Should print 0.0
    }
    // Instance variables (fields)
    private double width;
    private double height;

    // No-arg constructor
    public Wall() {
        this.width = 0;
        this.height = 0;
    }

    // Constructor with parameters
    public Wall(double width, double height) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // Method to get the value of width
    public double getWidth() {
        return width;
    }

    // Method to set the value of width
    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    // Method to get the value of height
    public double getHeight() {
        return height;
    }

    // Method to set the value of height
    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // Method to calculate the area of the wall
    public double getArea() {
        return this.width * this.height;
    }


}