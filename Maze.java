import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Maze{
  public static void main(String[]args){
    try{
      File text = new File("input.txt");
      Scanner inf = new Scanner(text);

      ArrayList<String> data = new ArrayList<String>;
      while(inf.hasNextLine()){
        String line = inf.nextLine();
        data.add(line);
        System.out.println(line);
      }

      Char[][] maze = new Char[data.length][data[0].length];
      for(int l=0;l<data.length;l++){
        for(int x=0;x<data[l].length();x++){
          maze[l][c] = data[l].charAt(c);
        }
      }
      System.out.println(maze);
    }
    catch(FileNotFoundException E){
      System.out.println("I can't find your file");
    }

  }
}
