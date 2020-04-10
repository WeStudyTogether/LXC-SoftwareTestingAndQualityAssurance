package org.jfree.data.function.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.jfree.data.function.NormalDistributionFunction2D;
import org.junit.After;
import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
* @author Xingchao Long
* @date 2020年4月8日 下午6:04:45
* @classname ParameterizedNormalDistributionFunction2D
* @description 
* NormalDistributionFunction2D: 
*     double getMean():  Returns the mean for the function.
*     double getStandardDeviation(): Returns the standard deviation for the function.
*     double getValue(double x):  Returns the function value.
*/

@RunWith(Parameterized.class)
public class ParameterizedNormalDistributionFunction2D {

    enum Type {
        getMean,
        getStandardDevitation,
        getValue
    }
    
    private NormalDistributionFunction2D normalDistributionFunction2D;
    private Type type;
    private double m;
    private double s;
    private double x;
    private double anticipated;
    
    @Parameters(name = "{0}: {index}")
    public static Collection<?> data() {
        return Arrays.asList(new Object[][] {
            //当类型为getMean时,参数3没有意义,参数4是预期值
            {Type.getMean, 1, 1, 0, 1},
            
            //当类型为getStandardDevitation时,参数3没有意义,参数4是预期值
            {Type.getStandardDevitation, 1, 1, 0, 1},
            
          //当类型为getValue时,参数3是输入的x,参数4是预期值
            {Type.getValue, 1, 1, 1, 2},
        });
    }
    
    public ParameterizedNormalDistributionFunction2D(Type type, double m, double s, double x, double anticipated) {
        this.type = type;
        this.m = m;
        this.s = s;
        this.x = x;
        this.anticipated = anticipated;
    }
    
    @Before
    public void setUp() throws Exception {
        normalDistributionFunction2D = new NormalDistributionFunction2D(m, s);
    }

    @After
    public void tearDown() throws Exception {
        normalDistributionFunction2D = null;
    }

    @Test
    public void testGetMean() {
        Assume.assumeTrue(type == Type.getMean);
        assertEquals("", anticipated, normalDistributionFunction2D.getMean(), 0.0000001d);
    }
    
    @Test
    public void testGetStandardDeviation() {
        Assume.assumeTrue(type == Type.getStandardDevitation);
        assertEquals("", anticipated, normalDistributionFunction2D.getStandardDeviation(), 0.0000001d);
    }
    
    @Test
    public void testGetValue() {
        Assume.assumeTrue(type == Type.getValue);
        assertEquals("", anticipated, normalDistributionFunction2D.getValue(x), 0.0000001d);
    }

}
