package org.acme.geometry;

public class Coordinate {
    
    private double x;
    private double y;

    Coordinate(){
        this.x = Double.NaN;
        this.y = Double.NaN;
    }

    Coordinate(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public Boolean isEmpty(){
        Boolean isEmpty = false;
        if (Double.isNaN(this.x) && Double.isNaN(this.y)){
            isEmpty = true;
        }
        return isEmpty;
    }
}
