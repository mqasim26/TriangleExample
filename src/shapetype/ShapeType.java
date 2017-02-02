package shapetype;

/**
 *
 * @author mqasim
 */
public class ShapeType {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        IShape shape = new Triangle(3.0, 5.0, 7.0);
        Enum type = shape.getShapeType();
        
        if(type == Triangle.Type.SCALENE)
            System.out.println("All sides are different");
        
    }
    
}
