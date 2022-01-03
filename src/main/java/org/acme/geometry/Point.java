package org.acme.geometry;

public class Point implements Geometry {
    
    private Coordinate coordinate;

    Point(){
        this.coordinate = new Coordinate();
    }

    Point(Coordinate coordinate){
        this.coordinate = coordinate;
    }

    public String getType(){
        return("Point");
    }

    public Coordinate getCoordinate(){
        return coordinate;
    }

    public Boolean isEmpty(){
        Boolean isEmpty = false;
        if (Double.isNaN(this.coordinate.getX()) && Double.isNaN(this.coordinate.getY())){
            isEmpty = true;
        }
        return isEmpty;
    }

    public void translate(double dx, double dy){
        double newX = this.coordinate.getX()+dx;
        double newY = this.coordinate.getY()+dy;
        this.coordinate = new Coordinate(newX,newY);
    }
}
