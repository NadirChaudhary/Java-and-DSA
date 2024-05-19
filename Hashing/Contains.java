import java.util.*;
public class Contains{
    public static void main(String[] args){
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("mango",85);
        hm.put("banana",70);

        System.out.println(hm.containsKey("mango"));
        System.out.println(hm.containsValue(85));
    }
}