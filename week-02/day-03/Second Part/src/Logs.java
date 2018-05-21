import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Logs {

  public static void main(String[] args) {


    try {
     Path filePath = Paths.get("src//log.txt");
     // System.out.println(uniqueIp(filePath);
     // System.out.println(getPostRatio(filePath));
    } catch (Exception e) {
      System.out.println("NotOK");
    }
  }

  /*

  public static ArrayList<String> uniqueIp (Path path1) {

    ArrayList<String> ipList = Files.readAllLines(path1);

    ipList. // have to sort unique

  }

  public static int getPostRatio (Path path1) {

    ArrayList<String> ipList = Files.readAllLines(path1);

    ipList. // have to split based on "  "


  }
  */
}



// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.
