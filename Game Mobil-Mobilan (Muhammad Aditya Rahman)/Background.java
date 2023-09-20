import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background extends World
{

    /**
     * Constructor for objects of class Background.
     * 
     */
    public Background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 600, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        mobil mobil = new mobil();
        addObject(mobil,144,68);
        mobil2 mobil2 = new mobil2();
        addObject(mobil2,142,204);
        mobil3 mobil3 = new mobil3();
        addObject(mobil3,145,324);
        mobil_f1 mobil_f1 = new mobil_f1();
        addObject(mobil_f1,142,440);
        mobil_f1.setRotation(180);
        Ambulance ambulance = new Ambulance();
        addObject(ambulance,139,552);
        mobil_f1.setLocation(140,427);
        mobil_f1.setLocation(137,425);
        mobil_f1.setLocation(132,432);
        mobil3.setLocation(130,322);
        mobil2.setLocation(132,204);
        mobil.setLocation(126,91);
    }
}
