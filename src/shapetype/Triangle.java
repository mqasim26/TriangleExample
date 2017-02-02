/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapetype;

/**
 *
 * @author mqasim
 */
public class Triangle implements IShape {

    public static enum Type {
        EQUILATERAL, ISOSCELES, SCALENE
    }
    
    protected double side1;
    protected double side2;
    protected double side3;

    public Triangle() { }
    
    public Triangle(double side1, double side2, double side3) {

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        
    }
    
    @Override
    public void setShapeSides(double[] sides) {
        
        if(sides == null || sides.length != 3)
            throw new IllegalArgumentException("The triangle must have 3 sides");
        
        side1 = sides[0];
        side2 = sides[1];
        side3 = sides[2];
    }
    
    // validate if input is valid to create a triangle
    protected void validateInput() {

        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new IllegalArgumentException("Any of the triangle side can't be zero");
        }

        if (side1 > side2 + side3 || side2 > side1 + side3 || side3 > side1 + side2) {
            throw new IllegalArgumentException("Sum of any two sides must be greater third side");
        }
        
    }

    @Override
    public Enum getShapeType() {

        validateInput();
        
        if (side1 == side2 && side2 == side3) {
            //if all sides of triangle are equal
            return Type.EQUILATERAL;
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            //if any two sides of triangle are equal
            return Type.ISOSCELES;
        } else {
            // all sides are different
            return Type.SCALENE;
        }
    }

}
