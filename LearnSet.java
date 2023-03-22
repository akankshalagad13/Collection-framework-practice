import java.nio.channels.SelectableChannel;
import java.util.HashSet;
import java.util.Set;

public class LearnSet{
    public static void main(String[] args) {
        Set<Integer>set=new HashSet<>();
        set.add(56);
        set.add(67);
        set.add(76);
        set.add(56);
        set.add(2);
        System.out.println(set);
        set.remove(56);
        System.out.println(set);
        System.out.println(set.contains(2));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.clear();
        System.out.println(set);


    }
}