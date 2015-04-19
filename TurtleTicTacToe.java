import java.util. *;
import java.awt. *;

public class TurtleTicTacToe {
  
  // Creating Arrays
  private static char[][] movesArray = new char[3][3];
  private static int[][] coordsArray = new int [9][2];
 

  public static void main(String[] args) throws InterruptedException {

    // Creating the world
    World w = new World();
    // Creating the turtle
    Turtle tom = new Turtle(w);
    // Draw the game board
    tom.drawBoard();
    tom.show();
    tom.setPenColor(Color.black);
    tom.penDown();
    
    
    // objects to recieve user input
    Scanner scanner = new Scanner(System.in);
    int myInt = 0;
    
    // filling the coords array
    fillCoords(w);
    
    // Flip a coin to see who goes first
    boolean userTurn = coinFlip();
    boolean winner = false;
    boolean tie = false;
    
    while (winner == false && tie == false)
    {
      int i = 0;
      while (i < 9)
      {
        // THIS IS THE USER'S TURN LOGIC
        if (userTurn)
        {
          
          System.out.print("Your turn... pick between spots: ");
          if(movesArray[0][0] != 'x'){
            System.out.print("1, ");
          }
          if(movesArray[0][1] != 'x'){
            System.out.print("2,");
          }
          if(movesArray[0][2] != 'x'){
            System.out.print(" 3");
          }
          if(movesArray[1][0] != 'x'){
            System.out.print(", 4");
          }
          if(movesArray[1][1] != 'x'){
            System.out.print(", 5");
          }
          if(movesArray[1][2] != 'x'){
            System.out.print(", 6");
          }
          if(movesArray[2][0] != 'x'){
            System.out.print(", 7");
          }
          if(movesArray[2][1] != 'x'){
            System.out.print(", 8");
          }
          if(movesArray[2][2] != 'x'){
            System.out.print(", 9");
          }
          
          // Get the user's number
          myInt = scanner.nextInt();
          
          switch (myInt)  {
            case 1: 
              movesArray[0][0] = 'o';
              tom.penUp();
              tom.moveTo(coordsArray[0][0], coordsArray[0][1]);
              tom.penDown();
              tom.drawHexagon();
              break;
              
            case 2: 
              movesArray[0][1] = 'o';
              tom.penUp();
              tom.moveTo(coordsArray[1][0], coordsArray[1][1]);
              tom.penDown();
              tom.drawHexagon();
              break;
              
            case 3: 
              movesArray[0][2] = 'o';
              tom.penUp();
              tom.moveTo(coordsArray[2][0], coordsArray[2][1]);
              tom.penDown();
              tom.drawHexagon();
              break;
              
            case 4: 
              movesArray[1][0] = 'o';
              tom.penUp();
              tom.moveTo(coordsArray[3][0], coordsArray[3][1]);
              tom.penDown();
              tom.drawHexagon();
              break;
              
            case 5: 
              movesArray[1][1] = 'o';
              tom.penUp();
              tom.moveTo(coordsArray[4][0], coordsArray[4][1]);
              tom.penDown();
              tom.drawHexagon();
              break;
              
            case 6: 
              movesArray[1][2] = 'o';
              tom.penUp();
              tom.moveTo(coordsArray[5][0], coordsArray[5][1]);
              tom.penDown();
              tom.drawHexagon();
              break;
              
            case 7: 
              movesArray[2][0] = 'o';
              tom.penUp();
              tom.moveTo(coordsArray[6][0], coordsArray[6][1]);
              tom.penDown();
              tom.drawHexagon();
              break;
              
            case 8: 
              movesArray[2][1] = 'o';
              tom.penUp();
              tom.moveTo(coordsArray[7][0], coordsArray[7][1]);
              tom.penDown();
              tom.drawHexagon();
              break;
              
            case 9: 
              movesArray[2][2] = 'o';
              tom.penUp();
              tom.moveTo(coordsArray[8][0], coordsArray[8][1]);
              tom.penDown();
              tom.drawHexagon();
              break;
            
          }
          
          //  Place it into the coordsArra
          userTurn = false;
          
          if (winner)
          {
            String win = "You win!";
            System.out.println(win);
          }
          
          i++;
        }
        
        // THIS IS THE COMPUTER'S TURN LOGIC
        if (!userTurn)
        {
          // Get Computer Turn
          System.out.println("Jarvis is thinking...");
          Thread.sleep(500);
          
          // Begin Jarvis Logic
          
          // Get a number between 1-9
          
          int jarvisNumber = (int)(Math.random()*10);
          
          
          if (jarvisNumber > 9 || jarvisNumber < 1)
          {
            jarvisNumber = (int)(Math.random()*10);
            
          }
          
          System.out.println("Jarvis has chosen space " + jarvisNumber);
          switch (jarvisNumber)  {
            case 1:
              movesArray[0][0] = 'x';
              tom.penUp();
              tom.moveTo(coordsArray[0][0], coordsArray[0][1]);
              tom.penDown();
              tom.drawX();
              break;
              
            case 2: 
              movesArray[0][1] = 'x';
              tom.penUp();
              tom.moveTo(coordsArray[1][0], coordsArray[1][1]);
              tom.penDown();
              tom.drawX();
              break;
              
            case 3: 
              movesArray[0][2] = 'x';
              tom.penUp();
              tom.moveTo(coordsArray[2][0], coordsArray[2][1]);
              tom.penDown();
              tom.drawX();
              break;
              
            case 4: 
              movesArray[1][0] = 'x';
              tom.penUp();
              tom.moveTo(coordsArray[3][0], coordsArray[3][1]);
              tom.penDown();
              tom.drawX();
              break;
              
            case 5: 
              movesArray[1][1] = 'x';
              tom.penUp();
              tom.moveTo(coordsArray[4][0], coordsArray[4][1]);
              tom.penDown();
              tom.drawX();
              break;
              
            case 6:
              movesArray[1][2] = 'x';
              tom.penUp();
              tom.moveTo(coordsArray[5][0], coordsArray[5][1]);
              tom.penDown();
              tom.drawX();
              break;
              
            case 7: 
              movesArray[2][0] = 'x';
              tom.penUp();
              tom.moveTo(coordsArray[6][0], coordsArray[6][1]);
              tom.penDown();
              tom.drawX();
              break;
              
            case 8: 
              movesArray[2][1] = 'x';
              tom.penUp();
              tom.moveTo(coordsArray[7][0], coordsArray[7][1]);
              tom.penDown();
              tom.drawX();
              break;
              
            case 9: 
              movesArray[2][2] = 'x';
              tom.penUp();
              tom.moveTo(coordsArray[8][0], coordsArray[8][1]);
              tom.penDown();
              tom.drawX();
              break;
              
          }
          
          userTurn = true;
          i++;
        }
      }
      
      // TODO Check for a tie or a winner
      
      if (tie == true)
      {
        System.out.println("Game over. Tie");
      } else {
        return;
      }
    }
  }
  
  public static boolean coinFlip()
  {
    if(Math.random()<.5)
    {
      System.out.println("Jarvis goes first.");
      int randomNumber = 1 + (int)(Math.random() * (9));
      return false;
    }
    else
    {
      System.out.println("You go first!");
      return true;
    }
  }
  
  public static void animateLine(Turtle tom, int heading, int startX, int startY, int endX, int endY) throws InterruptedException
  {
    // setup to draw a line through winning row/col/diag
    tom.show();
    tom.penUp();
    tom.moveTo(startX, startY);
    tom.setHeading(heading);
    tom.penDown();
    tom.setPenWidth(4);
    tom.setPenColor(Color.black);
    int dist = (int)(Math.sqrt((startX-endX) * (startX-endX) + (startY-endY) * (startY-endY)));
    
    // animate drawing the line
    for (int i = 0; i < dist/3; i++)
    {
      tom.forward(3);
      Thread.sleep(30);
    }
  }
  
  public static void fillCoords(World w)
  {
    
    // getting the mathematical measurements of the divided world
    int height = (int) (w.getHeight()/3);
    int heightDoubled = (int) (w.getHeight()/3 + w.getHeight()/3);
    int width = (int) (w.getWidth()/3);
    int widthDoubled = (int) (w.getWidth()/3 + w.getWidth()/3);
    
    // Space 1
    coordsArray[0][0] = 0;
    coordsArray[0][1] = 0;
    
    // Space 2
    coordsArray[1][0] = width;
    coordsArray[1][1] = 0;
    
    // Space 3
    coordsArray[2][0] = widthDoubled;
    coordsArray[2][1] = 0;
    
    // Space 4
    coordsArray[3][0] = 0;
    coordsArray[3][1] = height;
    
    // Space 5
    coordsArray[4][0] = width;
    coordsArray[4][1] = height;
    
    // Space 6
    coordsArray[5][0] = widthDoubled;
    coordsArray[5][1] = height;
    
    // Space 7
    coordsArray[6][0] = 0;
    coordsArray[6][1] = heightDoubled;
    
    // Space 8
    coordsArray[7][0] = width;
    coordsArray[7][1] = heightDoubled;
    
    // Space 9
    coordsArray[8][0] = widthDoubled;
    coordsArray[8][1] = heightDoubled;
  }
  
  public int jarvisReRoll()
  {
    int jarvisNumber = (int)(Math.random()*10);
    
    if (jarvisNumber > 9 || jarvisNumber < 1)
    {
      jarvisNumber = (int)(Math.random()*10);
    }
    
    return jarvisNumber;
  }
  
}