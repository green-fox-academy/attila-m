import java.util.ArrayList;
import java.util.Arrays;

public class E00Practice {
  public static void main(String[] args) {

    ArrayList <String> myStringArrayList = new ArrayList<String>();

    myStringArrayList.add("Egy");
    myStringArrayList.add("Ketto");
    myStringArrayList.add("Harom");
    myStringArrayList.add("Negy");
    myStringArrayList.add("Ot");

    for (int i = 0; i < myStringArrayList.size() ; i++) {

      System.out.println(myStringArrayList.get(i));

    }


    System.out.printf(myStringArrayList.get(1));

    System.out.println(myStringArrayList);




  }
}
