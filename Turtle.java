
import java.util.*;
import java.awt.*;

/**
 * Class that represents a turtle which is similar to a Logo turtle.
 * This class inherts from SimpleTurtle and is for students
 * to add methods to.
 *
 * Copyright Georgia Institute of Technology 2004
 * @author Barb Ericson ericson@cc.gatech.edu
 */
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
  
  //Main Method
  public static void main(String[] args)
  {
    World earth = new World();
    Turtle t1 = new Turtle(earth);
    t1.forward();
  }
  
  
//Came with Turtle class
  public void drawT() { 
    this.forward(100); 
    this.turnLeft(); 
    this.penUp(); 
    this.forward(40); 
    this.turn(180); 
    this.penDown(); 
    this.forward(80); 
    this.hide();
    
  }
  
  
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  //PAPER PROBLEM SOLVING
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  
  //Draw Six Pointed Star (1)
  public void drawSixPointedStar()
  {
    this.setPenWidth(3);
    this.turn(30);
    this.forward(90);
    this.turn(120);
    this.forward(90);
    this.turn(120);
    this.forward(90);
    this.turn(120);
    this.forward(30);
    this.turn(300);
    this.forward(30);
    this.turn(120);
    this.forward(90);
    this.turn(120);
    this.forward(90);
    this.turn(120);
    this.forward(90);
    this.turn(30);
    
    
  }
  
  
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  //BOOK PROGRAMS
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  
//PROGRAM 2 Draw Square
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
  
//PROGRAM 3 Draw Square with Variable
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
  
  //PROGRAM 4 Draw Square with Width as a Parameter
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
  
  

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  //LABS
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

//LAB2PARTD Draw Hexagon Method
  public void drawHexagon(int sideLength)
  {
   
    if (sideLength <= 0)
    {
      System.out.println("Error!");
      return;
    }
    this.forward(sideLength);
    this.turn(60);
    this.forward(sideLength);
    this.turn(60);
    this.forward(sideLength);
    this.turn(60);
    this.forward(sideLength);
    this.turn(60);
    this.forward(sideLength);
    this.turn(60);
    this.forward(sideLength);
    this.turn(60);
    System.out.println("Pre-Conditions: World and Turtle created and sideLength has to be positive");
    System.out.println("Post-Conditions: drawHex ");
    System.out.println("Return Values: execute the method drawHex");
  }
  
  
  //LAB4PARTB
public int getDistance()
{
  int x = getXPos();
  int y = getYPos();
  double distance = Math.sqrt((x*x) + (y*y));
  int finalDistance = (int) distance;
  return finalDistance;
}

public int getDistanceToPoint(int x1, int y1)
{
  int x = getXPos();
  int y = getYPos();
  double distance = Math.sqrt(((x-x1)*(x-x1)+(y-y1)*(y-y1)));
  int finalDistance = (int) distance;
  return finalDistance;
}

public boolean isTurtleClose(Turtle otherTurtle, int threshold)
{
  int x = otherTurtle.getXPos();
  int y = otherTurtle.getYPos();
  int x1 = this.getXPos();
  int y1 = this.getYPos();
  double distance = Math.sqrt(((x-x1)*(x-x1)+(y-y1)*(y-y1)));
  int finalDistance = (int) distance;
  if (threshold > finalDistance)
  {return true;
  }
  else 
  {return false;
  }
}
  

public static String helpGetters ()
{
  return " Common getters: isPenDown(), getPenColor(), GetXPos(), getYPos()";
}
  
public static String helpSetters ()
{
  return " Common setters: setPenColor(Color c), setPenDown(boolean b), setheading(int direction)";
}
  
public static String helpDrawing ()
{
  return " Drawing method: forward(int dist), backward(int dist), turnLeft(), turnRight(), turn(int degrees), moveTo(int x, int y)";
}

public static void help ()
{
  System.out.println(helpGetters());
  System.out.println(helpSetters());
  System.out.println(helpDrawing());
  
  
}



//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  //ASSIGNMENTS
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~



  //ASSIGNMENT 1 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  
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
    //this.turnLeft();
    this.forward(35);
    this.turnLeft();  
    
  } // end of exclamation mark method
  
//DRAW T METHOD
  public void drawT(Color c)
  {
    this.forward(80);
    this.turn(160);
    this.penDown();
    this.forward(80);
    this.turn(-130);
    this.forward(40);
    this.turn(130);
    this.forward(40);
    this.turn(-130);
    this.forward(80);
    this.penUp();
  }

  //Regular W
  public void drawW(Color c) {
    //spoint stands for starting point
    //I create the letters by moving from point to point
    //I do the same thing for every letter
    int spointx = getXPos();
    int spointy = getYPos()-100;
    this.setPenColor(c);
    this.penUp();
    this.moveTo(spointx,spointy);
    this.penDown();
    this.moveTo(spointx + 20,spointy + 100);
    this.moveTo(spointx + 35,spointy + 60);
    this.moveTo(spointx + 50,spointy + 100);
    this.moveTo(spointx + 65,spointy);
    this.penUp();
    this.moveTo(spointx + 75,spointy + 100);}
  
  
  //Bold W
  public void drawWBold(Color c, Boolean bold) {
    
    if (bold == true) 
    {this.setPenWidth(4);} else {this.setPenWidth(2);}
    int spointx = getXPos();
    int spointy = getYPos()-100;
    this.setPenColor(c);
    this.penUp();
    this.moveTo(spointx,spointy);
    this.penDown();
    this.moveTo(spointx + 20,spointy + 100);
    this.moveTo(spointx + 35,spointy + 60);
    this.moveTo(spointx + 50,spointy + 100);
    this.moveTo(spointx + 65,spointy);
    this.penUp();
    this.moveTo(spointx + 75,spointy + 100);
    this.setPenWidth(2);
  }
  
  
  //W where you can manipualate size
  public void drawWBoldSize(Color c, Boolean bold, int size) {
    
    if (bold == true) 
    {this.setPenWidth(4);} else {this.setPenWidth(2);}
    int spointx = getXPos();
    int spointy = getYPos() - 100*size;
    this.setPenColor(c);
    this.penUp();
    this.moveTo(spointx,spointy);
    this.penDown();
    this.moveTo(spointx + 20*size,spointy + 100*size);
    this.moveTo(spointx + 35*size,spointy + 60*size);
    this.moveTo(spointx + 50*size,spointy + 100*size);
    this.moveTo(spointx + 65*size,spointy);
    this.penUp();
    this.moveTo(spointx + 75*size,spointy + 100*size);
    this.setPenWidth(2);
  }
  
  
//Regular E
  public void drawE(Color c) {
    
    int spointx = getXPos()+30;
    int spointy = getYPos();
    this.setPenColor(c);
    this.penDown();
    this.moveTo(spointx,spointy);
    this.moveTo(spointx - 30,spointy);
    this.moveTo(spointx - 30,spointy - 50);
    this.moveTo(spointx,spointy - 50);
    this.moveTo(spointx - 30,spointy - 50);
    this.moveTo(spointx - 30,spointy - 100);
    this.moveTo(spointx,spointy - 100);
    this.penUp();
    this.moveTo(spointx + 10,spointy);
  }
  
  //Bold E
  
  public void drawEBold(Color c, Boolean bold)  {
    
    if (bold == true) 
    {this.setPenWidth(4);} else {this.setPenWidth(2);}
    int spointx = getXPos()+30;
    int spointy = getYPos();
    this.setPenColor(c);
    this.penDown();
    this.moveTo(spointx,spointy);
    this.moveTo(spointx - 30,spointy);
    this.moveTo(spointx - 30,spointy - 50);
    this.moveTo(spointx,spointy - 50);
    this.moveTo(spointx - 30,spointy - 50);
    this.moveTo(spointx - 30,spointy - 100);
    this.moveTo(spointx,spointy - 100);
    this.penUp();
    this.moveTo(spointx + 10,spointy);
    this.setPenWidth(2);
  }
  
//E Where you can manipulate the size
  
  public void drawEBoldSize(Color c, Boolean bold, int size) {
    
    if (bold == true) 
    {this.setPenWidth(4);} else {this.setPenWidth(2);}   
    
    int spointx = getXPos()+30*size;
    int spointy = getYPos();
    this.setPenColor(c);
    this.penDown();
    this.moveTo(spointx,spointy);
    this.moveTo(spointx - 30*size,spointy);
    this.moveTo(spointx - 30*size,spointy - 50*size);
    this.moveTo(spointx,spointy - 50*size);
    this.moveTo(spointx - 30*size,spointy - 50*size);
    this.moveTo(spointx - 30*size,spointy - 100*size);
    this.moveTo(spointx,spointy - 100*size);
    this.penUp();
    this.moveTo(spointx + 10,spointy);
    this.setPenWidth(2);
  }
  
  
  // Regular L
  public void drawL(Color c) {
    int spointx = getXPos();
    int spointy = getYPos();
    this.setPenColor(c);
    this.penDown();
    this.moveTo(spointx + 30, spointy);
    this.moveTo(spointx, spointy);
    this.moveTo(spointx, spointy - 100);
    this.penUp();
    this.moveTo(spointx+40, spointy);
  }
  
  //Bold L
  public void drawLBold(Color c, Boolean bold)  {
    
    if (bold == true) 
    {this.setPenWidth(4);} else {this.setPenWidth(2);}   
    
    
    int spointx = getXPos();
    int spointy = getYPos();
    this.setPenColor(c);
    this.penDown();
    this.moveTo(spointx + 30, spointy);
    this.moveTo(spointx, spointy);
    this.moveTo(spointx, spointy - 100);
    this.penUp();
    this.moveTo(spointx+40, spointy);
    this.setPenWidth(2);
  }
  
  //L where you can manipulate the size
  public void drawLBoldSize(Color c, Boolean bold, int size) {
    
    if (bold == true) 
    {this.setPenWidth(4);} else {this.setPenWidth(2);}   
    
    
    int spointx = getXPos();
    int spointy = getYPos();
    this.setPenColor(c);
    this.penDown();
    this.moveTo(spointx + 30*size, spointy);
    this.moveTo(spointx, spointy);
    this.moveTo(spointx, spointy - 100*size);
    this.penUp();
    this.moveTo((spointx+30*size)+10, spointy);
    this.setPenWidth(2);
  }
  
  
 
  //regular S
  public void drawS(Color c) {
    int spointx = getXPos();
    int spointy = getYPos();
    this.setPenColor(c);
    this.penDown();
    this.moveTo(spointx + 30, spointy);
    this.moveTo(spointx + 30, spointy - 50);
    this.moveTo(spointx, spointy - 50);
    this.moveTo(spointx, spointy - 100);
    this.moveTo(spointx + 30, spointy - 100);
    this.penUp();
    this.moveTo(spointx+40, spointy);
  }
  
  
  //bold s
  
  public void drawSBold(Color c, Boolean bold)  {
    
    if (bold == true) 
    {this.setPenWidth(4);
      // put code here that should execute if bold is true (set line thickness to 4)
    } else {this.setPenWidth(2);
      // put code here that should execute if bold is false (set line thickness to 2)
    }   
    int spointx = getXPos();
    int spointy = getYPos();
    this.setPenColor(c);
    this.penDown();
    this.moveTo(spointx + 30, spointy);
    this.moveTo(spointx + 30, spointy - 50);
    this.moveTo(spointx, spointy - 50);
    this.moveTo(spointx, spointy - 100);
    this.moveTo(spointx + 30, spointy - 100);
    this.penUp();
    this.moveTo(spointx+40, spointy);
    this.setPenWidth(2);
  }
  
  //bold and size S
  
  public void drawSBoldSize(Color c, Boolean bold, int size) {
    
    if (bold == true) 
    {this.setPenWidth(4);
      // put code here that should execute if bold is true (set line thickness to 4)
    } else {this.setPenWidth(2);
      // put code here that should execute if bold is false (set line thickness to 2)
    }   
    int spointx = getXPos();
    int spointy = getYPos();
    this.setPenColor(c);
    this.penDown();
    this.moveTo(spointx + 30*size, spointy);
    this.moveTo(spointx + 30*size, spointy - 50*size);
    this.moveTo(spointx, spointy - 50*size);
    this.moveTo(spointx, spointy - 100*size);
    this.moveTo(spointx + 30*size, spointy - 100*size);
    this.penUp();
    this.moveTo(spointx+40*size, spointy);
    this.setPenWidth(2);
  }      

//  WRITE NAME METHOD
  public void writeName(Color c, Boolean bold, int size) {
    this.drawWBoldSize(c, bold, size); 
    this.drawEBoldSize(c, bold, size); 
    this.drawLBoldSize(c, bold, size); 
    this.drawLBoldSize(c, bold, size); 
    this.drawSBoldSize(c, bold, size); 
  }
  
  
  

  
  //ASSIGNMENT 2 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  public void drawEyeglasses (int x, int y, Color c)
  {
    this.penUp();
    this.moveTo(x,y);
    this.setPenColor(c);
    this.penDown();
    this.turn(12);
    this.forward(50);
    this.turnRight();
    this.forward(80);
    this.turnRight();
    this.forward(50);
    this.turnRight();
    this.forward(80);
    this.turnRight();
    this.forward(50);
    this.turnRight();
    this.forward(80);
    this.turnRight();
    this.forward(25);
    this.turnLeft();
    this.forward(42);
    this.turnRight();
    this.forward(25);
    this.turnLeft();
    this.forward(80);
    this.turnLeft();
    this.forward(50);
    this.turnLeft();
    this.forward(80);
    this.turnLeft();
    this.forward(50);
    this.turnLeft();
    this.forward(80);
    this.turn(12);
    this.penUp();
    
    
    
  }
  
  public void drawMustache (int x, int y, Color c)
  {
    this.penUp();
    this.moveTo(x,y);
    this.setPenColor(c);
    this.setPenWidth(10);
    this.penDown();
    this.turn(87);
    this.forward(32);
    this.penUp();
    this.turn(3);
    this.forward(20);
    this.penDown();
    this.turn(11);
    this.forward(30);
    this.setHeading(0.0);
    this.penUp();
    
  }
  
 public void drawBoard()
 {
 
    this.setPenColor(Color.black);
    this.penUp();
    this.moveTo(200,100);
    this.penDown();
    this.moveTo(200,400);
    this.penUp();
    this.moveTo(300,400);
    this.penDown();
    this.moveTo(300,100);
    this.penUp();
    this.moveTo(100,200);
    this.penDown();
    this.moveTo(400,200);
    this.penUp();
    this.moveTo(100,300);
    this.penDown();
    this.moveTo(400,300);
    this.penUp();
    this.hide();
    
    
  
}
 
 public void drawX(int x, int y)
 {
   this.setPenColor(Color.blue);
   this.penUp();
   this.moveTo(x,y);
   this.moveTo(x+8,y+8);
   this.penDown();
   this.moveTo(x+84,y+84);
   this.penUp();
   this.moveTo(x+84, y+8);
   this.penDown();
   this.moveTo(x+8, y+84); 
   
 }

 public void drawHexagon(int x, int y)
 {
   this.setPenColor(Color.red);
   this.penUp();
   this.moveTo(x,y);
   this.moveTo(x+50,y+6);
   this.setHeading(0.0);
   this.penDown();
   this.turn(120);
   this.forward(45);
    this.turn(60);
    this.forward(45);
    this.turn(60);
    this.forward(45);
    this.turn(60);
    this.forward(45);
    this.turn(60);
    this.forward(45);
    this.turn(60);
    this.forward(45);
    this.turn(60);
   
 }
 
 
   public void drawHexagon()
    
  {
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
    this.turn(60);
  }
    
  
} // this } is the end of class Turtle, put all new methods before this
