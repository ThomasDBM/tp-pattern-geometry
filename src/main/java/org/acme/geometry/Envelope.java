package org.acme.geometry;

public class Envelope {

    private Coordinate bottomLeft;
    private Coordinate topRight;

    Envelope(){
        this.bottomLeft = new Coordinate();
        this.topRight = new Coordinate();
    }

    Envelope(Coordinate bottomleft, Coordinate topright){
        this.bottomLeft = bottomleft;
        this.topRight = topright;
    }
    
    public boolean isEmpty(){
        boolean Empty = false;
        if (this.bottomLeft.isEmpty() && this.topRight.isEmpty()){
            Empty = true;
        }
        return Empty;
    }

    public double getXmin(){
        return this.bottomLeft.getX();
    }

    public double getYmin(){
        return this.bottomLeft.getY();
    }

    public double getXmax(){
        return this.topRight.getX();
    }

    public double getYmax(){
        return this.topRight.getY();
    }
}
