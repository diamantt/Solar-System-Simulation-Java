public class Moons extends Object{

    Planets p;

    public Moons(Point location, double diam, String col){
        this.location = location;
        diameter = diam;
        this.col = col;
    }

    public Moons(Point location, double diam, String col, Planets p){
        this.location = location;
        diameter = diam;
        this.col = col;
        this.p = p;
    }

    public void drawObjectAbout(SolarSystem ss){
        ss.drawSolarObjectAbout(location.getDistance(), location.getAngle(), diameter, col, p.getDistance(), p.getAngle());
    }
    
}