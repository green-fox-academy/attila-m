public class PrintEven {

    public static void main(String[] args) {

        for (int even = 1; even < 500; even++) {
            if (even % 2 == 0) {
                System.out.println(even);
            }
        }
    }
}

// Create a program that prints all the even numbers between 0 and 500