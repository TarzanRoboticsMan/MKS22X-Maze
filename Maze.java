import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Maze{
  public static void main(String[]args){
    try{
      File text = new File("input.txt");
      Scanner inf = new Scanner(text);
    }
    catch(FileNotFoundException E){
      System.out.println("I can't find your file");
    }

  }
}
