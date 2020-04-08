package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
* @author Xingchao Long
* @date 2020年4月8日 上午9:24:06
* @classname RangeTest
* @description 
* 1. boolean contains(double value):  Returns the value within the range that is closest to the specified value.
* 2. boolean equals(Object obj): Tests this object for equality with an arbitrary object.
* 3. double getLength(): Returns the length of the range.
* 4. double getLowerBound(): Returns the lower bound for the range.
* 5. double getUpperBound(): Returns the upper bound for the range.
* 6. String toString(): Returns a string representation of this Range.
*/

public class RangeTest {
    
    private Range testRange;

    @Before
    public void setUp() throws Exception {
        testRange = new Range(-1, 1);
    }

    @After
    public void tearDown() throws Exception {
        testRange = null;
    }

    @Test
    public void testContains() {
        assertEquals("The central value of -1 and 1 should be 0", 0, testRange.getCentralValue(), 0.0000001d);
    }
    
    @Test
    public void testEquals() {
        assertEquals("The central value of -1 and 1 should be 0", 0, testRange.getCentralValue(), 0.0000001d);
    }
    
    @Test
    public void testGetLength() {
        assertEquals("The central value of -1 and 1 should be 0", 0, testRange.getCentralValue(), 0.0000001d);
    }
    
    @Test
    public void testGetLowerBound() {
        assertEquals("The central value of -1 and 1 should be 0", 0, testRange.getCentralValue(), 0.0000001d);
    }
    
    @Test
    public void testGetUpperBound() {
        assertEquals("The central value of -1 and 1 should be 0", 0, testRange.getCentralValue(), 0.0000001d);
    }
    
    @Test
    public void testToString() {
        assertEquals("The central value of -1 and 1 should be 0", 0, testRange.getCentralValue(), 0.0000001d);
    }

}
