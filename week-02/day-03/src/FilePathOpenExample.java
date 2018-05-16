import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class FilePathOpenExample {
  public static void main(String[] args) {

    String fileName = "asd.txt";
    Path path = Paths.get(fileName);
    ArrayList<ArrayList<String>> stringMatrix;
    try {
      List<String> content = Files.readAllLines(path);
      int sum = 0;
      for (String s: content) {
        System.out.println(s);
        System.out.println(s.split(";"));
        // sum += Integer.valueOf(s.split(";"[4]));
      }
      //  throw new Exception("a");
      } catch (IOException e) {
        System.out.println("valami");
      } catch (Exception e) {
        System.out.println("sima exception");
      }
  }
}
