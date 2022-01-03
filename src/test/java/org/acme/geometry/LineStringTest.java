package org.acme.geometry;

import java.util.ArrayList;

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
		Coordinate c = new Coordinate(1.0,1.0);
        Point p = new Point(c);
        ArrayList<Point> ps = new ArrayList<Point>();
        ps.add(p);
        LineString l = new LineString(ps);
        Assert.assertEquals(1,l.getNumPoints());
	}

	@Test
	public void testConstructor(){
		Coordinate c = new Coordinate(1.0,1.0);
        Point p = new Point(c);
        ArrayList<Point> ps = new ArrayList<Point>();
        ps.add(p);
        LineString l = new LineString(ps);
		Assert.assertEquals(1.0, l.getPointN(0).getCoordinate().getX(), EPSILON);
	}

    @Test
	public void testGetType(){
		LineString l = new LineString();
		Assert.assertEquals("LineString", l.getType());
    }
}

