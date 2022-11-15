import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Block here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Block extends Actor
{
    private int turnSpeed;
    /**
     * Act - do whatever the Block wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        turn(turnSpeed);
            
    }
    public Block (int maxTurnSpeed){
        turnSpeed = Greenfoot.getRandomNumber(maxTurnSpeed*2)-maxTurnSpeed;
        if (turnSpeed == 0)
            turnSpeed = 1;
    }
}
