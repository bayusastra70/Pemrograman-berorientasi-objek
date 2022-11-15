import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RobotWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RobotWorld extends World
{
    private int currentMaxTurnSpeed=2;
    private int currentLevel=1;

    public RobotWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
        
        
    }
    public void increaseLevel(){
        currentLevel++;
        setupLevel();
        
    }
    private void setupLevel(){
        if (currentLevel == 2) {
            currentMaxTurnSpeed++;
            addObject( new Block(currentMaxTurnSpeed), 420, 326);
            addObject( new Pizza(), 459, 30);
            addObject( new Pizza(), 750, 35);
            addObject( new Pizza(), 710, 330);
            addObject( new Pizza(), 80, 400);
            addObject( new Pizza(), 450, 500);
        }
        else if (currentLevel == 3) {
            currentMaxTurnSpeed++;
            addObject( new Block(currentMaxTurnSpeed), 180, 410);
            addObject( new Pizza(), 459, 30);
            addObject( new Pizza(), 750, 35);
            addObject( new Pizza(), 710, 330);
            addObject( new Pizza(), 80, 400);
            addObject( new Pizza(), 450, 500);
            
        }
         else if (currentLevel == 4) {
             Greenfoot.stop();
         }
    }
      public void prepare(){
        Robot robot = new Robot();
        addObject(robot,48,50);
        robot.setLocation(30,40);
        
        Block block = new Block(currentMaxTurnSpeed);
        addObject(block,427,145);
        
        Home home = new Home();
        addObject(home,751,552);
        
        Scorepanel scorepanel = new Scorepanel();
        addObject(scorepanel,71,554);
        
        Pizza pizza = new Pizza();
        addObject(pizza,720,46);
        Pizza pizza2 = new Pizza();
        addObject(pizza2,410,30);
        Pizza pizza3 = new Pizza();
        addObject(pizza3,150,300);
        Pizza pizza4 = new Pizza();
        addObject(pizza4,680,310);
        Pizza pizza5 = new Pizza();
        addObject(pizza5,417,537);
        
        
        
        
        Wall wall2 = new Wall();
        addObject(wall2,52, 147);
        Wall wall3 = new Wall();
        addObject(wall3,159, 147);
        Wall wall4 = new Wall();
        addObject(wall4,266, 147);
        Wall wall5 = new Wall();
        addObject(wall5,587, 147);
        Wall wall6 = new Wall();
        addObject(wall6,692, 147);
        Wall wall7 = new Wall();
        addObject(wall7,791, 147);
        
         

        
        
    }
}
