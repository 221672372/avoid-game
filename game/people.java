import greenfoot.*;

/**
 * Write a description of class people here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class people extends Actor
{
    /**
     * Act - do whatever the people wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        
        if( Greenfoot.isKeyDown( "shift" ) ){
            if( Greenfoot.isKeyDown( "right" ) ){
                setRotation(0);
                move(1);
            }
            else if( Greenfoot.isKeyDown( "down" ) ){
                setRotation(90);
                move(1);
            }
            else if( Greenfoot.isKeyDown( "left" ) ){
                setRotation(180);
                move(1);
            }
            else if( Greenfoot.isKeyDown( "up" ) ){
                setRotation(270);
                move(1);
            }
        }
        else{
            if( Greenfoot.isKeyDown( "right" ) ){
                setRotation(0);
                move(10);
            }
            else if( Greenfoot.isKeyDown( "down" ) ){
                setRotation(90);
                move(10);
            }
            else if( Greenfoot.isKeyDown( "left" ) ){
                setRotation(180);
                move(10);
            }
            else if( Greenfoot.isKeyDown( "up" ) ){
                setRotation(270);
                move(10);
            }
        }
    }    
}