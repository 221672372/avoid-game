import greenfoot.*;

/**
 * Write a description of class people here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class people extends Actor
{
    private int Life;

    public people(){
        Life = 5;
    }

    /**
     * Act - do whatever the people wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {

        getWorld().showText( "Life = "+Life,100, 50 );

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

        Actor actor = getOneObjectAtOffset( 0, 0, BALL_S.class );
        if( actor != null ){
            Life--;
            getWorld().showText( "Life = "+Life,100, 50 );
            getWorld().removeObject( actor );
            if(Life == 0){
                World game = new gameover();
                Greenfoot.setWorld(game);
            }

        }  

        Actor actor2 = getOneObjectAtOffset( 0, 0, BALL_M.class );
        if( actor2 != null ){
            Life--;
            getWorld().showText( "Life = "+Life,100, 50 );
            getWorld().removeObject( actor2 );
       
            if(Life == 0){
                World game = new gameover();
                Greenfoot.setWorld(game);
            }

        }

        Actor actor3 = getOneObjectAtOffset( 0, 0, BALL_L.class );
        if( actor3 != null ){
            Life--;
            getWorld().showText( "Life = "+Life,100, 50 );
            getWorld().removeObject( actor3 );
        
            if(Life == 0){
                World game = new gameover();
                Greenfoot.setWorld(game);
            }

        }
    }

}
