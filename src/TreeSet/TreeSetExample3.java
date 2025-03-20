package TreeSet;
import java.util.TreeSet;

public class TreeSetExample3 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");
        TreeSet<String> clonedSet = (TreeSet<String>) treeSet.clone();
        System.out.println("Cloned TreeSet: " + clonedSet);
    }
}
