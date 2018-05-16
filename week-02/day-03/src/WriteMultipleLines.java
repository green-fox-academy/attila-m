import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class WriteMultipleLines {
  public static void main(String[] args) {

    Path filePath = Paths.get("src/Test1");

    writer(filePath, "Apple", 5);
  }

  public static void writer (Path p1, String s1, Integer i1) {

    ArrayList<String> theList = new ArrayList<>();
    for (int i = 0; i < i1; i++) {
      theList.add(s1);
    }
    try {
      Files.write(p1,theList);

    } catch (Exception e) {
      System.out.println("Try again. Bye.");
    }
  }
}

// Create a function that takes 3 parameters: a path, a word and a number,
// than it should write to a file.
// The path parameter should be a string, that describes the location of the file.
// The word parameter should be a string, that will be written to the file as lines
// The number paramter should describe how many lines the file should have.
// So if the word is "apple" and the number is 5, than it should write 5 lines
// to the file and each line should be "apple"
// The function should not raise any error if it could not write the file.