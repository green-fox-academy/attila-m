public class test {
    public static void main(String[] args) {

        int triLine = 5;
        for (int i = 1; i <= triLine; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}