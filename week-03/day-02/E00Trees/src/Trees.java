public class Trees {

  public static void main(String[] args) {

    Tree tree1 = new Tree();
    Tree tree2 = new Tree();
    Tree tree3 = new Tree();
    Tree tree4 = new Tree();
    Tree tree5 = new Tree();

    tree1.type = "Pine";
    tree1.leafColor = "EverGreen :)";
    tree1.age = 32;
    tree1.sex = "male";

    tree2.type = "Oak";
    tree2.leafColor = "DarkGreen";
    tree2.age = 59;
    tree2.sex = "male";

    tree1.State();
    tree2.State();

  }
}