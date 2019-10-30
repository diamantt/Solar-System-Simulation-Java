/**
 * This class is a subclass of the class Object which means by extending it, it inherites all the variables and methods that the class Object contains
 */
public class Moons extends Object{

    /**
     * Instance of the class planets because we need it to fetch the location of a certain planet in order to make a moon orbit around that specific planet
     */
    Planets p;

    /**
     * This constructor is here just in case wee need to draw a moon that is not going to be orbiting around a specific planet
     * @param location this is an instance parameter of the class point
     * @param diam this is a double type parameter of the diameter of the moon
     * @param col this is a string type parameter of the color of the moon
     */
    public Moons(Point location, double diam, String col){
        this.location = location;
        diameter = diam;
        this.col = col;
    }

    /**
     * This constructor is used for initialising the variables we're gonna need if we draw a moon orbiting a specific planet
     * @param location this is an instance parameter of the class point and it's fetching the location of the object
     * @param diam this is a double type parameter of the diameter of the moon
     * @param col this is a string type parameter of the color of the moon
     * @param p this is an instance parameter of the class planets and it's fetching the location of the specific planet we want to orbit
     */
    public Moons(Point location, double diam, String col, Planets p){
        this.location = location;
        diameter = diam;
        this.col = col;
        this.p = p;
    }

    /**
     * This method is used for drawing an object about meaning around a specific planet
     */
    public void drawObjectAbout(SolarSystem ss){
        ss.drawSolarObjectAbout(location.getDistance(), location.getAngle(), diameter, col, p.getDistance(), p.getAngle());
    }
    
}