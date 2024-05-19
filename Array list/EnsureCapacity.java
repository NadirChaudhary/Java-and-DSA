import java.util.ArrayList;
public class EnsureCapacity {
  public static void main(String[] args) {
    ArrayList<String> languages= new ArrayList<>();

    // set the capacity of the arraylist
    languages.ensureCapacity(3);

    // Add elements in the ArrayList
    languages.add("Java");
    languages.add("Python");
    languages.add("C");
    System.out.println("ArrayList: " + languages);
  }
}