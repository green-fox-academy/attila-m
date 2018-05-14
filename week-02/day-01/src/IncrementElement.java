public class IncrementElement {

  public static void main(String[] args) {
    int [] t = {1, 2, 3, 4, 5};
    t[3] = t[3]++;
    System.out.println(t[3]);
  }
}

/* - Create an array variable named `t`
        with the following content: `[1, 2, 3, 4, 5]`
        - Increment the third element
        - Print the third element */
