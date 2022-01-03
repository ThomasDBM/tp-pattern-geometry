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
		Assert.assertEquals("Point", p.getType());
	}

	@Test
	public void testisEmpty(){
		Point p = PointFactory.createPointO();
		Point p1 = PointFactory.createEmptyPoint();

		Assert.assertTrue(p1.isEmpty());
		Assert.assertFalse(p.isEmpty());
	}
}
