import greenfoot.*;

/**
 * Write a description of class Myworld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Myworld extends World
{
<<<<<<< HEAD

    private int rtime;/* 制限時間 */   
    private int i;/* i...for文用制御変数 */
    private int x = 550;/* ❤のx座標調整用変数 */
=======
    private int rtime;
>>>>>>> 7cb6a6fde7e8e39a51a029230c6ee4de4e8b20cb
    
    public void act()
    {
        rtime--;
        showText("Time = "+rtime,500,50);
<<<<<<< HEAD
        showText("Life = "+title.life,500,70);
=======
       
>>>>>>> 7cb6a6fde7e8e39a51a029230c6ee4de4e8b20cb
        
        if(rtime == -1)
        {
            World game = new clear();
            Greenfoot.setWorld(game);
        }

        int MINx = 0;
        int MAXx = 600;
        int MINy = 0;
        int MAXy = 400;
        
        int x = MINx + (int)(Math.random()*((MAXx-MINx)+1));
        int y = MINy + (int)(Math.random()*((MAXy-MINy)+1));
        int rotate = (int)(Math.random()*360);
        
        double random_locate = Math.random() * 100;

        if(random_locate >= 0 && random_locate < 25) x = 1;
        else if(random_locate >= 25 && random_locate < 50) y = 1;
        else if(random_locate >= 50 && random_locate < 75) x = 598;
        else y = 398;
        

        if (rtime % 10 == 0){

            double random = Math.random() * 100;

            if(random <= 20){
                addObject( new BALL_L(), x, y );
            }
            else if(random > 20 && random <= 50){
                addObject( new BALL_M(), x, y );
            }
            else if(random > 50){
                addObject( new BALL_S(), x, y );
            }
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
<<<<<<< HEAD
        rtime = 500;
        
        addObject( new people(), 300, 200 );
        
=======
        rtime = 1000;

        addObject( new people(), 300, 200 );
        
        /*for(i=0;i<3;i++){
            showText("❤",x,60);
            x -= 10;
        }
        
        if(people.life == 2){
            showText("",x,60);
        }
        if(people.life == 1){
            showText("",x-10,60);
        }
        if(people.life == 0){
            showText("",x,60);
        }*/
        
>>>>>>> 008e4028b8468ab0887d2996e414b432b276b051
    }

}
