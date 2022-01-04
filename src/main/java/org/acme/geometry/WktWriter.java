package org.acme.geometry;

public class WktWriter {
    
    public String write(Geometry geometry){
        String result = geometry.getType();
        if (geometry.isEmpty()){
            result += " EMPTY";
        } else {
            result += "(";
            if ( geometry instanceof Point ){
                Point point = (Point)geometry;
                result += point.getCoordinate().getX();
                result += " ";
                result += point.getCoordinate().getY();
                result += ")";
            }else if ( geometry instanceof LineString ){
                LineString lineString = (LineString)geometry;
                for (int n=0;  n < lineString.getNumPoints(); n++) {
                    result += lineString.getPointN(n).getCoordinate().getX();
                    result += " ";
                    result += lineString.getPointN(n).getCoordinate().getY();
                    result += ",";
                }
                result += ")";
            }else{
                throw new RuntimeException("geometry type not supported");
            }
        }
        return result;
    }
}
