public class Moons extends Object{

    Planets p;

    public Moons(double dis, double ang, double diam, String col){
        distance = dis;
        angle = ang;
        diameter = diam;
        this.col = col;
    }

    public Moons(double dis, double ang, double diam, String col, Planets p){
        distance = dis;
        angle = ang;
        diameter = diam;
        this.col = col;
        this.p = p;
    }

    public void drawObjectAbout(SolarSystem ss){
        ss.drawSolarObjectAbout(distance,angle, diameter, col, p.getDistance(), p.getAngle());
    }
    
}