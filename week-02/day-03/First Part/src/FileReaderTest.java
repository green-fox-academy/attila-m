import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReaderTest {

  public static void main(String[] args) {

    Path filePath = Paths.get("src//CountLines.txt");
    try {
      System.out.println(new File("Test1.txt").getCanonicalPath());
      List<String> fileLines = Files.readAllLines(filePath);
      System.out.println(fileLines);
    } catch (IOException e) {
      System.out.println("Nem nyert.");
    }
  }
}
