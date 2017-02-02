package shapetype;

import java.util.Arrays;
import java.util.Collection;
import org.junit.runners.Parameterized;

/**
 *
 * @author mqasim
 */
public class TriangleTest extends ShapeTest {
    
    public TriangleTest(double[] params, Enum result) {
        super(params, result);
    }
    
    @Override
    public IShape getInstance(){
        return new Triangle();
    }
    
   @Parameterized.Parameters
    public static Collection shapeData() {
      return Arrays.asList(new Object[][] {
         { new double[] { 0, 0, 0 }, null },
         { new double[] { 2, 5, 9 }, null },
         { new double[] { 12, 12, 12 }, Triangle.Type.EQUILATERAL },
         { new double[] { 10, 10, 15 }, Triangle.Type.ISOSCELES },
         { new double[] { 12, 10, 15 }, Triangle.Type.SCALENE },
      });
   }
}
