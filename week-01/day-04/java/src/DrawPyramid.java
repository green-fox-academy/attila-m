public class DrawPyramid {
    public static void main(String[] args) {
        int pyramid = 6;

        for (int i = 1; i < pyramid; i++) {

            for (int j = i; j < pyramid; j++)
                System.out.print(" ");

            for (int k = 1; k < (i * 2); k++)
                System.out.print("*");
            System.out.println(" ");

        }
    }
}

// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was