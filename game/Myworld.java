import greenfoot.*;

/**
 * Write a description of class Myworld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Myworld extends World
{
    public Myworld()
    {    
        super(600, 400, 1); 
        
        addObject( new people(), 300, 200 );
    }
    
    public final void setBackground("background.jpeg")
}
