import greenfoot.*;

/**
 * Write a description of class shooting here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class title extends World
{

    /**
     * Constructor for objects of class shooting.
     * 
     */
    
    public static int life;/* 残機 */
    
    public title()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        life = 3;
        showText("Zキーでスタート",300,300);
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("z"))
        {
            World game = new waiting();
            Greenfoot.setWorld(game);
        }
    }
}
