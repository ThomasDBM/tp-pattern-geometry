package org.acme.geometry;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class LogGeometryVisitorTest {
    
    @Test
    public void testVisitorPoint() throws UnsupportedEncodingException{
        Geometry geometry = PointFactory.createPointO();
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(os);
        LogGeometryVisitor visitor = new LogGeometryVisitor(out);
        geometry.accept(visitor);
        // result contiendra ce qui est écrit dans la console
        String result = os.toString("UTF8");

        Assert.assertEquals("Je suis un point avec x=0.0 et y=0.0", result.trim());
    }

    @Test
    public void testVisitorLineString() throws UnsupportedEncodingException{
        List<Point> points = PointFactory.createPointsOA();
        Geometry geometry = new LineString(points);
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(os);
        LogGeometryVisitor visitor = new LogGeometryVisitor(out);
        geometry.accept(visitor);
        // result contiendra ce qui est écrit dans la console
        String result = os.toString("UTF8");

        Assert.assertEquals("Je suis une polyligne definie par 2 points", result.trim());
    }


}
