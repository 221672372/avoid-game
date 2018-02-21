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
                move(2);
            }
            else if( Greenfoot.isKeyDown( "down" ) ){
                setRotation(90);
                move(2);
            }
            else if( Greenfoot.isKeyDown( "left" ) ){
                setRotation(180);
                move(2);
            }
            else if( Greenfoot.isKeyDown( "up" ) ){
                setRotation(270);
                move(2);
            }
        }
        else{
            if( Greenfoot.isKeyDown( "right" ) ){
                setRotation(0);
                move(8);
            }
            else if( Greenfoot.isKeyDown( "down" ) ){
                setRotation(90);
                move(8);
            }
            else if( Greenfoot.isKeyDown( "left" ) ){
                setRotation(180);
                move(8);
            }
            else if( Greenfoot.isKeyDown( "up" ) ){
                setRotation(270);
                move(8);
            }
        }
    }

    public void hantei(){

        Actor actor = getOneObjectAtOffset( 0, 0, BALL_S.class );
        Actor actor2 = getOneObjectAtOffset( 0, 0, BALL_M.class );
        Actor actor3 = getOneObjectAtOffset( 0, 0, BALL_L.class );
        if( actor != null || actor2 != null || actor3 != null){
            title.life--;
            String heart ="";

            for(int i=0;i<title.life;i++){
                heart += "❤";
            }           
            getWorld().showText(heart,500,80);

            if(title.life == -1)
            {
                World game = new gameover();
                Greenfoot.setWorld(game);
            }
            invtime = 100;
        }  

    }
}
