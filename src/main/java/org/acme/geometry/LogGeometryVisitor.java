package org.acme.geometry;

import java.io.PrintStream;

public class LogGeometryVisitor implements GeometryVisitor {
    
    PrintStream out;

    LogGeometryVisitor( PrintStream out){
        this.out = out;
    }

    public void visit(Point point){
        String result = "Je suis un point avec x=";
        result += point.getCoordinate().getX();
        result += " et y=";
        result += point.getCoordinate().getY();
        out.println(result);
    }

    public void visit(LineString linestring){
        String result = "Je suis une polyligne definie par ";
        result += linestring.getNumPoints();
        result += " points";
        out.println(result);
    }

}
