import java.lang.Math;

public class Main{

    public static void main(String args[])
    {

        SolarSystem space = new SolarSystem(1100,1100);

        double rand = Math.random(); 
    
        int i = 0;        

        Planets[] planetsArray = new Planets[5];
        
        Sun s = new Sun(new Point(0, 0), 100, "#FFFF00");
        Planets earth = new Planets(new Point(150,60), 45, "#0d59db");
        Planets mercury = new Planets(new Point(70,270), 15, "#d9c08f");
        Planets venus = new Planets(new Point(100,200), 25, "#d9c08f");
        Planets mars = new Planets(new Point(200,50), 35, "#d90000");
        Planets jupiter = new Planets(new Point(400,180), 50, "#d90000");

        planetsArray[0] = earth;
        planetsArray[1] = mercury;
        planetsArray[2] = venus;
        planetsArray[3] = mars;
        planetsArray[4] = jupiter;

        for(i=0; i<5; i++){
            rand = Math.random();
            planetsArray[i].setRotationSpeed(rand);
        }

        Moons earthMoon = new Moons(new Point(30,40),6,"#D3D3D3", planetsArray[0]);

        Moons marsMoon1 = new Moons(new Point(30,0),4,"#D3D3D3", planetsArray[3]);
        Moons marsMoon2 = new Moons(new Point(30,360),4,"#D3D3D3", planetsArray[3]);
        
        Moons[] jupiterMoons = new Moons[79];

        AsteroidBelt[] asteroids = new AsteroidBelt[600];

        for(i=0; i<79; i++){
            jupiterMoons[i] = new Moons(new Point(60 + Math.random() * 30, Math.random()), Math.random() * 5, "#D3D3D3", planetsArray[4]);
            jupiterMoons[i].setRotationSpeed(Math.random() * 5);
        }
        for(i=0; i<600; i++){
            asteroids[i] = new AsteroidBelt(new Point(250 + Math.random() * 30,Math.random()), Math.random() * 5, "#D3D3D3");
            asteroids[i].setRotationSpeed(Math.random() * 3);
        }

        earthMoon.setRotationSpeed(3);
        marsMoon1.setRotationSpeed(6);
        marsMoon2.setRotationSpeed(3);

        while(true){

            s.drawObject(space);

            for(i=0; i<5; i++){
                planetsArray[i].drawObject(space);
                planetsArray[i].moveObject();
            }
            for(i=0; i<79; i++){
                jupiterMoons[i].drawObjectAbout(space);
            }
            for(i=0; i<300; i++){
                asteroids[i].drawObject(space);
            }
            earthMoon.drawObjectAbout(space);
            marsMoon1.drawObjectAbout(space);
            marsMoon2.drawObjectAbout(space);

            space.finishedDrawing();
            
            earthMoon.moveObject();
            marsMoon1.moveObject();
            marsMoon2.moveObject();

            for(i=0; i<79; i++){
                jupiterMoons[i].moveObject();
            }
            for(i=0; i<600; i++){
                asteroids[i].moveObject();
            }
            
        }
        
    }
}