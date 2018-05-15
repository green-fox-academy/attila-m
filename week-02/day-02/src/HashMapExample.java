import java.util.HashMap;

public class HashMapExample {
  public static void main(String[] args) {
    HashMap<Integer, String> map = new HashMap<Integer, String>();

    map.put(12, "alma");
    map.put(0, "jo");
    map.put(11, "lama");
    map.put(1, "alma"); // ha ketszer putolod ugyanazt a keyt akkor felulirod

    System.out.println(map);
    System.out.println(map.size());
    System.out.println(map.keySet());
    System.out.println(map.values());
    System.out.println(map.get(0));
  }
}
