import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Maze{
  public static void main(String[]args){
    try{
      File text = new File("Maze1.txt");
      Scanner inf = new Scanner(text);

      ArrayList<String> data = new ArrayList<String>();
      while(inf.hasNextLine()){
        String line = inf.nextLine();
        data.add(line);
        System.out.println(line);
      }

      char[][] maze = new char[data.size()][data.get(0).length()];
      for(int l=0;l<data.size();l++){
        for(int c=0;c<data.get(l).length();c++){
          maze[l][c] = data.get(l).charAt(c);
        }
      }
      System.out.println(maze);
    }
    catch(FileNotFoundException E){
      System.out.println("I can't find your file");
    }

  }
}
