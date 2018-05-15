public class Reverse {
  public static void main(String... args){
    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

     System.out.println(reverse(reversed));
  }

  public static String reverse (String s1) {

    String reversedString = "";

    for (int i = 0; i < s1.length(); i++) {
      char swap = s1.charAt(s1.length() -1 -i);
      reversedString = reversedString.concat(String.valueOf(swap));
      }

    return reversedString;

    }
  }

// Create a method that can reverse a String, which is passed as the parameter
// Use it on this reversed string to check it!
// Try to solve this using charAt() first, and optionally anything else after.