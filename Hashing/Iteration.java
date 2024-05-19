import java.util.*;
public class Iteration{
    public static void main(String[] args){
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);
        hm.put("Indonesia",6);  
        hm.put("Neoal",5);
        System.out.println(hm);

        // Iterate
        Set<String> keys = hm.keySet();
        for(String k : keys){
            System.out.println("Key = "+k+", Value = "+hm.get(k));
        }
    }
}