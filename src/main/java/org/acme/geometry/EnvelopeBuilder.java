package org.acme.geometry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EnvelopeBuilder implements GeometryVisitor{
    
    private List<Double> xVals;
    private List<Double> yVals;

    EnvelopeBuilder(){
        xVals = new ArrayList<Double>();
        yVals = new ArrayList<Double>();
    }

    public void insert(Coordinate coordinate){
        this.xVals.add(coordinate.getX());
        this.yVals.add(coordinate.getY());
    }
    
    public Envelope build(){
        double xmin = Collections.min(xVals);
        double xmax = Collections.max(xVals);
        double ymin = Collections.min(yVals);
        double ymax = Collections.max(yVals);

        Coordinate bottomLeft = new Coordinate(xmin, ymin);
        Coordinate topRight = new Coordinate(xmax, ymax);

        Envelope envelope = new Envelope(bottomLeft, topRight);

        return envelope;
    }

    public void visit(Point point){
        this.insert(point.getCoordinate());
    }

    public void visit(LineString lineString){
        for (int n=0; n < lineString.getNumPoints(); n++) {
            this.insert(lineString.getPointN(n).getCoordinate());
        }
    }
}
