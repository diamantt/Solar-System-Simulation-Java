import java.lang.Math;

/** 
 * This class is responsible to combine everything and show it on the screen
 */
public class Main{

    public static void main(String args[])
    {
        /**
         * Declaration and initialisation of variables and instances of classes such as the sun and the planets
         * Also making an instance of the SolarSystem which is going to be our window
         */
        SolarSystem space = new SolarSystem(1100,1100);

        double rand = Math.random(); 

        /**
         * This i is used in all for loops
         */
        int i = 0;       

        Planets[] planetsArray = new Planets[5];
        
        Sun s = new Sun(new Point(0, 0), 100, "#FFFF00");
        Planets earth = new Planets(new Point(140,60), 45, "#0d59db");
        Planets mercury = new Planets(new Point(70,270), 15, "#d9c08f");
        Planets venus = new Planets(new Point(100,200), 25, "#d9c08f");
        Planets mars = new Planets(new Point(210,50), 35, "#d90000");
        Planets jupiter = new Planets(new Point(400,180), 50, "#d90000");

        /**
         * Initialisation of the array planets
         */
        planetsArray[0] = earth;
        planetsArray[1] = mercury;
        planetsArray[2] = venus;
        planetsArray[3] = mars;
        planetsArray[4] = jupiter;

        /**
         * Randomizing and setting the speed for each planet
         */
        for(i=0; i<5; i++){
            rand = Math.random();
            planetsArray[i].setRotationSpeed(rand);
        }

        /**
         * Declaration and initialisation of the instances of the class Moons
         */
        Moons earthMoon = new Moons(new Point(30,40),6,"#D3D3D3", planetsArray[0]);

        Moons marsMoon1 = new Moons(new Point(30,0),4,"#D3D3D3", planetsArray[3]);
        Moons marsMoon2 = new Moons(new Point(30,360),4,"#D3D3D3", planetsArray[3]);
        
        Moons[] jupiterMoons = new Moons[79];

        /**
         * Declaring the instance array of the class asteroids 
         * */
        AsteroidBelt[] asteroids = new AsteroidBelt[600];

        /**
         * Initialisation and setting the speed for the jupiterMoon which is an array instance of the class Moons
         * and for the asteroids which is an array instance of the class AsteroidBelt
         */
        for(i=0; i<79; i++){
            jupiterMoons[i] = new Moons(new Point(60 + Math.random() * 30, Math.random() * 360), Math.random() * 5, "#D3D3D3", planetsArray[4]);
            jupiterMoons[i].setRotationSpeed(Math.random() * 5);
        }
        for(i=0; i<600; i++){
            asteroids[i] = new AsteroidBelt(new Point(260 + Math.random() * 30,Math.random() * 360), Math.random() * 5, "#D3D3D3");
            asteroids[i].setRotationSpeed(Math.random() * 3);
        }

        /**
         * Setting the speed for earthMoon and the two marsMoons
         */
        earthMoon.setRotationSpeed(3);
        marsMoon1.setRotationSpeed(6);
        marsMoon2.setRotationSpeed(3);

        /**
         * This while loop is set to true so it continues forever until we terminate the window
         */
        while(true){

            /**
             * This command is used to draw the sun
             */
            s.drawObject(space);

            /**
             * Here we begin the drawing of all the objects(planets, moons, asteroids)
             */
            for(i=0; i<5; i++){
                planetsArray[i].drawObject(space);
                
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

            /**
             * This command is used to notify the window to finish the drawing of the objects
             */
            space.finishedDrawing();


            /**
             * Here starts the orbiting part of the objects so we move them by calling the moveObject
             */
            earthMoon.moveObject();
            marsMoon1.moveObject();
            marsMoon2.moveObject();

            for(i=0; i<600; i++){
                asteroids[i].moveObject();
            }
            for(i=0; i<79; i++){
                jupiterMoons[i].moveObject();
            }
            for(i=0; i<5; i++){
                planetsArray[i].moveObject();
            }
        }
        
    }
}