package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class WktWriterTest {
    
    public static final double EPSILON = 1.0e-15;

    @Test
    public void testWriter(){
        Geometry g = PointFactory.createPointA();
        WktWriter writer = new WktWriter();
        Assert.assertEquals("POINT(1.0 1.0)", writer.write(g));
    }
}
