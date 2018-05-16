import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class CopyFile {

  public static void main(String[] args) {

    String fileOne = "src/copyFrom.txt";
    String fileTwo = "src/copyTo.txt";

    copier(fileOne, fileTwo);

  }

  public static boolean copier (String s1, String s2) {

    Path fileOne = Paths.get(s1);
    Path fileTwo = Paths.get(s2);
    try {
      ArrayList<String> listFull = new ArrayList<>(Files.readAllLines(fileOne));
      Files.write(fileTwo, listFull);

    } catch (Exception e) {
      System.out.println("Woops, something didn't work out.");
    }

    return true; // Not returning anything...

  }
}

// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful