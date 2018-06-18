import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Births {
  public static void main(String[] args) {
    System.out.println(mostCommonYear(birthYearsCount(getYears(fileReader("assets/births.txt")))));
  }

  public static List<String> fileReader(String fileDestination) {
    Path filePath = Paths.get(fileDestination);
    try {
      List<String> content = Files.readAllLines(filePath);
      return content;
    } catch (Exception e) {
      System.out.println("Not a file.");
    }
    return null;
  }

  public static List<String> getYears(List<String> content) {
    List<String> birthYear = new ArrayList<>();
    for (int i = 0; i < content.size(); i++) {
      birthYear.add(content.get(i).split("[-;]")[1]);
    }
    return birthYear;
  }

  public static HashMap<String, Integer> birthYearsCount(List<String> years) {
    HashMap<String, Integer> birthYearCount = new HashMap<>();
    for (int i = 0; i < years.size(); i++) {
      if (!birthYearCount.containsKey(years.get(i))) {
        birthYearCount.put(years.get(i), 1);
      } else {
        birthYearCount.put(years.get(i), birthYearCount.get(years.get(i)) + 1);
      }
    }
    System.out.println(birthYearCount.keySet());
    System.out.println(birthYearCount.values());
    return birthYearCount;
  }

  public static String mostCommonYear(HashMap birthYearCount) {
    int max = 0;
    String commonYear = "";

    for (Object year: birthYearCount.keySet()) {
      if ((int) birthYearCount.get(year) > max) {
        max = (int) birthYearCount.get(year);
        commonYear = (String) year;
      }
    } return commonYear;
  }
}



// Create a function that
// - takes a filename as a parameter,
// - reads a csv file which rows contains data in the following format: <person name>;<birthdate in YYYY-MM-DD format>;<city name>
// - returns the year when the most births happend.

// You can find such a csv file in this directory: births.csv
// If you pass births.csv to your function, the result should be 2006.
