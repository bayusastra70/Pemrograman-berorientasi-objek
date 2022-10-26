import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    public Hero(){
    }
    
    public void act()
    {
        moveHero();
        shootLaser();
    }
    
    
    
    private void moveHero(){
        
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-4);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()+4);
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-4,getY());
        }
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+4,getY());
        }
    }
        

    

    
    
    private int laserTimer = 0;
    private void shootLaser(){
        if (laserTimer == 30){
            getWorld().addObject(
                new Laser(),
                getX() + 5,
                getY()
            
            );
            
            laserTimer = 0;
        }else{
            laserTimer++;
        }
    }
}
