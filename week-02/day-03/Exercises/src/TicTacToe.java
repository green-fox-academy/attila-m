import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TicTacToe {

  public static void main(String[] args) {
    // Write a function that takes a filename as string,
    // open and read it. The file data represents a tic-tac-toe
    // game result. Return 'X'/'O'/'draw' based on which player
    // has winning situation.

    System.out.println(ticTacResult("win-o.txt"));
    // should print O

    System.out.println(ticTacResult("win-x.txt"));
    // should print X

    System.out.println(ticTacResult("draw.txt"));
    // should print draw
  }

  public static String ticTacResult (String s1) {

    String result = "";

    try {
      Path filePath = Paths.get(s1);
      List<String> ticTacFile = Files.readAllLines(filePath);
      result = ticTacFile.get(0);
    } catch (Exception e) {
      System.out.println("NotOK");
    }
    return result;
  }
}