package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class AbstractGeometryTest {
    
    public static final double EPSILON = 1.0e-15;

    @Test
    public void testAsText(){
        Point p = PointFactory.createPointA();
        String result = p.asText();
        Assert.assertEquals("POINT(1.0 1.0)", result);
    }
}
