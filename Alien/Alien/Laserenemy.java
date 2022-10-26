import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Laserenemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Laserenemy extends Actor
{
    public void act()
    {
        // Add your action code here.
        move(8);
        
        laserCollision();
        
        
        
    }
    private void laserCollision(){
        if (isTouching(Enemy.class)){
            
            getWorld().addObject(
                new Boom(),
                getX(),
                getY()
            );
            
            
            
            removeTouching(Enemy.class);
            getWorld().removeObject(this);
        } else if (isAtEdge())
            getWorld().removeObject(this);
    }
}
