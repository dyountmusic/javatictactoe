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
    // Flip a coin to see who goes first
    boolean userTurn = coinFlip();
    
    // Create variables to store the gameplay
    boolean winner = false;
    boolean tie = false;
    
    Scanner scanner = new Scanner(System.in);
    int myInt = 0;
    
    // Keep track of whose turn it is
    // X is always the Player
    // O is always Jarvis
    char whoseTurn = 'X';
  
    while (winner == false && tie == false)
    {
      int i = 0;
      while (i < 9)
      {
        
        // THIS IS THE USER'S TURN LOGIC
        if (userTurn)
        {
          // Get User Input
          System.out.println("Your turn");
          // Get the user's number
          myInt = scanner.nextInt();
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
          userTurn = true;
          i++;
        }
      }
      return;
    }
  }
  
  // Method to flip a coin to determine who goes first
  // Method returns a true or false state
  // true indicates it is the user's turn
  // false indicates it is Jarvis' turn
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

}
