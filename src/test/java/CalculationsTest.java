

import org.junit.Assert;
import org.junit.Test;

public class CalculationsTest {
    @Test
    public void testingExpr1() {
        Assert.assertTrue(Calculations.performCalculations("8*3/2+8*5.1+13") == 65.8);
    }

    @Test
    public void testingExpr2() {
        Assert.assertTrue(Calculations.performCalculations("12/4+7-18*2-13") == -39.0);
    }

    @Test
    public void testingExpr3() {
        Assert.assertTrue(Calculations.performCalculations("-2-8*4+15/3*12") == 26.0);
    }

    public void testingExpr4(){
        Assert.assertTrue(Calculations.performCalculations("9+2*6*(1+2)") == 45.0);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testForException() {
        Calculations.performCalculations("-2.3+5/0");
    }
}