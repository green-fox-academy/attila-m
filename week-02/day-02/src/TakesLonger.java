public class TakesLonger {
  public static void main(String... args){
    String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

    String always = "always takes longer than";

    // System.out.println(quote.indexOf("you")); - 21

    quote = quote.substring(0, 21) + always + quote.substring(20);

    System.out.println(quote);
  }
}

// When saving this quote a disk error has occured. Please fix it.
// Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
// Using pieces of the quote variable (instead of just redefining the string)