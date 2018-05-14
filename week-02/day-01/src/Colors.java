import java.util.Arrays;

public class Colors {
  public static void main(String[] args) {
    String colors [][] = {
            {"green", "red", "pink"},
            {"lime", "orange red", "orchid"},
            {"forest green", "red", "violet"},
            {"olive", "tomato", "pink"},
            {"pale green", "hot pink"},
            {"spring green"},
    };

    System.out.println(Arrays.deepToString(colors));
  }

}

// - Create a two dimensional array
//   which can contain the different shades of specified colors
// - In `colors[0]` store the shades of green:
//   `"lime", "forest green", "olive", "pale green", "spring green"`
// - In `colors[1]` store the shades of red:
//   `"orange red", "red", "tomato"`
// - In `colors[2]` store the shades of pink:
//   `"orchid", "violet", "pink", "hot pink"`