package org.acme.geometry;

public class GeometryWithCachedEnvelope implements Geometry, GeometryListener {
    
    Geometry original;
    Envelope cachedEnvelope;

    GeometryWithCachedEnvelope(Geometry original){
        this.original = original;
        this.cachedEnvelope = null;
    }

    public String getType(){
        return original.getType();
    }

    public Boolean isEmpty(){
        return original.isEmpty();
    }

    public void translate(double dx, double dy){
        original.translate(dx, dy);
    }

    public Envelope getEnvelope(){
        if (this.cachedEnvelope == null){
            this.cachedEnvelope = original.getEnvelope();
        }
        return this.cachedEnvelope;
    }

    public Geometry clone(){
        return original.clone();
    }

    public void accept(GeometryVisitor visitor){
        original.accept(visitor);
    }

    public void onChange(Geometry geometry){
        if (this.cachedEnvelope != null){
            this.cachedEnvelope = original.getEnvelope();
        }
    }
}
