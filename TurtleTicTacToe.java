import java.util. *;
import java.awt. *;

public class TurtleTicTacToe {
  
  // Create arrays
  private static char[][] movesArray = new char[3][3];
  private static int[][] coordsArray = new int [9][2];
  
  public static void main(String[] args) {
    
    // Creating the world
    World w = new World();
    // Creating the turtle
    Turtle tom = new Turtle(w);
    // Draw the game board
    tom.drawBoard();
    boolean userTurn = coinFlip();
    
    // Create variables to store the gameplay
    boolean isWinner = false;
    
    Scanner scanner = new Scanner(System.in);
    int myInt = 0;
    
    while (isWinner == false)
    {
      int i = 0;
      while (i < 9)
      {
        System.out.println(i);
        // Flipping Back and forth between user and computer
        
        // THIS IS THE USER'S TURN LOGIC
        if (userTurn)
        {
          // Get User Input
          System.out.println("User's turn");
          // Get the user's number
          myInt = scanner.nextInt();
          System.out.println(myInt);
          //  Place it into the coordsArra
          userTurn = false;
          i++;
        }
        // THIS IS THE COMPUTER'S TURN LOGIC
        if (!userTurn)
        {
          // Get Computer Turn
          System.out.println("It's the computer's turn");
          userTurn = true;
          i++;
        }
        
        
      }
      return;
    }
    System.out.println("For loop is done");
  }
  
  // Method to flip a coin to determine who goes first
  public static boolean coinFlip()
  {
    if(Math.random()<.5)
    {
      System.out.println("Computer start");
      int randomNumber = 1 + (int)(Math.random() * (9));
      return false;
    }
    else
    {
      System.out.println("Your Turn!");
      return true;
    }
  }
  
}
