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

   // public static int hit = 0;/* 被弾判定用変数 */
    private int invtime = 0;/* invtime...無敵時間 */

    public void act() {
        operation();
        
        if(invtime > 0 ){
            --invtime;
            if( (invtime % 2 ) == 1 ) getImage().setTransparency(0);
            else getImage().setTransparency(255);
        }
        else hantei();
    }

    public void operation(){
        
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
        
    public void hantei(){
            
        Actor actor = getOneObjectAtOffset( 0, 0, BALL_S.class );
        if( actor != null ){
            title.life--;
            if(title.life == -1)
            {
                World game = new gameover();
                Greenfoot.setWorld(game);
            }
            invtime = 100;
        }  

        Actor actor2 = getOneObjectAtOffset( 0, 0, BALL_M.class );
        if( actor2 != null ){
            title.life--;
            if(title.life == -1)
            {
                World game = new gameover();
                Greenfoot.setWorld(game);
            }
            invtime = 100;
        }

        Actor actor3 = getOneObjectAtOffset( 0, 0, BALL_L.class );
        if( actor3 != null ){
            title.life--;
            if(title.life == -1)
            {
                World game = new gameover();
                Greenfoot.setWorld(game);
            }
            invtime = 100;
        }
    }
}