package org.jfree.data.function.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
* @author Xingchao Long
* @date 2020年4月8日 上午9:49:17
* @classname LineFunction2DTest
* @description 
* LineFunction2D: A function in the form y = a + bx. 
*     double getValue(double x): Returns the function value.
*/

@RunWith(Parameterized.class)
public class ParameterizedLineFunction2DTest {
    
    public ParameterizedLineFunction2DTest() {
    }

    @Parameters
    public Collection<?> data() {
        return Arrays.asList();
    }
    
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetValue() {
        fail("Not yet implemented");
    }

}
