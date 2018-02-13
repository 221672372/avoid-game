import greenfoot.*;

/**
 * Write a description of class waiting here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class waiting extends World
{

    /**
     * Constructor for objects of class waiting.
     * 
     */
    public waiting()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    
    public void act()
    {
        Greenfoot.delay(100);
        World game = new Myworld();
        Greenfoot.setWorld(game);
    }
}
