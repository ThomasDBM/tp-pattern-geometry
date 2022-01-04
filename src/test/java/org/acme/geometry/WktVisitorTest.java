package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class WktVisitorTest {
        
    public static final double EPSILON = 1.0e-15;

    @Test
    public void testWriter(){
        WktVisitor visitor = new WktVisitor();
        Geometry g = PointFactory.createPointA();
        g.accept(visitor);
        Assert.assertEquals("POINT(1.0 1.0)", visitor.getResult());
    }
}
