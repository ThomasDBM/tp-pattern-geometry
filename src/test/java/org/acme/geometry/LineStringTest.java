package org.acme.geometry;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class LineStringTest {

    public static final double EPSILON = 1.0e-15;

	@Test
	public void testDefaultConstructor(){
		LineString l = new LineString();
		Assert.assertTrue(true);
	}

    @Test
	public void testGetNumPoint(){
        List<Point> ps = PointFactory.createPointsOA();
        LineString l = new LineString(ps);
        Assert.assertEquals(2,l.getNumPoints());
	}

	@Test
	public void testConstructor(){
		List<Point> ps = PointFactory.createPointsOA();
        LineString l = new LineString(ps);
		Assert.assertEquals(1.0, l.getPointN(1).getCoordinate().getX(), EPSILON);
	}

    @Test
	public void testGetType(){
		LineString l = new LineString();
		Assert.assertEquals("LineString", l.getType());
    }
}

