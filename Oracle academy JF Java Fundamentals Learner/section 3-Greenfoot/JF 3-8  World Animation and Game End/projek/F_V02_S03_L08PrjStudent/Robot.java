import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
    //instance fields for the robot class
    private GreenfootImage robotImage = new GreenfootImage("man01.png");
    private GreenfootImage robotImage2 = new GreenfootImage("man2.png");
    
    private int animateCounter = 0;
    private int lives = 3;
    private int pizzaConsumed = 0;
    private int score = 0;
    private int timer;
    private final int MAXTIMER = 1000;
    
    
    
    
    public void act()
    {
        // Add your action code here.
        robotMovement();
        detectWallCollision();
        detectBlockCollision();
        detectHomeCollision();
        eatPizza();
        updateTimer();
        animate();
        
    
    }
    public Robot (){
        resetTimer();
        
    }
    private void resetTimer(){
        timer = MAXTIMER;
    }
    private void updateTimer(){
        timer--;
        getWorld().showText("time left : "+timer, 70, 500);
        if (timer< 1) {
           removeLife();
           resetTimer();
           setLocation(30,50);
        }
    }
    private void showStatus(){
        getWorld().showText("Lives : "+lives, 70,540);
        getWorld().showText("Score : "+lives, 70,560);
    }
    private void increaseScore(){
        score++;
        showStatus();
    }
    private void testEndGame(){
        if (lives < 0) {
            
            Greenfoot.stop();
        }
    }
    private void removeLife () {
        lives--;
        testEndGame();
        showStatus();
    }
   
    private void animate(){
        animateCounter++;
        if (animateCounter > 5) {
            if (getImage() == robotImage) {
                setImage(robotImage2);
            }
            else {
                setImage(robotImage);
            }
        }
    }
    private void eatPizza(){
        if (isTouching(Pizza.class)){
            Greenfoot.playSound("eat.wav");
            removeTouching(Pizza.class);
            pizzaConsumed++;
            timer = timer + 200;
           
        }
    
    }
    private void detectHomeCollision(){
        if (isTouching(Home.class)){
            Greenfoot.playSound("yee.wav");
            setLocation(30,50);
            pizzaConsumed = 0;
            increaseScore();
            RobotWorld myWorld = (RobotWorld)getWorld();
            myWorld.increaseLevel();
            resetTimer();

        }
        
    }
        
    
    
    private void robotMovement() {
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+3,getY());
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-3,getY());
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()+3);
        }
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-3);
        }
    }
    private void detectBlockCollision() {
        if (isTouching(Block.class)) {
            Greenfoot.playSound("aakk.wav");
            setLocation(30,50);
            removeLife();
            
        }
    }
    private void detectWallCollision() {
        if (isTouching(Wall.class)) {
            Greenfoot.playSound("aakk.wav");
            setLocation(30,50);
            removeLife();
        }
    }
        
    
    
    
    
    
    
    
    
    
}
