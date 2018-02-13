import greenfoot.*;

/**
 * Write a description of class clear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class clear extends World
{

    /**
     * Constructor for objects of class clear.
     * 
     */
    public clear()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        showText("CLEAR!!!",300,200);

        showText("Enterキーを押してください",300,300);
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("enter"))
        {
            World game = new title();
            Greenfoot.setWorld(game);
        }
    }
}
