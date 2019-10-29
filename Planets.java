public class Planets extends Object{
    
    public Planets(Point location, double diam, String col){
        
        this.location = location;
        diameter = diam;
        this.col = col;
    }
    public double getDistance(){
        return location.getDistance();
    }

    public double getAngle(){
        return location.getAngle();
    }

}