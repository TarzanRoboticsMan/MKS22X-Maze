import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Maze{
  private char[][] maze;
  private boolean animate;

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
          if(maze[l][c]=='S') countS++;
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

  /*Wrapper Solve Function returns the helper function
    Note the helper function has the same name, but different parameters.
    Since the constructor exits when the file is not found or is missing an E or S, we can assume it exists. */
    public int solve(){
      //find the location of the S.

      //erase the S

      //and start solving at the location of the s.

      //return solve(???,???);
      return 0;
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
