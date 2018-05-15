import java.util.ArrayList;

public class ArrayListExample {

  public static void main(String[] args) {

    int [] intArray = new int[5];
    ArrayList<Integer> intArrayList = new ArrayList(); // erdemes megadni az arraylist tipusat

    intArrayList.add(1);
    intArrayList.add(3);
    intArrayList.add(88);
    intArrayList.add(64);
    intArrayList.add(11);
    intArrayList.add(6);
    intArrayList.add(9);
    intArrayList.remove(Integer.valueOf(6));
    intArrayList.set(0, 90);

   // intArrayList.addAll(2,intArrayList2)

    for (int i = 0; i < intArrayList.size() ; i++) {
      System.out.println(intArrayList.get(i));
    }
    System.out.println(intArrayList.size());

    System.out.println("THIS: " + intArrayList.set(3, intArrayList.get(1)));

  }
}
