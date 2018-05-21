import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
  public static void main(String[] args) {

    String filePath = "src//CountLines.txt";
    System.out.println(lineCounter(filePath));

  }

  public static int lineCounter (String fn1) {

    int value = 0;

    Path filePath = Paths.get(fn1);
    try {
      List<String> listLines = Files.readAllLines(filePath);
      value = listLines.size();
    } catch (IOException e) {
     value = 0;
    }
    return value;
  }
}
// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.
