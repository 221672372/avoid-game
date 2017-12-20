import greenfoot.*;

/**
 * Write a description of class BALL_S here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BALL_S extends BALL
{
    /**
     * Act - do whatever the BALL_S wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
         int rtime = 0;
            double minspeed = 0.5;
            double maxspeed = 3.0;
            
            if( rtime != 0 ){
                
            }
            
            double speed = minspeed + Math.random()*((maxspeed-minspeed)+1);
            
            rtime--;
            
            if( rtime == 0 ){
                rtime = 50;
                
                int rotate = (int)(Math.random() * 360 );
                
                setRotation( rotate );
            }
    }    
}
