public class Object{
    protected double distance;
    protected double angle;
    protected double diameter;
    protected String col;
    protected double rotationSpeed;

    public void drawObject(SolarSystem ss){
        ss.drawSolarObject(distance, angle, diameter, col);
    }
    public void moveObject(){
        angle = angle + rotationSpeed;
    }
    public void setRotationSpeed(double rspeed){
        rotationSpeed = rspeed;
    }
    

}