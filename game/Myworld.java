import greenfoot.*;

/**
 * Write a description of class Myworld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Myworld extends World
{
    private int rtime;

    public void act()
    {
        rtime--;
        showText("Time ="+rtime,500,50);
        if(rtime == 0)
        {
            showText("time up = "+rtime,200,200);
            Greenfoot.stop();
        }
    }
    

    /**
     * Constructor for objects of class Myworld.
     * 
     */
    public Myworld()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        rtime = 1000;
    }
}
