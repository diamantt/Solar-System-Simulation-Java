/**
 * This program is responsible to connect the Point class with the classes Planets, Moons and AsteroidBelt as these classes inherite the class Object
 */
public class Object{

    /**
     * Declaration of the variables location, diameter, color and rotation speed(we set them as protected because they will later be inherited in the subclasses)
     */
    protected Point location;
    protected double diameter;
    protected String col;
    protected double rotationSpeed;

    /**
     * This method is used for the drawing of the object so whenever it is called it will draw 
     * an object onto the window
     */
    public void drawObject(SolarSystem ss){
        ss.drawSolarObject(location.getDistance(), location.getAngle(), diameter, col);
    }

    /**
     * This method is used for the moving of the drawn object so whenever it is called it will make an object orbit around another object using the method setAngle 
     */
    public void moveObject(){
        location.setAngle(location.getAngle() + rotationSpeed);
    }
    
    /**
     * This method is used for setting the Rotation speed of an object
     */
    public void setRotationSpeed(double rspeed){
        rotationSpeed = rspeed;
    }
    

}