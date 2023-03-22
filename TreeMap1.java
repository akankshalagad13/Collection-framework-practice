import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {
    public static void main(String[] args) {
        Map<String,Integer> numbers=new TreeMap<>();
        numbers.put("One",1);
        numbers.put("Two",2);
        numbers.put("Three",3);
        numbers.put("Four",4);
        numbers.put("Five",5);
        System.out.println(numbers);
        numbers.remove("Two");
        System.out.println(numbers);
        System.out.println(numbers.containsKey("Two"));
        if(!numbers.containsKey("two")){
            numbers.put("Two",2);
        }
        System.out.println(numbers);

    }
    
}
