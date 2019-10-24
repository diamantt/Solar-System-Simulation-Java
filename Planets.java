public class Planets extends Object{
    private String name;
    public Planets(double dis, double ang, double diam, String col){
        distance = dis;
        angle = ang;
        diameter = diam;
        this.col = col;


    }
    public double getDistance(){
        return distance;
    }
    public double getAngle(){
        return angle;
    }
    /*
    public void setDistance(double newDistance){
        this.dis = newDistance;
    }
    public void setAngle(double newAngle){
        this.ang = newAngle;
    }
    public void setDiameter(double newDiameter){
        this.diam = newDiameter;
    }
    public void setColor(String newColor){
        this.col = newColor;
    }
    */

}