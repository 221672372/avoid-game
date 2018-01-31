import greenfoot.*;

/**
 * Write a description of class Myworld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Myworld extends World
{
    private int rtime;

    public void act()
    {
        rtime--;
        showText("Time = "+rtime,500,50);
        if(rtime == -1)
        {
            World game = new clear();
            Greenfoot.setWorld(game);
        }
<<<<<<< HEAD
        
=======

>>>>>>> dbbd07d65a8966c0f3e706a005bb733e2791423a
        int MINx = 0;
        int MAXx = 600;
        int MINy = 0;
        int MAXy = 400;
<<<<<<< HEAD
        
        int x = MINx + (int)(Math.random()*((MAXx-MINx)+1));
        int y = MINy + (int)(Math.random()*((MAXy-MINy)+1));
        int rotate = (int)(Math.random()*360);
        
        double random_locate = Math.random() * 100;
        
=======

        int x = MINx + (int)(Math.random()*((MAXx-MINx)+1));
        int y = MINy + (int)(Math.random()*((MAXy-MINy)+1));
        int rotate = (int)(Math.random()*360);

        double random_locate = Math.random() * 100;

>>>>>>> dbbd07d65a8966c0f3e706a005bb733e2791423a
        if(random_locate >= 0 && random_locate < 25) x = 1;
        else if(random_locate >= 25 && random_locate < 50) y = 1;
        else if(random_locate >= 50 && random_locate < 75) x = 598;
        else y = 398;
<<<<<<< HEAD
        
        if (rtime % 10 == 0){
            
            double random = Math.random() * 100;
            
=======

        if (rtime % 10 == 0){

            double random = Math.random() * 100;

>>>>>>> dbbd07d65a8966c0f3e706a005bb733e2791423a
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
<<<<<<< HEAD
        
=======

>>>>>>> dbbd07d65a8966c0f3e706a005bb733e2791423a
    }

    /**
     * Constructor for objects of class Myworld.
     * 
     */
    public Myworld()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        rtime = 500;
<<<<<<< HEAD
        
        addObject( new people(), 300, 200 );
        
    }
    
    //public final void setBackground("background.jpeg")
}
=======

        addObject( new people(), 300, 200 );

    }
}
>>>>>>> dbbd07d65a8966c0f3e706a005bb733e2791423a
