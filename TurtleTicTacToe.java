
import java.util.*;
import java.awt.*;

//Tic Tac Toe
public class TurtleTicTacToe 
{
  private static char[][] movesArray = new char[3][3];
  private static int[][] coordsArray = new int[9][2];
  private static int[] moves = new int[9];
  public static int myInt;
  public static void main(String[] args) throws InterruptedException
  {

    int i;
    
    coordsArray[0][0] = 100;
    coordsArray[0][1] = 100;
    coordsArray[1][0] = 200;
    coordsArray[1][1] = 100;
    coordsArray[2][0] = 300;
    coordsArray[2][1] = 100;
    coordsArray[3][0] = 100;
    coordsArray[3][1] = 200;
    coordsArray[4][0] = 200;
    coordsArray[4][1] = 200;
    coordsArray[5][0] = 300;
    coordsArray[5][1] = 200;
    coordsArray[6][0] = 100;
    coordsArray[6][1] = 300;
    coordsArray[7][0] = 200;
    coordsArray[7][1] = 300;
    coordsArray[8][0] = 300;
    coordsArray[8][1] = 300;
    
    //Create World
    World w = new World(500,500);
    //Create Turtle
    Turtle t = new Turtle(w);
    //Create Board
    t.drawBoard();
    System.out.println("WELCOME TO TIC TAC TOE by: TJ Wells");
    Thread.sleep(300);
    //Who go's First
    if(Math.random()>.5)
    {
      i = 1;
    }
    else
    {
      i = 2;
    }
    
    for(int x=0; x < 9;x++)
    {
      if( i % 2 == 0 )
      {
        
        Thread.sleep(500);
        System.out.println("--> Computer's Turn <--");
        
          
       compTurn(t, i); 
   
      }
      
      if( i % 2 == 1 )
      {
        Thread.sleep(500);
        printAvailable();
        System.out.println("  It's your turn...");
        usersTurn(t, i);

      }
      if(whoWon(t))
      {
        return;
      }
      
      
      

      i++;
    }
      System.out.println("You tied.  GAME OVER");

  }

  
  
  
  
  
  
  public static void usersTurn(Turtle t, int turn)
  {
    int goodValue = 1;
    while (goodValue == 1){
    Scanner scanner = new Scanner(System.in);
    myInt = scanner.nextInt();
    

   switch (myInt)
    {
      case 1:
        if (movesArray[0][0] == 'x' || movesArray[0][0] == 'o')
        {
        System.out.println("Already Taken");
        break;
      }
        else{
        
       goodValue = 2;
        t.drawX(coordsArray[0][0],coordsArray[0][1]);
        
        movesArray[0][0] = 'x';
        break;
        
        }
     
         
        
        case 2:
        if (movesArray[1][0] == 'x' || movesArray[1][0] == 'o')
        {
          
        System.out.println("Already Taken");
        break;
      }
        else
        {
       goodValue = 2;
        t.drawX(coordsArray[1][0],coordsArray[1][1]);
        
        movesArray[1][0] = 'x';
        break;
        
        }
        
        case 3:
        if (movesArray[2][0] == 'x' || movesArray[2][0] == 'o')
        {
        System.out.println("Already Taken");
        break;
      }
        else
        {
       goodValue = 2;
        t.drawX(coordsArray[2][0],coordsArray[2][1]);
        
        movesArray[2][0] = 'x';
        break;
        
        }
        
        case 4:
        if (movesArray[0][1] == 'x' || movesArray[0][1] == 'o')
        {
        System.out.println("Already Taken");
        break;
      }
        else
        {
       goodValue = 2;
        t.drawX(coordsArray[3][0],coordsArray[3][1]);
        
        movesArray[0][1] = 'x';
        break;
        
        }
        
        
        case 5:
        if (movesArray[1][1] == 'x' || movesArray[1][1] == 'o')
        
          {
        System.out.println("Already Taken");
        break;
      }
        else
        {
       goodValue = 2;
        t.drawX(coordsArray[4][0],coordsArray[4][1]);
        
        movesArray[1][1] = 'x';
        break;
        
        }
        
        case 6:
        if (movesArray[2][1] == 'x' || movesArray[2][1] == 'o')
        {
        System.out.println("Already Taken");
        break;
      }
        else
        {
       goodValue = 2;
        t.drawX(coordsArray[5][0],coordsArray[5][1]);
        
        movesArray[2][1] = 'x';
        break;
        
        }
        
        case 7:
        if (movesArray[0][2] == 'x' || movesArray[0][2] == 'o')
        {
        System.out.println("Already Taken");
        break;
      }
        else
        {
       goodValue = 2;
        t.drawX(coordsArray[6][0],coordsArray[6][1]);
        
        movesArray[0][2] = 'x';
        break;
        
        }
        
        case 8:
        if (movesArray[1][2] == 'x' || movesArray[1][2] == 'o')
        {
        System.out.println("Already Taken");
        break;
      }
        else
        {
       goodValue = 2;
        t.drawX(coordsArray[7][0],coordsArray[7][1]);
        
        movesArray[1][2] = 'x';
        break;
        
        }
        case 9:
        if (movesArray[2][2] == 'x' || movesArray[2][2] == 'o')
        {
        System.out.println("Already Taken");
        break;
      }
        else
        {
       goodValue = 2;
        t.drawX(coordsArray[8][0],coordsArray[8][1]);
        
        movesArray[2][2] = 'x';
        break;
        
        }
        
        
    
    
    
    }
    
  }

  }
  
  
  
  
  
  
  
  
  
  public static void compTurn(Turtle t, int turn)
  {
    
    int goodValue = 1;
    while (goodValue == 1)
    {
    int compMove = (int)((Math.random() * 9) + 1);
    

   switch (compMove)
    {
      case 1:
        if (movesArray[0][0] == 'x' || movesArray[0][0] == 'o')
        {
        break;
      }
        else
        {
       goodValue = 2;
        t.drawHexagon(coordsArray[0][0],coordsArray[0][1]);
        
        movesArray[0][0] = 'o';
        break;
        
        }
        
        case 2:
        if (movesArray[1][0] == 'x' || movesArray[1][0] == 'o')
        {
          break;
      }
        else
        {
       goodValue = 2;
        t.drawHexagon(coordsArray[1][0],coordsArray[1][1]);
        
        movesArray[1][0] = 'o';
        break;
        
        }
        
        case 3:
        if (movesArray[2][0] == 'x' || movesArray[2][0] != 'o')
        {
          break;
      }
        else
        {
       goodValue = 2;
        t.drawHexagon(coordsArray[2][0],coordsArray[2][1]);
        
        movesArray[2][0] = 'o';
        break;
        
        }
        
        case 4:
        if (movesArray[0][1] == 'x' || movesArray[0][1] == 'o')
        {
          break;
      }
        else
        {
       goodValue = 2;
        t.drawHexagon(coordsArray[3][0],coordsArray[3][1]);
        
        movesArray[0][1] = 'o';
        break;
        
        }
        
        case 5:
        if (movesArray[1][1] == 'x' || movesArray[1][1] == 'o')
        {
          break;
      }
        else
        {
       goodValue = 2;
        t.drawHexagon(coordsArray[4][0],coordsArray[4][1]);
        
        movesArray[1][1] = 'o';
        break;
        
        }
        
        case 6:
        if (movesArray[2][1] == 'x' || movesArray[2][1] == 'o')
        {
          break;
      }
        else
        {
       goodValue = 2;
        t.drawHexagon(coordsArray[5][0],coordsArray[5][1]);
        
        movesArray[2][1] = 'o';
        break;
        
        }
        
        case 7:
        if (movesArray[0][2] == 'x' || movesArray[0][2] == 'o')
        {
          break;
      }
        else
        {
       goodValue = 2;
        t.drawHexagon(coordsArray[6][0],coordsArray[6][1]);
        
        movesArray[0][2] = 'o';
        break;
        
        }
        
        case 8:
        if (movesArray[1][2] == 'x' || movesArray[1][2] == 'o')
        {
          break;
      }
        else
        {
       goodValue = 2;
        t.drawHexagon(coordsArray[7][0],coordsArray[7][1]);
        
        movesArray[1][2] = 'o';
        break;
        
        }
        case 9:
        if (movesArray[2][2] == 'x' || movesArray[2][2] == 'o')
        {
          break;
      }
        else
        {
       goodValue = 2;
        t.drawHexagon(coordsArray[8][0],coordsArray[8][1]);
        
        movesArray[2][2] = 'o';
        break;
        
        }
        
        
    }
    
    
    }


    
  }
  
  
  
  
  public static void printAvailable()
  {
    System.out.print("The open spaces are... ");

        if (movesArray[0][0] == 'x' || movesArray[0][0] == 'o')
        {
        System.out.print("-,");
      }
        else
        {
       System.out.print("1,");
        
        }
        
        
        if (movesArray[1][0] == 'x' || movesArray[1][0] == 'o')
        {
          System.out.print("-,");
      }
        else
        {
       System.out.print(" 2,");
        
        }
        

        if (movesArray[2][0] == 'x' || movesArray[2][0] == 'o')
        {
        System.out.print("-,");
      }
        else
        {
       System.out.print(" 3,");
        
        }
        

        if (movesArray[0][1] == 'x' || movesArray[0][1] == 'o')
        {
          System.out.print("-,");
      }
        else
        {
       System.out.print(" 4,");
        
        }

        if (movesArray[1][1] == 'x' || movesArray[1][1] == 'o')
        {
          System.out.print("-,");
      }
        else
        {
       System.out.print(" 5,");
        
        }
        

        if (movesArray[2][1] == 'x' || movesArray[2][1] == 'o')
        {
           System.out.print("-,");
      }
        else
        {
       System.out.print(" 6,");
        
        }
        

        if (movesArray[0][2] == 'x' || movesArray[0][2] == 'o')
        {
          System.out.print("-,");
      }
        else
        {
       System.out.print(" 7,");
        
        }

        if (movesArray[1][2] == 'x' || movesArray[1][2] == 'o')
        {
          System.out.print("-,");
      }
        else
        {
       System.out.print(" 8,");
        
        }

        if (movesArray[2][2] == 'x' || movesArray[2][2] == 'o')
        {
          System.out.print("-.");
      }
        else
        {
       System.out.print(" 9.");
    
    
  }
  }
  
  
  
  public static boolean whoWon(Turtle t) throws InterruptedException
  {
    int dist = 300;
    int dist2 = 425;
    if(movesArray[0][0] == 'x' && movesArray[0][1] == 'x' && movesArray[0][2] == 'x')
    {
      t.penUp();
      t.moveTo(150,100);
      t.setPenWidth(3);
      t.penDown();
      t.turnToFace(150,400);
      t.penUp();
      System.out.println("USER WINS!!!!!");
      return true;
    }
      if(movesArray[0][0] == 'x' && movesArray[1][1] == 'x' && movesArray[2][2] == 'x' )
      {
      t.penUp();
      t.moveTo(100,100);
      t.setPenWidth(3);
      t.penDown();
      t.turnToFace(400,400);
      for (int i = 0; i< dist2/3; i++) {
      t.forward(3);
      Thread.sleep(30);
      }
      t.penUp();
      System.out.println("USER WINS!!!!!");
      return true;
      }
        
      if(movesArray[0][0] == 'x' && movesArray[1][0] == 'x' && movesArray[2][0] == 'x' )
      {
      t.penUp();
      t.moveTo(100,150);
      t.setPenWidth(3);
      t.penDown();
      t.turnToFace(400,150);
      for (int i = 0; i< dist/3; i++) {
      t.forward(3);
      Thread.sleep(30);
      }
      t.penUp();
      System.out.println("USER WINS!!!!!");
      return true; 
      }
        
      if(movesArray[1][0] == 'x' && movesArray[1][1] == 'x' && movesArray[1][2] == 'x')
      {
      t.penUp();
      t.moveTo(250,100);
      t.setPenWidth(3);
      t.penDown();
      t.turnToFace(250,400);
      for (int i = 0; i< dist/3; i++) {
      t.forward(3);
      Thread.sleep(30);
      }
      t.penUp();
      System.out.println("USER WINS!!!!!");
      return true;
      }
      
      if(movesArray[2][0] == 'x' && movesArray[1][1] == 'x' && movesArray[0][2] == 'x')
      {
      t.penUp();
      t.moveTo(400,100);
      t.setPenWidth(3);
      t.penDown();
      t.turnToFace(100,400);
      for (int i = 0; i< dist2/3; i++) {
      t.forward(3);
      Thread.sleep(30);
      }
      t.penUp();
      System.out.println("USER WINS!!!!!");
      return true;
      }
      if(movesArray[2][0] == 'x' && movesArray[2][1] == 'x' && movesArray[2][2] == 'x')
      {
      t.penUp();
      t.moveTo(350,100);
      t.setPenWidth(3);
      t.penDown();
      t.turnToFace(350,400);
      for (int i = 0; i< dist/3; i++) {
      t.forward(3);
      Thread.sleep(30);
      }
      t.penUp();
      System.out.println("USER WINS!!!!!");
      return true; 
      }
      if(movesArray[0][1] == 'x' && movesArray[1][1] == 'x' && movesArray[2][1] == 'x')
      {
      t.penUp();
      t.moveTo(250,100);
      t.setPenWidth(3);
      t.penDown();
      t.turnToFace(250,400);
      for (int i = 0; i< dist/3; i++) {
      t.forward(3);
      Thread.sleep(30);
      }
      t.penUp();
      System.out.println("USER WINS!!!!!");
      return true;
      }
      if(movesArray[0][2] == 'x' && movesArray[1][2] == 'x' && movesArray[2][2] == 'x')
    {
      t.penUp();
      t.moveTo(100,350);
      t.setPenWidth(3);
      t.penDown();
      t.turnToFace(400,350);
      for (int i = 0; i< dist/3; i++) {
      t.forward(3);
      Thread.sleep(30);
      }
      t.penUp();
      System.out.println("USER WINS!!!!!");
      return true;
    
    
  }
  
  
  if(movesArray[0][0] == 'o' && movesArray[0][1] == 'o' && movesArray[0][2] == 'o')
    {
      t.penUp();
      t.moveTo(150,100);
      t.setPenWidth(3);
      t.penDown();
      t.turnToFace(150,400);
      for (int i = 0; i< dist/3; i++) {
      t.forward(3);
      Thread.sleep(30);
      }
      t.penUp();
      System.out.println("COMPUTER WINS!!!!!");
      return true;
    }
      if(movesArray[0][0] == 'o' && movesArray[1][1] == 'o' && movesArray[2][2] == 'o' )
      {
      t.penUp();
      t.moveTo(100,100);
      t.setPenWidth(3);
      t.penDown();
      t.turnToFace(400,400);
      for (int i = 0; i< dist2/3; i++) {
      t.forward(3);
      Thread.sleep(30);
      }
      t.penUp();
      System.out.println("COMPUTER WINS!!!!!");
      return true;
      }
        
      if(movesArray[0][0] == 'o' && movesArray[1][0] == 'o' && movesArray[2][0] == 'o' )
      {
      t.penUp();
      t.moveTo(100,150);
      t.setPenWidth(3);
      t.penDown();
      t.turnToFace(400,150);
      for (int i = 0; i< dist/3; i++) {
      t.forward(3);
      Thread.sleep(30);
      }
      t.penUp();
      System.out.println("COMPUTER WINS!!!!!");
      return true; 
      }
        
      if(movesArray[1][0] == 'o' && movesArray[1][1] == 'o' && movesArray[1][2] == 'o')
      {
      t.penUp();
      t.moveTo(250,100);
      t.setPenWidth(3);
      t.penDown();
      t.turnToFace(250,400);
      for (int i = 0; i< dist/3; i++) {
      t.forward(3);
      Thread.sleep(30);
      }
      t.penUp();
      System.out.println("COMPUTER WINS!!!!!");
      return true;
      }
      
      if(movesArray[2][0] == 'o' && movesArray[1][1] == 'o' && movesArray[0][2] == 'o')
      {
      t.penUp();
      t.moveTo(400,100);
      t.setPenWidth(3);
      t.penDown();
      t.turnToFace(100,400);
      for (int i = 0; i< dist2/3; i++) {
      t.forward(3);
      Thread.sleep(30);
      }
      t.penUp();
      System.out.println("COMPUTER WINS!!!!!");
      return true;
      }
      if(movesArray[2][0] == 'o' && movesArray[2][1] == 'o' && movesArray[2][2] == 'o')
      {
      t.penUp();
      t.moveTo(350,100);
      t.setPenWidth(3);
      t.penDown();
      t.turnToFace(350,400);
      for (int i = 0; i< dist/3; i++) {
      t.forward(3);
      Thread.sleep(30);
      }
      t.penUp();
      System.out.println("COMPUTER WINS!!!!!");
      return true; 
      }
      if(movesArray[0][1] == 'o' && movesArray[1][1] == 'o' && movesArray[2][1] == 'o')
      {
      t.penUp();
      t.moveTo(250,100);
      t.setPenWidth(3);
      t.penDown();
      t.turnToFace(250,400);
      t.penUp();
      System.out.println("COMPUTER WINS!!!!!");
      return true;
      }
      if(movesArray[0][2] == 'o' && movesArray[1][2] == 'o' && movesArray[2][2] == 'o')
    {
      t.penUp();
      t.moveTo(100,350);
      t.setPenWidth(3);
      t.penDown();
      t.turnToFace(400,350);
      for (int i = 0; i< dist/3; i++) {
      t.forward(3);
      Thread.sleep(30);
      }
      t.penUp();
      System.out.println("COMPUTER WINS!!!!!");
      return true;
    
    
  }
  
  return false;
  }
  

  
  
}
