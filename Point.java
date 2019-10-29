public class Point
{
    private double dis; //distance
    private double ang; //angle

    public Point(double dis, double ang){
        this.dis = dis;
        this.ang = ang;
    }

    public double getDistance(){
        return dis;
    }
    public double getAngle(){
        return ang;
    }
    public void setDistance(double dis){
        this.dis = dis;
    }
    public void setAngle(double ang){
        this.ang = ang;
    }
}