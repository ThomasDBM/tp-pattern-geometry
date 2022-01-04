package org.acme.geometry;

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
		Assert.assertEquals("LINESTRING", l.getType());
    }

	@Test
	public void testisEmpty(){
		List<Point> ps = PointFactory.createPointsOA();
		LineString l = new LineString(ps);
		LineString l1 = new LineString();

		Assert.assertTrue(l1.isEmpty());
		Assert.assertFalse(l.isEmpty());
	}

	@Test
	public void testTranslate(){
        List<Point> p = PointFactory.createPointsOA();
		LineString l = new LineString(p);
		l.translate(1.0, 1.0);
		Assert.assertEquals(1.0, l.getPointN(0).getCoordinate().getX(), EPSILON);
		Assert.assertEquals(1.0, l.getPointN(0).getCoordinate().getY(), EPSILON);
		Assert.assertEquals(2.0, l.getPointN(1).getCoordinate().getX(), EPSILON);
		Assert.assertEquals(2.0, l.getPointN(1).getCoordinate().getY(), EPSILON);
	}

	@Test
	public void testClone(){
        List<Point> p = PointFactory.createPointsOA();
		LineString l = new LineString(p);
		LineString l1 = l.clone();
		l.translate(1.0, 1.0);
		Assert.assertEquals(0.0, l1.getPointN(0).getCoordinate().getX(), EPSILON);
		Assert.assertEquals(0.0, l1.getPointN(0).getCoordinate().getY(), EPSILON);
		Assert.assertEquals(1.0, l1.getPointN(1).getCoordinate().getX(), EPSILON);
		Assert.assertEquals(1.0, l1.getPointN(1).getCoordinate().getY(), EPSILON);
	}

	@Test
	public void testEnvelope(){
        List<Point> p = PointFactory.createPointsOA();
		LineString l = new LineString(p);
		Envelope e = l.getEnvelope();
		Assert.assertEquals(1.0, e.getXmax(), EPSILON);
        Assert.assertEquals(0.0, e.getXmin(), EPSILON);
        Assert.assertEquals(1.0, e.getYmax(), EPSILON);
        Assert.assertEquals(0.0, e.getYmin(), EPSILON);
	}
}

