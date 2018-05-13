public class FizzBuzz {
    public static void main(String[] args) {

        for (int oneToHunded = 1; oneToHunded < 101; oneToHunded++) {
            if ((oneToHunded % 3 == 0) && (oneToHunded % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if (oneToHunded % 3 == 0) {
                System.out.println("Fizz");
            } else if (oneToHunded % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(oneToHunded);
            }
        }
    }
}

// Write a program that prints the numbers from 1 to 100.
// But for multiples of three print “Fizz” instead of the number
// and for the multiples of five print “Buzz”.
// For numbers which are multiples of both three and five print “FizzBuzz”.