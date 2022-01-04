package org.acme.geometry;

import java.util.ArrayList;
import java.util.List;

public class LineString implements Geometry {
    
    public List<Point> points;

    LineString(){
        this.points = new ArrayList<Point>();
    }

    LineString(List<Point> points){
        this.points = points;
    }

    public String getType(){
        return "LINESTRING" ;
    }

    public int getNumPoints(){
        return points.size();
    }

    public Point getPointN(int n){
        return points.get(n);
    }

    public Boolean isEmpty(){
        Boolean isEmpty = false;
        if (this.points.size()<1){
            isEmpty = true;
        }
        return isEmpty;
    }

    public void translate(double dx, double dy){
        for (Point point : points) {
            point.translate(dx, dy);
        }
    }

    public LineString clone(){
        LineString newLineString = new LineString();
        for (Point point : points) {
            Point p = point.clone();
            newLineString.points.add(p);
        }
        return newLineString;
    }

    public Envelope getEnvelope(){
        EnvelopeBuilder builder = new EnvelopeBuilder();
        for (Point point : points) {
            builder.insert(point.getCoordinate());
        }
        return builder.build();
    }

}
