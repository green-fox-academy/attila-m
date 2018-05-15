public class TodoPrint {
  public static void main(String... args){
    String todoText = " - Buy milk\n";
    String myTodo = "My todo:\n";
    String downloadGames = " - Download games\n";
    String diablo = "\t - Diablo";

    todoText = myTodo + todoText + downloadGames + diablo;

    System.out.println(todoText);
  }
}

// Add "My todo:" to the beginning of the todoText
// Add " - Download games" to the end of the todoText
// Add " - Diablo" to the end of the todoText but with indention

// Expected outpt:

// My todo:
//  - Buy milk
//  - Download games
//      - Diablo