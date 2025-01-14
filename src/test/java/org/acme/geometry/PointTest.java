package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    
	public static final double EPSILON = 1.0e-15;

	@Test
	public void testDefaultConstructor(){
		Point p = PointFactory.createEmptyPoint();
		Assert.assertEquals(Double.NaN, p.getCoordinate().getX(), EPSILON);
		Assert.assertEquals(Double.NaN, p.getCoordinate().getY(), EPSILON);
	}

	@Test
	public void testConstructor(){
        Point p = PointFactory.createPointA();
		Assert.assertEquals(1.0, p.getCoordinate().getX(), EPSILON);
		Assert.assertEquals(1.0, p.getCoordinate().getY(), EPSILON);
	}

	@Test
	public void testGetType(){
        Point p = PointFactory.createEmptyPoint();
		Assert.assertEquals("POINT", p.getType());
	}

	@Test
	public void testisEmpty(){
		Point p = PointFactory.createPointO();
		Point p1 = PointFactory.createEmptyPoint();

		Assert.assertTrue(p1.isEmpty());
		Assert.assertFalse(p.isEmpty());
	}

	@Test
	public void testTranslate(){
        Point p = PointFactory.createPointA();
		p.translate(1.0, 1.0);
		Assert.assertEquals(2.0, p.getCoordinate().getX(), EPSILON);
		Assert.assertEquals(2.0, p.getCoordinate().getY(), EPSILON);
	}

	@Test
	public void testClone(){
        Point p = PointFactory.createPointA();
		Point p1 = p.clone(); 
		p.translate(1.0, 1.0);
		Assert.assertEquals(1.0, p1.getCoordinate().getX(), EPSILON);
		Assert.assertEquals(1.0, p1.getCoordinate().getY(), EPSILON);
	}

	@Test
	public void testEnvelope(){
        Point p = PointFactory.createPointA();
		Envelope e = p.getEnvelope();
		Assert.assertEquals(1.0, e.getXmax(), EPSILON);
        Assert.assertEquals(1.0, e.getXmin(), EPSILON);
        Assert.assertEquals(1.0, e.getYmax(), EPSILON);
        Assert.assertEquals(1.0, e.getYmin(), EPSILON);
	}
}
