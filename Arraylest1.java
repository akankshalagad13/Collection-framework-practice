import java.util.List;
import java.util.ArrayList;
public class Arraylest1{
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.add(4);
        System.out.println(list);
        list.add(2, 30);
        System.out.println(list);
        List<Integer>newList=new ArrayList<>();
        newList.add(150);
        newList.add(160);
        list.addAll(newList);
        System.out.println(list);
        System.out.println(list.get(2));
    }
}