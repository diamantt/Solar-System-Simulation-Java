/**
 * This class is a subclass of the class Object which means by extending it, it inherites all the variables and methods that the class Object contains
 */
public class AsteroidBelt extends Object{
    /**
     * This constructor is made so that it connects to the other classes by using instances of their variables
     * @param location this parameter is a variable called location which has Point as a type and it takes the location of the asteroid
     * @param diam this parameter takes the size of the asteroid and has a double type
     * @param col this parameter takes color of the asteroid and has a string type
     */
    public AsteroidBelt(Point location, double diam, String col){
        this.location = location;
        diameter = diam;
        this.col = col;
    }
    
}