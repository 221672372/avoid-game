import greenfoot.*;

/**
 * Write a description of class apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class apple extends Actor
{ 
    public void move() 
    {
        if( Greenfoot.isKeyDown( "up" ) ){
            setRotation(270);
            move(4);
        }


    }    
}
