package shapetype;

import java.util.Collection;
import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public abstract class ShapeTest {

   protected double[] params;
   protected Enum result;
   protected IShape shape;

   public abstract IShape getInstance();

   // Each parameter should be placed as an argument here
   // Every time runner triggers, it will pass the arguments
   // from parameters we defined in primeNumbers() method
	
   public ShapeTest(double[] params, Enum result) {
      this.params = params;
      this.result = result;
   }

   @Before
   public void initialize() {
       shape = getInstance();
   }

   // This test will run 4 times since we have 5 parameters defined
   @Test //(expected = IllegalArgumentException.class)
   public void testGetShapeType() {
       try {
            shape.setShapeSides(params);
            assertEquals(result, shape.getShapeType());
       } catch (Exception e)        {
           assertEquals(e.getClass().getName(), "java.lang.IllegalArgumentException");
       }
   }
}
