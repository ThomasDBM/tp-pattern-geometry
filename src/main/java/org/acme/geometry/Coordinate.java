package org.acme.geometry;

public class Coordinate {
    
    private double x;
    private double y;

    Coordinate(){
        this.x = 0.0;
        this.y = 0.0;
    }

    Coordinate(double x, double y){
        this.x = x;
        this.y = y;
    }

    double getX(){
        return this.x;
    }

    double getY(){
        return this.y;
    }
}
