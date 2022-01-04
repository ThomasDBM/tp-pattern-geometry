package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class EnvelopeBuilderTest {
    
    public static final double EPSILON = 1.0e-15;
    
    @Test
	public void testBuild(){
        EnvelopeBuilder builder = new EnvelopeBuilder();
        builder.insert(new Coordinate(0.0,1.0));
        builder.insert(new Coordinate(2.0,0.0));
        builder.insert(new Coordinate(1.0,3.0));
        Envelope e = builder.build();
        Assert.assertEquals(2.0, e.getXmax(), EPSILON);
        Assert.assertEquals(0.0, e.getXmin(), EPSILON);
        Assert.assertEquals(3.0, e.getYmax(), EPSILON);
        Assert.assertEquals(0.0, e.getYmin(), EPSILON);
	}
}
