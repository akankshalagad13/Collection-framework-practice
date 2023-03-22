import java.util.Set;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        // when we want a set of elements in sorted form then we use here Treeset data
        // structure.
        set.add(45);
        set.add(89);
        set.add(98);
        set.add(80);
        set.add(95);
        System.out.println(set);

    }

}
