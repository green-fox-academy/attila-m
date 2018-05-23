import java.util.ArrayList;
import java.util.List;

public class Dominoes {
  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    // You have the list of Dominoes
    // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
    // eg: [2, 4], [4, 3], [3, 5] ...

    System.out.println(dominoes);

    List<Domino> sortedDominoes = new ArrayList<>();
    sortedDominoes.add(dominoes.get(0));
    sortedDominoes.add(dominoes.get(4));
    sortedDominoes.add(dominoes.get(1));
    sortedDominoes.add(dominoes.get(3));
    sortedDominoes.add(dominoes.get(5));
    sortedDominoes.add(dominoes.get(2));

    System.out.println(sortedDominoes);
  }

  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2)); //0
    dominoes.add(new Domino(4, 6)); //1
    dominoes.add(new Domino(1, 5)); //2
    dominoes.add(new Domino(6, 7)); //3
    dominoes.add(new Domino(2, 4)); //4
    dominoes.add(new Domino(7, 1)); //5
    return dominoes;
  }

}