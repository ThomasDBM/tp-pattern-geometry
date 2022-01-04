package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class EnvelopeTest {

    public static final double EPSILON = 1.0e-15;
    
    @Test
	public void testDefaultConstructeur(){
        Envelope e = new Envelope();
        Assert.assertEquals(Double.NaN, e.getXmax(), EPSILON);
        Assert.assertEquals(Double.NaN, e.getXmin(), EPSILON);
        Assert.assertEquals(Double.NaN, e.getYmax(), EPSILON);
        Assert.assertEquals(Double.NaN, e.getYmin(), EPSILON);
	}
    
    @Test
	public void testConstructeur(){
        Coordinate c1 = new Coordinate(1.0,1.0);
        Coordinate c2 = new Coordinate(2.0,2.0);
        Envelope e = new Envelope(c1,c2);
        Assert.assertEquals(2.0, e.getXmax(), EPSILON);
        Assert.assertEquals(1.0, e.getXmin(), EPSILON);
        Assert.assertEquals(2.0, e.getYmax(), EPSILON);
        Assert.assertEquals(1.0, e.getYmin(), EPSILON);
	}

    @Test
    public void testIsEmpty(){
        Coordinate c1 = new Coordinate(1.0,1.0);
        Coordinate c2 = new Coordinate(2.0,2.0);
        Envelope e1 = new Envelope(c1,c2);
        Envelope e = new Envelope();

        Assert.assertTrue(e.isEmpty());
        Assert.assertFalse(e1.isEmpty());
    }

}
