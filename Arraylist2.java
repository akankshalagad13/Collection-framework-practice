import java.util.List;
import java .util.ArrayList;
import java.util.Iterator;
public class Arraylist2 {
    public static void main(String[] args) {
        List<Integer>list1=new ArrayList<>();
        list1.add(12);
        list1.add(11);
        list1.add(10);
        list1.add(13);
        list1.add(14);
        list1.add(15);
        list1.add(16);
        System.out.println(list1);
        list1.set(2,2000);
        System.out.println(list1);
        System.out.println(list1.contains(15));
        for(int i=0;i<=list1.size();i++){
            System.out.println("the element is:"+list1.get(i));
        }
        for(Integer element:list1){
            System.out.println("for each element is:"+element);
        }
        Iterator<Integer>it=list1.iterator();
        while(it.hasNext()){
            System.out.println("iterator:"+it.next());
        }


    }
    
}
