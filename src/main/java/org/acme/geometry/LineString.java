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
        return "LineString" ;
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

}
