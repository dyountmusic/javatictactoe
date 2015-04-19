import java.util.*;
import java.awt.*;

public class Turtle extends SimpleTurtle
{
  ////////////////// constructors ///////////////////////
  
  /** Constructor that takes the x and y and a picture to
    * draw on
    * @param x the starting x position
    * @param y the starting y position
    * @param picture the picture to draw on
    */
  public Turtle (int x, int y, Picture picture) 
  {
    // let the parent constructor handle it
    super(x,y,picture);
  }
  
  /** Constructor that takes the x and y and a model
    * display to draw it on
    * @param x the starting x position
    * @param y the starting y position
    * @param modelDisplayer the thing that displays the model
    */
  public Turtle (int x, int y, 
                 ModelDisplay modelDisplayer) 
  {
    // let the parent constructor handle it
    super(x,y,modelDisplayer);
  }
  
  /** Constructor that takes the model display
    * @param modelDisplay the thing that displays the model
    */
  public Turtle (ModelDisplay modelDisplay) 
  {
    // let the parent constructor handle it
    super(modelDisplay);
  }
  
  /**
   * Constructor that takes a picture to draw on
   * @param p the picture to draw on
   */
  public Turtle (Picture p)
  {
    // let the parent constructor handle it
    super(p);
  }  
  
  
  /////////////////// methods ///////////////////////
  /* This method makes a turtle draw a square
   * Heght of 30 and Width of 30
   */
  
  public void drawSquare()
  {
    this.turnRight();
    this.forward(30); 
    this.turnRight();
    this.forward(30);
    this.turnRight();
    this.forward(30); 
    this.turnRight();
    this.forward(30);
  }
  
  /* This method makes a turtle draw a square
   * Variable Width
   */
  
  public void drawSquare2()
  {
    int width = 30;
    
    this.turnRight();
    this.forward(width); 
    this.turnRight();
    this.forward(width);
    this.turnRight();
    this.forward(width);
    this.turnRight();
    this.forward(width);
  }
  
  /* This method makes a turtle draw a square
   * Width is an input parameter
   */
  
  
  
  public static void main(String[] args)
  {
    World earth = new World();
    Turtle t1 = new Turtle(earth);
    t1.forward();
  }
  
  public void drawT() 
  { 
    this.forward(100); 
    this.turnLeft(); 
    this.penUp(); 
    this.forward(40); 
    this.turn(180); 
    this.penDown(); 
    this.forward(80); 
    this.hide();
    
  }
  
  /* This method makes a turtle draw a hexagon 
   */
  
  public void drawHexagon()
    
  {
    this.penUp();
    this.setHeading(0);
    this.turn(90);
    this.forward(107);
    this.setHeading(0);
    
    this.turn(180);
    this.forward(30);
    this.turn(180);
    
    this.penDown();
    
    this.turn(120);
    this.forward(50);
    this.turn(60);
    this.forward(50);
    this.turn(60);
    this.forward(50);
    this.turn(60);
    this.forward(50);
    this.turn(60);
    this.forward(50);
    this.turn(60);
    this.forward(50);
    
    this.setHeading(0);
  }
  
  public void drawHex()
  {
    this.turn(60);
    this.forward(50);
    this.turn(60);
    this.forward(50);
    this.turn(60);
    this.forward(50);
    this.turn(60);
    this.forward(50);
    this.turn(60);
    this.forward(50);
    this.turn(60);
    this.forward(50);
  }
  
  public void hexReset()
  {
    this.penUp();
    this.turnLeft();
    this.forward(5);
    this.penDown();
  }
  
  /**
   * Method to draw a square with a width and height parameter
   * of some passed amount.
   * @param width the width and height to use
   * */
  
  public void drawSquare(int width)
  {
    this.turnRight();
    this.forward(width);
    this.turnRight();
    this.forward(width);
    this.turnRight();
    this.forward(width);
    this.turnRight();
    this.forward(width);
  }
  
  public void drawQuestionMark(Color c) {   
    // assumes we begin facing up (North) with penUp,   
    // and that we are at the bottom-left of where the letter is supposed to appear     
    // first move over while pen is up   
    
    this.turnRight();   
    this.forward(38);   
    
// now put pen down, set color  
    this.setPenColor(c);    
    this.penDown();  
    // draw vertical part of bottom of question mark  
    this.forward(4);   
    this.turnLeft(); 
    this.forward(4);
    this.turnLeft(); 
    this.forward(4);
    this.turnLeft();
    this.forward(4); 
    this.turn(180);  
    // move up a bit
    this.penUp();  
    this.forward(10);
    // draw stick below curve
    this.penDown();   
    this.forward(20);   
    // draw round part of question mark 
    int angle = -40; 
    int dist = 15;    
    this.turnRight(); 
    this.forward(5);  
    this.turn(angle);   
    this.forward(dist);  
    this.turn(angle);  
    this.forward(dist);  
    this.turn(angle);    
    this.forward(dist);
    this.turn(angle); 
    this.forward(dist);
    this.turn(angle);   
    this.forward(dist);  
    // move to bottom right of letter area
    this.penUp(); 
    this.turnLeft(); 
    this.forward(40); 
    this.turn(20);
    this.forward(30); 
    // move to next letter position`
    this.turnLeft(); 
    this.forward(35);  
    this.turnLeft(); 
  } // end of question mark method 
  
  public void drawExclamationMark(Color c) {    
    // assumes we begin facing up (North) with penUp,    
    // and that we are at the bottom-left of where the letter is supposed to appear       
    // first move over while pen is up   
    this.turnRight();     
    this.forward(38);   
    // now put pen down, set color  
    this.setPenColor(c);   
    this.penDown();    
    // draw bottom of exclamation mark    
    this.forward(4);   
    this.turnLeft();  
    this.forward(4);    
    this.turnLeft();    
    this.forward(4);   
    this.turnLeft();   
    this.forward(4);   
    this.turn(180);      
    // move up a bit  
    this.penUp();    
    this.forward(10);    
    // move right a bit  
    this.turnRight();    
    this.forward(2);   
    this.turnLeft();    
    // draw top of exclamation mrk   
    this.penDown();     
    this.forward(65);       
    // move to bottom right of letter area  
    this.penUp();   
    this.turn(180);  
    this.forward(75);   
    this.turnLeft();    
    this.forward(25);      
    // move to next letter position` 
    this.turnLeft();  
    this.forward(35); 
    this.turnLeft();      
  } 
// end of exclamation mark method  
  
  public void drawLetterS(Color c)
    //this method draws the capital letter "S" with a Pen Color option
  {
    this.turnRight();
    this.forward(13);
    this.turn(-25);
    this.forward(10);
    this.turn(-25);
    this.forward(10);
    this.turn(-25);
    this.forward(10);
    this.turn(-25);
    this.forward(10);
    this.turn(-25);
    this.forward(10);
    this.turn(-25);
    this.forward(10);
    this.turn(-25);
    
    
    this.forward(10);
    this.turn(25);
    this.forward(10);
    this.turn(25);
    this.forward(10);
    this.turn(25);
    this.forward(10);
    this.turn(25);
    this.forward(10);
    this.turn(25);
    this.forward(10);
    this.turn(25);
    this.forward(10);
    this.turn(25);
    this.forward(13);
    
    this.penUp();
    this.forward(10);
    this.turnRight();
    this.forward(85);
    this.turn(180);
    
  }
  public void drawLetterT(Color c)
    //this method draws the capital letter "T" with a Pen Color option
  {
    this.turnRight();
    this.penUp();
    this.forward(40);
    this.penDown();
    this.turn(-90);
    this.forward(100);
    this.turnLeft();
    this.forward(40);
    this.turn(180);
    this.forward(80);
    
    this.penUp();
    this.forward(10);
    this.turn(90);
    this.forward(100);
    this.turn(180); 
  }
  public void drawLetterE(Color c)
    //this method draws the capital letter "E" with a Pen Color option
  {
    this.forward(90);
    this.turnRight();
    this.forward(70);
    this.backward(70);
    this.turn(90);
    this.forward(45);
    this.turnLeft();
    this.forward(70);
    this.backward(70);
    this.turn(90);
    this.forward(45);
    this.turnLeft();
    this.forward(70);
    
    this.penUp();
    this.forward(10);
    this.turnLeft();
    
    
    
    
    
  }
  public void drawLetterL(Color c)
    //this method draws the capital letter "L" with a Pen Color option
  {
    this.forward(90);
    this.backward(90);
    this.turnRight();
    this.forward(45);
    
    this.penUp();
    this.forward(10);
    this.turnLeft();
    
    
  }
  
  public void drawLetterSBold(Color c, boolean bold)
    //this method draws the capital letter "S" with a Pen Color option and Bold option
  {
    if (bold == true)  
    { 
      this.setPenWidth(4);
    } 
    else
    { this.setPenWidth(2);
    } 
    {
      this.turnRight();
      this.forward(13);
      this.turn(-25);
      this.forward(10);
      this.turn(-25);
      this.forward(10);
      this.turn(-25);
      this.forward(10);
      this.turn(-25);
      this.forward(10);
      this.turn(-25);
      this.forward(10);
      this.turn(-25);
      this.forward(10);
      this.turn(-25);
      
      
      this.forward(10);
      this.turn(25);
      this.forward(10);
      this.turn(25);
      this.forward(10);
      this.turn(25);
      this.forward(10);
      this.turn(25);
      this.forward(10);
      this.turn(25);
      this.forward(10);
      this.turn(25);
      this.forward(10);
      this.turn(25);
      this.forward(13);
      
      this.penUp();
      this.forward(10);
      this.turnRight();
      this.forward(85);
      this.turn(180);
      
    }
  }
  public void drawLetterTBold(Color c, boolean bold)
    //this method draws the capital letter "T" with a Pen Color option and boolean Bold option
  {
    if (bold == true)  
    { 
      this.setPenWidth(4);
    } 
    else
    { this.setPenWidth(2);
    } 
    {
      this.turnRight();
      this.penUp();
      this.forward(40);
      this.penDown();
      this.turn(-90);
      this.forward(100);
      this.turnLeft();
      this.forward(40);
      this.turn(180);
      this.forward(80);
      
      this.penUp();
      this.forward(10);
      this.turn(90);
      this.forward(100);
      this.turn(180); 
    }
  }
  public void drawLetterEBold(Color c, boolean bold)
    //this method draws the capital letter "E" with a Pen Color option
  {
    if (bold == true)  
    { 
      this.setPenWidth(4);
    } 
    else
    { this.setPenWidth(2);
    } 
    {
      this.forward(90);
      this.turnRight();
      this.forward(70);
      this.backward(70);
      this.turn(90);
      this.forward(45);
      this.turnLeft();
      this.forward(70);
      this.backward(70);
      this.turn(90);
      this.forward(45);
      this.turnLeft();
      this.forward(70);
      
      this.penUp();
      this.forward(10);
      this.turnLeft();
      
      
      
      
      
    }
  }
  public void drawLetterLBold(Color c, boolean bold)
    //this method draws the capital letter "L" with a Pen Color option
  {
    if (bold == true)  
    { 
      this.setPenWidth(4);
    } 
    else
    { this.setPenWidth(2);
    } 
    {
      this.forward(90);
      this.backward(90);
      this.turnRight();
      this.forward(45);
      
      this.penUp();
      this.forward(10);
      this.turnLeft();
      
      
    }
    
    
    
    
    
  }
  public void drawSBoldSize(Color c, boolean bold, int width)
    //this method draws the capital letter "S" with a Pen Color option and Bold option
  {
    if (bold == true)  
    { 
      this.setPenWidth(4);
    } 
    else
    { this.setPenWidth(2);
    } 
    {
      this.turnRight();
      this.forward(13*width);
      this.turn(-25);
      this.forward(10*width);
      this.turn(-25);
      this.forward(10*width);
      this.turn(-25);
      this.forward(10*width);
      this.turn(-25);
      this.forward(10*width);
      this.turn(-25);
      this.forward(10*width);
      this.turn(-25);
      this.forward(10*width);
      this.turn(-25);
      
      
      this.forward(10*width);
      this.turn(25);
      this.forward(10*width);
      this.turn(25);
      this.forward(10*width);
      this.turn(25);
      this.forward(10*width);
      this.turn(25);
      this.forward(10*width);
      this.turn(25);
      this.forward(10*width);
      this.turn(25);
      this.forward(10*width);
      this.turn(25);
      this.forward(13);
      
      this.penUp();
      this.forward(10*width);
      this.turnRight();
      this.forward(85*width);
      this.turn(180);
      
    }
  }
  public void drawTBoldSize(Color c, boolean bold,int width)
    //this method draws the capital letter "T" with a Pen Color option and boolean Bold option
  {
    if (bold == true)  
    { 
      this.setPenWidth(4);
    } 
    else
    { this.setPenWidth(2);
    } 
    {
      this.turnRight();
      this.penUp();
      this.forward(40*width);
      this.penDown();
      this.turn(-90);
      this.forward(100*width);
      this.turnLeft();
      this.forward(40*width);
      this.turn(180);
      this.forward(80*width);
      
      this.penUp();
      this.forward(10*width);
      this.turn(90);
      this.forward(100*width);
      this.turn(180); 
    }
  }
  public void drawEBoldSize(Color c, boolean bold,int width)
    //this method draws the capital letter "E" with a Pen Color option
  {
    if (bold == true)  
    { 
      this.setPenWidth(4);
    } 
    else
    { this.setPenWidth(2);
    } 
    {
      this.forward(90*width);
      this.turnRight();
      this.forward(70*width);
      this.backward(70*width);
      this.turn(90);
      this.forward(45*width);
      this.turnLeft();
      this.forward(70*width);
      this.backward(70*width);
      this.turn(90);
      this.forward(45*width);
      this.turnLeft();
      this.forward(70*width);
      
      this.penUp();
      this.forward(10*width);
      this.turnLeft();
      
      
      
      
      
    }
  }
  public void drawLBoldSize(Color c, boolean bold, int width)
    //this method draws the capital letter "L" with a Pen Color option
  {
    if (bold == true)  
    { 
      this.setPenWidth(4);
    } 
    else
    { this.setPenWidth(2);
    } 
    {
      this.forward(90*width);
      this.backward(90*width);
      this.turnRight();
      this.forward(45*width);
      
      this.penUp();
      this.forward(10*width);
      this.turnLeft();
      
      
    }
    
  }
  
  
  public void drawGlasses(int x, int y, Color c) //this method draws a pair of glasses
  {
    this.penUp();
    this.setPenWidth(10);
    this.moveTo(x,y);
    this.penDown();
    this.setPenColor(c);
    this.drawSquare(85);
    this.turn(180);
    this.forward(42);
    this.turnLeft();
    this.penUp();
    this.forward(85);
    this.penDown();
    this.forward(80);
    this.turn(-90);
    this.forward(42);
    this.drawSquare(85);
    this.hide();
    
    
    
  }
  public void drawBowTie(int x, int y, Color c) //this method draws a bowtie
  {
    this.penUp();
    this.setPenWidth(8);
    this.setPenColor(c);
    this.moveTo(x,y);
    this.penDown();
    this.forward(85);
    this.turn(125);
    this.forward(200);
    this.turn(-125);
    this.forward(113);
    this.turn(-125);
    this.forward(200);
    this.turn(125);
    this.forward(113);
    this.penUp();
    
  }
  
  public void drawBoard()
  {
    
    this.setPenColor(Color.black);
    this.penUp();
    this.moveTo(0,160);
    this.turn(90);
    this.penDown();
    this.forward(640);
    this.turn(90);
    this.penUp();
    this.forward(160);
    this.turn(90);
    this.penDown();
    this.forward(640);
    this.penUp();
    this.moveTo(213,0);
    this.turnToFace(213,480);
    this.penDown();
    this.forward(480);
    this.turnToFace(640,480);
    this.penUp();
    this.forward(213);
    this.turnToFace(426,0);
    this.penDown();
    this.forward(480);
    this.penUp();
    this.hide();
    
  }
}

// this } is the end of class Turtle, put all new methods before this

