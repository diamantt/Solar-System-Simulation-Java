public class Object{

    protected Point location;
    /*
    protected double distance;
    protected double angle;
    */
    protected double diameter;
    protected String col;
    protected double rotationSpeed;

    public void drawObject(SolarSystem ss){
        ss.drawSolarObject(location.getDistance(), location.getAngle(), diameter, col);
    }

    public void moveObject(){
        location.setAngle(location.getAngle() + rotationSpeed);
    }
    
    public void setRotationSpeed(double rspeed){
        rotationSpeed = rspeed;
    }
    

}