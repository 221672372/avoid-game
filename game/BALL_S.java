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
    
    private int rtime = 500;
    private int flag = 0;
    public void act() 
    {
        int speed = 3;
        
        int rotate;
        int x = getX();
        int y = getY();
        
        if(x == 0 || x == 599 || y == 0 || y == 399){
            getWorld().removeObject( this );
        }
        
        if(rtime % 10 == 0){
            if(flag == 0){
                if(x < 300 && y < 200){
                    rotate = (int)(Math.random()*90 + 0);
                    setRotation(rotate);
                }
                if(x >= 300 && y < 200){
                    rotate = (int)(Math.random()*90 + 90);
                    setRotation(rotate);
                }
                if(x < 300 && y >= 200){
                    rotate = (int)(Math.random()*90 + 270);
                    setRotation(rotate);
                }
                if(x >= 300 && y >= 200){
                    rotate = (int)(Math.random()*90 + 180);
                    setRotation(rotate);
                }
                flag = 1;
            }
        }
        
        move(speed);
        rtime--;
    }
    
}
