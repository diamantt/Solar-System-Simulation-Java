/**
 * This class is a subclass of the class Object which means by extending it, it inherites all the variables and methods that the class Object contains
 */
public class Planets extends Object{

    /**
     * This constructor is made for the initialisation of the variables location, diameter and color
     * @param location this parameter is an instance of the class point and contains the distance and angle of an object
     * @param diam this double type parameter is the diameter of the object
     * @param col this string type parameter is the color of the object
     */
    public Planets(Point location, double diam, String col){
        
        this.location = location;
        diameter = diam;
        this.col = col;
    }
    /**
     * This get method is used for fetching the Distance of the object 
     * @return it returns the distance of a planet
     */
    public double getDistance(){
        return location.getDistance();
    }

    /**
     * This get method is used for fetching the Angle of the object
     * @return it returns the angle of a planet
     */
    public double getAngle(){
        return location.getAngle();
    }

}