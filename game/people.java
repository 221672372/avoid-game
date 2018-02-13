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

<<<<<<< HEAD
    public void operation(){
        
=======
        getWorld().showText( "Life = "+Life,100, 50 );

>>>>>>> 7cb6a6fde7e8e39a51a029230c6ee4de4e8b20cb
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
<<<<<<< HEAD
            title.life--;
            if(title.life == -1)
            {
                World game = new gameover();
                Greenfoot.setWorld(game);
            }
            invtime = 100;
=======
            Life--;
            getWorld().showText( "Life = "+Life,100, 50 );
            getWorld().removeObject( actor );
            if(Life == 0){
                World game = new gameover();
                Greenfoot.setWorld(game);
            }

>>>>>>> 7cb6a6fde7e8e39a51a029230c6ee4de4e8b20cb
        }  

        Actor actor2 = getOneObjectAtOffset( 0, 0, BALL_M.class );
        if( actor2 != null ){
<<<<<<< HEAD
            title.life--;
            if(title.life == -1)
            {
                World game = new gameover();
                Greenfoot.setWorld(game);
            }
            invtime = 100;
=======
            Life--;
            getWorld().showText( "Life = "+Life,100, 50 );
            getWorld().removeObject( actor2 );
       
            if(Life == 0){
                World game = new gameover();
                Greenfoot.setWorld(game);
            }

>>>>>>> 7cb6a6fde7e8e39a51a029230c6ee4de4e8b20cb
        }

        Actor actor3 = getOneObjectAtOffset( 0, 0, BALL_L.class );
        if( actor3 != null ){
<<<<<<< HEAD
            title.life--;
            if(title.life == -1)
            {
                World game = new gameover();
                Greenfoot.setWorld(game);
            }
            invtime = 100;
=======
            Life--;
            getWorld().showText( "Life = "+Life,100, 50 );
            getWorld().removeObject( actor3 );
        
            if(Life == 0){
                World game = new gameover();
                Greenfoot.setWorld(game);
            }

>>>>>>> 7cb6a6fde7e8e39a51a029230c6ee4de4e8b20cb
        }
    }
}
