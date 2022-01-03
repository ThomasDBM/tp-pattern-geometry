package org.acme.geometry;

import java.util.ArrayList;
import java.util.List;

public class PointFactory {

    public static Point createPointO(){
        Coordinate c = new Coordinate(0.0,0.0);
        Point point = new Point(c);
        return point;
    }

    public static Point createPointA(){
        Coordinate c = new Coordinate(1.0,1.0);
        Point point = new Point(c);
        return point;
    }

    public static List<Point> createPointsOA(){
        List<Point> points = new ArrayList<Point>();
        Coordinate c = new Coordinate(1.0,1.0);
        Point A = new Point(c);
        Coordinate c1 = new Coordinate(0.0,0.0);
        Point O = new Point(c1);
        points.add(O);
        points.add(A);
        return points;
    }
}
