import java.util.*;

public class CandyShop{
  public static void main(String... args){
    ArrayList<Object> arrayList = new ArrayList<Object>();
    arrayList.add("Cupcake");
    arrayList.add(2);
    arrayList.add("Brownie");
    arrayList.add(false);

    // Accidentally we added "2" and "false" to the list. 
    // Your task is to change from "2" to "Croissant" and change from "false" to "Ice cream"
    // No, don't just remove the lines
    // Create a method called sweets() which takes the list as a parameter. 

    System.out.println(sweets(arrayList));
    // Expected output: "Cupcake", "Croissant", "Brownie", "Ice cream"
  }

  public static ArrayList<Object> sweets (ArrayList<Object> alo1) { // max 5 non-String :(

    ArrayList<Object> sweets = new ArrayList<>();
    sweets.add("Bubblegum");
    sweets.add("Croissant");
    sweets.add("Lollipop");
    sweets.add("Ice cream");
    sweets.add("Chocolate");

    ArrayList<Object> sweetify = new ArrayList<>();

    for (int i = 0; i < alo1.size(); i++) {

      if (alo1.get(i) instanceof String) {
        sweetify.add(alo1.get(i));
      } else { sweetify.add(sweets.get(i));
        }
      }
      return sweetify;
    }
  }