package org.acme.geometry;

public class WktVisitor implements GeometryVisitor {
    
    private StringBuilder buffer;

    WktVisitor(){
        this.buffer = new StringBuilder();
    }

    public String getResult(){
        String result = buffer.toString();
        return result;
    }

    public void visit(Point point){
        String result = point.getType();
        if (point.isEmpty()){
            result += " EMPTY";
        } else {
            result += "(";
            result += point.getCoordinate().getX();
            result += " ";
            result += point.getCoordinate().getY();
            result += ")";
        }
        buffer.append(result);
    }

    public void visit(LineString lineString){
        String result = lineString.getType();
        if (lineString.isEmpty()){
            result += " EMPTY";
        } else {
            result += "(";
            for (int n=0;  n < lineString.getNumPoints(); n++) {
                result += lineString.getPointN(n).getCoordinate().getX();
                result += " ";
                result += lineString.getPointN(n).getCoordinate().getY();
                result += ",";
            }
            result += ")";
        }
        buffer.append(result);
    }
    
}
