import java.util.*;
public class Clear{
    public static void main(String[] args){
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("mango",85);
        hm.put("banana",70);
        hm.clear();
        System.out.println(hm);
    }
}