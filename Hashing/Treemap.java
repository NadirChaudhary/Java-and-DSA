import java.util.*;
public class Treemap{
    public static void main(String[] args){
        TreeMap<String,Integer> tm = new TreeMap<>();
        tm.put("India",100);
        tm.put("China",150);
        tm.put("US",50);
        tm.put("Nepal",5);

        System.out.println(tm);
    }
}