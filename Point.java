/**
 * This program passes the location which contains the distance and the angle of an object
 */
public class Point
{
    /**
     * Declaration of the variables distance and angle
     */
    private double dis; //distance
    private double ang; //angle

    /**
     * This constructor does the initialization of the variables distance and angle
     * @param dis this parameter is a double type and it gets the distance of the object
     * @param ang this parameter is a double type and it gets the angle of the object
     */
    public Point(double dis, double ang){
        this.dis = dis;
        this.ang = ang;
    }

    /**
     * This get method is used to fetch and return the distance when needed
     */
    public double getDistance(){
        return dis;
    }
    /**
     * This get method is used to fetch and return the angle when needed
     */
    public double getAngle(){
        return ang;
    }
    /**
     * This set method is used to set a specific distance for the variable instance when needed
     */
    public void setDistance(double dis){
        this.dis = dis;
    }
    /**
     * This set method is used to set a specific angle for the variable angle when needed
     */
    public void setAngle(double ang){
        this.ang = ang;
    }
}