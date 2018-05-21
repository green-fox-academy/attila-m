import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {

  public static void main(String[] args) {

     List<String> addedLine = new ArrayList<>();
     addedLine.add("This is the first line");
     addedLine.add("This is the second line");
    try {
      Path filePath = Paths.get("my-file.txt");
      // Path filePath2 = Paths.get("here//is//a//file");
      Files.write(filePath, addedLine);
      // Files.write(filePath2,addedLine);
    } catch (Exception e) {
      System.out.println("Unable to write file: my-file.txt");
    }
    System.out.println("IT WORKS!");
  }
}

// Open a file called "my-file.txt"
// Write your name in it as a single line
// If the program is unable to write the file,
// then it should print an error message like: "Unable to write file: my-file.txt"