package org.jfree.data.function.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.jfree.data.function.PowerFunction2D;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
* @author Xingchao Long
* @date 2020年4月8日 下午6:02:15
* @classname ParameterizedPowerFunction2DTest
* @description 
* PowerFunction2D: A function of the form y = a * x ^ b. 
*     double getValue(double x): Returns the value of the function for a given input ('x').
*/

@RunWith(Parameterized.class)
public class ParameterizedPowerFunction2DTest {
    
    private PowerFunction2D powerFunction2D;
    private double a;
    private double b;
    private double x;
    private double anticipated;

    @Parameters(name = "{index}")
    public static Collection<?> data() {
        return Arrays.asList(new Object[][] {
            {1, 1, 2, 2},
            {1, 1, 2, 2}
        });
    }
    
    public ParameterizedPowerFunction2DTest(double a, double b, double x, double anticipated) {
        this.a = a;
        this.b = b;
        this.x = x;
        this.anticipated = anticipated;
    }
    
    @Before
    public void setUp() throws Exception {
        powerFunction2D = new PowerFunction2D(a, b);
    }

    @After
    public void tearDown() throws Exception {
        powerFunction2D = null;
    }

    @Test
    public void testGetValue() {
        assertEquals("", anticipated, powerFunction2D.getValue(x), 0.0000001d);
    }

}
