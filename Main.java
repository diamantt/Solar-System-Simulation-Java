import java.lang.Math;

public class Main{

    public static void main(String args[])
    {

        SolarSystem space = new SolarSystem(1050,1050);

        double rand = Math.random(); 
    
        int i = 0;        

        Planets[] planetsArray = new Planets[5];
        //Moons[] moonsArray = new Moons[];
        
        Sun s = new Sun(0, 0, 100, "#FFFF00");
        Planets earth = new Planets(190,60, 45, "#0d59db");
        Planets mercury = new Planets(70,270, 15, "#d9c08f");
        Planets venus = new Planets(100,200, 25, "#d9c08f");
        Planets mars = new Planets(260,50, 35, "#d90000");
        Planets jupiter = new Planets(400,180, 60, "#d90000");

        planetsArray[0] = earth;
        planetsArray[1] = mercury;
        planetsArray[2] = venus;
        planetsArray[3] = mars;
        planetsArray[4] = jupiter;

        for(i=0; i<5; i++){
            rand = Math.random();
            planetsArray[i].setRotationSpeed(rand);
        }

        Moons earthMoon = new Moons(30,40,6,"#D3D3D3", planetsArray[0]);
        
        Moons[] jupiterMoons = new Moons[79];

        for(i=0; i<79; i++){
            jupiterMoons[i] = new Moons(60 + Math.random() * 30, Math.random(), Math.random() * 5, "#D3D3D3", planetsArray[4]);
            jupiterMoons[i].setRotationSpeed(Math.random() * 5);
        }

        earthMoon.setRotationSpeed(3);

        while(true){

            s.drawObject(space);

            for(i=0; i<5; i++){
                planetsArray[i].drawObject(space);
                planetsArray[i].moveObject();
            }
            for(i=0; i<79; i++){
                jupiterMoons[i].drawObjectAbout(space);
            }
            earthMoon.drawObjectAbout(space);
            earthMoon.moveObject();
            
            space.finishedDrawing();

            for(i=0; i<79; i++){
                jupiterMoons[i].moveObject();
            }
        }
        
    }
}