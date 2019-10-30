/**
 * This class contains all the variables that are going to be used in order to draw the sun
 */
public class Sun extends Object{

    /**
     * This constructor is made for the initialisation of the variables location, diameter and color
     * @param location this parameter is an instance of the class point which contains the distance and angle of an object
     * @param diam this parameter is double type of the diameter of the object
     * @param col this parameter is string type of the color of the object
     */
    public Sun(Point location, double diam, String col){
       this.location = location;
       diameter = diam;
       this.col = col;
    }
}