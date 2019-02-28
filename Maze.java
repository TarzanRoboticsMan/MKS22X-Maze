import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Maze{
  private char[][] maze;
  private boolean animate;
  private int x,y;

  public static void main(String[]args){}
  public Maze(){
    try{
      File text = new File("Maze1.txt");
      Scanner inf = new Scanner(text);

      ArrayList<String> data = new ArrayList<String>();
      while(inf.hasNextLine()){
        String line = inf.nextLine();
        data.add(line);
      }

      int countS=0; int countE=0;
      maze = new char[data.size()][data.get(0).length()];
      for(int l=0;l<data.size();l++){
        for(int c=0;c<data.get(l).length();c++){
          maze[l][c] = data.get(l).charAt(c);
          if(maze[l][c]=='S') countS++; x=l;y=c;
          if(maze[l][c]=='E') countE++;
        }
      }
      if(countS!=1||countE!=1) throw new IllegalStateException();
    }
    catch(FileNotFoundException E){
      System.out.println("I can't find your file");
    }
    catch(IllegalStateException E){
      System.out.println("Invalid maze");
    }
  }

  public void setAnimate(boolean b){
    animate = b;
  }
  public void clearTerminal(){
    //erase terminal, go to top left of screen.
    System.out.println("\033[2J\033[1;1H");
  }
  private void animate(){
    //automatic animation! You are welcome.
    if(animate){
      clearTerminal();
      System.out.println(this);
      try{wait(20);}
      catch (Interrupted Exception e) {System.out.println("yikes");}
    }
  }

  /*Wrapper Solve Function returns the helper function
  Note the helper function has the same name, but different parameters.
  Since the constructor exits when the file is not found or is missing an E or S, we can assume it exists. */
  public int solve(){
    return solve(x,y);
  }

  /*
  Recursive Solve function
  A solved maze has a path marked with '@' from S to E.

  Returns the number of @ symbols from S to E when the maze is solved,
  Returns -1 when the maze has no solution.

  Postcondition:
  The S is replaced with '@' but the 'E' is not.
  All visited spots that were not part of the solution are changed to '.'
  All visited spots that are part of the solution are changed to '@'
  */
  private int solve(int row, int col){ //you can add more parameters since this is private
    animate();
    //COMPLETE SOLVE
    if(maze[row][col]=='E') return 1;
    if(maze[row][col]=='#'||maze[row][col]=='.'||maze[row][col]=='@') return -1;

    return -1; //so it compiles
  }




  /*Return the string that represents the maze.
  It should look like the text file with some characters replaced. */
  public String toString(){
    String ans = "";
    for(int r=0;r<maze.length;r++){
      for(int c=0;c<maze[0].length;c++){
        ans+=maze[r][c];
      }
      ans+="\n";
    }
    return ans;
  }

}
